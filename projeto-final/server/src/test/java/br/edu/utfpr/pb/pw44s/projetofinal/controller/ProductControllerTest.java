package br.edu.utfpr.pb.pw44s.projetofinal.controller;

import br.edu.utfpr.pb.pw44s.projetofinal.dto.CategoryDTO;
import br.edu.utfpr.pb.pw44s.projetofinal.dto.ProductDTO;
import br.edu.utfpr.pb.pw44s.projetofinal.model.Category;
import br.edu.utfpr.pb.pw44s.projetofinal.search.request.SearchRequest;
import br.edu.utfpr.pb.pw44s.projetofinal.search.request.filter.SearchFilter;
import br.edu.utfpr.pb.pw44s.projetofinal.service.CategoryService;
import br.edu.utfpr.pb.pw44s.projetofinal.shared.CrudControllerTest;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ProductControllerTest extends CrudControllerTest<ProductDTO> {

    @Override
    protected String getURL() {
        return "/products";
    }

    @Autowired
    private CategoryService categoryService;

    private Category category;

    @BeforeAll
    void createCategory() {
        category = new Category();
        category.setName("Teste");
        categoryService.save(category);
    }

    @Override
    protected ProductDTO createValidObject() {
        return ProductDTO.builder()
                .name("Teste")
                .price(10.0)
                .description("Teste")
                .categories(List.of(new CategoryDTO(category.getId(), category.getName())))
                .build();
    }

    @Override
    protected ProductDTO createInvalidObject() {
        return ProductDTO.builder()
                .name("Teste")
                .price(-10.0)
                .build();
    }

    @Override
    protected void onBeforeUpdate(ProductDTO dto) {
        dto.setId(1L);
    }

    @Override
    protected SearchRequest createSearchRequest() {
        return SearchRequest.builder()
                .filters(List.of(
                        SearchFilter.builder()
                                .field("categories.name")
                                .type(SearchFilter.Type.EQUALS)
                                .value("Teste")
                                .build()
                ))
                .build();
    }

    @Override
    @Test
    @Order(7)
    protected void searchEntries() {
        SearchRequest request = createSearchRequest();
        ResponseEntity<Object> response = testRestTemplate.postForEntity(getURL() + "/search", request, Object.class);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertNotNull(response.getBody());
    }
}

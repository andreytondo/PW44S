package br.edu.utfpr.pb.pw44s.projetofinal.controller;

import br.edu.utfpr.pb.pw44s.projetofinal.dto.CategoryDTO;
import br.edu.utfpr.pb.pw44s.projetofinal.dto.ProductDTO;
import br.edu.utfpr.pb.pw44s.projetofinal.model.Product;
import br.edu.utfpr.pb.pw44s.projetofinal.shared.CrudControllerTest;

import java.util.List;

public class ProductControllerTest extends CrudControllerTest<Long, Product, ProductDTO> {

    @Override
    protected String getURL() {
        return "/products";
    }

    @Override
    protected ProductDTO createValidObject() {
        ProductDTO productDTO = new ProductDTO();
        productDTO.setName("Teste");
        productDTO.setPrice(10.0);

        List<CategoryDTO> categories = List.of(new CategoryDTO(null, "Teste"));
        productDTO.setCategories(categories);

        return productDTO;
    }

    @Override
    protected ProductDTO createInvalidObject() {
        ProductDTO productDTO = new ProductDTO();
        productDTO.setName("Teste");
        productDTO.setPrice(-1.0);
        return productDTO;
    }

    @Override
    protected void onBeforeUpdate(ProductDTO dto) {
        dto.setId(1L);
    }
}

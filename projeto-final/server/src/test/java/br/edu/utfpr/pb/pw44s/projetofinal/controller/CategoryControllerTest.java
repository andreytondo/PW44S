package br.edu.utfpr.pb.pw44s.projetofinal.controller;

import br.edu.utfpr.pb.pw44s.projetofinal.dto.CategoryDTO;
import br.edu.utfpr.pb.pw44s.projetofinal.model.Category;
import br.edu.utfpr.pb.pw44s.projetofinal.shared.CrudControllerTest;

class CategoryControllerTest extends CrudControllerTest<Long, Category, CategoryDTO> {

    @Override
    protected String getURL() {
        return "/categories";
    }

    @Override
    protected CategoryDTO createValidObject() {
        return new CategoryDTO(null, "teste");
    }

    @Override
    protected CategoryDTO createInvalidObject() {
        return new CategoryDTO(null, "teste");
    }

    @Override
    protected void onBeforeUpdate(CategoryDTO dto) {
        dto.setId(1L);
    }
}
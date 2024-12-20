package br.edu.utfpr.pb.pw44s.projetofinal.controller;

import br.edu.utfpr.pb.pw44s.projetofinal.dto.CategoryDTO;
import br.edu.utfpr.pb.pw44s.projetofinal.shared.CrudControllerTest;

class CategoryControllerTest extends CrudControllerTest<CategoryDTO> {

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
        return new CategoryDTO(null, null);
    }

    @Override
    protected void onBeforeUpdate(CategoryDTO dto) {
        dto.setId(1L);
    }
}
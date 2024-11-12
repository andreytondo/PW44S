package br.edu.utfpr.pb.pw44s.projetofinal.controller;

import br.edu.utfpr.pb.pw44s.projetofinal.dto.UserDTO;
import br.edu.utfpr.pb.pw44s.projetofinal.model.User;
import br.edu.utfpr.pb.pw44s.projetofinal.shared.CrudControllerTest;
import org.junit.jupiter.api.Assertions;

class UserControllerTest extends CrudControllerTest<Long, User, UserDTO> {

    @Override
    protected String getURL() {
        return "/users";
    }

    @Override
    protected UserDTO createValidObject() {
        return new UserDTO(null, "teste", "Teste", "Teste123456!");
    }

    @Override
    protected UserDTO createInvalidObject() {
        return new UserDTO(null, "teste", "Teste", "123");
    }

    @Override
    protected void onBeforeUpdate(UserDTO dto) {
        dto.setPassword("Teste123456!");
        dto.setId(1L);
    }

    @Override
    protected void searchEntries() {
        Assertions.assertThrows(NullPointerException.class, super::searchEntries);
    }
}
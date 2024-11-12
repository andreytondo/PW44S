package br.edu.utfpr.pb.pw44s.projetofinal.controller;

import br.edu.utfpr.pb.pw44s.projetofinal.dto.UserDTO;
import br.edu.utfpr.pb.pw44s.projetofinal.model.User;
import br.edu.utfpr.pb.pw44s.projetofinal.repository.UserRepository;
import br.edu.utfpr.pb.pw44s.projetofinal.service.UserService;
import br.edu.utfpr.pb.pw44s.projetofinal.shared.CrudController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserController extends CrudController<Long, User, UserDTO, UserRepository, UserService> {

    public UserController() {
        super(User.class, UserDTO.class);
    }

    @RequestMapping("/teste")
    public String teste() {
        return "Teste OK";
    }

    @Override
    public UserDTO toDto(User entity) {
        entity.setPassword(null);
        entity.setUsername(null);
        return super.toDto(entity);
    }
}
package br.edu.utfpr.pb.pw44s.projetofinal.controller;

import br.edu.utfpr.pb.pw44s.projetofinal.dto.AddressDTO;
import br.edu.utfpr.pb.pw44s.projetofinal.dto.OrderDTO;
import br.edu.utfpr.pb.pw44s.projetofinal.dto.UserDTO;
import br.edu.utfpr.pb.pw44s.projetofinal.enums.OrderStatus;
import br.edu.utfpr.pb.pw44s.projetofinal.model.Address;
import br.edu.utfpr.pb.pw44s.projetofinal.model.User;
import br.edu.utfpr.pb.pw44s.projetofinal.service.AddressService;
import br.edu.utfpr.pb.pw44s.projetofinal.service.UserService;
import br.edu.utfpr.pb.pw44s.projetofinal.shared.CrudControllerTest;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class OrderControllerTest extends CrudControllerTest<OrderDTO> {

    @Override
    protected String getURL() {
        return "/orders";
    }

    @Autowired
    private UserService userService;

    @Autowired
    private AddressService addressService;

    private User user;
    private Address address;

    @BeforeAll
    void setUp() {
        user = new User();
        user.setUsername("Teste");
        user.setPassword("Teste123456!@#");
        userService.save(user);

        address = new Address();
        address.setUser(user);
        address.setCity("Teste");
        address.setNumber("Teste");
        address.setState("Teste");
        address.setStreet("Teste");
        address.setZipCode("Teste");
        addressService.save(address);
    }

    @Override
    protected OrderDTO createValidObject() {
        return OrderDTO.builder()
                .user(new UserDTO(user.getId()))
                .address(new AddressDTO(address.getId()))
                .items(List.of())
                .total(0.0)
                .status(OrderStatus.PENDING)
                .build();
    }

    @Override
    protected OrderDTO createInvalidObject() {
        return OrderDTO.builder()
                .user(null)
                .address(null)
                .items(List.of())
                .total(0.0)
                .status(null)
                .build();
    }

    @Override
    protected void onBeforeUpdate(OrderDTO dto) {
        dto.setId(1L);
    }
}
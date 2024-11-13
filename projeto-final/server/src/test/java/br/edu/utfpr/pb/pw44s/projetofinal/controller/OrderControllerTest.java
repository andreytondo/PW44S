package br.edu.utfpr.pb.pw44s.projetofinal.controller;

import br.edu.utfpr.pb.pw44s.projetofinal.dto.OrderDTO;
import br.edu.utfpr.pb.pw44s.projetofinal.shared.CrudControllerTest;

import java.util.List;


class OrderControllerTest extends CrudControllerTest<OrderDTO> {

    @Override
    protected String getURL() {
        return "/orders";
    }

    @Override
    protected OrderDTO createValidObject() {
        return OrderDTO.builder()
                .userId(1L) // TODO should be a User
                .addressId(1L) // TODO should be an Address
                .items(List.of()) // TODO should be a List<OrderItem> and not empty
                .total(0.0)
                .status("teste") // TODO should be a enum
                .build();
    }

    @Override
    protected OrderDTO createInvalidObject() {
        return OrderDTO.builder()
                .userId(null) // TODO should be a User
                .addressId(1L) // TODO should be an Address
                .items(List.of()) // TODO should be a List<OrderItem> and not empty
                .total(0.0)
                .status("teste") // TODO should be a enum
                .build();
    }

    @Override
    protected void onBeforeUpdate(OrderDTO dto) {
        dto.setId(1L);
    }
}
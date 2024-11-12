package br.edu.utfpr.pb.pw44s.projetofinal.controller;

import br.edu.utfpr.pb.pw44s.projetofinal.dto.OrderDTO;
import br.edu.utfpr.pb.pw44s.projetofinal.model.Order;
import br.edu.utfpr.pb.pw44s.projetofinal.repository.OrderRepository;
import br.edu.utfpr.pb.pw44s.projetofinal.service.OrderService;
import br.edu.utfpr.pb.pw44s.projetofinal.shared.CrudController;

public class OrderController extends CrudController<Long, Order, OrderDTO, OrderRepository, OrderService> {
    public OrderController(Class<Order> entityClass, Class<OrderDTO> dtoClass) {
        super(entityClass, dtoClass);
    }
}

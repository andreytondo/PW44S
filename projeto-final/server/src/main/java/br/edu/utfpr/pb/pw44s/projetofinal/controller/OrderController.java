package br.edu.utfpr.pb.pw44s.projetofinal.controller;

import br.edu.utfpr.pb.pw44s.projetofinal.dto.OrderDTO;
import br.edu.utfpr.pb.pw44s.projetofinal.model.Order;
import br.edu.utfpr.pb.pw44s.projetofinal.repository.OrderRepository;
import br.edu.utfpr.pb.pw44s.projetofinal.service.OrderService;
import br.edu.utfpr.pb.pw44s.projetofinal.shared.CrudController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("orders")
public class OrderController extends CrudController<Long, Order, OrderDTO, OrderRepository, OrderService> {

    public OrderController() {
        super(Order.class, OrderDTO.class);
    }
}

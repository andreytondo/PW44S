package br.edu.utfpr.pb.pw44s.projetofinal.controller;

import br.edu.utfpr.pb.pw44s.projetofinal.dto.OrderItemDTO;
import br.edu.utfpr.pb.pw44s.projetofinal.model.OrderItem;
import br.edu.utfpr.pb.pw44s.projetofinal.repository.OrderItemRepository;
import br.edu.utfpr.pb.pw44s.projetofinal.service.OrderItemService;
import br.edu.utfpr.pb.pw44s.projetofinal.shared.CrudController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("orderItens")
public class OrderItemController extends CrudController<Long, OrderItem, OrderItemDTO, OrderItemRepository, OrderItemService> {

    public OrderItemController() {
        super(OrderItem.class, OrderItemDTO.class);
    }
}

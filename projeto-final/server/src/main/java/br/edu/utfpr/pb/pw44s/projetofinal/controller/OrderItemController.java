package br.edu.utfpr.pb.pw44s.projetofinal.controller;

import br.edu.utfpr.pb.pw44s.projetofinal.dto.OrderItemDTO;
import br.edu.utfpr.pb.pw44s.projetofinal.model.OrderItem;
import br.edu.utfpr.pb.pw44s.projetofinal.repository.OrderItemRepository;
import br.edu.utfpr.pb.pw44s.projetofinal.service.OrderItemService;
import br.edu.utfpr.pb.pw44s.projetofinal.shared.CrudController;

public class OrderItemController extends CrudController<Long, OrderItem, OrderItemDTO, OrderItemRepository, OrderItemService> {
    public OrderItemController(Class<OrderItem> entityClass, Class<OrderItemDTO> dtoClass) {
        super(entityClass, dtoClass);
    }
}

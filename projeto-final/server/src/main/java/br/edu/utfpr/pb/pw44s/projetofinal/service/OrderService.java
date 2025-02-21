package br.edu.utfpr.pb.pw44s.projetofinal.service;

import br.edu.utfpr.pb.pw44s.projetofinal.model.Order;
import br.edu.utfpr.pb.pw44s.projetofinal.model.User;
import br.edu.utfpr.pb.pw44s.projetofinal.repository.OrderRepository;
import br.edu.utfpr.pb.pw44s.projetofinal.shared.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
public class OrderService extends CrudService<Long, Order, OrderRepository> {

    private final OrderItemService orderItemService;

    public OrderService(OrderItemService orderItemService) {
        this.orderItemService = orderItemService;
    }

    @Override
    public JpaSpecificationExecutor<Order> getSpecExecutor() {
        return repository;
    }

    @Override
    public Order save(Order entity) {
        Order finalEntity = repository.save(entity);

        if (entity.getItems() != null) {
            entity.getItems().forEach(item -> {
                item.setOrder(finalEntity);
                orderItemService.save(item);
            });
        }

        return entity;
    }
}

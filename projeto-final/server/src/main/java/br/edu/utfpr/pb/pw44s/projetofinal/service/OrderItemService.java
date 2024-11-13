package br.edu.utfpr.pb.pw44s.projetofinal.service;

import br.edu.utfpr.pb.pw44s.projetofinal.model.Category;
import br.edu.utfpr.pb.pw44s.projetofinal.model.OrderItem;
import br.edu.utfpr.pb.pw44s.projetofinal.repository.OrderItemRepository;
import br.edu.utfpr.pb.pw44s.projetofinal.shared.CrudService;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public class OrderItemService extends CrudService<Long, OrderItem, OrderItemRepository> {

    @Override
    public JpaSpecificationExecutor<OrderItem> getSpecExecutor() {
        return repository;
    }
}
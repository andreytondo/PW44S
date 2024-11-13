package br.edu.utfpr.pb.pw44s.projetofinal.service;

import br.edu.utfpr.pb.pw44s.projetofinal.model.Order;
import br.edu.utfpr.pb.pw44s.projetofinal.repository.OrderRepository;
import br.edu.utfpr.pb.pw44s.projetofinal.shared.CrudService;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Service;

@Service
public class OrderService extends CrudService<Long, Order, OrderRepository> {

    @Override
    public JpaSpecificationExecutor<Order> getSpecExecutor() {
        return repository;
    }
}

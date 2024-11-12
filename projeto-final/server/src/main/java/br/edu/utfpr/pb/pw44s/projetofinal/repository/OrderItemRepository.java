package br.edu.utfpr.pb.pw44s.projetofinal.repository;

import br.edu.utfpr.pb.pw44s.projetofinal.model.OrderItem;
import br.edu.utfpr.pb.pw44s.projetofinal.shared.CrudRepository;
import br.edu.utfpr.pb.pw44s.projetofinal.spec.OrderItemSpecExecutor;

public interface OrderItemRepository extends CrudRepository<Long, OrderItem>, OrderItemSpecExecutor {
}

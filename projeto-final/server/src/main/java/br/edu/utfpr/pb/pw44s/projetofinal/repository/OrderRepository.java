package br.edu.utfpr.pb.pw44s.projetofinal.repository;

import br.edu.utfpr.pb.pw44s.projetofinal.model.Order;
import br.edu.utfpr.pb.pw44s.projetofinal.shared.CrudRepository;
import br.edu.utfpr.pb.pw44s.projetofinal.spec.OrderSpecExecutor;

public interface OrderRepository extends CrudRepository<Long, Order>, OrderSpecExecutor {
}

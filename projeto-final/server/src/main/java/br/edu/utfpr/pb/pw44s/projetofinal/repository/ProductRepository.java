package br.edu.utfpr.pb.pw44s.projetofinal.repository;

import br.edu.utfpr.pb.pw44s.projetofinal.model.Product;
import br.edu.utfpr.pb.pw44s.projetofinal.shared.CrudRepository;
import br.edu.utfpr.pb.pw44s.projetofinal.spec.ProductSpecExecutor;

public interface ProductRepository extends CrudRepository<Long, Product>, ProductSpecExecutor {
}

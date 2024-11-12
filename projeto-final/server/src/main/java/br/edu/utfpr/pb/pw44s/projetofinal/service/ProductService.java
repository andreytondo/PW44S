package br.edu.utfpr.pb.pw44s.projetofinal.service;

import br.edu.utfpr.pb.pw44s.projetofinal.model.Product;
import br.edu.utfpr.pb.pw44s.projetofinal.repository.ProductRepository;
import br.edu.utfpr.pb.pw44s.projetofinal.shared.CrudService;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Service;

@Service
public class ProductService extends CrudService<Long, Product, ProductRepository> {

    @Override
    public JpaSpecificationExecutor<Product> getSpecExecutor() {
        return repository;
    }
}

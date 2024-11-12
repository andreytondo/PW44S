package br.edu.utfpr.pb.pw44s.projetofinal.controller;

import br.edu.utfpr.pb.pw44s.projetofinal.dto.ProductDTO;
import br.edu.utfpr.pb.pw44s.projetofinal.model.Product;
import br.edu.utfpr.pb.pw44s.projetofinal.repository.ProductRepository;
import br.edu.utfpr.pb.pw44s.projetofinal.service.ProductService;
import br.edu.utfpr.pb.pw44s.projetofinal.shared.CrudController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("products")
public class ProductController extends CrudController<Long, Product, ProductDTO, ProductRepository, ProductService> {

    public ProductController() {
        super(Product.class, ProductDTO.class);
    }
}

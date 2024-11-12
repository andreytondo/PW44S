package br.edu.utfpr.pb.pw44s.projetofinal.controller;

import br.edu.utfpr.pb.pw44s.projetofinal.dto.CategoryDTO;
import br.edu.utfpr.pb.pw44s.projetofinal.model.Category;
import br.edu.utfpr.pb.pw44s.projetofinal.repository.CategoryRepository;
import br.edu.utfpr.pb.pw44s.projetofinal.service.CategoryService;
import br.edu.utfpr.pb.pw44s.projetofinal.shared.CrudController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("categories")
public class CategoryController extends CrudController<Long, Category, CategoryDTO, CategoryRepository, CategoryService> {

    public CategoryController() {
        super(Category.class, CategoryDTO.class);
    }

}
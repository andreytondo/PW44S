package br.edu.utfpr.pb.pw44s.projetofinal.service;

import br.edu.utfpr.pb.pw44s.projetofinal.model.Category;
import br.edu.utfpr.pb.pw44s.projetofinal.repository.CategoryRepository;
import br.edu.utfpr.pb.pw44s.projetofinal.shared.CrudService;
import org.springframework.stereotype.Service;

@Service
public class CategoryService extends CrudService<Long, Category, CategoryRepository> {
}

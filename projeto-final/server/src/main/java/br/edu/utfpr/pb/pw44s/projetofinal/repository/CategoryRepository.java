package br.edu.utfpr.pb.pw44s.projetofinal.repository;

import br.edu.utfpr.pb.pw44s.projetofinal.model.Category;
import br.edu.utfpr.pb.pw44s.projetofinal.shared.CrudRepository;
import br.edu.utfpr.pb.pw44s.projetofinal.spec.CategorySpecExecutor;

public interface CategoryRepository extends CrudRepository<Long, Category>, CategorySpecExecutor {
}

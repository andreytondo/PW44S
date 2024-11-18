package br.edu.utfpr.pb.pw44s.projetofinal.repository;

import br.edu.utfpr.pb.pw44s.projetofinal.model.User;
import br.edu.utfpr.pb.pw44s.projetofinal.shared.CrudRepository;

public interface UserRepository extends CrudRepository<Long, User> {

    User findByUsername(String username);
}

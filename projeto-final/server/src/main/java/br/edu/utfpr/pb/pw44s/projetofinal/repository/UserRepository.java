package br.edu.utfpr.pb.pw44s.projetofinal.repository;

import br.edu.utfpr.pb.pw44s.projetofinal.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}

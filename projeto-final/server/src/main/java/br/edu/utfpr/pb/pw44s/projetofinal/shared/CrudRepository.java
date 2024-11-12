package br.edu.utfpr.pb.pw44s.projetofinal.shared;

import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface CrudRepository<ID extends Serializable, E extends Identifiable<ID>> extends JpaRepository<E, ID> {

}
package br.edu.utfpr.pb.pw44s.projetofinal.repository;

import br.edu.utfpr.pb.pw44s.projetofinal.model.Address;
import br.edu.utfpr.pb.pw44s.projetofinal.shared.CrudRepository;
import br.edu.utfpr.pb.pw44s.projetofinal.spec.AddressSpecExecutor;

public interface AddressRepository extends CrudRepository<Long, Address>, AddressSpecExecutor {
}

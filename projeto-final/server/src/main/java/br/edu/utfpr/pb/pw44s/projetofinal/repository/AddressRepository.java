package br.edu.utfpr.pb.pw44s.projetofinal.repository;

import br.edu.utfpr.pb.pw44s.projetofinal.model.Address;
import br.edu.utfpr.pb.pw44s.projetofinal.shared.CrudRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface AddressRepository extends CrudRepository<Long, Address>, JpaSpecificationExecutor<Address> {
}

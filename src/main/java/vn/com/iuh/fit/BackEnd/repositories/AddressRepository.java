package vn.com.iuh.fit.BackEnd.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import vn.com.iuh.fit.BackEnd.models.Address;


@RepositoryRestResource
public interface AddressRepository extends CrudRepository<Address, Long> {
}
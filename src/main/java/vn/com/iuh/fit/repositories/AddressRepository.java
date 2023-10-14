package vn.com.iuh.fit.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import vn.com.iuh.fit.models.Address;


@RepositoryRestResource
public interface AddressRepository extends CrudRepository<Address, Long> {
}
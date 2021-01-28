package avitepa.foundation.bank.bankservices.Repository;

import avitepa.foundation.bank.bankservices.Repository.entities.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends CrudRepository<Customer,Long> {
}

package avitepa.foundation.bank.bankservices.Repository;

import avitepa.foundation.bank.bankservices.Repository.entities.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepo extends CrudRepository<Account,Long> {
}

package ir.arsalan.accountMcpServer;

import ir.arsalan.accountMcpServer.model.Account;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AccountRepository extends CrudRepository<Account, Long> {
    List<Account> findByPersonId(Long personId);
}
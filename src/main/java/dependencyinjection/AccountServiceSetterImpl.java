package dependencyinjection;

import org.example.Account;
import org.example.AccountRepository;
import org.example.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

public class AccountServiceSetterImpl implements AccountService {
    private AccountRepository accountRepository;

    public void setAccountRepository(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public void tranferMoney(long fromAccountId, long toAccountId, double amount) {

    }

    @Override
    public void depositMoney(long accountId, double amount) throws Exception {

    }

    @Override
    public Account getAccount(long accountId) {
        return null;
    }

    @Service("accountService")
    public class AccountService2Impl implements AccountService {
        @Autowired
        private AccountRepository accountRepository;

        @Override
        public void tranferMoney(long fromAccountId, long toAccountId, double amount) {
            Account sourceAccount = accountRepository.find(fromAccountId);
            Account targetAccount = accountRepository.find(toAccountId);
            sourceAccount.setBalance(sourceAccount.getBalance() - amount);
            targetAccount.setBalance(targetAccount.getBalance() + amount);
            accountRepository.update(sourceAccount);
            accountRepository.update(targetAccount);
        }

        @Override
        public void depositMoney(long accountId, double amount) throws Exception {
            Account account = accountRepository.find(accountId);
            account.setBalance(account.getBalance() + amount);
            accountRepository.update(account);
        }

        @Override
        public Account getAccount(long accountId) {
            return accountRepository.find(accountId);
        }
    }
}



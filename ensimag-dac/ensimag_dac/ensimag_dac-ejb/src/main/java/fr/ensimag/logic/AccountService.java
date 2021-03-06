package fr.ensimag.logic;

import fr.ensimag.dao.AccountDAOLocal;
import fr.ensimag.entity.Account;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Edward
 */
@Stateless
public class AccountService implements AccountServiceLocal {

    @EJB
    AccountDAOLocal accountDBAcces;
    
    @Override
    public void register(String username, String password) {
        Account account = new Account();
        account.setUsername(username);
        account.setPassword(password);
        accountDBAcces.create(account);
    }

}

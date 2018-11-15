package dao;

import java.util.List;

import model.Account;

public interface AccountDAO {

	public boolean saveAccount(Account account);
	
	public List<Account> getAccounts();

	public Account getAccount(Integer accountNo);

	public boolean deleteAccount(int accountNo);
	
}

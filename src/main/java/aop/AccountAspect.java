package aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import dao.AccountDAO;
import model.Account;

@Aspect
@Component
public class AccountAspect {

	@Before("execution(* dao.AccountDAOImpl.saveAccount(..))")
	public void validateAccount(JoinPoint joinPoint) {
		System.out.println("Method: ValidateAccount is being processed.");
		Object []args = joinPoint.getArgs();
		Account account = (Account)args[0];
		AccountDAO accountDAO = (AccountDAO) joinPoint.getTarget();
		int accountNo = account.getAccountNo();
		if(accountDAO.getAccount(accountNo) !=null) {
			throw new RuntimeException("Account with Account Number " + accountNo + " is already exists");
		}
	}
}

package app.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import app.validations.PSCode;

public class Account {

	@NotNull
	private Integer accountNo;
	
	@NotNull(message="Account Holder name cant be blank")
	@Size(min=2,max=50,message="Invalid length for Account Holder Name")
	@Pattern(regexp="[A-Za-z(\\s)]+", message="Invalid Account Holder Name")
	private String accountHolderName;
	
	@NotNull(message="Balance Amount is required")
	@Min(value=5000, message="Minimum balance must not be less than 5000")
	private Integer balance;
	
	@NotNull(message="Account Type cant be null")
	private String accountType;
	
	@DateTimeFormat(pattern="MM/dd/yyyy")
	@NotNull(message="Date Of Birth cant be null")
	@Past(message="Acount cant be created for a person not born")
	private Date dateOfBirth;
	
	@NotNull(message="PS Code is required")
	@PSCode(value="PSUSA",message="Security Code should start with PSUSA")
	private String psCode;
	
	public Account() {
		accountNo = 0;
		accountHolderName = "";
		balance = 0;
		accountType = "";
		dateOfBirth = new Date();
		psCode = "";
	}
	
	public Account(Integer accNo, String holderName, Integer balance,
			String accType, Date dob, String psCode
			) {
		this.accountNo = accNo;
		this.accountHolderName = holderName;
		this.balance = balance;
		this.accountType = accType;
		this.dateOfBirth = dob;
		this.psCode = psCode;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPsCode() {
		return psCode;
	}

	public void setPsCode(String psCode) {
		this.psCode = psCode;
	}

	public Integer getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(Integer accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public Integer getBalance() {
		return balance;
	}

	public void setBalance(Integer balance) {
		this.balance = balance;
	}

}

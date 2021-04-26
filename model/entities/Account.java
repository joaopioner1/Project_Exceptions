package model.entities;

import model.exceptions.BusinessException;

public class Account {

	private Integer number;
	private String holder;
	private Double balance, withdrawLimit;

	public Account() {
	}

	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public Double deposit(Double amount) {
		return balance += amount;
	}
	
	/*
	 * Nelio made a method just to validate the withdraw. I don't think that is necessary. 
	 */
	
	public void withdraw(Double amount) {
		if (balance < amount) {
			throw new BusinessException("Withdraw error: Not enough balance");
		}
		if (withdrawLimit < amount) {
			throw new BusinessException("Withdraw error: The amount exceeds withdraw limit");
		}
		this.balance = balance - amount;
	}
}

package com.usopen.bankbackend.transaction;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Transaction {

	@Id
	private long id;

	private long balance;

	private String type;

	private long balanceAfterTransaction;

	private String accountNumber;

}

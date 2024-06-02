package com.usopen.bankbackend.account;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Account {

	@Id
	private String number;

	private String type;

	private long balance;

	private String passwowrd;

	private int employeeId;

	private int branchId;

	private int customerId;

	private LocalDateTime createdAt;

	private LocalDateTime updateAt;
}

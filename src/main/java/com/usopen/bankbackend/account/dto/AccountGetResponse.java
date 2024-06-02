package com.usopen.bankbackend.account.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@Getter
@ToString
public class AccountGetResponse {
	private String number;
	private String type;
	private boolean isFirst;
	private long balance;
	private String passwowrd;
	private int employeeId;
	private int branchId;
	private long customerId;

}

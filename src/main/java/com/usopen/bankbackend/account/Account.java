package com.usopen.bankbackend.account;

import java.time.LocalDateTime;

import com.usopen.bankbackend.common.entity.BaseEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Getter
public class Account extends BaseEntity {

	@Id
	private String number;
	private String type;
	private boolean isFirst;
	private long balance;
	private String passwowrd;
	private int employeeId;
	private int branchId;
	private long customerId;

}

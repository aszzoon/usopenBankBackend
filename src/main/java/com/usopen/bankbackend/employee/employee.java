package com.usopen.bankbackend.employee;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class employee {

	@Id

	private long id;

	private String name;

	private long branchId;

}

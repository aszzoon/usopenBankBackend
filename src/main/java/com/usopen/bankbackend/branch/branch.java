package com.usopen.bankbackend.branch;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class branch {

	@Id
	private long id;

	private String name;

	private String address;
}

package com.usopen.bankbackend.customer;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customer {

	@Id
	private long id;

	private String name;

	private String grade;

	private int age;

	private String email;

	private String organization;

	private LocalDateTime createAt;

	private LocalDateTime updatedAt;
}

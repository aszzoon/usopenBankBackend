package com.usopen.bankbackend.account;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.usopen.bankbackend.account.dto.AccountGetResponse;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class AccountController {
	private final AccountService accountService;

	@GetMapping("/accounts") // TODO: header -> customer_id
	public List<AccountGetResponse> getAccount(@RequestParam long id) {
		return accountService.getAccounts(id);
	}
}

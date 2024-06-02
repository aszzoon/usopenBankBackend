package com.usopen.bankbackend.account;

import java.util.List;

import org.springframework.stereotype.Service;

import com.usopen.bankbackend.account.dto.AccountGetResponse;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AccountService {
  private final AccountRepository accountRepository;

  public List<AccountGetResponse> getAccounts(long customerId) {
    return accountRepository.findAccountByCustomerId(customerId)
            .stream().map(account -> AccountGetResponse.builder()
                    .number(account.getNumber())
                    .balance(account.getBalance())
                    .branchId(account.getBranchId())
                    .customerId(account.getCustomerId())
                    .build())
            .toList();
  }
}
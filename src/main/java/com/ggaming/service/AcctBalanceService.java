package com.ggaming.service;


import com.ggaming.domain.AcctBalance;

public interface AcctBalanceService {
     AcctBalance find(String accountno);

     String getBalance(String accountName);
}

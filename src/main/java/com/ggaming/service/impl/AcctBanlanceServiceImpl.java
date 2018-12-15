package com.ggaming.service.impl;

import com.ggaming.domain.AcctBalance;
import com.ggaming.mapper.AcctBalanceMapper;
import com.ggaming.service.AcctBalanceService;
import com.ggaming.util.DESEncrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AcctBanlanceServiceImpl implements AcctBalanceService {

    @Autowired
    private AcctBalanceMapper acctBalanceMapper;


    @Override
    public AcctBalance find(String accountno) {
        return acctBalanceMapper.selectByPrimaryKey(accountno);
    }

    @Override
    public String getBalance(String accountName) {
        AcctBalance acctBalance=acctBalanceMapper.selectByPrimaryKey(accountName);
        DESEncrypt des = new DESEncrypt("ggamingdes");
        String balanceStr = acctBalance.getBanlance();
        String balanceInt = null;
        try {
            balanceInt = des.decrypt(balanceStr);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //acctBalance.getBanlance();
        return balanceInt;
    }
}

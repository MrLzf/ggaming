package com.ggaming.service;


import com.ggaming.domain.AccountInfo;

import java.util.List;

public interface AccountInfoService {
     int add(AccountInfo accountInfo);
     int delete(String id);
     int update(AccountInfo accountInfo);
     AccountInfo find(String id);
     List<AccountInfo> all();
     AccountInfo accountAndPwdSelect(String accountid, String password);
}

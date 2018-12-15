package com.ggaming.service.impl;

import com.ggaming.domain.ApiCustomer;
import com.ggaming.mapper.ApiCustomerMapper;
import com.ggaming.service.ApiCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApiCustomerServiceImpl implements ApiCustomerService {

    @Autowired
    private ApiCustomerMapper apiCustomerMapper;


    @Override
    public ApiCustomer selectByPrimaryKey(String apicode) {
        return apiCustomerMapper.selectByPrimaryKey(apicode);
    }
}

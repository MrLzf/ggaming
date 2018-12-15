package com.ggaming.service;


import com.ggaming.domain.ApiCustomer;

public interface ApiCustomerService {
     ApiCustomer selectByPrimaryKey(String apicode);
}

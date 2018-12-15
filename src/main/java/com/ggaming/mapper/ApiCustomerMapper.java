package com.ggaming.mapper;

import com.ggaming.domain.ApiCustomer;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ApiCustomerMapper {
    int deleteByPrimaryKey(String apicode);

    int insert(ApiCustomer record);

    int insertSelective(ApiCustomer record);

    ApiCustomer selectByPrimaryKey(String apicode);

    int updateByPrimaryKeySelective(ApiCustomer record);

    int updateByPrimaryKey(ApiCustomer record);
    
    ApiCustomer apicodeByPrimaryKey(String apicode);
    
    List<ApiCustomer> compayIdByList(String compayId);
    
    //ApiCustomer apicodeByAccountno(String accountno);
}
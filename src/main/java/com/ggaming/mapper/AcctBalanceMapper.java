package com.ggaming.mapper;

import com.ggaming.domain.AcctBalance;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface AcctBalanceMapper {
    int deleteByPrimaryKey(String accountno);

    int insert(AcctBalance record);

    int insertSelective(AcctBalance record);

    AcctBalance selectByPrimaryKey(String accountno);

    int updateByPrimaryKeySelective(AcctBalance record);

    int updateByPrimaryKey(AcctBalance record);
}
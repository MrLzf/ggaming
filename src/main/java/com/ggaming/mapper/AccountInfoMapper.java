package com.ggaming.mapper;

import com.ggaming.domain.AccountInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AccountInfoMapper {
    int deleteByPrimaryKey(String accountno);

    int insert(AccountInfo record);

    int insertSelective(AccountInfo record);

    AccountInfo selectByPrimaryKey(String accountno);

    int updateByPrimaryKeySelective(AccountInfo record);

    int updateByPrimaryKey(AccountInfo record);
    
    /**
     * 根据用户名密码登陆
     * @param accountid
     * @param password
     * @return
     */
    AccountInfo accountAndPwdSelect(@Param("accountid") String accountid, @Param("password") String password);
    
    /**
     * 根据用户名初始密码登陆
     * @param accountid
     * @param password
     * @return
     */
    AccountInfo accountAndinitPwdSelect(String accountid, String password);
}
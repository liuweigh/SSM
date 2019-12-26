package com.shenruan.service;

import com.shenruan.domain.Account;

import java.util.List;

/**
 * 账户的业务层接口
 */
public interface IAccountService {
    /**
     * 查询所有
     * @return
     */
    List<Account> findAll();

    /**
     * 保存
     * @param account
     */
    void save (Account account);

}

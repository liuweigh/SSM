package com.shenruan.dao;

import com.shenruan.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IAccounDao {

    /**
     * 查询所有
     */
    @Select("select * from user_t")
    List<Account> findAll();

    /**
     * 保存所有
     */
    @Insert("insert into user_t(name,money)values(#{name},#{money})")
    void save(Account account);
 }

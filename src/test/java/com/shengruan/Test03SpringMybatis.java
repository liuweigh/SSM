package com.shengruan;

import com.shenruan.domain.Account;
import com.shenruan.service.IAccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * 测试spring  和mybatis 的整合结果
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class Test03SpringMybatis {
    @Autowired
    private IAccountService accountService;
    @Test
    public void testFindAll(){
        List<Account> accounts = accountService.findAll();
        for (Account account: accounts){
            System.out.println(account);
        }
    }

    @Test
    public void testSave(){
        Account account = new Account();
        account.setName("mybatis");
        account.setMoney(55555f);
        accountService.save(account);
    }
}

package com.shenruan.web.controller;

import com.shenruan.domain.Account;
import com.shenruan.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * 账户控制器
 */
@Controller
@RequestMapping("account")
public class AccountController {

    @Autowired
    private IAccountService accountService;
    /**
     * 保存
     * @param account
     * @return
     */

    @RequestMapping("save")
    public String save(Account account){
accountService.save(account);
        return "success";
    }

    /**
     * 查询所有
     * @return
     */
    @RequestMapping("findAll")
    public ModelAndView findAll(){
        List<Account> accounts= accountService.findAll();
        ModelAndView mv = new ModelAndView();
        mv.setViewName("success");
        mv.addObject("message",accounts);
        return mv;
    }

}

package com.shengruan;

import com.shenruan.dao.IAccounDao;
import com.shenruan.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * 测试mybaties 的环境搭建
 */
public class test02Mybaitis {
    public static void main(String[] args) throws IOException {
        //1.读取配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.创建构建者对象
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        //3.创建工厂对象
        SqlSessionFactory factory = builder.build(in);
        //4. 创建SqlSession对象
        SqlSession sqlSession = factory.openSession();
        //5.创建dao接口的代理实现类
        IAccounDao proxyAccountDao = sqlSession.getMapper(IAccounDao.class);
        //6.执行方法
        List<Account> accounts = proxyAccountDao.findAll();
     /* for (Account account:accounts){
          System.out.println(account);
      }*/

        Account account = new Account();
        account.setName("ee73");
        account.setMoney(20000f);
        proxyAccountDao.save(account);

        //7.释放资源
        sqlSession.commit();
        sqlSession.close();
      in.close();
    }

}

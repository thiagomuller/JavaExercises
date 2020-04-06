package com.thiagomuller.aopdemo;

import com.thiagomuller.aopdemo.dao.AccountDAO;
import com.thiagomuller.aopdemo.dao.MembershipDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainDemoApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(DemoConfig.class);

        AccountDAO accountDAO =
                context.getBean("accountDAO", AccountDAO.class);
        MembershipDAO membershipDAO =
                context.getBean("membershipDAO", MembershipDAO.class);

        Account account = new Account();
        accountDAO.addAccount(account, true);
        accountDAO.doWork();

        membershipDAO.addAccount();
        membershipDAO.goToSleep();

    }
}
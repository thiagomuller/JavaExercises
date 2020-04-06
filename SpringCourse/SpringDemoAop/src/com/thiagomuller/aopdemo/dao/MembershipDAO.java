package com.thiagomuller.aopdemo.dao;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {
    public void addAccount(){
        System.out.println(getClass() + ": DOING STUFF: ADDING A MEMBERSHIP ACCOUNT");
    }

    public void goToSleep(){
        System.out.printf(getClass() + ": " +
                "I'm go to sleep now...");
    }
}

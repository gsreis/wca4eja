package com.acme.modres.security;

import java.lang.reflect.Member;

public class Service {
    public static final String OPERATION = "my-operation";

    public void operation() {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            // this SecurityManager method is not availible in Java 11
            // securityManager.checkMemberAccess(Service.class, Member.PUBLIC);
        }
        System.out.println("Operation is executed");
    }
}

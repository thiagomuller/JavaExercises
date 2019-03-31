package com.thiagomuller;

import org.apache.commons.dbcp.BasicDataSource;

public class Config {
    private String username;
    private String password;
    private String dbUrl;


    public BasicDataSource configDB(){
        this.username = "scilobot";
        this.password = "sagan";
        this.dbUrl = "jdbc:postgresql://localhost/scilobot_db";

        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setUrl(this.dbUrl);
        basicDataSource.setUsername(this.username);
        basicDataSource.setPassword(this.password);

        return basicDataSource;
    }


}

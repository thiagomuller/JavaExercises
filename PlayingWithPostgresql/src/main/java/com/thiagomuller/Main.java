package com.thiagomuller;

import org.apache.commons.dbcp.BasicDataSource;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        String url = "http://news.mit.edu/2019/3q-david-pesetsky-what-is-linguistics-0327";
        Config config = new Config();
        BasicDataSource dataSource = config.configDB();

        try{
            Statement stmt = dataSource.getConnection().createStatement();
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS urls(url TEXT);");
            stmt.executeUpdate("INSERT INTO urls(url) VALUES('http://news.mit.edu/2019/3q-david-pesetsky-what-is-linguistics-0327');");
            ResultSet rs = stmt.executeQuery("SELECT url FROM urls;");
            while(rs.next()){
                System.out.println(rs.getString("url"));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

    }
}

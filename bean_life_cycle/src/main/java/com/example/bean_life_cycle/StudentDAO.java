package com.example.bean_life_cycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.xml.transform.Result;
import java.sql.*;

public class StudentDAO {

    private String url = "jdbc:mysql://localhost/SpringCore";
    private String userName ="root";
    private String passWord = "123456";
    private Connection con;



    public void setUrl(String url) {
        System.out.println("settet url dang duoc goi...");
        this.url = url;
    }

    public void setUserName(String userName) {
        System.out.println("settet userName dang duoc goi...");

        this.userName = userName;
    }

    public void setPassWord(String passWord) {
        System.out.println("settet passWord dang duoc goi...");

        this.passWord = passWord;
    }
    @PostConstruct
    public void init(){

        System.out.println("init dang duoc goi");
        createConnection();
    }

    public void createConnection(){
        try {
            con = DriverManager.getConnection(url,userName,passWord);
            System.out.println("method create dang duoc goi..");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void selectAllRows(){
        try {

            Statement std = con.createStatement();
            ResultSet rs  = std.executeQuery("SELECT * FROM springcore.student");
            while (rs.next()){
                int studentid = rs.getInt(1);
                String studentName = rs.getString(2);
                double hostDee = rs.getDouble(3);
                String foodType = rs.getString(4);
                System.out.println(studentid + " " + studentName +" " +hostDee + " " + foodType);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public void CloseConnextion(){
        try {
            con.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    @PreDestroy
    public void destroy(){
        CloseConnextion();
        System.out.println("destroy  duoc goi....");
    }
}

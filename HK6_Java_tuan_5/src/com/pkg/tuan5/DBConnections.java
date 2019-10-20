package com.pkg.tuan5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBConnections {

    public static Connection getConnection(){
        Connection conn =null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            try {
                conn=DriverManager.getConnection("jdbc:sqlserver://localhost:1433 ; databaseName=DB.LNH.Project ; user=sa ; password=123");
                System.out.println("ket noi thanh cong");
                System.out.println(conn);
            } catch (SQLException ex) {
                Logger.getLogger(DBConnections.class.getName()).log(Level.SEVERE, null, ex);
                 System.out.println("khong tim thay datatbase");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBConnections.class.getName()).log(Level.SEVERE, null, ex);
             System.out.println("khong tim thay driver");
        }
        return conn;
    }
    
    public static void main(String[] args) {
        System.out.println(getConnection());
    }
}

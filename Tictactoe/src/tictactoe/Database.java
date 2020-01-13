/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author user
 */
public class Database {
    boolean wasNull;
    Connection conn;
    boolean flag2,flag3;
    public Database()
    {
        try {
            	conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/tictactoe", "root", "#Number1");
        	} catch (SQLException ex) {
            		Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        	}
        	if (conn != null) {
            		System.out.println("Connected to the database!");
        	} else {
            		System.out.println("Failed to make connection!");
        	}
    }
    public boolean checkEmail(String email)
    { 
        
        try {
            PreparedStatement pst=conn.prepareStatement("select * from players where email = ?");
            pst.setString(1, email);
            ResultSet rs=pst.executeQuery();
            if(rs.first())
            {
                flag3= true;
            }
            else
                flag3 = false;
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return flag3;
    }
    public boolean checkUserName(String name)
    { 
        try {
            PreparedStatement pst=conn.prepareStatement("select * from players where Player_name = ?");
            pst.setString(1, name);
            ResultSet rs=pst.executeQuery();
            if(rs.first())
            {
                flag2= true;
            }
            else
                flag2 = false;
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return flag2;
    }
    public void registration(String name,String pass,String email)
    {
        try {
           
            PreparedStatement pst=conn.prepareStatement("insert into players (Player_name,Password,email) values(?,?,?)");
            pst.setString(1, name);
            pst.setString(2, pass);
            pst.setString(3, email);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    public boolean Login(String name,String pass)
    {
        String arr[]=new String[4];
        boolean flag=false;
        try {
            
            PreparedStatement pst=conn.prepareStatement("select * from players where Player_name = ? and Password = ?");
            pst.setString(1, name);
            pst.setString(2, pass);
            ResultSet rs=pst.executeQuery();
           // rs.next();
            
            if(!rs.first())
            {
                flag= false;
            }
            else 
            {
                flag= true;
                //rs.next();
                arr[0]=rs.getString("Player_name");
                arr[1]=rs.getString("Password");
                arr[2]=rs.getString("State");
                arr[3]=rs.getString("Score");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return flag;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentcourse;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

/**
 *
 * @author Ioana
 */
public class StudentInfo {
    Connectionx c=new Connectionx();
    public boolean InsertStudent(int id,String name,String birthdate,String address) throws SQLException
    {
        Connection con = c.getConnection();  
        String query="Select * form Student";
        Statement stmt = con.createStatement();
        ResultSet rs;
        rs = stmt.executeQuery(query);
            while ( rs.next() ) {
                if(rs.getString("Nume").equals(name) || rs.getInt("ID_Student")==id){
                    return false;
                }
            }
        String queryStr = "Insert into Student (ID_Student,Nume,BirthData,Adresa) values (?,?,?,?)";
        PreparedStatement pstmt =con.prepareStatement(queryStr);
        pstmt.setInt(1, id);
        pstmt.setString(2, name);
        pstmt.setString(3, birthdate);
        pstmt.setString(4, address);
        pstmt.execute();
        if(queryStr!=null)
            return true;
        else
            return false;
    }
    public boolean UpdateStudent(int id,String name,String birthdate,String address) throws SQLException
    {
        Connection con = c.getConnection();  
        String query="Select * form Student";
        Statement stmt = con.createStatement();
        ResultSet rs;
        rs = stmt.executeQuery(query);
            while ( rs.next() ) {
                if(rs.getInt("ID_Student")!=id){
                    return false;
                }
            }
        if(name!=null && birthdate==null && address==null){
        String sql = "UPDATE Student " +"SET Nume = ? WHERE ID_Student=?";
        PreparedStatement pstmt =con.prepareStatement(sql);
        pstmt.setString(1, name);
        pstmt.setInt(2, id);
        pstmt.executeUpdate();
        if(sql!=null)
            return true;
        else
            return false;
        }
        if(name==null && birthdate!=null && address==null){
        String sql = "UPDATE Student " +"SET BirthData = ? WHERE ID_Student=?";
        PreparedStatement pstmt =con.prepareStatement(sql);
        pstmt.setString(1, birthdate);
        pstmt.setInt(2, id);
        pstmt.executeUpdate();
        if(sql!=null)
            return true;
        else
            return false;
        }
        if(name==null && birthdate==null && address!=null){
        String sql = "UPDATE Student " +"SET Adresa = ? WHERE ID_Student=?";
        PreparedStatement pstmt =con.prepareStatement(sql);
        pstmt.setString(1, address);
        pstmt.setInt(2, id);
        pstmt.executeUpdate();
        if(sql!=null)
            return true;
        else
            return false;
        }
        return false;
    }
     public boolean DeleteStudent(int id) throws SQLException
    {
        Connection con = c.getConnection();  
        String query="Select * form Student";
        Statement stmt = con.createStatement();
        ResultSet rs;
        rs = stmt.executeQuery(query);
            while ( rs.next() ) {
                if(rs.getInt("ID_Student")!=id){
                    return false;
                }
            }  
        String sql = "delete from Student " +"WHERE ID_Student=?";
        PreparedStatement pstmt =con.prepareStatement(sql);
        pstmt.setInt(1, id);
        pstmt.execute();
        if(sql!=null)
            return true;
        else
            return false;
        
    }
}

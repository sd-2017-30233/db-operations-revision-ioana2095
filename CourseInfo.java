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

/**
 *
 * @author Ioana
 */
public class CourseInfo {
    Connectionx c=new Connectionx();
    public boolean InsertCourse(int id,String name,String Teacher,int Yearofstudy) throws SQLException
    {
        Connection con = c.getConnection();  
        String query="Select * form Courses";
        Statement stmt = con.createStatement();
        ResultSet rs;
        rs = stmt.executeQuery(query);
            while ( rs.next() ) {
                if(rs.getString("Nume").equals(name) || rs.getString("ID_Courses").equals(id)){
                    return false;
                }
            }
        
        String queryStr = "Insert into Courses (ID_Courses,Nume,Teacher,Yearofstudy) values (?,?,?,?)";
        PreparedStatement pstmt =con.prepareStatement(queryStr);
        pstmt.setInt(1, id);
        pstmt.setString(2, name);
        pstmt.setString(3, Teacher);
        pstmt.setInt(4, Yearofstudy);
        pstmt.execute();
        if(queryStr!=null)
            return true;
        else
            return false;
    }
    public boolean UpdateCourse(int id,String name,String Teacher,int Yearofstudy) throws SQLException
    {
        Connection con = c.getConnection();  
        String query="Select * form Courses";
        Statement stmt = con.createStatement();
        ResultSet rs;
        rs = stmt.executeQuery(query);
            while ( rs.next() ) {
                if(rs.getInt("ID_Courses")!=id){
                    return false;
                }
            }
        if(name!=null && Teacher==null && Yearofstudy==0){
        String sql = "UPDATE Courses " +"SET Nume = ? WHERE ID_Courses=?";
        PreparedStatement pstmt =con.prepareStatement(sql);
        pstmt.setString(1, name);
        pstmt.setInt(2, id);
        pstmt.executeUpdate();
        if(sql!=null)
            return true;
        else
            return false;
        }
        if(name==null && Teacher!=null && Yearofstudy==0){
        String sql = "UPDATE Courses " +"SET Teacher = ? WHERE ID_Courses=?";
        PreparedStatement pstmt =con.prepareStatement(sql);
        pstmt.setString(1, Teacher);
        pstmt.setInt(2, id);
        pstmt.executeUpdate();
        if(sql!=null)
            return true;
        else
            return false;
        }
        if(name==null && Teacher==null && Yearofstudy!=0){
        String sql = "UPDATE Courses " +"SET Yearofstudy = ? WHERE ID_Courses=?";
        PreparedStatement pstmt =con.prepareStatement(sql);
        pstmt.setInt(1, Yearofstudy);
        pstmt.setInt(2, id);
        pstmt.executeUpdate();
        if(sql!=null)
            return true;
        else
            return false;
        }
        return false;
    }
     public boolean DeleteCourse(int id) throws SQLException
    {
        Connection con = c.getConnection();  
        String query="Select * form Courses";
        Statement stmt = con.createStatement();
        ResultSet rs;
        rs = stmt.executeQuery(query);
            while ( rs.next() ) {
                if(rs.getInt("ID_Courses")!=id){
                    return false;
                }
            }
        String sql = "delete from Courses " +"WHERE ID_Courses=?";
        PreparedStatement pstmt =con.prepareStatement(sql);
        pstmt.setInt(1, id);
        pstmt.execute();
        if(sql!=null)
            return true;
        else
            return false;
        
    }
}

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
import java.util.ArrayList;

/**
 *
 * @author Ioana
 */
public class StudentEnroll {
    private Connectionx c=new Connectionx();
    private ArrayList<Integer> idCourse=new ArrayList<Integer>();
    public boolean InsertCourse(String nameStudent,ArrayList<String> nameCourses) throws SQLException
    {
        Connection con = c.getConnection();  
        String str="Select ID_Student,Nume from Student";
        Statement stmt = con.createStatement();
        ResultSet rs;
        int idStudent=0;
        rs = stmt.executeQuery(str);
            while ( rs.next() ) {
                if(rs.getString("Nume").equals(nameStudent))
                idStudent=rs.getInt("ID_Student");
                else
                    return false;
            }
        for(int i=0;i<nameCourses.size();i++){
        String str1="Select ID_Courses,Nume from Courses";
        Statement stmt1 = con.createStatement();
        ResultSet rs1;
        rs1 = stmt1.executeQuery(str1);
            while ( rs1.next() ) {
                if(rs1.getString("Nume").equals(nameCourses.get(i)))
                idCourse.add(rs1.getInt("ID_Courses"));
                else
                    return false;
            }
        }
        for(int i=0;i<nameCourses.size();i++){
        String queryStr = "Insert into StudentEnroll (ID_Student,ID_Courses) values (?,?)";
        PreparedStatement pstmt =con.prepareStatement(queryStr);
        pstmt.setInt(1,idStudent);
        pstmt.setInt(2, idCourse.get(i));
        pstmt.execute();
        }
        return true;
    }
    public boolean ViewStudentInfo(String numeStudent) throws SQLException
    {
        Connection con = c.getConnection();  
        String str="Select * from Student";
        Statement stmt = con.createStatement();
        ResultSet rs;
        rs = stmt.executeQuery(str);
            while ( rs.next() ) {
                if(rs.getString("Nume").equals(numeStudent)){
                    System.out.println(rs.getInt("ID_Student"));
                    System.out.println(rs.getString("Nume"));
                    System.out.println(rs.getString("BirthData"));
                    System.out.println(rs.getString("Adresa"));
                }
            }
            if(str!=null)
            return true;
        else
            return false;
    }
    public boolean ViewCoursesInfo(String numeCourses) throws SQLException
    {
        Connection con = c.getConnection();  
        String str="Select * from Courses";
        Statement stmt = con.createStatement();
        ResultSet rs;
        rs = stmt.executeQuery(str);
            while ( rs.next() ) {
                if(rs.getString("Nume").equals(numeCourses)){
                    System.out.println(rs.getInt("ID_Courses"));
                    System.out.println(rs.getString("Nume"));
                    System.out.println(rs.getString("Teacher"));
                    System.out.println(rs.getInt("Yearofstudy"));
                }
            }
             if(str!=null)
            return true;
        else
            return false;
    }
    public boolean ViewInfo(String numeCourses) throws SQLException
    {
        Connection con = c.getConnection();  
        String str="Select * from Courses";
        Statement stmt = con.createStatement();
        ResultSet rs;
        int idCourse=0;
        rs = stmt.executeQuery(str);
            while ( rs.next() ) {
                if(rs.getString("Nume").equals(numeCourses)){
                    idCourse=rs.getInt("ID_Courses");
                }
                else
                    return false;
            }
        String str1="Select * from StudentEnroll";
        Statement stmt1 = con.createStatement();
        ResultSet rs1;
        rs1 = stmt1.executeQuery(str1);
            while ( rs1.next() ) {
                if(rs1.getInt("ID_Courses")==idCourse){
                    int idS=rs1.getInt("ID_Student");
                    String str2="Select * from Student";
                    Statement stmt2 = con.createStatement();
                    ResultSet rs2;
                    rs2 = stmt.executeQuery(str2);
                    while ( rs2.next() ) {
                        if(rs2.getInt("ID_Student")==idS)
                        System.out.println(rs2.getString("Nume"));
                        else
                            return false;
                    }
                }
            }
            return true;
    }
}

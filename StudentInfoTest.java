/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentcourse;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ioana
 */
public class StudentInfoTest {
    
    public StudentInfoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of InsertStudent method, of class StudentInfo.
     */
    @Test
    public void testInsertStudent() throws Exception {
        System.out.println("InsertStudent");
        StudentInfo instance = new StudentInfo();
        boolean expResult = true;
        boolean result = instance.InsertStudent(213456, "PopescuAndreea","1995-02-12", "str. Alexandru Vlad nr.90 jud. Cluj");
        assertEquals(expResult, result);
    }

    /**
     * Test of UpdateStudent method, of class StudentInfo.
     */
    @Test
    public void testUpdateStudent() throws Exception {
        System.out.println("UpdateStudent");
        StudentInfo instance = new StudentInfo();
        boolean expResult = true;
        boolean result = instance.UpdateStudent(213456, null, null, "str. Alexandru Vlad nr.99 jud. Cluj");
        assertEquals(expResult, result);
    }

    /**
     * Test of DeleteStudent method, of class StudentInfo.
     */
    @Test
    public void testDeleteStudent() throws Exception {
        System.out.println("DeleteStudent");
        StudentInfo instance = new StudentInfo();
        boolean expResult = true;
        boolean result = instance.DeleteStudent(213456);
        assertEquals(expResult, result);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentcourse;

import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ioana
 */
public class StudentEnrollTest {
    
    public StudentEnrollTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of InsertCourse method, of class StudentEnroll.
     */
    @Test
    public void testInsertCourse() throws Exception {
        System.out.println("InsertCourse");
        StudentEnroll instance = new StudentEnroll();
        boolean expResult = true;
        boolean result = instance.InsertCourse(nameStudent, nameCourses);
        assertEquals(expResult, result);
    }

    /**
     * Test of ViewStudentInfo method, of class StudentEnroll.
     */
    @Test
    public void testViewStudentInfo() throws Exception {
        System.out.println("ViewStudentInfo");
        StudentEnroll instance = new StudentEnroll();
        boolean expResult = true;
        boolean result = instance.ViewStudentInfo(numeStudent);
        assertEquals(expResult, result);
    }

    /**
     * Test of ViewCoursesInfo method, of class StudentEnroll.
     */
    @Test
    public void testViewCoursesInfo() throws Exception {
        System.out.println("ViewCoursesInfo");
        StudentEnroll instance = new StudentEnroll();
        boolean expResult = true;
        boolean result = instance.ViewCoursesInfo(numeCourses);
        assertEquals(expResult, result);
    }

    /**
     * Test of ViewInfo method, of class StudentEnroll.
     */
    @Test
    public void testViewInfo() throws Exception {
        System.out.println("ViewInfo");
        StudentEnroll instance = new StudentEnroll();
        boolean expResult = true;
        boolean result = instance.ViewInfo(numeCourses);
        assertEquals(expResult, result);
    }
    
}

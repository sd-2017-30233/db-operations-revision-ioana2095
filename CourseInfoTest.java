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
public class CourseInfoTest {
    
    public CourseInfoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of InsertCourse method, of class CourseInfo.
     */
    @Test
    public void testInsertCourse() throws Exception {
        System.out.println("InsertCourse");
        CourseInfo instance = new CourseInfo();
        boolean expResult = true;
        boolean result = instance.InsertCourse(7, "Biologie", "Popescu V.", 2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of UpdateCourse method, of class CourseInfo.
     */
    @Test
    public void testUpdateCourse() throws Exception {
        System.out.println("UpdateCourse");
        CourseInfo instance = new CourseInfo();
        boolean expResult = true;
        boolean result = instance.UpdateCourse(7, null, "Pop M.", 0);
        assertEquals(expResult, result);
    }

    /**
     * Test of DeleteCourse method, of class CourseInfo.
     */
    @Test
    public void testDeleteCourse() throws Exception {
        System.out.println("DeleteCourse");
        CourseInfo instance = new CourseInfo();
        boolean expResult = true;
        boolean result = instance.DeleteCourse(7);
        assertEquals(expResult, result);
    }
    
}

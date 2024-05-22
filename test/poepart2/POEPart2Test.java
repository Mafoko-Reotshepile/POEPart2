/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package poepart2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class POEPart2Test {
    
    public POEPart2Test() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of main method, of class POEPart2.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null ;
        POEPart2.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Menu method, of class POEPart2.
     */
    @Test
    public void testMenu() {
        System.out.println("Menu");
        POEPart2.Menu();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addTasks method, of class POEPart2.
     */
    @Test
    public void testAddTasks() {
        System.out.println("addTasks");
        POEPart2.addTasks();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showReport method, of class POEPart2.
     */
    @Test
    public void testShowReport() {
        System.out.println("showReport");
        POEPart2.showReport();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class POEPart2.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        POEPart2 instance = null;
        String expResult = "Login Feature";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createTaskID method, of class POEPart2.
     */
    @Test
    public void testCreateTaskID() {
        System.out.println("createTaskID");
        POEPart2 instance = null;
        String expResult = "";
        String result = instance.createTaskID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

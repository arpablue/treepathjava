/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arpablue.treepath;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ASUS
 */
public class TreePathTest {
    
    public TreePathTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of add method, of class TreePath.
     */
    @Test
    public void test_TreePath_Add() {
        System.out.println("---------------test_TreePath_Add");
            TreePath t = new TreePath();
            t.add("first/","1");
            t.add("second","1");
            t.add("third","1");
            System.out.println( t.JSONbeauty() );
    }
     @Test
    public void test_TreePath_DeepAdd() {
        System.out.println("---------------test_TreePath_DeepAdd");
            TreePath t = new TreePath();
            t.add("a/","1");
            t.add("b/d","2");
            t.add("b/e","3");
            t.add("b/f","4");
            t.add("c/g/h/i/j","5");
            t.add("c/g/h/i/k","6");
            t.add("c/g/h/i/l","7");
            System.out.println( t.JSONbeauty() );
    }
      
}

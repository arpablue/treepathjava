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
     * Test of set method, of class TreePath.
     */
    //@Test
    public void test_TreePath_Add() {
        System.out.println("---------------test_TreePath_Add");
        TreePath t = new TreePath();
        t.set("first/", "1");
        t.set("second", "1");
        t.set("third", "1");
        System.out.println(t.toJSONbeauty());
    }

    //@Test
    public void test_TreePath_DeepAdd() {
        System.out.println("---------------test_TreePath_DeepAdd");
        TreePath t = new TreePath();
        t.set("a/", "1");
        t.set("b/d", "2");
        t.set("b/e", "3");
        t.set("b/f", "4");
        t.set("c/g/h/i/j", "5");
        t.set("c/g/h/i/k", "6");
        t.set("c/g/h/i/l", "7");
        System.out.println(t.toJSONbeauty());
    }

    /**
     * It verify that a root is set in the root node
     */
    //@Test
    public void test_TreePath_setAVector_root() {
        System.out.println("---------------test_TreePath_setAVector_root");
        TreePath t = new TreePath();
        String[] array = new String[4];
        array[0] = "a";
        array[1] = "b";
        array[2] = "c";
        array[3] = "d";
        t.add( array );
        System.out.println( t.toJSONbeauty() );
    }
    /**
     * It set an array in the fisrt level.
     */
    @Test
    public void test_TreePath_add_a_vector_level_1()
    {
        System.out.println("---------------test_TreePath_setAVector_root");
        TreePath t = new TreePath();
        
        String[] array = new String[4];
        array[0] = "a";
        array[1] = "b";
        array[2] = "c";
        array[3] = "d";
        
        String[] array1 = new String[4];
        array1[0] = "e";
        array1[1] = "f";
        array1[2] = "g";
        array1[3] = "h";
        t.set( "options", array );
        t.set( "features/test", array1 );
        System.out.println( t.toJSONbeauty() );
        System.out.println("-------------------");
        t.set( "options/2", "value1" );
        t.set( "features/test/1", "Value X" );
        System.out.println( t.toJSONbeauty() );
    }

}

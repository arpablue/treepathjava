/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arpablue.treepath.node;

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
public class TreePath_PairTest {
    
    public TreePath_PairTest() {
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
     * It verify the toString methotd is returning the correct value.
     */
    @Test
    public void test_TreePath_Pair_toString() {
        System.out.println("--------------test_TreePath_Pair_toString");
        TreePath_Pair target = new TreePath_Pair();
        target.setKey("MyKey");
        target.setValue(33);
        System.out.println( target.toString());
        
    }
    /**
     * It verify the toString methotd is returning the correct value.
     */
    @Test
    public void test_TreePath_Pair_toJSONbeauty() {
        System.out.println("--------------test_TreePath_Pair_toJSONbeauty");
        TreePath_Pair target = new TreePath_Pair();
        target.setKey("MyKey");
        target.setValue(33);
        System.out.println( target.toJSON());
        
    }
    /**
     * It verify the toString methotd is returning the correct value.
     */
    @Test
    public void test_TreePath_Pair_toJSONbeauty_FromString() {
        System.out.println("--------------test_TreePath_Pair_toJSONbeauty_FromString");
        TreePath_Pair target = new TreePath_Pair();
        target.setKey("MyKey");
        target.setValue("car");
        System.out.println( target.toJSONbeauty(null));
        
    }
    /**
     * It verify the toString methotd is returning the correct value.
     */
    @Test
    public void test_TreePath_Pair_toJSONbeauty_FromString_withMargin() {
        System.out.println("--------------test_TreePath_Pair_toJSONbeauty_FromString_withMargin");
        TreePath_Pair target = new TreePath_Pair();
        target.setKey("MyKey");
        target.setValue("car");
        System.out.println( target.toJSONbeauty("    "));
        
    }
    
}

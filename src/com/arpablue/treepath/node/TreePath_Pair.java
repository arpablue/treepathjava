/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arpablue.treepath.node;

import com.arpablue.treepath.TreePath;

/**
 * It manage the method to interact witht he other clase.
 * @author ASUS
 */
public class TreePath_Pair extends TreePath_Pair_To
{
    /**
     * Default constructor.
     */
    public TreePath_Pair()
    {        
    }
    /**
     * It initialize the curren object with two values.
     * @param key It is the assigned key.
     * @param value It i sthe assigned value.
     */
    public TreePath_Pair(String key, Object value)
    {        
        this.setKey(key);
        this.setValue(value);
    }
    /**
     * It specify the new value.
     * @param value It i sthe new value.
     */
    public void setValue( Object value){
        mValue = value;
    }

    
}

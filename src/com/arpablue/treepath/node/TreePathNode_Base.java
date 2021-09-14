/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arpablue.treepath.node;

/**
 *
 * @author ASUS
 */
class TreePathNode_Base 
{
    /**
     * It set a format a string to be in a specific format.
     * @param target It is the string to format.
     * @return It is the string formated.
     */
    protected static String setFormat( String target )
    {
        if( target == null )
        {
            return null;
        }
        target = target.trim();
        target = target.replace('/', ' ');
        target = target.trim();
        target = target.replace(' ', '/');
        return target;
    }
    
}

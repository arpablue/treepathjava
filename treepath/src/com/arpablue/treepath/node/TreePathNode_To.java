/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arpablue.treepath.node;

import com.arpablue.treepath.TreePath;

/**
 *
 * @author ASUS
 */
class TreePathNode_To extends TreePathNode_Logic
{
    public String toJSON()
    {
           return "TPN to develop.";
    }
    public String toJSONbeauty( String margin)
    {
        String res="";
        if( this.mChildren == null )
        {
            return "null";
        }
        if( this.mChildren.isEmpty() )
        {
            return "{}";
        }
        res = "{";
        boolean seconds = false;
        for( TreePath_Pair node : this.mChildren )
        {
            if( seconds )
            {
                res = res + ",";
            }
            seconds = true;
            res = res + "\r\n" + margin + TreePath.MARGIN + node.toJSONbeauty(margin + TreePath.MARGIN);
        }
        res = res + "\r\n" + margin + "}";
        return res;
    }
    /**
     * It return the data of the current object in a JSON format.
     * @return It is the string that conatins the data fot he current data.
     */
    @Override
    public String toString()
    {
        return toJSON();
    }
}

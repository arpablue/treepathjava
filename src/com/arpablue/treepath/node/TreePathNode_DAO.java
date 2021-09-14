/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arpablue.treepath.node;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
class TreePathNode_DAO extends TreePathNode_Base
{
    /**
     * it specify if the current level is an array.
     */
    protected boolean mIsArray;
    /**
     * It contains the value of the curent level.
     */
    protected ArrayList<TreePath_Pair> mChildren;
    /**
     * Default constructor.
     */
    public TreePathNode_DAO()
    {
        mIsArray = false;
        initThis();
    }
    /**
     * it configure the settings for the current node.
     */
    protected void initThis()
    {
        if( this.mChildren == null )
        {
            this.mChildren = new ArrayList<TreePath_Pair>();
        }
        
    }
    /**
     * It is to verify the content is a array or not.
     * @return It is true the data ofthe current levl is an array.
     */
    protected  boolean isArray()
    {
        return this.mIsArray;
    }
    /**
     * It add value to the current node
     * @param key It is  the key used fore the current level.
     * @param value IT is the new level added.
     */
    
   protected void setNode( String key, Object value)
   {
       this.initThis();
       TreePath_Pair n = this.getNode(key);
       if( n != null )
       {
           n.setValue(value);
           return;
       }
       n = new TreePath_Pair( key, value);
       this.mChildren.add(n);
   }
    /**
     * It return a node with a specific key, if the node not exists then return null.
     * @param key It is the key to searh the node.
     * @return It is the node that content the key.
     */
    protected TreePath_Pair getNode( String key)
    {
        if( this.mChildren == null )
        {
            return null;
        }
        for( TreePath_Pair node : this.mChildren )
        {
           if( node.equalsTo(key) ) 
           {
               return node;
           }
        }
        return null;
    }

}

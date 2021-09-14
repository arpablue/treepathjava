/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arpablue.treepath;

import com.arpablue.treepath.node.TreePathNode;

/**
 *
 * @author ASUS
 */
public class TreePath 
{
    /**
     * It is the margin used for the beautifyer of the JSON.
     */
    public static String MARGIN = "    ";
    /**
     * It is the first node of the tree.
     */
    protected TreePathNode mRoot;
    /**
     * default constructor.
     */
    public TreePath()
    {
        mRoot = new TreePathNode();
    }
    /**
     * It add a element using a key path to epecify the structure where the value should be added.
     * If the key path not exists then it is added.
     * @param key It is the key path.
     * @param value It is the new value to the key path.
     */
    public void set( String key, Object value )
    {
        this.mRoot.set(key, value);
    }
    /**
     * It specify a node for the roo node.
     * @param array Ity i sthe array to specify the current node.
     */
    public void add( Object[] array )
    {
        this.mRoot.addArray( array );
    }
    /**
     * It return the data of the current object in string with JSON format
     * @return 
     */
    public String toJSON(){
        if( this.mRoot == null ){
            return "{}";
        }
        return this.mRoot.toJSON();
    }
    public String toJSONbeauty(String margin){
        if( this.mRoot == null )
        {
            return "{}";
        }
        return this.mRoot.toJSONbeauty( margin );
    }
    public String toJSONbeauty(){
        return this.toJSONbeauty("");
    }
    /**
     * It return another object with the a clone of each element in the node and the same values.
     * @return it it the clone of the current tree.
     */
    public Object cloneMe() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * It return the data of the current object in a JSON format.
     * @return It is the String with the data of the current object.
     */
    @Override
    public String toString()
    {
        return this.toJSON();
    }
    
}

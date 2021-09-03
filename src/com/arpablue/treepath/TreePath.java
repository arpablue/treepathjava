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
     * It set a format a string to be in a specific format.
     * @param target It is the string to format.
     * @return It is the string formated.
     */
    protected String setFormat( String target )
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
    /**
     * It add a element using a key path to epecify the structure where the value should be added.
     * If the key path not exists then it is added.
     * @param key It is the key path.
     * @param value It is the new value to the key path.
     */
    public void add( String key, Object value )
    {
        key = this.setFormat(key);
        if( key == null ){
            return;
        }
        if( key.length() < 1)
        {
            return;
        }
        String[] keys = key.split("/");
        this.mRoot.add(keys, 0, value);
        
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
    public String JSONbeauty(){
        return this.toJSONbeauty("");
    }
 
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

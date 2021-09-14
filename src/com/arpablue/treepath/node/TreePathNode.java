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
public class TreePathNode extends TreePathNode_To
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
    /**
     * It add a element using a key.
     * @param key It is the key for the value.
     * @param value It is the value assigned to the key.
     */
    public void set(String key , Object value)
    {
        if( key == null)
        {
            return;
        }
        key = TreePathNode_Base.setFormat(key );
        String[] keys = key.split("/");
        this.set(keys, 0, value);
         
    }
    /**
     * It set a element in the current node or in the childs.
     * @param keys It is the list of keys to identify the level of the value.
     * @param index It is the current level of the TrePath.
     * @param value It is the new value assigned.
     */
    public void set( String[] keys, int index, Object value )
    {
        if( keys == null )
        {
            return;
        }
        if( keys.length < 1 )
        {
            return;
        }
        if( index < 0)
        {
            return ;
        }
        if( keys.length <= index )
        {
            return; 
        }
        this.mIsArray = false;
        String key = keys[index] ;
        if( index == keys.length - 1 )
        {
            value = getRealValue( value );
            this.setNode( key, value);
            return;
        }
        TreePath_Pair node = this.getNode( key );
        if( node == null){
            node = new TreePath_Pair( key, ((Object)new TreePathNode()) );
            this.mChildren.add(node);
        }
        Object obj = node.getValue();
        if( obj == null )
        {
            obj = ((Object) new TreePathNode());
            node.setValue( obj );
        }
        if( !(obj instanceof TreePathNode) )
        {
            obj = ((Object) new TreePathNode());
            node.setValue( obj );
        }
        TreePathNode tree = (TreePathNode) obj;
        tree.set(keys,index+1,value);
    }
    protected Object getRealValue(Object value )
    {
        if( value == null )
        {
            return value;
        }
        
        if( value.getClass().isArray() )
        {
            value = (Object) getFromArray( value );
        }
        return value;
    }
    /**
     * It return a value from an array object.
     * @param value It is the value assigned to an array.
     * @return It is the TreePathNode associated to the array.
     */
    protected TreePathNode getFromArray(Object value)
    {
        if( value == null )
        {
            return null;
        }
        TreePathNode res = new TreePathNode();
        
        Object[] array = (Object[]) value;
        res.addArray(array);
        return res;
    }
    /**
     * It specify an array to the current node.
     * @param array It is the array for the current node. 
     */
    public void addArray( Object[] array)
    {
        this.mChildren.clear();
        if( array == null )
        {
            return;
        }
        int index = 0;
        TreePath_Pair child;
        this.mIsArray = true;
        for( Object e : array)
        {
            child = new TreePath_Pair();
            child.setKey( index + "" );
            child.setValue(e);
            this.mChildren.add(child);
            index++;
        }
    }

}

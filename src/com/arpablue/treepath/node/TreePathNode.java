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
     * It add a element in the current node or in the childs.
     * @param keys It is the list of keys to identify the level of the value.
     * @param index It is the current level of the TrePath.
     * @param value It is the new value assigned.
     */
    public void add( String[] keys, int index, Object value )
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
        String key = keys[index] ;
        if( index == keys.length - 1 )
        {
            if( value.getClass().isArray() )
            {
                this.setArray( key,  (Object[]) value );
            }
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
        tree.add(keys,index+1,value);
        
        
    }
}

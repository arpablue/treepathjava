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
class TreePath_Pair_Logic  extends TreePath_Pair_DAO
{
    /**
     * It compare the current object with another TreePath, It compare the keys of two objects.
     * @param target It is the Object tobe compared,
     * @return It is true if both objects has the same keys.
     */
    public boolean equalsTo( TreePath_Pair target )
    {
        if( ( this.getKey() == null ) && ( target.getKey() == null ) ){
            return false;
        }
        if( this.getKey() == null )
        {
            return false;
        }
        if( target.getValue() == null )
        {
            return false;
        }
        return this.equalsTo(target.getKey());
    }
    /**
     * It verify if a String is equals to the jeççkey of the current node.
     * @param target It is the string to verify if the key is the same.
     * @return Iti s true the current key is equals to the string.
     */
    public boolean equalsTo( String target )
    {
        if( ( this.getKey() == null ) && ( target == null ) ){
            return false;
        }
        if( this.getKey() == null )
        {
            return false;
        }
        if( target == null )
        {
            return false;
        }
        return this.getKey().equalsIgnoreCase(target);
    }
    /**
     * It return another object bue with the same values of the current object.
     */
    public TreePath_Pair cloneMe()
    {
        TreePath_Pair res = new TreePath_Pair();
        res.setKey(this.getKey());
        if( this.mValue instanceof TreePath ){
            res.setValue( ((TreePath)this.mValue).cloneMe() );
        }else{
            res.setValue(mValue);
        }
        return res;
    }
}

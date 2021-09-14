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
class TreePath_Pair_DAO  extends TreePath_Pair_Base
{
    /**
     * It is the key of the pair.
     */
    protected String mKey;
    /**
     * It is the value of the pair.
     */
    protected Object mValue;
    /**
     * it i sthe current key.
     * @param key 
     */
    public void setKey( String key ){
        mKey = key;
        if( mKey != null ){
            mKey = mKey.trim();
        }
    }
    /**
     * It return the current key.
     * @return 
     */
    public String getKey(){
        return this.mKey;
    }
    /**
     * It return the current value, it is the current value.
     * @return It is the current value.
     */
    public Object getValue()
    {
        return mValue;
    }
    
}

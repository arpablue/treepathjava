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
class TreePath_Pair_To  extends TreePath_Pair_Logic
{
    /**
     * It returnthe string value of the current value, if the value is a String then it is retuned with double quotes.
     * @return It ist he string fo the object,
     */
    protected String getValueString(String margin)
    {
        String res = "";
        if( this.getValue() == null )
        {
            return null;
        }
        if( this.mValue instanceof String )
        {
            return "\""+this.getValue().toString()+"\"";
        }
        if( this.mValue instanceof TreePathNode )
        {
            return ((TreePathNode) mValue).toJSONbeauty(margin);
        }
        if( this.mValue instanceof TreePath )
        {
            return ((TreePath) mValue).toJSONbeauty(margin);
        }
        return this.getValue().toString();
    }
    /**
     * It returnt he pair in JSON format.
     * @param margin it is the white space added to the begining of the string. It
     * return the data of the object in a JSON format.
     * @return It isthe string of the object in JSON format.
     */
    public String toJSONbeauty(String margin)
    {
        String res = "";
        if( margin == null )
        {
            res = res + "\"" + this.getKey()+"\":";
            res = res + this.getValueString( null );
        }else{
            res = res + "\"" + this.getKey()+"\":";
            res = res + this.getValueString( margin + TreePath.MARGIN );
        }
        
        return res;
    }
    /**
     * It return the current data in HJSON format to be added to a JSON object..
     * @return It is the srting in JSON format.
     */
    public String toJSON()
    {
        String res = "";
        res = res +"\"" + this.getKey()+"\":";
        res = res +this.getValueString(null);   
        return res;
    }
    /**
     * It return the data of the object in JSON fomat.
     * @return It is the String withthe data of the object.
     */
    @Override
    public String toString()
    {
        return this.toJSON();
    }
}

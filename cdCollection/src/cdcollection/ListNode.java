/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdcollection;

/**
 *
 * @author Ivan Day
 */
public class ListNode {
    private Object value;
    private ListNode next;
    
    public ListNode(Object initValue, ListNode initNext){
        value = initValue;
        next = initNext;
    }
    
    public Object getValue(){
        return value;
    }
    
    public ListNode getNext(){
        return next;
    }
    
    public void setValue (Object theNewValue){
        value = theNewValue;
    }
    
    public void setNext (ListNode theNewNext){
        next = theNewNext;
    }
}

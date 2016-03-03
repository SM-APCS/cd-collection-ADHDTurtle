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
public class CDList {
    private ListNode list;
    
    public CDList(){
        list = null;
    }
    
    public void add (CD CompactDisk){
        ListNode node = new ListNode (CompactDisk, null);
        ListNode current;
        
        if (list == null)
            list = node;
        else{
            current = list;
            while(current.getNext() != null)
                current = current.getNext();
            current.setNext(node);
        }
    }
    
    public String toString (){
        String result = "";
        
        ListNode current = list;
        
        while (current != null){
            result += current.getValue().toString() + "\n";
            current = current.getNext();
        }
        
        return result;
    }
}

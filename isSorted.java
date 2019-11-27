/*
* Write a method isSorted that returns true if the list is in sorted (nondecreasing) order and 
* returns false otherwise. An empty list is considered to be sorted.
*/
public boolean isSorted(){
    ListNode curr = front;
    boolean temp = true;
    if(curr==null){
        return temp;
    }
    else{
        while(curr.next != null){
            if(curr.data > curr.next.data){   
                temp = false;
            }
            
            curr = curr.next;
        }
       return temp; 
    }
}

public ListNode reverse(){
    ListNode curr = front;
   
    if(curr == null){
        return front;
    }
    ListNode back = null;
    while(curr.next!=null){
      ListNode temp = front.next;
      front = front.next;      
      curr.next = back;
      back = curr;   
      temp = temp.next;  
      curr = front;       
    }
    curr.next = back;
    return back;  
}

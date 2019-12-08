// Write a method reverse that reverses the order of the elements in the list. For example, if the variable list initially stores this sequence of integers:

// [1, 8, 19, 4, 17]
// It should store the following sequence of integers after reverse is called:

// [17, 4, 19, 8, 1]

public void reverse(){
    ListNode back = null;
    
    while(front!=null){
      ListNode temp = front.next;
      front.next = back;     
      back = front;
      front = temp;
    }
    front = back; 
}

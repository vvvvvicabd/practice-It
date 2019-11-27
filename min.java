/*
* BJP5 Exercise 16.2: min
* Write a method min that returns the minimum value in a list of integers.
* If the list is empty, it should throw a NoSuchElementException. 
*/
public int min(){
    // exception should always be placed on top of the code
    if(front == null){
        throw new NoSuchElementException();
    }
    else{
        ListNode curr = front;
        int min = curr.data;
        while(curr!=null){
            if(curr.data < min){
                min = curr.data;
            }
            //remember to move the pointer when one node has been checked
            curr = curr.next;
        }
        return min;
    }
    
}

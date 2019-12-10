import java.util.*;

public Static alternatingReverse(Stack<Integer> s){
    Queue<Integer> q = new Queue<>();
    if(s.size()%2!=0){
        throw new IAE;
    }
    else{
        Queue<Integer> s1 = new Queue<>();
        while(!s.isEmpty()){ 
            q.add(s.remove()); 
        }
        while(!q.isEmpty()){
            s.push(q.remove());
        }
        // Queue[]
        // Stack[8,7,6,5,4,3,2,1]
    }
}
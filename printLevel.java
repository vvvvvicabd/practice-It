/*
Write a method numberNodes that changes the data stored in a binary tree, assigning sequential integers starting with 1 to each node so that a pre-order traversal will produce the numbers in order(1, 2, 3, etc.). For example, given the tree referenced by tree below at left, the call of tree.numberNodes(); would overwrite the existing data assigning the nodes values from 1 to 6 so that a pre-order traversal of the tree would produce 1, 2, 3, 4, 5, 6.

Before Call	After Call
          +---+
          | 7 |
          +---+
         /     \
     +---+     +---+
     | 3 |     | 9 |
     +---+     +---+
    /     \         \
+---+     +---+     +---+
| 9 |     | 2 |     | 0 |
+---+     +---+     +---+
          +---+
          | 1 |
          +---+
         /     \
     +---+     +---+
     | 2 |     | 5 |
     +---+     +---+
    /     \         \
+---+     +---+     +---+
| 3 |     | 4 |     | 6 |
+---+     +---+     +---+
You are not to change the structure of the tree. You are simply changing the values stored in the data fields. Your method should return a count of how many nodes were in the tree.

Assume that you are adding this method to the IntTree class as defined below:

public class IntTree {
    private IntTreeNode overallRoot;
    ...
}
*/
public void printLevel(int n){
     printLevel(n,1,overallRoot);   
}
private void printLevel(int n,int curr,IntTreeNode node){
    if(n<1){
        throw new IllegalArgumentException();
    }
    
    else{
        if(node!=null){
        if(curr==n){
           System.out.println(node.data);
        }
        else if(curr<n){
            if(node.left!=null){
                printLevel(n,curr+1,node.left);
                 
            }
            if(node.right!=null){
                printLevel(n,curr+1,node.right);
            }
        }
        else printLevel(n,1,node);
        }
    }   
}

/*Write a method printLeaves that outputs the leaves of a binary tree from right to left. More specifically, the leaves should be printed in the reverse order that they would be printed using any of the standard traversals. For example, if a variable tree stores a reference to the following tree:

          +---+
          | 2 |
          +---+
         /     \
     +---+     +---+
     | 8 |     | 1 |
     +---+     +---+
    /         /     \
+---+     +---+     +---+
| 0 |     | 7 |     | 6 |
+---+     +---+     +---+
         /               \
     +---+               +---+
     | 4 |               | 9 |
     +---+               +---+
Then the call of t.printLeaves(); should produce the following output:

leaves: 9 4 0
If the tree does not have any leaves (an empty tree), simply print:

no leaves
Assume that you are adding this method to the IntTree class as defined below:

public class IntTree {
    private IntTreeNode overallRoot;
    ...
}*/
public void printLeaves(){
    if(overallRoot==null){
        System.out.print("no leaves");
    }
    else System.out.print(printLeaves(overallRoot,"leaves:"));
}
private String printLeaves(IntTreeNode root, String s){
    
    
        if(root.left==null&&root.right==null){  
             return s+" "+root.data;
        }
        else{
            if(root.right!=null){
               s = printLeaves(root.right,s);
               
            }
            if(root.left!=null){
               s = printLeaves(root.left,s);
            } 
        }
    
    return s;
}
//such as tricky one..

/*Assume that you are adding this method to the IntTree class as defined below:

public class IntTree {
    private IntTreeNode overallRoot;
    ...
}
*/

public int doublePositives(){
    return doublePositives(overallRoot);
}
private int doublePositives(IntTreeNode root){
    if(root==null){
        return 0;
    }
    else{
        if(root.data > 0){
            root.data =  2 * root.data;
        }
        
             doublePositives(root.left);
        
             doublePositives(root.right);
        }
    return root.data;
}

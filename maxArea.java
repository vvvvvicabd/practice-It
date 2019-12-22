class Solution {
    public int maxArea(int[] height){
       int w = height.length;
        
        int currA = 0;
        if(w==2)return Math.min(height[0],height[1]);
        else{
           for(int leftH=0;leftH<w;leftH++){
              for(int rightH = w-1;rightH>0;rightH--){
                  if(Math.min(height[leftH],height[rightH])*Math.abs(leftH-rightH)>currA){
                    currA = Math.min(height[leftH],height[rightH])*Math.abs(leftH-rightH);  
                  }
              }
            }  
        }
       
        return currA;
}
}

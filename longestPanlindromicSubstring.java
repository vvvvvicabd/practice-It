class Solution {
    public String longestPalindrome(String s) {
        int start = 0;
        int end = 0;
        if(s==null||s.length()<1)return "";
        
        for(int i=0;i<s.length();i++){
            //when length is odd
            int size1 = slidingWindow(i,i,s);
            //when length is even
            int size2 = slidingWindow(i,i+1,s);
            
            int length = Math.max(size1,size2);
            // checks if length is greater than the boundary window

            if(length > end-start){
                start = i - ((length-1)/2);
                end = i + length/2;
            }
        }
        
        //remember substring is exclusive at the end
        return s.substring(start,end+1);
        
    }
    private int slidingWindow(int low,int high,String s){
        if(s==null||low>high)return 0;
        
        while(low>=0&&high<s.length()&&s.charAt(low)==s.charAt(high)){
            //returns the size of this sliding window
            low--;
            high++;   
        }
        return high - low - 1;
    }
    
    
    
}

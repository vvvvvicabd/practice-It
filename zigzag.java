class Solution {
    public String convert(String s, int numRows) {
        //special cases when there's only one row or one char
        if(s.length()==1)return s;
        if(numRows==1)return s;
        
        char[] string = s.toCharArray();
        char[] result = new char[string.length];
        
        int max = 2*numRows - 2;//max number in a block
        int blocks = (string.length + max - 1) / max;
        int counter = 0;
        for(int r=1;r<=numRows;r++){
            for(int t=0;t<=blocks;t++){
                int i1 = max * t + r -1;
                int i2 = max * (t+1) -r +1;
                
                if(i1>=0&&i1<string.length){
                    result[counter++] = string[i1];
                }
                if(r!=1&&i2>=0&&i2<string.length&&i1!=i2){
                    result[counter++] = string[i2];
                }
                
            }
        }
        
        return new String(result);
    }
}

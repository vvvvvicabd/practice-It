public boolean isReverse(String a, String b){
    if(a==null&&b==null){
        return true;
    }
    else if(a.length()!=b.length()){
        return false;
    }    
    else {
        int l = a.length();
        char c1 = a.charAt(0);
        char c2 = b.charAt(l-1);
        if(c1==c2){
            return isReverse(a.substring(1),b.substring(0,l-1));//not inclusive at the end
        }
        else{
            return false;
        }
    } 
    return false;
}

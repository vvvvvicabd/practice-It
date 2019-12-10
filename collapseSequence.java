public String collapseSequences(String s, Charcater c){
    //base case
    if(s.length()==0||s.length()==1){
        return s;
    }
    //
    else if(s.charAt(0)==c&&s.charAt(1)==c){
        return collapseSequences(s.substring(1),c);
    }
    else{
        return s.charAt(0)+collapseSequences(s.substring(1),c); 
    }
}
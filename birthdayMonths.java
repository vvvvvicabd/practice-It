//Collections 
public static Map<String,Set<String>> birthdayMonths(Map<String,String> birthdays){
    Map<String,Set<String>> m = new TreeMap<String,Set<String>>();
    for(String name:birthdays.keySet()){
        String month = birthdays.get(name).getMonth();
        if(!m.contains(month)){
            m.put(month,name);
        }
        else{
           m.get(name).add(month); 
        }
    }
    return m;
}
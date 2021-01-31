package kata3;

import java.util.HashMap;
import java.util.Map;


public class Histogram {
    private final Map<String,Integer> count = new HashMap<>(); 
    
    public String[] getKeys () {
        return count.keySet().toArray(new String[0]);
        
    }
    
    public int getCount (String key) {
        return count.getOrDefault(key,0);
    }
    
    public void add(String key){
        count.put(key, getCount(key)+1);
    }
}

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Random;

class RandomizedSet {
    HashMap<Integer,Integer> map;
    
    LinkedList<Integer> list;
    public RandomizedSet() {
        
        map= new HashMap<Integer,Integer>();
        list= new LinkedList<Integer>();
        
    }
    
    public boolean insert(int val) {
        
        if(map.containsKey(val))
        {
            return false;
        }
        else
        {
            map.put(val,1);
            list.add(val);
            
            return true;
            
        }
        
        
    }
    
    public boolean remove(int val) {
        
        if(map.containsKey(val))
        {
            map.remove(val);
            list.remove(new Integer(val));
            return true;
        }
        else
        {
            return false;
        }
        
    }
    
    public int getRandom() {
        
         Random rand = new Random();
         int index=rand.nextInt(list.size());
         
        return list.get(index);
        
    }
    
    
    public static void main(String args[])
    {
    	RandomizedSet set = new RandomizedSet();
    	System.out.println(set.insert(1));
    	System.out.println(set.remove(2));
    	System.out.println(set.insert(2));
    	System.out.println(set.getRandom());
    	System.out.println(set.remove(1));
    	System.out.println(set.insert(2));
    	System.out.println(set.getRandom());
    	
    }
    
    
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
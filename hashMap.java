// import java.util.HashMap;
import java.util.*;

// hashmap is the data structure that store the two types of information in the form of key and value. 

public class hashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();


// insertion
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("three", 5); // here it will just update the value of key.

        // there two caes in the map.put exist and doesn't exist in the map if the key
        // is existing it will be updated , and if it is not it will be inseted new keyvaluepairs.
        System.out.println(map); // unordered


 //Search / lookup operation 
        if(map.containsKey("two")) System.out.println("yes its exists");


//iterate in hashmap .
      for(Map.Entry<String, Integer> varialname : map.entrySet()){
        System.out.println(varialname.getKey()+" "+varialname.getValue()+" ");
      }
  
//remove entry from the set .
        map.remove("two");   // it will remove the corresponding values also .
        System.out.println(map); // it will print {one=1, three=5}

    }
}

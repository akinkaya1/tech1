package collections;

import java.util.HashMap;
import java.util.Map;

public class LoopingMaps {
    public static void main(String[] args) {
        Map<Integer,String> favFruits = new HashMap<>();
        favFruits.put(1, "Melon");
        favFruits.put(2, "PineApple");
        favFruits.put(3, "Mango");

        int i = 0;
        for(Map.Entry m: favFruits.entrySet()){
            if(i < 2)System.out.println(m.getKey()+" "+m.getValue());
            i++;
        }
    }
}

import java.util.HashMap;
import java.util.Iterator;

public class Map {
    public static void main(String[] args) {

        HashMap<String,String> map = new HashMap<>();

        map.put("k3", "v3");
        map.put("k1", "v1");
        map.put("k2", "v2");

        /**
         * Case.1
         */
        Iterator<String> keys = map.keySet().iterator();
        while(keys.hasNext()){
            String key = keys.next();
            System.out.println("key : " + key + " , " +" value : "+ map.get(key));
        }

        /**
         * Case.1
         */
        for(String key : map.keySet()){
            System.out.println("key : " + key + " , " +" value : "+ map.get(key));
        }

    }
}

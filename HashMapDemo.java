import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        // key:value

        Map<Integer, String> m = new HashMap<>();

        m.put(1, "Ram");
        m.put(2, "Laxman");
        m.put(3, "Sita");

        System.out.println(m);
        System.out.println(m.get(3));//sita 
        System.out.println(m.get(20));
        System.out.println(m.getOrDefault(20,"NA"));


        System.out.println("size => "+m.size());
 
        m.remove(3);//key 
        System.out.println(m);
        System.out.println("size => "+m.size());

        //remove all 
        // m.clear(); 


        System.out.println(m.keySet());

        System.out.println(m.containsKey(2));//true
        System.out.println(m.containsValue("ram"));//false 
        System.out.println(m.containsValue("Ram"));//true 
        
        //1 : ram 
        //2 : laxman 

        // m.put(1, "Ravan"); //re insert key 1 
        m.putIfAbsent(1, "Ravan");
        System.out.println(m);

    }
}

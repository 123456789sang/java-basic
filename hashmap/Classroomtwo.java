import java.util.HashMap;
import java.util.Set;

public class Classroomtwo {
    public static void main(String[] args) {
        HashMap<String,Integer>hm=new HashMap<>();
        //insertion - o(1)
        hm.put("India", 100);
        hm.put("China", 50);
        hm.put("pak", 80);
        hm.put("us", 60);

       //iterate
       Set<String>keys=hm.keySet();
       System.out.println(keys);//[China, pak, us, India]

       for (String K : keys) {
          System.out.println("keys="+K+"," +"value="+hm.get(K));//keys=China,value=50
       }

    }
}

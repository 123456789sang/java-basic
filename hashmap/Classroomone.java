import java.util.HashMap;

public class Classroomone {
    public static void main(String[] args) {
        HashMap<String,Integer>hm=new HashMap<>();
        //insertion - o(1)
        hm.put("India", 100);
        hm.put("China", 50);
        hm.put("pak", 80);
        hm.put("us", 60);
        System.out.println(hm);

        //get-O(1)
        int population =hm.get("India");
        System.out.println(population);//100
        System.out.println(hm.get("Indonesia"));//null
        
       //containskey-O(1)
       System.out.println(hm.containsKey("India"));//true
       System.out.println(hm.containsKey("Indonesia"));//false
        
       //remove-O(1)
       System.out.println(hm.remove("China"));
       System.out.println(hm);//{pak=80, us=60, India=100}
       
       //Size-O(1)
       System.out.println(hm.size());//3

       //isEmpty()
       hm.clear();
       System.out.println(hm.isEmpty());//true
    }
}

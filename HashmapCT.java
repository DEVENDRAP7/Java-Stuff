/**
 * HashmapCT
 */
import java.util.*;
public class HashmapCT {

    public static void main(String[] args) 
    {
        // Create a HashMap
        
        HashMap<String, Integer> map = new HashMap<>();
        //map.put("one",1);
        //map.put("two",2);
        System.out.println(map);
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Integer n=sc.nextInt();
        map.put(s,n);
        System.out.println(map);
    }
}


import javax.sql.rowset.spi.SyncProvider;
import java.util.*;

public class TestsDataStructures {


    public static void main(String [] args){
        Employee w1 = new Waiter(554,"Jon Snow", "27 Long str.", true, 5);
        Employee c1 = new Chef(238,"Gordon Ramsey","12 Avenue",25,"Spagetti & Meat Balls");
        Employee w2 = new Waiter(357,"Amy Harvey", "27 Long  str.", false, 5);
        Employee c2 = new Chef(272,"Guy Fieri","12 Wale str",38,"Burgers and fries");
        Employee w3 = new Waiter(450,"Bill Cosby", "27 Long str.", false, 5);
        Employee c3 = new Chef(352,"Buddy Valestro","108 Maddison rd",20,"T-Bone Steak");

        List ar = new ArrayList<Employee>();
        Set set = new HashSet();
        Collection col = new LinkedList();
        Map mp = new HashMap();


        //Program starts
        System.out.println("This program sorts data stuctures" );

        //adding to the List
        ar.add(w1);
        ar.add(w2);
        ar.add(w3);


        //adding to the Collection
        col.add(15);

        //adding to the map
        mp.put(123,"Stack");

        //Adding items into the set
        set.add("Java");
        set.add("C#");
        set.add("Ruby");
        set.add("Angular");
        set.add("Go lang");
        set.add("Kotlin");


        sortAlph(ar);
        sortAsc(set);
    }

    //method for sorting a List in alphabetical order
    public static void sortAlph(List ar){

        //Display before it is sorted
        System.out.println("-------List-------");
        System.out.print("Unsorted"+"\n");
        for(int i = 0; i<ar.size(); i++){
            System.out.println(ar.get(i).toString());
        }
        //sort the array list
        Collections.sort(ar);
        System.out.print("Sorted"+"\n");
        for(int i = 0; i<ar.size();i++) {
            System.out.println( ar.get(i).toString());
        }
    }
    public static void sortAsc(Set set){
        System.out.println("\n-----------Set----------");
        //display unsorted
        System.out.println("Unsorted"+ set);

        Set<String> tset = new TreeSet<String>(set);
        //display sorted
        System.out.println("Sorted"+ tset);
    }
    public void addCol(Collection col, int num){
        System.out.println("\n-----------Collection/Linked List----------");
        col.add(num);
        System.out.println("Added to collection");
    }

    public void removeMap(Map mp, int key){
        mp.remove(key);
    }

}



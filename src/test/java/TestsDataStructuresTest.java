
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.*;

import static org.junit.Assert.*;


public class TestsDataStructuresTest {

    TestsDataStructures tds;
    Collection col;
    List ar;
    Set set;
    Map mp;
    Employee w1;
    Employee w2;
    Employee w3;


    @org.junit.Before
    public void setUp() throws Exception {
        tds = new TestsDataStructures();
        set = new HashSet();
        ar = new ArrayList<Employee>();
        mp = new HashMap();
        col = new LinkedList();

        w1 = new Waiter(554,"Jon Snow", "27 Long str.", true, 5);
        w2 = new Waiter(357,"Amy Harvey", "27 Long  str.", false, 5);
        w3 = new Waiter(450,"Bill Cosby", "27 Long str.", false, 5);

        //adding to the List
        ar.add(w1);
        ar.add(w2);
        ar.add(w3);

        //Adding items into the set
        set.add("Java");
        set.add("C#");
        set.add("Ruby");
        set.add("Angular");
        set.add("Go lang");
        set.add("Kotlin");

        //adding to the Collection
        col.add(15);

        //adding to the map
        mp.put(123,"Stack");


    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void sortAlph() {
        String wait1B4 = ar.get(0).toString();
        TestsDataStructures.sortAlph(ar);
        Assert.assertNotEquals(wait1B4 ,ar.get(0).toString());
    }

    @org.junit.Test
    public void sortAsc() {
        String fSetB4 = set.toString();
        TestsDataStructures.sortAsc(set);
        Assert.assertEquals(fSetB4 ,set.toString());

    }

    @org.junit.Test
    public void addCol() {
        //initializing a variable to store the collection's size before adding to it
        int colSizeB4 = col.size();

        //adding to the collection
        tds.addCol(col, 5);

        //testing if the size before adding is not the size after adding
        Assert.assertNotEquals(colSizeB4, col.size());
    }

    @org.junit.Test
    public void removeMap() {//removes  map
        int mapSizeB4 = mp.size();
        tds.removeMap(mp,123);
        Assert.assertNotEquals(mapSizeB4, mp.size());
    }
}

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class MyMapTest<K,V> {
    /*MyArrayList<K> list;
    MySet<V> set;*/
    MyMap<K,V> map;

    @Before
    public void setup(){
        /*list = new MyArrayList<>();
        set = new MySet<>();*/
        map = new MyMap<>();
    }

    @Test
    public void testContainsKey(){
        map.put(1, "x");
        boolean expected = true;
        boolean actual = map.containsKey(1);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testContainsValue(){
        map.put(1, "y");
        boolean expected = true;
        boolean actual = map.containsValue("y");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testPut(){
        map.put(2,"e");
        int expected = 1;
        int actual = map.getSize();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGet(){
        map.put(2,"d");
        String expected = "d";
        String actual = (String) map.get(2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testClearAndIsEmpty(){
        map.clear();
        boolean expected = true;
        boolean actual = map.isEmpty();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemove(){
        map.put(1,"x");
        String expected = "x";
        String actual = (String) map.remove(1);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSize(){
        map.put(2,"y");
        int expected = 1;
        int actual = map.getSize();
        Assert.assertEquals(expected, actual);
    }

}

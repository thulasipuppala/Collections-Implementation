import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MyArrayListTest {

    MyArrayList<Object> list = new MyArrayList<>();

    @Test
    public void testAdd(){
        Integer n = 3;
        list.add(n);
        Assert.assertEquals(1, list.size());
    }

    @Test
    public void testAddString(){
        list = new MyArrayList<>();
        String s = "xyz";
        list.add(s);
        Assert.assertEquals(1, list.size());
    }

    @Test
    public void testAddAtIndex(){
        list.clear();
        list.add(2);
        list.add("element");
        double d = 3.23;
        list.add(1, d);
        Assert.assertEquals(3, list.size());
    }

    @Test
    public void testGet(){
        list.add(2);
        Object actual = list.get(0);
        Assert.assertEquals(2, actual);
    }

    @Test
    public void testRemove(){
        Integer element = 2;
        list.add(element);
        Assert.assertEquals(true, list.remove(element));
    }

    @Test
    public void testRemove2(){
        Integer element = 2;
        Assert.assertEquals(false, list.remove(element));
    }

   @Test
    public void testSet(){
        Integer element = 3;
        list.add(element);
        Assert.assertEquals(element,list.set(0, element));
    }

    @Test
    public void testClear(){
        list.clear();
        Assert.assertEquals(0, list.size());
    }

    @Test
    public void testIsEmpty(){
        list.clear();
        Assert.assertEquals(true, list.isEmpty());
    }

    @Test
    public void testContains(){
        Integer n = 5;
        list.add(n);
        Assert.assertEquals(true, list.contains(n));
    }

    @Test
    public void testSize(){
        list.clear();
        Integer n = 5;
        list.add(n);
        n = 6;
        list.add(n);
        Assert.assertEquals(2, list.size());
    }
}

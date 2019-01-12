import org.junit.Assert;
import org.junit.Test;

public class MySetTest {

        MySet<Object> set = new MySet<>();

        @Test
        public void testAdd(){
            Integer n = 3;
            set.add(n);
            Assert.assertEquals(1, set.size());
        }

        @Test
        public void testAdd2(){
            Integer n = 3;
            set.add(n);
            Assert.assertEquals(1, set.size());
        }

        @Test
        public void testAddString(){
            set = new MySet<>();
            String s = "xyz";
            set.add(s);
            Assert.assertEquals(1, set.size());
        }

        @Test
        public void testAddAtIndex(){
            set.clear();
            set.add(2);
            set.add("element");
            double d = 3.23;
            set.add(1, d);
            Assert.assertEquals(3, set.size());
        }

        @Test
        public void testGet(){
            set.add(2);
            Object actual = set.get(0);
            Assert.assertEquals(2, actual);
        }

        @Test
        public void testRemove(){
            Integer element = 2;
            set.add(element);
            Assert.assertEquals(true, set.remove(element));
        }

        @Test
        public void testRemove2(){
            Integer element = 2;
            Assert.assertEquals(false, set.remove(element));
        }

        @Test
        public void testClear(){
            set.clear();
            Assert.assertEquals(0, set.size());
        }

        @Test
        public void testIsEmpty(){
            set.clear();
            Assert.assertEquals(true, set.isEmpty());
        }

        @Test
        public void testContains(){
            Integer n = 5;
            set.add(n);
            Assert.assertEquals(true, set.contains(n));
        }

        @Test
        public void testSize(){
            set.clear();
            Integer n = 13;
            set.add(n);
            n = 6;
            set.add(n);
            Assert.assertEquals(2, set.size());
        }

}

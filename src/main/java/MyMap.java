import java.util.Set;

public class MyMap<K,V> {
    MyArrayList<V> values;
    MySet<K> keySet;
    int size;

    public MyMap() {
        this.values = new MyArrayList<>();
        this.keySet = new MySet<>();
        this.size = 0;
    }

    public int getSize(){
        return this.size;
    }

    public void put(Object i, Object x) {
        int index = 0;
        if(keySet.contains(i)){
            index = keySet.getIndex(i);
            values.add(index,x);
        }
        else {
            keySet.add(i);
            values.add(x);
            this.size += 1;
        }
    }

    public boolean containsKey(Object i) {
        return keySet.contains(i);
    }

    public boolean containsValue(Object y) {
        return values.contains(y);
    }

    public Object get(Object i) {
        int index = keySet.getIndex(i);
        Object value =values.get(index);
        return value;
    }

    public void clear() {
        keySet.clear();
        values.clear();
    }

    public boolean isEmpty() {
        if(keySet.isEmpty() && values.isEmpty())
            return true;
        else
            return false;
    }

    public Object remove(Object key) {
        if(keySet.contains(key)){
            int index = keySet.getIndex(key);
            keySet.remove(key);
            Object value = values.get(index);
            values.remove(value);
            return value;
        }
        else
            return null;
    }

    public MySet<K> keyset() {
        return keySet;
    }


}

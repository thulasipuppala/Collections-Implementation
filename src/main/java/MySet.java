import java.lang.reflect.Array;

public class MySet<E> {
    Object[] set;

    public MySet(){
        this.set = new Object[0];
    }

    public MySet(int size) {
        this.set = new Object[size];
    }

    public void add(Object element){
        if(!this.contains(element)) {
            Object[] newArray = new Object[this.size() + 1];
            newArray[this.size()] = element;
            set = newArray;
        }
    }

    public int getIndex(Object o){
        for(int i=0; i<this.size();i++){
            if(set[i].equals(o))
                return i;
        }
        return -1;
    }

    public void add(int index, Object d) {
        if(!this.contains(d)) {
            Object[] newArr = new Object[set.length + 1];
            for (int i = 0; i < set.length; i++) {
                if (i < index)
                    newArr[i] = set[i];
                else if (i > index)
                    newArr[i - 1] = set[i];
            }
            set = newArr;
        }
    }

    public Object get(int index){
        int count = 0;
        for(Object element : set){
            if(count == index)
                return element;
            count++;
        }
        return null;
    }

    public boolean remove(Object remove){
        boolean check = false;
        int count = 0;
        int counter = 0;
        if(this.size() > 0) {
            Object[] newArr = new Object[set.length - 1];
            for (Object element : set) {
                if (element.equals(remove) && count < 1) {
                    count = 1;
                    check = true;
                } else {
                    newArr[counter] = element;
                    counter++;
                }
            }
        }
        return check;
    }

    public void clear(){
        set = (Object[]) Array.newInstance(this.set.getClass().getComponentType(), 0);
    }

    public boolean isEmpty(){
        if(set.length == 0)
            return true;
        return false;
    }

    public boolean contains(Object element)
    {
        for(Object o : set) {
            if(element.equals(o)) {
                return true;
            }
        }
        return false;
    }

    public int size(){
        return this.set.length;
    }


}

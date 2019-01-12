import java.lang.annotation.ElementType;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MyArrayList<E> {

    Object[] myArray;

    public MyArrayList(){
        this.myArray = new Object[0];
    }

    public MyArrayList(int size) {
        this.myArray = new Object[size];
    }

    public void add(Object element){
        Object[] newArray = new Object[this.myArray.length + 1];
        newArray[newArray.length - 1] = element;
        myArray = newArray;
    }

    public void add(int index, Object d) {
        Object[] newArr = new Object[myArray.length + 1];
        for(int i=0;i<myArray.length + 1;i++)
        {
            if(i<index)
                newArr[i] = myArray[i];
            else if(i > index)
                newArr[i] = myArray[i-1];
            else
                newArr[i] = d;
        }
        myArray = newArr;
    }

    public Object get(int index){
        int count = 0;
        for(Object element : myArray){
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
            Object[] newArr = new Object[myArray.length - 1];
            for (Object element : myArray) {
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

   public Object set(int index, Object element){
        for(int i=0; i<myArray.length; i++){
            if(i == index) {
                myArray[i] = element;
                return element;
            }
        }
        return null;
    }

    public void clear(){
        myArray = new Object[0];
    }

    public boolean isEmpty(){
        if(myArray.length == 0)
            return true;
        return false;
    }

    public boolean contains(Object element)
    {
        for(int i=0; i<myArray.length; i++){
            if(myArray[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    public int getIndex(Object o){
        for(int i=0; i<this.size();i++){
            if(myArray[i].equals(o))
                return i;
        }
        return -1;
    }

    public int size(){
        return myArray.length;
    }


}

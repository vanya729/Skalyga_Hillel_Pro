package lessons8;

import java.util.Arrays;

public class CollectionIml implements Collection {

    private String[] array;
    private int size;

    public CollectionIml() {
        array= new String[10];
        size=0;
    }

    private void audit(int minCapacity) {
        if (array.length < minCapacity) {
            int newCapacity = array.length * 2;
            if (newCapacity < minCapacity) {
                newCapacity = minCapacity;
            }
            array = Arrays.copyOf(array, newCapacity);
        }
    }

    @Override
    public boolean add(String o) {
        return add(size,o);
    }

    @Override
    public boolean add(int index, String o) {
        audit(size + 1);

        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = o;
        size++;
        return true;
    }

    private boolean delete(int index){
        error(index);
        for (int i = index; i <size-1 ; i++) {
            array[i]= array[i+1];
        }
        size--;
        return true;
    }
    @Override
    public boolean delete(String o) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(o)){
                delete(i);
                return true;
            }
        }
        return true;
    }

    @Override
    public String get(int index) {
        error(index);
        return array[index];
    }

    @Override
    public boolean contain(String o) {
        for (int i = 0; i <size ; i++) {
            if (array[i].equals(o)){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean equals(Collection str) {

        if (str==this){
            return true;
        }if (str==null || getClass()!=str.getClass()){
            return false;
        }

    CollectionIml other = (CollectionIml) str;
        if (size!=other.size){
            return false;
        }

        for (int i = 0; i < size; i++) {
            if (!array[i].equals(other.array[i])){
                return false;
            }
        }

    return true;
    }

    @Override
    public boolean clear() {
        for (int i = 0; i <array.length ; i++) {
            array[i]=null;
        }
        size=0;
        return true;
    }

    @Override
    public int size() {
        return size;
    }

    private void error(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Error");
        }
    }
}
/*
boolean add(String o);                  +
boolean add(int index, String o);       +
boolean delete (String o)               +
String get(int index);                  +
boolean contain(String o);              +
boolean equals (Collection str),
boolean clear(),                        +
int size(),                             +
 */
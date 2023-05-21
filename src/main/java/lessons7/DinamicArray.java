package lessons7;

import java.util.Arrays;

public class DinamicArray {

    private String[] array;
    private int size;

    public DinamicArray() {
        array= new String[10];
        size=0;
    }
    public void audit(int minCapacity) {
        if (array.length < minCapacity) {
            int newCapacity = array.length * 2;
            if (newCapacity < minCapacity) {
                newCapacity = minCapacity;
            }
            array = Arrays.copyOf(array, newCapacity);
        }
    }

    public boolean add(int index, String value) {
//        error(index);
        audit(size + 1);

        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = value;
        size++;
        return true;
    }

    public boolean add(String value){
        return add(size,value);
    }

    public boolean delete(int index){
        error(index);
        for (int i = index; i <size-1 ; i++) {
            array[i]= array[i+1];
        }
        size--;
        return true;
    }

    public boolean delete(String value){
        for (int i = 0; i < size; i++) {
            if (array[i].equals(value)){
                delete(i);
                return true;
            }
        }
        return true;
    }

    public String get(int index){
        error(index);
        return array[index];
    }

    private void error(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Error");
        }
    }

    public int getSize() {
        return size;
    }
}
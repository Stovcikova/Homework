package sk.kosickaakademia.stovcikova.homework.stack;

import java.util.ArrayList;
import java.util.List;

public class Stack {
    private int capacity;
    private List<Integer>array;

    public Stack (int c){
        this.capacity = c;
        array = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }
    public int getSize(){
        return array.size();
    }
    public boolean isEmpty(){
        return array.isEmpty();
    }
    public boolean isFull(){
        return capacity== array.size();
    }
    public void push(int value){
        if (isFull()){
            System.out.println("Stack is full! ");
        }else
        array.add(value);
    }
    public void pop(){
        array.remove(array.size()-1);
    }
    public void clear(){
        array.clear();

    }
    public void print(){
        System.out.println();
        for (Integer t: array)
            System.out.println(t+"");
    }
}

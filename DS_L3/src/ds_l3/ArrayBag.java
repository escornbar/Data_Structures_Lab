/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_l3;

import java.util.Random;

/**
 *
 * @author syaam
 */
public class ArrayBag<T> implements BagInterface<T>{
    private T[] bag;
    private final int DEFAULT_CAPACITY=25;
    private int numberOfEntries;
    
    public ArrayBag() {
        numberOfEntries=0;
        bag = (T[]) new Object[0];
    }
    
    //Clone constructor
    public ArrayBag(ArrayBag<T> anotherBag) {
        bag = anotherBag.toArray();
        numberOfEntries=anotherBag.getCurrentSize();
    }
    
    @Override
    public int getCurrentSize() {
        return numberOfEntries;
    }
    
    @Override
    public boolean isFull() {
        return numberOfEntries==DEFAULT_CAPACITY;
    }
    
    @Override
    public boolean isEmpty() {
        return numberOfEntries==0;
    }
    
    @Override
    public boolean add(T newEntry) {
        if(getCurrentSize()<=DEFAULT_CAPACITY) {
            T[] temp = (T[])new Object[getCurrentSize()+1];
            for (int i = 0; i < getCurrentSize(); i++) {
                temp[i]=bag[i];
            }
            temp[getCurrentSize()] = newEntry;
            bag = temp;
            numberOfEntries = temp.length;
            return true;
        } else {
            return false;
        }
    }
    
    @Override
    public T remove() {
        if(!isEmpty()) {
            T toRemove = bag[new Random().nextInt(getCurrentSize())];
            T[] temp = (T[]) new Object[getCurrentSize()-1];
            for (int i = 0,j=0; i < temp.length; i++) {
                if(bag[i]!=toRemove) {
                    temp[j++] = bag[i];
                }
            }
            bag = temp;
            numberOfEntries = temp.length;
            return toRemove;
        } else {
            return null;
        }
    }
    
    @Override
    public boolean remove(T anEntry) {
        if(!isEmpty()&&contains(anEntry)) {
            T[] temp = (T[])new Object[getCurrentSize()-1];
            
            boolean removed = false;
            for (int i = 0,j=0; i < getCurrentSize(); i++) {
                if(!bag[i].equals(anEntry)||removed) {
                    temp[j++] = bag[i];
                }else if (bag[i].equals(anEntry)) {
                    removed = true;
                }
            }
            bag = temp;
            numberOfEntries = temp.length;
            return true;
        }else return false;
    }
    
    @Override
    public void clear() {
        bag = (T[])new Object[0];
        numberOfEntries=0;
    }
    
    @Override
    public int getFrequencyOf(T anEntry) {
        int sum=0;
        for (int i = 0; i < bag.length; i++) {
            if (bag[i].equals(anEntry)) {
                sum++;
            }
        }
        return sum;
    }
    
    @Override
    public boolean contains(T anEntry) {
        for (int i = 0; i < bag.length; i++) {
            if (bag[i].equals(anEntry)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public T[] toArray() {
        return bag;
    }
    
    @Override
    public ArrayBag<T> union(ArrayBag<T> anotherBag) {
        ArrayBag<T> newBag = new ArrayBag<>();
        try {
            for (int i = 0; i < numberOfEntries; i++) {
                    newBag.add(bag[i]);
            }
            for (int i = 0; i < anotherBag.getCurrentSize(); i++) {
                    newBag.add(anotherBag.toArray()[i]);
            }
        } catch (Exception e) {
            System.out.println("Union failed, full capacity reached!");
        }
        return newBag;
    }
    
    @Override
    public ArrayBag<T> intersection(ArrayBag<T> anotherBag) {
        ArrayBag<T> temp1 = new ArrayBag<>(this);
        ArrayBag<T> temp2 = new ArrayBag<>(anotherBag);
        ArrayBag<T> newBag = new ArrayBag<>();
        for (int i = 0; i < temp1.toArray().length; i++) {
            for (int j = 0; j < temp2.toArray().length; j++) {
                if(temp1.toArray()[i].equals(temp2.toArray()[j])) {
                    newBag.add(temp1.toArray()[i]);
                    temp2.remove(temp2.toArray()[j]);
                    break;
                }
            }
        }
        return newBag;
    }
    
    @Override
    public ArrayBag<T> difference(ArrayBag<T> anotherBag) {
        ArrayBag<T> clone1 = new ArrayBag<T>(this);
        ArrayBag<T> clone2 = new ArrayBag<T>(anotherBag);
        for (int i = 0; i < clone1.toArray().length; i++) {
            for (int j = 0; j < clone2.toArray().length; j++) {
                if(clone1.toArray()[i].equals(clone2.toArray()[j])) {
                    clone1.remove(clone1.toArray()[i]);
                    clone2.remove(clone2.toArray()[j]);
                }
            }
        }
        return clone1;
    }
}

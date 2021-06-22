/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_l2;

/**
 *
 * @author syaam
 */
public class StorePairGeneric<T extends Comparable<T>> implements Comparable<StorePairGeneric<T>>{
    private T first, second;

    public StorePairGeneric(T first, T second) {
        this.first = first;
        this.second = second;
    }
    
    public T getFirst() {
        return first;
    }
    public T getSecond() {
        return second;
    }
    public void setPair(T first, T second) {
        this.first = first;
        this.second = second;
    }
    public String toString() {
        return "first = " + first + " second = " + second;
    }

    @Override
    public boolean equals(Object obj) {
        StorePairGeneric temp = (StorePairGeneric<T>) obj;
        return this.first.equals(temp.first);
    }
    
    @Override
    public int compareTo(StorePairGeneric<T> obj) {
        return this.first.compareTo(obj.first);
    }
    
}

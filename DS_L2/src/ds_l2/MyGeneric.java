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
public class MyGeneric<T> {
    private T e;

    public MyGeneric() {
    }

    public MyGeneric(T e) {
        this.e = e;
    }

    public T getE() {
        return e;
    }

    public void setE(T e) {
        this.e = e;
    }
    
}

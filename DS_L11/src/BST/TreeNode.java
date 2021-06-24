/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BST;

/**
 *
 * @author Syaamil Faiq
 */
public class TreeNode<E extends Comparable<E>> {
    
    protected TreeNode<E> left, right;
    protected E element;

    public TreeNode(E element) {
        this.element = element;
    }

    public E getElement() {
        return element;
    }
    
}

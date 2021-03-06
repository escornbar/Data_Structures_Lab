/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_l3;

/**
 *
 * @author syaam
 */
public interface BagInterface<T> {
    
    /** Gets the current number of entries in this bag.
        @return the integer number of entries currently in the bag */
    public int getCurrentSize();

    /** Sees whether this bag is full.
        @return true if the bag is full, or false if not */
    public boolean isFull();

    /** Sees whether this bag is empty.
        @return true if the bag is empty, or false if not */
    public boolean isEmpty();

    /** Adds a new entry to this bag.
        @param newEntry the object to be added as a new entry
        @return true if the addition is successful, or false if not */
    public boolean add(T newEntry);

    /** Removes one unspecified entry from this bag, if possible.
        @return either the removed entry, if the removal was successful,
        or null */
    public T remove();

    /** Removes one occurrence of a given entry from this bag.
        @param anEntry the entry to be removed
        @return true if the removal was successful, or false if not */
    public boolean remove(T anEntry);

    /** Removes all entries from this bag. */
    public void clear();

    /** Counts the number of times a given entry appears in this bag.
        @param anEntry the entry to be counted
        @return the number of times anEntry appears in the bag */
    public int getFrequencyOf(T anEntry);

    /** Tests whether this bag contains a given entry.
        @param anEntry the entry to locate
        @return true if this bag contains anEntry, or false otherwise */
    public boolean contains(T anEntry);

    /** Retrieves all entries that are in this bag.
        @return a newly allocated array of all the entries in the bag */
    public T[] toArray();
    
    /** Combines contents of two collections into a new collection.
        @param anotherBag the second bag to be combined with
        @return a bag that contains the combined contents */
    public ArrayBag<T> union(ArrayBag<T> anotherBag);
    
    /** Make a new collection of the entries that occur in both collections.
        @param anotherBag the second bag to be compared with
        @return a bag that contains the overlapping contents */
    public ArrayBag<T> intersection(ArrayBag<T> anotherBag);
    
    /** Make a new collection of the entries that would be left in one
        collection after removing those that also occur in the second.
        @param anotherBag the second bag to be compared with
        @return a bag that contains the remaining contents */
    public ArrayBag<T> difference(ArrayBag<T> anotherBag);
} //end BagInterface

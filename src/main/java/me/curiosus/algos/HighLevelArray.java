package me.curiosus.algos;

/**
 * Created by jepeterson@gmail.com on 3/18/14.
 * curiosus.me
 */

public class HighLevelArray {

    private Class element;
    private int sizeOfArray;
    private int numberOfElements;
    private Object [] elements;

    public HighLevelArray(Class element, int sizeOfArray) {
       this.element = element;
       this.sizeOfArray = sizeOfArray;
       init();
    }

    public void insert(Object obj) {
        elements[numberOfElements] = obj;
        numberOfElements++;

    }

    public Object find(Object obj) {
        for (int i = 0; i < elements.length; i++) {
            Object o = elements[i];
            if (obj.equals(o)) {
                return o;
            }
        }
        return null;
    }

    public void delete() {

    }

    public int size() {
        return numberOfElements;
    }

    private void init() {
        elements = new Object [sizeOfArray];

    }
}

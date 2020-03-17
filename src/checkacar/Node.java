/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkacar;

/**
 *
 * @author Fernando Baladi
 */
public class Node {
    private int ID, priority, nCarsChecked;
    private Node pNext;
    
    //This method instance a new Node only with ID and its priority. 
    //It doesn't care about the number of cars checked.
    public Node(int ID, int priority) {
        this.ID = ID;
        this.priority = priority;
        this.pNext = null;
        this.nCarsChecked = 0;
    }
    //This method instance a new Node with ID and its priority. 
    //In this method it's important to the number of cars checked.
    public Node(int ID, int priority, int nCarsChecked) {
        this.ID = ID;
        this.priority = priority;
        this.pNext = null;
        this.nCarsChecked = nCarsChecked;
    }

    
    //Getters and setters
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getnCarsChecked() {
        return nCarsChecked;
    }

    public void setnCarsChecked(int nCarsChecked) {
        this.nCarsChecked = nCarsChecked;
    }

    public Node getpNext() {
        return pNext;
    }

    public void setpNext(Node pNext) {
        this.pNext = pNext;
    }
    
    
    
}

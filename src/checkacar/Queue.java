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
public class Queue {
 
    private Node root, last;
    public Queue(int priority) {
        this.root = null;
        this.last = null;
    }
    
    public boolean isEmpty(){
        if (this.root == null) {
            return true;
        }else{
            return false;
        }
    }
    
    public void insertANewNode(int numberID, int priority){
        Node newNode = new Node(numberID, priority);
        newNode.setpNext(null);
        if (isEmpty()) {
            this.root = newNode;
            this.last = newNode;
        }else{
            this.last.setpNext(newNode);
            this.last = newNode;
        }
    }
    
    public void insertANode(int numberID, int priority){
        Node newNode = new Node(numberID, priority);
        newNode.setpNext(null);
        if (isEmpty()) {
            this.root = newNode;
            this.last = newNode;
        }else{
            this.last.setpNext(newNode);
            this.last = newNode;
        }
    }
   
    public int pull(){
        int  IDToReturn = 0;
        if (root == last) {
            IDToReturn = this.root.getID();
            this.root = null;
            this.last = null;
        }else{
            IDToReturn = firstGreatPriorityID();
            this.root = this.root.getpNext();
        }
        return IDToReturn;
        
    }
    
    public int firstGreatPriorityID(){
        Node aux = this.root;
        int auxID = 0; 
        while(aux != null){
            if (aux.getPriority() == 1) {
                return aux.getID();
            }
            aux = aux.getpNext();
        }
        aux = this.root;
        while(aux != null){
            if(aux.getPriority() == 2){
                return aux.getID();
            }
        }
        return this.root.getID();
    }
    
    public void printEveryNode(){
        Node aux = root;
        System.out.println("Printing the queue");
        while(aux != null){
            System.out.println("ID: "+aux.getID() + " Priority: " + aux.getPriority() );
            aux = aux.getpNext();
        }
        System.out.println("");
    }
    
    public int chooseAPriority(){
        return (int)(Math.random() * 3) + 1;  
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public Node getLast() {
        return last;
    }

    public void setLast(Node last) {
        this.last = last;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    
}

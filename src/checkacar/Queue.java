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
    
    //Queue constructor
    
    public Queue() {
        this.root = null;
        this.last = null;
    }
    
    //This method returns True if the queue doesn't have any node.
    //And returns False if the queue have any node.
    public boolean isEmpty(){
        if (this.root == null) {
            return true;
        }else{
            return false;
        }
    }
    //This method insert a Node with only its numberID and its priority.
    public void insertANode(int numberID, int priority){
        Node newNode = new Node(numberID, priority);
        if (isEmpty()) {
            this.root = newNode;
            this.last = newNode;
        }else{
            this.last.setpNext(newNode);
            this.last = newNode;
        }
    }
    
    //This method insert a Node with its numberID, its priority and the number of cars checked.
    public void insertANode(Node node){
        if (isEmpty()) {
            this.root = node;
            this.last = node;
        }else{
            this.last.setpNext(node);
            this.last = node;
        }
    }
   
    //This method returns the ID of the root and remove it.
    public Node pull(){
        Node aux = null;
        if (root == last) {
            aux = this.root;
            this.root = null;
            this.last = null;
        }else if(root != null){
            aux = this.root;
            this.root = this.root.getpNext();
        }
        return aux;        
    }
    
    //This method prints the ID of each Node
    public void printEveryNode(){
        Node aux = this.root;
        System.out.println("Printing the queue");
        while(aux != null){
            System.out.println("ID: "+aux.getID() + " Priority: " + aux.getPriority() + "NCarros:" + aux.getnCarsChecked());
            aux = aux.getpNext();
        }
        System.out.println("");
    }
    
    //Getters and Setters
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
}

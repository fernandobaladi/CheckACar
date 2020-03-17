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
public class Controller {
    
    public Queue firstPriority = new Queue();
    public Queue secondPriority = new Queue();
    public Queue thirdPriority = new Queue();
    public Queue inMaintenance = new Queue();
    public Node carInMechanic = null;

    public Controller() {
    }

    public static String queueInfo(Queue queue){
        String info = "No hay carros";
            Queue auxQueue1 = new Queue();
            info = "";
            while(!queue.isEmpty()){
                Node aux = queue.pull();
                info = (info + aux.getID() + "\n");
                auxQueue1.insertANode(aux);

            }
            System.out.println("Viene info");
            System.out.println(info);
            queue  = auxQueue1;
        
        return info;
    }
    //This method will return the String with the whole info of the first queue to show it on the view 
    public static String firstQueueInfo(){
        String info = "No hay carros";
            Queue auxQueue1 = new Queue();
            info = "";
            while(!Factory.firstPriority.isEmpty()){
                Node aux = Factory.firstPriority.pull();
                info = (info + aux.getID() + "\n");
                auxQueue1.insertANode(aux);

            }
            System.out.println("Viene info");
            System.out.println(info);
            Factory.firstPriority  = auxQueue1;
        
        return info;
    }

    //This method will return the String with the whole info of the second queue to show it on the view 
    public static String secondQueueInfo(){
        String info = "No hay carros";
            Queue auxQueue = new Queue();
            info = "";
            while(!Factory.secondPriority.isEmpty()){
                Node aux = Factory.secondPriority.pull();
                info = (info + aux.getID() + "\n");
                auxQueue.insertANode(aux);

            }
            System.out.println("Viene info");
            System.out.println(info);
            Factory.secondPriority  = auxQueue;
        
        return info;
    }
    
    //This method will return the String with the whole info of the third queue to show it on the view 
    public static String thirdQueueInfo(){
        String info = "No hay carros";
            Queue auxQueue = new Queue();
            info = "";
            while(!Factory.thirdPriority.isEmpty()){
                Node aux = Factory.thirdPriority.pull();
                info = (info + aux.getID() + "\n");
                auxQueue.insertANode(aux);

            }
            System.out.println("Viene info");
            System.out.println(info);
            Factory.thirdPriority  = auxQueue;
        
        return info;
    }
    //This method will return the String with the whole info of the inMaintenance queue to show it on the view 
    public static String inMaintenanceQueueInfo(){
        String info = "No hay carros";
            Queue auxQueue = new Queue();
            info = "";
            while(!Factory.inMaintenance.isEmpty()){
                Node aux = Factory.inMaintenance.pull();
                info = (info + aux.getID() + "\n");
                auxQueue.insertANode(aux);

            }
            System.out.println("Viene info");
            System.out.println(info);
            Factory.inMaintenance  = auxQueue;
        
        return info;
    }
    
    
    //getters and setters
    public Queue getFirstPriority() {
        return firstPriority;
    }

    public void setFirstPriority(Queue firstPriority) {
        this.firstPriority = firstPriority;
    }

    public Queue getSecondPriority() {
        return secondPriority;
    }

    public void setSecondPriority(Queue secondPriority) {
        this.secondPriority = secondPriority;
    }

    public Queue getThirdPriority() {
        return thirdPriority;
    }

    public void setThirdPriority(Queue thirdPriority) {
        this.thirdPriority = thirdPriority;
    }

    public Queue getInMaintenance() {
        return inMaintenance;
    }

    public void setInMaintenance(Queue inMaintenance) {
        this.inMaintenance = inMaintenance;
    }

    public Node getCarInMechanic() {
        return carInMechanic;
    }

    public void setCarInMechanic(Node carInMechanic) {
        this.carInMechanic = carInMechanic;
    }
    
    
        
}

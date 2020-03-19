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
public class Admin {

    public Admin() {
    }
    
    
    //This method update the number of cars that have been on the mechanic before
    //the current car or node passes to the mechanic
    public void manageNodes(){
        if (!Factory.secondPriority.isEmpty()) {
            Queue auxQueue1 = new Queue();
            while(!Factory.secondPriority.isEmpty()){
                Node aux = Factory.secondPriority.pull();
                aux.setnCarsChecked(aux.getnCarsChecked()+1);
                auxQueue1.insertANode(aux);

            }
            Factory.secondPriority  = auxQueue1;
        }
        
        if(!Factory.thirdPriority.isEmpty()){
            Queue auxQueue2 = new Queue();
            while (!Factory.thirdPriority.isEmpty()) {
                Node aux = Factory.thirdPriority.pull();
                aux.setnCarsChecked(aux.getnCarsChecked()+1);
                auxQueue2.insertANode(aux);
            }
            Factory.thirdPriority = auxQueue2;
        }  
    }
    
    //This method update the priority of the car when 10 cars have been in the mechanic
    //before the car that is being updated.
    public void updateNodes(){
        
        Queue auxQueue2 = new Queue();
        while(!Factory.secondPriority.isEmpty()){
            if(Factory.secondPriority.getRoot().getnCarsChecked() == 10){
                Node aux = Factory.secondPriority.pull();
                aux.setPriority(1);
                aux.setnCarsChecked(0);
                aux.setpNext(null);
                Factory.firstPriority.insertANode(aux);
            }else{
                auxQueue2.insertANode(Factory.secondPriority.pull());
            }
        }
        Factory.secondPriority = auxQueue2;
        
        Queue auxQueue3 = new Queue();
        while(!Factory.thirdPriority.isEmpty()){
            if (Factory.thirdPriority.getRoot().getnCarsChecked()==10) {
                Node aux = Factory.thirdPriority.pull();
                aux.setPriority(2);
                aux.setnCarsChecked(0);
                aux.setpNext(null);
                Factory.secondPriority.insertANode(aux);
            }else{
                auxQueue3.insertANode(Factory.thirdPriority.pull());
            }
        }
        Factory.thirdPriority = auxQueue3;
    }
    
    //This method return the node of the car that will be on the mechanic
    public Node returnACar(){
        if (!Factory.firstPriority.isEmpty()) {
        
            return Factory.firstPriority.pull();
        
        }else if(!Factory.secondPriority.isEmpty()){
        
            return Factory.secondPriority.pull();
            
        }else if(!Factory.thirdPriority.isEmpty()){
        
            return Factory.thirdPriority.pull();
            
        }
        
        return null;
    }
    //This method decides if the first car of the inMaintenance queue will be again
    // in its original queue or will stay there.
    public void endTheRepair(){
        int r =  (int)((Math.random() * 10) + 1);
        if (r <= 6) {
            Node aux = Factory.inMaintenance.pull();
            aux.setpNext(null);
            switch (aux.getPriority()) {
                case 1:
                    Factory.firstPriority.insertANode(aux);
                    break;
                case 2:
                    Factory.secondPriority.insertANode(aux);
                    break;
                case 3: 
                    Factory.thirdPriority.insertANode(aux);
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }
    
    //This method insert a car in a random queue.
    public static void createACar(){
        int r =  (int)((Math.random() * 10) + 1);
        
        if (r <= 6) {

            int priority = (int)((Math.random() * 3) + 1);

            switch (priority) {
                case 1:
                    Factory.firstPriority.insertANode(Factory.numberID, 1);
                    break;
                case 2:
                    Factory.secondPriority.insertANode(Factory.numberID, 2);
                    break;
                case 3:
                    Factory.thirdPriority.insertANode(Factory.numberID, 3);
                    break;
                default:
                    throw new AssertionError();
            }
            Factory.numberID++;
            
        }
    }
        
}

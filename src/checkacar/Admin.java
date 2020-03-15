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
    
    
    
    public void manageNodes(){
        if (!Factory.secondPriority.isEmpty()) {
        
            Factory.secondPriority.actNumberNodes();
        
        }
        if (!Factory.thirdPriority.isEmpty()) {
            
            Factory.thirdPriority.actNumberNodes();
        
        }
    }
    
    public void updateNodes(){
        
        Queue auxQueue2 = new Queue();
        while(!Factory.secondPriority.isEmpty()){
            if(Factory.secondPriority.getRoot().getnCarsChecked() == 10){
                Factory.firstPriority.insertANode(Factory.secondPriority.pull(), 1);
            }else{
                auxQueue2.insertANode(Factory.secondPriority.pull(), 2);
            }
        }
        Factory.secondPriority = auxQueue2;
        
        Queue auxQueue3 = new Queue();
        while(!Factory.thirdPriority.isEmpty()){
            if (Factory.thirdPriority.getRoot().getnCarsChecked()==10) {
                Factory.secondPriority.insertANode(Factory.thirdPriority.pull(), 2);
            }else{
                auxQueue3.insertANode(Factory.thirdPriority.pull(), 3);
            }
        }
        Factory.thirdPriority = auxQueue3;
    }
    
    public int returnANode(){
        if (!Factory.firstPriority.isEmpty()) {
        
            return Factory.firstPriority.pull();
        
        }else if(!Factory.secondPriority.isEmpty()){
        
            return Factory.secondPriority.pull();
            
        }else if(!Factory.thirdPriority.isEmpty()){
        
            return Factory.thirdPriority.pull();
            
        }
        
        return 0;
    }
        
}

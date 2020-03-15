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

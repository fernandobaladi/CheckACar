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
public class Factory {
        public static int numberID = 0;
        public static Queue firstPriority = new Queue();
        public static Queue secondPriority = new Queue();
        public static Queue thirdPriority = new Queue();
        public static Queue inMaintenance = new Queue();
        public static Admin admin = new Admin();
        public static Mechanic mechanic = new Mechanic();
        
    public static void main(String[] args) {
        
        
        boolean createACar = false;
        while(true){
            if (createACar) {
                createACar = false;
            }else{
                createACar = true;
            }    
        }
        
    
    }
    
    public static void insertANode(){
        int priority = (int)((Math.random() * 3) + 1);
        
        switch (priority) {
            case 1:
                firstPriority.insertANode(numberID, 1);
                break;
            case 2:
                secondPriority.insertANode(numberID, 2);
                break;
            case 3:
                thirdPriority.insertANode(numberID, 3);
                break;
            default:
                throw new AssertionError();
        }
        numberID++;
    }
}

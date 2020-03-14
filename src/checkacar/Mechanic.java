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
public class Mechanic {

    int carID;
    boolean isCar; 
    public Mechanic() {
        carID = 0;
        isCar = false;
    }
    
    public void checkACar() throws InterruptedException{
        //Thread.sleep(5000);
        int p = checkProbably();
        switch (p) {
            case val:
                
                break;
            default:
                throw new AssertionError();
        }
    }
    
    public int checkProbably(){
    
        int p = (int)(Math.random() * 100);
        if (p <= 20) {
            return 1;  
        }else if(p <= 50){
            return 2;
        }else{
            return 3;
        }
    }
}

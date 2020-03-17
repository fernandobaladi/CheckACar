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
    //This method checks the car and decides what happens with the current car.
    public void checkACar(Node car) throws InterruptedException{
        if(car != null){
            Thread.sleep(100);
            int p = checkProbably();
            car.setnCarsChecked(0);
            car.setpNext(null);
            switch (p) {
                case 1:
                    switch (car.getPriority()) {
                        case 1:
                            Factory.firstPriority.insertANode(car);
                            break;
                        case 2:
                            Factory.secondPriority.insertANode(car);
                            break;
                        case 3:
                            Factory.thirdPriority.insertANode(car);
                            break;
                        default:
                            throw new AssertionError();
                    }
                    System.out.println("Entré de nuevo en mi cola");
                    System.out.println("Mi ID es: " + car.getID()+ "\nMi prioridad es: "+ car.getPriority());
                    break;
                case 2:
                    Factory.inMaintenance.insertANode(car);
                    System.out.println("Estoy en la cola de mantenimiento");
                    System.out.println("Mi ID es: " + car.getID()+ "\nMi prioridad es: "+ car.getPriority());
                    break;
                case 3:
                    System.out.println("Fui despachado");
                    System.out.println("Mi ID es: " + car.getID()+ "\nMi prioridad es: "+ car.getPriority());
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }
    
    //It's the math probability to find what will happen with the car.
    public int checkProbably(){
    
        int p = (int)(Math.random() * 100);
        if (p <= 20) {
            return 1;  
        }else if(p <= 70){
            return 2;
        }else{
            return 3;
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkacar;

import javax.swing.JFrame;

/**
 *
 * @author Fernando Baladi
 */
public class Factory {
        //numberID it's an int where is allocated the next ID to assign
        public static int numberID = 1;
        //The followin 4 queue are  for the priorities and for the blocked queue
        public static Queue firstPriority = new Queue();
        public static Queue secondPriority = new Queue();
        public static Queue thirdPriority = new Queue();
        public static Queue inMaintenance = new Queue();
        //Instance of Admin and the Mechanic on Factory.
        public static Admin admin = new Admin();
        public static Mechanic mechanic = new Mechanic();
        
        
    public static void main(String[] args) throws InterruptedException {
        
        //There is the instance of the view and the controller
        Controller controller = new Controller();
        Vista v = new Vista();
        v.setVisible(true);
        v.setResizable(false);
        v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        v.setLocationRelativeTo(null);
        boolean newCarInCicle = false;
        int i = 0;
        //There is the instance of the first car
        createACar(); 
        //It starts the execution
        while(true){
            
            admin.manageNodes();
            admin.updateNodes();
            if (!Factory.inMaintenance.isEmpty()) {
                admin.endTheRepair();
            }
            
            if (newCarInCicle) {
                createACar();
                newCarInCicle = false;
            }else{
                newCarInCicle = true;
            }
            Node carInMechanic = admin.returnACar();
            //here we validate every variable of the view
            if (carInMechanic != controller.getCarInMechanic() && carInMechanic != null) {
                controller.setCarInMechanic(carInMechanic);
                v.fixingjTextField.setText(String.valueOf(carInMechanic.getID()));
            }else if(carInMechanic == null){
                controller.carInMechanic = null;
                v.fixingjTextField.setText("No hay ningún carro.");
            }
            if (Factory.firstPriority != controller.firstPriority) {
                controller.setFirstPriority(Factory.firstPriority);
                v.firstjTextArea.setText(controller.firstQueueInfo());
            }
            if (Factory.secondPriority != controller.secondPriority) {
                controller.setSecondPriority(Factory.secondPriority);
                v.secondjTextArea.setText(controller.secondQueueInfo());
            }
            if (Factory.thirdPriority != controller.thirdPriority) {
                controller.setThirdPriority(Factory.thirdPriority);
                  v.thirdjTextArea.setText(controller.thirdQueueInfo());
  //              v.thirdjTextArea.setText(controller.queueInfo(Factory.thirdPriority));

            }
            if (Factory.inMaintenance != controller.inMaintenance) {
                controller.setInMaintenance(Factory.inMaintenance);
                v.lockjTextArea.setText(controller.inMaintenanceQueueInfo());
                //v.thirdjTextArea.setText(controller.queueInfo(Factory.inMaintenance));
            }
            
            mechanic.checkACar(carInMechanic);
            
        }
    }
    
    //This method insert a car in a random queue.
    public static void createACar(){
        int r =  (int)((Math.random() * 10) + 1);
        
        if (r <= 6) {

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
    
}

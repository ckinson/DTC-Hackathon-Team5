/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alexademo;

/**
 * Due to the AWS SDK still being in development. This small program demos our idea. 
 * @author Connor Tall
 */
public class AlexaDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //
        String date = "01/01/2001";
        String time = "00:00:00";
        int heartRate = 55;
        String bodyTemp = "36.77";
        
        System.out.println("Green: - Green light means that no action is required");
        System.out.println("Person 1:");
        System.out.println("Date: " + date + " | " + "Time: " + time + " | " 
                + "Heart rate: " + heartRate + " | "+ "body temp: " + bodyTemp);
        System.out.println();
        
        String date2 = "01/01/2001";
        String time2 = "00:00:00";
        int heartRate2 = 65;
        String bodyTemp2 = "34.77";
        
        System.out.println("Amber: - Amber light means that Alexa tries to calm the person down.");
        System.out.println("Person 2:");
        System.out.println("Date: " + date2 + " | " + "Time: " + time2 + " | " 
                + "Heart rate: " + heartRate2 + " | "+ "body temp: " + bodyTemp2);
        System.out.println();
        
        String date3 = "01/01/2001";
        String time3 = "00:00:00";
        int heartRate3 = 85;
        String bodyTemp3 = "40.32";
        
        System.out.println("Red: - Red light means that Alexa tries to calm the person down."
                + " A member of staff is notified by SMS.");
        System.out.println("Person 3:");
        System.out.println("Date: " + date3 + " | " + "Time: " + time3 + " | " 
                + "Heart rate: " + heartRate3 + " | "+ "body temp: " + bodyTemp3);
    }
}

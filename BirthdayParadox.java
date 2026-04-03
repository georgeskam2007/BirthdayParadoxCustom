//a custom birthday paradox with random names and random birthdays 

import java.util.Random;
import java.util.Scanner;

public class BirthdayParadox{
   
   public static void main (String[] args){
       int[] birthdays = new int[500];
       System.out.print("How many persons in this room ? ");
       String [] names = new String[500];
       Scanner input = new Scanner(System.in);
       Random randBirth = new Random();
       
       
        
       int persons = input.nextInt();
       double notSameBirthProb =   Math.exp(-(persons*(persons-1))/730.0)*100; //with the help of a Poisson random variable
                                                                              //where our parameter is n(n-1)/730,n equals persons                                                               
     String notSameBirthProbAprox = String.format("%.1f", notSameBirthProb);
        
       
       System.out.println("There is  approximately a " + notSameBirthProbAprox  + "% probability that there are no persons with same birthday");
       
       //generating random names
       boolean exists;
       int count=0;
       Random rand = new Random();
       int index;
         for (int individual=0;individual<persons;individual++){
            index = rand.nextInt(persons);  
         names[individual] = namesList.names[index];
         
         
         }
      
       
       for (int i=0;i<=persons;i++){
           birthdays[i] = 1+ randBirth.nextInt(365);
          }
          System.out.println();
          
          printBirths(names,birthDayMonth(birthdays,persons),persons);//printing all birthdays
   
   
   for (int i = 0; i < persons; i++) {
    for (int j = i + 1; j < persons; j++) {
        if (birthdays[i]==(birthdays[j])) {
            System.out.println(names[i] + " has the same birthday as " +  names[j] + " ( " + birthDayMonth(birthdays,persons,i) + " )");
        }
    }
}
    
   }//main ends    
    
    
    



//printing  birthdays 
public static void printBirths(String[] names,String[] births,int atoma){
    System.out.println("All Birthdays of this room :");
    
    for (int i=0;i<atoma;i++){
        System.out.println(names[i]+ " : " + births[i]);
    }

}

//adjusting birthday month,day

public static String[] birthDayMonth(int[] array,int atoma){
    int month;
    int day;
    String monStr;
    String[] analytBirth = new String[atoma];
    
    for (int i=0;i<atoma;i++){
        month = array[i]/31 + 1;
        
        if (month == 1) {
            monStr = "January";
        } else if (month == 2) {
            monStr = "February";
        } else if (month == 3) {
            monStr = "March";
        } else if (month == 4) {
            monStr = "April";
        } else if (month == 5) {
            monStr = "May";
        } else if (month == 6) {
            monStr = "June";
        } else if (month == 7) {
            monStr = "July";
        } else if (month == 8) {
            monStr = "August";
        } else if (month == 9) {
            monStr = "September";
        } else if (month == 10) {
            monStr = "October";
        } else if (month == 11) {
            monStr = "November";
        } else if (month == 12) {
            monStr = "December";
        } else {
            monStr = "Invalid input";
        }

        day = array[i]/12 +1;
        analytBirth[i] = day + " " + monStr;
        
    }
    
    return analytBirth;
}



//for 1 person

public static String birthDayMonth(int[] array,int atoma,int thisPerson){
    
    int month;
    int day;
    String monStr;
    String analytBirth;
        month = array[thisPerson]/31 + 1;
        
        if (month == 1) {
            monStr = "January";
        } else if (month == 2) {
            monStr = "February";
        } else if (month == 3) {
            monStr = "March";
        } else if (month == 4) {
            monStr = "April";
        } else if (month == 5) {
            monStr = "May";
        } else if (month == 6) {
            monStr = "June";
        } else if (month == 7) {
            monStr = "July";
        } else if (month == 8) {
            monStr = "August";
        } else if (month == 9) {
            monStr = "September";
        } else if (month == 10) {
            monStr = "October";
        } else if (month == 11) {
            monStr = "November";
        } else if (month == 12) {
            monStr = "December";
        } else {
            monStr = "Invalid input";
        }

        day = array[thisPerson]/12 +1;
        analytBirth = day + " " + monStr;
        
    
    return analytBirth;
}








}//class ends
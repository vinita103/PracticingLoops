import java.util.Scanner;

public class PositiveNumbers {

    public static void main(String[] args) {

        Scanner data = new Scanner (System.in);
       
        while (true){

            System.out.println("Enter a number:");  
            int num = data.nextInt();

           
            if (num == 0) {

                break; 

            }

            System.out.println("Number is  " + num);

            if (num < 0){
           
            System.out.println("Number must be a positive number"); 
            
            continue;

            }
            
        }  
           
                    
        }
      
        
    }
    




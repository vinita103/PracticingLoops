import java.util.Scanner;

public class MultiplicationTables {

    public static void main(String[] args) {

        Scanner data = new Scanner(System.in);

        System.out.print("Input a number: ");       
        int num = data.nextInt();
     
        for (int i =1; i <=10; i++){

        System.out.println(num + " X " + i + " = " + (num * i));

        }                
       


            }
        
    }
    


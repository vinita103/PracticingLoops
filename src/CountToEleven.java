import java.util.Scanner;

public class CountToEleven {

    public static void main(String[] args) {

        Scanner data = new Scanner(System.in);

        System.out.println("Enter a number less than 11");

        int num = data.nextInt();

        for (int i = num; i <= 11; i++){

           System.out.println(i);

        }          

    }
    
}


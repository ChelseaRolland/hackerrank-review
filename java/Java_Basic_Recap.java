import java.util.Scanner;

/*  */
import java.util.Scanner;

public class Java_Basic_Recap {
    public static void main(String [] args){
        //Q.1
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d =  scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();
        
        scan.close();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
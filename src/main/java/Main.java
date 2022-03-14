import java.util.Scanner;
/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args ){
        Scanner scanner = new Scanner(System.in);
        String userInputString = scanner.nextLine();

        if( userInputString.equals("Bob")  || userInputString.equals("Alice")){
            System.out.println("Greetings "  + userInputString);

        }


    }
}

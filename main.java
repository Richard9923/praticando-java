import java.util.Scanner;
import java.util.Random;



public class main {

    


    public static void main(String[] args) {
        
       String playerChoice = playerChoice();
       System.out.println(playerChoice);


    }

    static String playerChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha entre pedra papel e tesoura.");
        return scanner.nextLine();
    
    }



    
}
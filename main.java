import java.util.Scanner;
import java.util.Random;



public class main {

    


    public static void main(String[] args) {
        
       String playerChoice = playerChoice();
       String computerChoice = computerChoice();
       System.out.println(computerChoice);
       


    }

    static String playerChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha entre pedra papel e tesoura.");
        return scanner.nextLine();
    
    }

    static String computerChoice() {
        Random random = new Random();
        String[] computerOptions = {"pedra", "papel", "tesoura"};
        int randomNumber = random.nextInt(0, computerOptions.length);
        return computerOptions[randomNumber];
    }


    
}
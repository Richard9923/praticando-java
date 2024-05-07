import java.util.Scanner;
import java.util.Random;



public class main {

    


    public static void main(String[] args) {
       
       String resultadoJogo = gaming(playerChoice(),computerChoice());
       System.out.println(resultadoJogo);


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

    static String gaming(String player, String computer) {

        if (player.equals(computer)) {
            System.out.println("Empate. Escolha do jogador: "+player+". Escolha do computador: "+computer+".");
            return "empate";
        }
        else if (player.equals("pedra") && computer.equals("tesoura")) {
            System.out.println("Jogador venceu! Escolha do jogador: "+player+". Escolha do computador: "+computer+".");
            return "venceu";
        }
        else if (player.equals("papel") && computer.equals("pedra")) {
            System.out.println("Jogador venceu! Escolha do jogador: "+player+". Escolha do computador: "+computer+".");
            return "venceu";
        }
        else if (player.equals("tesoura") && computer.equals("papel")) {
            System.out.println("Jogador venceu! Escolha do jogador: "+player+". Escolha do computador: "+computer+".");
            return "venceu";
        }
        else {
            System.out.println("Jogador perdeu. Escolha do jogador: "+player+". Escolha do computador: "+computer+".");
            return "perdeu";
        }
    }
    
}
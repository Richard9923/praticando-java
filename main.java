import java.util.Scanner;
import java.util.Random;



public class main {
    static int playerPoints = 0;
    static int computerPoints = 0;
    static boolean gameOn = true;

    public static void main(String[] args) {
       
        while (gameOn == true) {
            System.out.println("Pontos do jogador: "+playerPoints);
            System.out.println("Pontos do computador: "+computerPoints);

            String resultadoJogo = gaming(playerChoice(),computerChoice());
            verificarVencedor(resultadoJogo);
        }    
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

    static void verificarVencedor(String resultado) {

        if (resultado.equals("venceu")) {    
            playerPoints +=1;
            if (playerPoints == 3) {
                System.out.println("O jogador venceu o jogo com "+playerPoints+" pontos. ");
                System.out.println("Fim do jogo.");
                gameOn = false;
            }    
            else {
                System.out.println("Continuando o jogo.");
            }

        }
        else if (resultado.equals("perdeu")) {
            computerPoints += 1;
            if (computerPoints == 3) {
                System.out.println("O computador venceu o jogo com "+computerPoints+" pontos. ");
                System.out.println("Fim do jogo.");
                gameOn = false;
            }
            else {
                System.out.println("Continuando o jogo.");
            }
        }

    }
    
}
import java.util.Scanner;
import java.util.Random;

public class JogoAdivinhacao 
{
    public static void main(String[] args) 
    {
        Random gerador = new Random();
        int numeroSorteado = gerador.nextInt(100);

        Scanner entrada = new Scanner(System.in);
        System.out.println("Adivinhe o número que estou pensando...");
        int numeroDigitado = entrada.nextInt();

        if (numeroDigitado == numeroSorteado)
            System.out.println("Parabéns, você acertou. O número era " + numeroSorteado + ".");
        else
            System.out.println("Você errou. Eu pensei no " + numeroSorteado + ".");

    }    
}

import java.util.Scanner;

public class entrada_e_saida 
{
    public static void main(String[] args)
    {
        System.out.println("Olá mundo!!!");

        // Entrada de dados
        String nome;
        Scanner entrada = new Scanner(System.in);
        nome = entrada.next();

        System.out.println("Seu nome é " + nome + ".");
    }
}

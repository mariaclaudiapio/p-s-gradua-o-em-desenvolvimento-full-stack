import java.util.Scanner;

public class DoWhile 
{
    public static void main(String[] args) 
    {
        int valor = 0;

        do
        {
            System.out.println("Digite um valor qualquer ou 99 para sair.");
            Scanner entrada = new Scanner(System.in);
            valor = entrada.nextInt();
            System.out.println("O valor que você digitou foi: " + valor + ".");
        } while (valor != 99);
        
        System.out.println("Saindo do programa...");
    }    
}

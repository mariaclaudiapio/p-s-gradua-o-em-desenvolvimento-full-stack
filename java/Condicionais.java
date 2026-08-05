public class Condicionais 
{
    public static void main(String[] args) 
    {
        int nota = 3;

        if(nota >= 6)
            System.out.println("Aprovado");
        else if (nota >= 3 && nota < 6)
            System.out.println("Recuperação");        
        else
            System.out.println("Reprovado");        
    }
}

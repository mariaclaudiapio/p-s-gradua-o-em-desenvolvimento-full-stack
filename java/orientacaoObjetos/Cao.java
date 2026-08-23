package orientacaoObjetos;

public class Cao 
{
    String nome;
    String cor;
    int idade;
    double peso;

    // Método construtor
    public Cao()
    {
        cor = "Caramelo";
    }

    // Método construtor carregado (com parâmetros)
    public Cao(String nome, int idade)
    {
        this.nome = nome;
        this.idade = idade;
    }

        public void Anda()
    {
        System.out.println("Estou andando..." + cor);
    }

    public void DadosCao()
    {
        System.out.println("Meu nome é " + nome + " e eu tenho " + idade + " anos.");
    }
}

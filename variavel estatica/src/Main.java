import br.com.pacotes.pessoa.Pessoa;

public class Main {
    public static void main(String[] args){
        Pessoa joao = new Pessoa();
        joao.name = "João";
        System.out.println(joao.name + " - " + Pessoa.contador);

        Pessoa maria = new Pessoa();
        maria.name = "Maria";
        System.out.println(maria.name + " - " + Pessoa.contador);

        Pessoa jose = new Pessoa();
        jose.name = "José";
        System.out.println(jose.name + " - " + Pessoa.contador);


    }
}

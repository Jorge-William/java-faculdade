package cap02;

import java.util.*;

public class EntradaComDataInputStream {
    public static void main(String[] args) {
        float nota1 = 0, nota2 = 0, trabalho = 0, media = 0;

        try {
            System.out.println("Entre com a nota 1: ");
            Scanner leia = new Scanner(System.in);
            nota1 = leia.nextFloat();

            System.out.println("Entre com a nota 2: ");
            leia = new Scanner(System.in);
            nota2 = leia.nextFloat();

            System.out.println("Entre com a nota do trabalho: ");
            leia = new Scanner(System.in);
            trabalho = leia.nextFloat();


            media = (nota1 + nota2) / 3;
            System.out.println("Media: " + media);

        } catch (NumberFormatException erro){
            System.out.println("Houve um erro na conversão, digite somente caracteres numéricos!!!" + erro.toString());
        }


    }
}

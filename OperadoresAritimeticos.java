package cap02;

public class OperadoresAritimeticos {
    public static void main(String[] args) {

        // Declaracao e inicializacao de variaveis
        int x = 10 ; int y = 3;

        // Varias operacoes com as variaveis
        System.out.println("X = " + x);
        System.out.println("Y = " + y);
        System.out.println("-X = " + (-x));
        System.out.println("X/Y = " + (x/y));
        System.out.println("Resto de x por y = " + (x%y));
        System.out.println("Inteiro de x por y = " + (int)(x/y)); //resulta em 1
        System.out.println("X + 1 = " + (++x)); //Resulta em 11
    }
}

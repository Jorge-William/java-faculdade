package cap02;

import javax.swing.JOptionPane;

public class EntradaComJOptionPane {
    public static void main(String[] args) {
        String aux = "";

        float nota1 = 0, nota2 = 0, trabalho = 0, media = 0;

        try {
            aux = JOptionPane.showInputDialog("Entre com a nota 1: ");
            nota1 = Float.parseFloat(aux);

            aux = JOptionPane.showInputDialog("Entre com a nota 2: ");
            nota1 = Float.parseFloat(aux);

            aux = JOptionPane.showInputDialog("Entre com a nota do trabalho: ");
            trabalho = Float.parseFloat(aux);

            media = (nota1 + nota2) / 3;
            JOptionPane.showInternalMessageDialog(null,"A media foi: ");


        } catch (NumberFormatException erro){
                JOptionPane.showMessageDialog(null, "Houve um erro na conversao digite apenas...." + erro.toString());
        }
        System.exit(0);
    }
}

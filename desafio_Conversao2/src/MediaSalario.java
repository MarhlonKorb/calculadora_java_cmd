import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class MediaSalario {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));

        String salario1 = JOptionPane.showInputDialog("Digite o valor do primeiro salário: ");
        String salario2 = JOptionPane.showInputDialog("Digite o valor do segundo salário: ");
        String salario3 = JOptionPane.showInputDialog("Digite o valor do teirceiro salário: ");

        double valor1 = Double.parseDouble(salario1);
        double valor2 = Double.parseDouble(salario2);
        double valor3 = Double.parseDouble(salario3);

        double mediaSalarios = (valor1 + valor2 + valor3) / 3;

        System.out.println("A media dos salários é: "+mediaSalarios);
    }
}

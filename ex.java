import java.util.Scanner;
import java.text.DecimalFormat;

public class ex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##0.00");

        double[] temperatura = new double[12];
        float mediaTotal = 0;

        for (int i = 0; i < 12; i++) {
            boolean aux = true;
            System.out.println("Insira uma temperatura " + (i + 1) + " (entre 4 e 10): ");

            while (aux) {
                temperatura[i] = input.nextDouble();

                if (temperatura[i] < 4 || temperatura[i] > 10) {
                    System.out.print("Valor inválido. Insira novamente.\n ");
                } else {
                    aux = false;
                }
            }
        } 

        for (int i = 0; i < 12; i++) {
            mediaTotal += temperatura[i];
        }

        mediaTotal /= temperatura.length;

        System.out.printf("A média das temperaturas é de: %s graus Celsius", df.format(mediaTotal));

        input.close();
    }
}
import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double[] consumos = new double[5];
        for (int i = 0; i < consumos.length; i++) {
            System.out.printf("Consumo %d: ", (i + 1));
            consumos[i] = entrada.nextDouble();
        }

        int qtde = 0;
        for (double consumo : consumos) {
            if (consumo > 5000) {
                System.out.printf("Consumo anomalo: %.1f\n", consumo);
                qtde++;
            }
        }
        System.out.printf("Quantidade de consumo anomalo: %d\n", qtde);
    }
}
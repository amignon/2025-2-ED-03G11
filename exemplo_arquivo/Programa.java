import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        String[] linhas = null;
        try {
            linhas = leArquivo("arquivo.ed1");
            for (int i = 0; i < linhas.length; i++) {
                if (linhas[i] == null) break;
                System.out.println(linhas[i]);
            }
        } catch (IOException e) {
            System.out.printf("Erro ao abrir o arquivo: %s\n", e.getMessage());
        }
        if (linhas != null) {
            linhas[9] = "100 out a";
            linhas[10] = "110 out b";
            try {
                gravaArquivo("arquivo2.ed1", linhas);
            } catch(IOException e) {
                System.out.printf("Erro ao gravar o arquivo: %s\n", e.getMessage());
            }
        }
    }

    public static void gravaArquivo(String caminho, String[] linhas) throws IOException {
        PrintWriter escritor = new PrintWriter(caminho);
        int posicao = 0;
        while (linhas[posicao] != null) {
            escritor.println(linhas[posicao]);
            posicao++;
        }
        escritor.close();
    }

    public static String[] leArquivo(String caminho) throws IOException {
        String[] linhas = new String[100];
        String linha;
        
        File arquivo = new File(caminho);
        Scanner leitor = new Scanner(arquivo);
        int posicao = 0;
        while (leitor.hasNextLine()) {
            linha = leitor.nextLine();
            linhas[posicao] = linha;
            posicao++;
        }
        leitor.close();
        return linhas;
    }
}
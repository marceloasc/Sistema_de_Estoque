package utils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class BancoDeDadosJson {
    
    public static void salvarArquivo(String caminho, String texto) {
        //Travar o caminho para o arquivo e o nomeFileWriter
        Path arquivo = Paths.get(caminho);
        BufferedWriter bw = null;
        if (!Files.exists(arquivo)) {
            try {
                Files.createFile(arquivo);
                bw = new BufferedWriter(new FileWriter(arquivo.toFile(), true));
                bw.write(texto);
            } catch (IOException ex) {
                System.out.println("Arquivo com problema");
            } finally {
                try {
                    bw.close();
                } catch (IOException ex) {
                    System.out.println("Não consegui fechar o arquivo");
                }
            }
        } else {
            try {
                bw = new BufferedWriter(new FileWriter(arquivo.toFile(), true));
                bw.newLine();
                bw.write(texto);
            } catch (IOException ex) {
                System.out.println("Arquivo com problemas");
            } finally {
                try {
                    bw.close();
                } catch (IOException ex) {
                    System.out.println("Não consegui fechar o arquivo");
                }

            }
        }

    }
}

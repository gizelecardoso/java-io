package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {
		
		//Fluxo de Entrada com um Arquivo
		
//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer iow = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(iow);
		
		//FileWriter fw = new FileWriter("lorem2.txt");
		
		long ini = System.currentTimeMillis();
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
		bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod ");
		//fw.write("\r\n");
		//fw.write(System.lineSeparator());
		bw.newLine();
		bw.newLine();
		bw.write("tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,");
		
		bw.close();//precisa fechar o código.
		
		long fim = System.currentTimeMillis();

        System.out.println("Passaram " + (fim - ini) + " milissegundos");
		
	}

}

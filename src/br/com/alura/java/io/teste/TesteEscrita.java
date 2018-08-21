package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {
		
		//Fluxo de Entrada com um Arquivo
		
		OutputStream fos = new FileOutputStream("lorem2.txt");
		Writer iow = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(iow);
		
		bw.write("jajhahahhahah");
		bw.newLine();
		bw.newLine();
		bw.write("jajhahahhahah");
		
		bw.close();//precisa fechar o código.
		
	}

}

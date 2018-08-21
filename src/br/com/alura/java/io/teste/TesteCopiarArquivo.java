package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.Socket;

public class TesteCopiarArquivo {

	public static void main(String[] args) throws IOException {
		
		//Comunicação com rede
		
		Socket s = new Socket();
		
		
		//Fluxo de Entrada com um Arquivo
		
		//InputStream fis = System.in; //- TECLADO
		//InputStream fis = new FileInputStream("lorem.txt"); //ARQUIVO
		InputStream fis = s.getInputStream(); // REDE
		Reader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		//OutputStream fos = System.out; // TECLADO
		//OutputStream fos = new FileOutputStream("lorem2.txt"); //ARQUIVO
		OutputStream fos = s.getOutputStream(); //REDE
		
		Writer iow = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(iow);
		
		String linha = br.readLine();
		
		while(linha != null && !linha.isEmpty()) {
			bw.write(linha);
			bw.newLine();
			bw.flush();
			linha = br.readLine();
		}
		
		br.close();
		bw.close();//precisa fechar o código.
	
		
	}

}

package br.com.alura.java.io.teste;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEEnconding {

	public static void main(String[] args) throws UnsupportedEncodingException {
		
		String s = "ç";
		System.out.println(s.codePointAt(0));//unicode
		
		Charset charset = Charset.defaultCharset();
		System.out.println(charset.displayName());
		
//		byte[] bytes = s.getBytes();//CTRL+1 - CRIAR VARIAVEL LOCAL.
//		System.out.println(bytes.length + ", windows-1252");
		
		byte[] bytes = s.getBytes("windows-1252");//CTRL+1 - CRIAR VARIAVEL LOCAL.
		System.out.println(bytes.length + ", windows-1252");
		String sNovo = new String(bytes, "windows-1252");
		System.out.println(sNovo);
		
		
		
		bytes = s.getBytes("UTF-16");//CTRL+1 - CRIAR VARIAVEL LOCAL.
		System.out.print(bytes.length + ", UTF-16, ");
		sNovo = new String(bytes, "UTF-16");
		System.out.println(sNovo);
		
		bytes = s.getBytes("UTF-8");//CTRL+1 - CRIAR VARIAVEL LOCAL.
		System.out.print(bytes.length + ", UTF-8, ");
		sNovo = new String(bytes, "UTF-8");
		System.out.println(sNovo);
		
		bytes = s.getBytes(StandardCharsets.US_ASCII);//CTRL+1 - CRIAR VARIAVEL LOCAL.
		System.out.print(bytes.length + ", US-ASCII, ");
		sNovo = new String(bytes, "US-ASCII");
		System.out.println(sNovo);


	}

}

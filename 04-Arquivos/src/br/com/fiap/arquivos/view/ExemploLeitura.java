package br.com.fiap.arquivos.view;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExemploLeitura {

	public static void main(String[] args) {
		try {
			//Abrir o fluxo de entrada
			FileReader inputStream = new FileReader("churros.txt");
			//Objeto para ler o arquivo
			BufferedReader arquivo = new BufferedReader(inputStream);
			
			//Variavel para receber cada linha do arquivo
			String linha;
			//Laço para ler todas as linhas do arquivo
			while ((linha = arquivo.readLine()) != null) {
				System.out.println(linha);
			}
			
			//Fechar os recursos abertos
			arquivo.close();
			inputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
	}//main
}//class
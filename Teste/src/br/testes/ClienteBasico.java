package br.testes;

//ClienteBasico.java
import java.io.*;
import java.net.*;

public class ClienteBasico {
	public static void main(String a[]) {

		if (a.length == 0) {
			System.out.println("[Forne�a um IP ou Nome de Dom�nio]");
			System.exit(0);
		}

		try {
			System.out.println("[Conectando ao Servidor...]");
			Socket cliente = new Socket(a[0], 1234);
			
			System.out.println("[Conex�o aceita de: "
					+ cliente.getInetAddress().toString() + "]");
			
			System.out.println("[Recebendo Mensagens...]");
			
			ObjectInputStream entrada = new ObjectInputStream(
					cliente.getInputStream());
			
			String msg;
			do {
				msg = (String) entrada.readObject();
				System.out.println(msg);
			} while (!msg.equals("EOT"));
			cliente.close();
			
			System.out.println("[Conex�o Encerrada...]");
			
		} catch (Exception e) {
			System.out.println("Erro!\n" + e.getMessage());
		}
	}
}
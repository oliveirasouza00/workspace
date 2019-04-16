package br.testes;

//Servidor 
//ServidorBasico.java
import java.io.*;
import java.net.*;

public class ServidorBasico{
public static void main(String args[]){
try {
System.out.println("[Criando Servidor ...]");
ServerSocket servidor = new ServerSocket(1234);
System.out.println("[Servidor Operando na porta 1234]");
while (true) {
System.out.println("[Esperando Conexão ...]");
Socket cliente = servidor.accept();

System.out.println("[Conexão aberta de:  " + cliente.getInetAddress().toString() + "]");

System.out.println("[Enviando dados...]");
ObjectOutputStream saida = new ObjectOutputStream(cliente.getOutputStream());
saida.flush();					//Envia cabecalho de preparo do outro endpoint
saida.writeObject("Servidor Basico Conectado");
saida.writeObject("Dados Conexão: "+cliente.toString());
saida.writeObject("Tchau!");
System.out.println("[Dados Enviados]");
saida.writeObject("EOT");
cliente.close();
System.out.println("[Conexão encerrada]");
}
}
catch (Exception e) {
System.out.println("Erro!\n"+e.getMessage());
}
}
}
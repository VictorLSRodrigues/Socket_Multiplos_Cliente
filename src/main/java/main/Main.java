package main;

import java.net.*;
import java.io.*;
import java.util.Scanner;
import javax.swing.*;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
          try {
            Socket servidor = new Socket(sc.next(), 4444);//endereco e porta
            PrintWriter out = new PrintWriter(
                    servidor.getOutputStream(), true);
            String mensagem = "";
            while (!mensagem.equals("fim")) {
                mensagem = JOptionPane.
                        showInputDialog("Digite a Mensagem ou fim para sair");
                out.println(mensagem); //escreve a mensagem
            }
        } catch (IOException io) {
            System.err.println("Problemas de IO");
        }
    }
}

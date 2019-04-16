package br.testes;

import javax.swing.*;

public class Tes {
    public static Object Sorteio;


        private int numero;

      Tes() {
           numero = (int) (1 + (Math.random() * 10)); //sorteia numeros entre 1 e 10
       }

       public int getNumero() {
           return this.numero;
      }

       public void setNumero(int n) {
           numero = n;
      }

       public static void main(String args[]) {
           Tes Sorteio1 = new Tes();
           int resposta = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor entre 1 e 10"));

           if (resposta == Sorteio1.getNumero()) {
               JOptionPane.showMessageDialog(null, "Você acertou o primeiro sorteio");
           } else {
               JOptionPane.showMessageDialog(null, "Você errou o primeiro sorteio. \n O valor sorteado foi " + Sorteio1.getNumero());
           }
       
           {
             Tes Sorteio2=new Tes();
               int resposta2=Integer.parseInt(JOptionPane.showInputDialog("Informe um valor entre 1 e 10"));

               if (resposta2 ==Sorteio2.getNumero()){
                   JOptionPane.showMessageDialog(null,"Você acertou o segundo sorteio");
               }else{
                   JOptionPane.showMessageDialog(null,"Você errou o segundo sorteio. \n O valor sorteado foi " +Sorteio2.getNumero());

               }
           }
               {
                   Tes Sorteio3=new Tes();
                   int resposta3=Integer.parseInt(JOptionPane.showInputDialog("Informe um valor entre 1 e 10"));

                   if (resposta3==Sorteio3.getNumero()){
                       JOptionPane.showMessageDialog(null,"Você acertou o terceiro sorteio");
                   }else{
                       JOptionPane.showMessageDialog(null,"Você errou o terceiro sorteio. \n O valor sorteado foi "+Sorteio3.getNumero());

                   }

               System.exit(0);


               }
       }
    }
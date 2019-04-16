package br.testes;

import javax.swing.JOptionPane;

public class Sorteio {

	public static Object Sorteio;

	private int numero;

	Sorteio() {

		numero = (int) (1 + (Math.random() * 2));
	}

	public int getNumero() {
		return this.numero;

	}

	public void setNumero(int n) {
		numero = n;
	}

	public static void main(String args[]) {
		Sorteio Sorteio1 = new Sorteio();
		int resposta = Integer.parseInt(JOptionPane
				.showInputDialog("Inform o Valor de 1 a 2"));

		if (resposta == Sorteio1.getNumero()) {
			JOptionPane.showConfirmDialog(null,
					"Você  acertou o primeiro sorteio");
		} else {
			JOptionPane.showConfirmDialog(null,
					"Você errou " + Sorteio1.getNumero());

		}

		{
			Sorteio Sorteio2 = new Sorteio();
			int resposta2 = Integer.parseInt(JOptionPane
					.showInputDialog("Informe o valor o valor entre 1 e 2"));

			if (resposta2 == Sorteio2.getNumero()) {
				JOptionPane.showMessageDialog(null,
						"Você Acertou o segundo sorteio");

			} else {

				JOptionPane.showInputDialog(null,
						"Você errou o segundo sorteio", +Sorteio2.getNumero());

			}

		}
		
		{
			Tes Sorteio3 = new Tes();
			int resposta3 = Integer.parseInt(JOptionPane
					.showInputDialog("Informe um valor entre 1 e 2"));

			if (resposta3 == Sorteio3.getNumero()) {
				JOptionPane.showMessageDialog(null,
						"Você acertou o terceiro sorteio");
			} else {
				JOptionPane.showMessageDialog(null,
						"Você errou o terceiro sorteio. \n O valor sorteado foi "
								+ Sorteio3.getNumero());

			}

			System.exit(0);

		}

	}
}

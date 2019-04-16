package br.testes;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



	
	public class Window implements ActionListener {
	
		
		private static String labelPrefix = "N° de Clicks:";
		private int nClicks =0;
		final JLabel label = new JLabel(labelPrefix + "0");
		
		public Component creatComponents(){
			
			JButton botao = new JButton("ok");
			botao.addActionListener(this);
			label.setLabelFor(botao);
			
			JPanel pane = new JPanel();
			pane.add(botao);
			pane.add(label);
			return pane;
	
		}
		
		
	
		@Override
		public void actionPerformed(ActionEvent e) {
			nClicks++;
			label.setText(labelPrefix + nClicks);
		}
		
			
		public void main(){
			
			JFrame jan = new JFrame("Aplicação com Botão");
			jan.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			jan.setSize(300,300);
			
			Window app = new Window();
			Component content = app.creatComponents();
			jan.getContentPane().add(content,BorderLayout.CENTER);
			jan.pack();
			jan.setVisible(true);
		
			}
		
		}	



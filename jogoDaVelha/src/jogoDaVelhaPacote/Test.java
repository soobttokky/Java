package jogoDaVelhaPacote;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.util.Iterator;

import javax.swing.*;

@SuppressWarnings({ "serial", "unused" })
public class Test extends JFrame {
	JButton[] bt = new JButton[9];
	JLabel placar = new JLabel("Placar");
	JLabel px = new JLabel("X 0");
	JLabel po = new JLabel("O 0");
	JButton novo = new JButton("Novo jogo");
	JButton zerar = new JButton("Zerar placar");
	int PX = 0;
	int PO = 0;
	boolean xo = false;
	boolean[] click = new boolean[9];
	
	public Test() {
		setVisible(true);
		setTitle("Jogo da Velha");
		setDefaultCloseOperation(3); // para fechar a tela apenas quando se aperta no X
		setLayout(null); // sem layout
		setBounds(250,100,700,500); // tamaho, lagura e posição da tela
		add(placar);
		add(px);
		add(po);
		add(novo);
		add(zerar);
		
		placar.setBounds(400,50,100,30);
		px.setBounds(400,75,100,30);
		po.setBounds(450,75,100,30);
		novo.setBounds(410,125,110,20);
		zerar.setBounds(410,150,110,20);
		
		placar.setFont(new Font("Consolas",Font.BOLD,25));
		px.setFont(new Font("Consolas",Font.ITALIC,15));
		po.setFont(new Font("Consolas",Font.ITALIC,15));
		
		novo.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				limpar();
			}
		});
		
		zerar.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				PO = 0;
				PX = 0;
				atualizar();
			}
		});
		
		
		
		int cont = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				bt[cont] = new JButton();
				add(bt[cont]);
				bt[cont].setBounds((100 * i)+ 50, (100 * j) + 75,95,95);
				bt[cont].setFont(new Font("Consolas",Font.BOLD,40));
				cont++;
			}
			
		}
		
		for (int i = 0; i < 9; i++) {
			click[i] = false;
		}
		
		bt[0].addActionListener(new java.awt.event.ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				if(click[0] == false) {
					click[0] = true;
					mudar(bt[0]);
				}
			}
			
		});
		
		bt[1].addActionListener(new java.awt.event.ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				if(click[1] == false) {
					click[1] = true;
					mudar(bt[1]);
				}
			}
			
		});
		
		bt[2].addActionListener(new java.awt.event.ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				if(click[2] == false) {
					click[2] = true;
					mudar(bt[2]);
				}
			}
			
		});
		
		bt[3].addActionListener(new java.awt.event.ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				if(click[3] == false) {
					click[3] = true;
					mudar(bt[3]);
				}
			}
			
		});
		
		bt[4].addActionListener(new java.awt.event.ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				if(click[4] == false) {
					click[4] = true;
					mudar(bt[4]);
				}
			}
			
		});
		
		bt[5].addActionListener(new java.awt.event.ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				if(click[5] == false) {
					click[5] = true;
					mudar(bt[5]);
				}
			}
			
		});
		
		bt[6].addActionListener(new java.awt.event.ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				if(click[6] == false) {
					click[6] = true;
					mudar(bt[6]);
				}
			}
			
		});
		
		bt[7].addActionListener(new java.awt.event.ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				if(click[7] == false) {
					click[7] = true;
					mudar(bt[7]);
				}
			}
			
		});
		
		bt[8].addActionListener(new java.awt.event.ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				if(click[8] == false) {
					click[8] = true;
					mudar(bt[8]);
				}
			}
			
		});
	}
	
	public void mudar(JButton btn) {
		if(xo) {
			btn.setText("O");
			xo = false;
		}else {
			btn.setText("X");
			xo = true;
		}
		ganhou();
	}
	
	public void atualizar()	{
		px.setText("X " + PX);
		po.setText("O " + PO);
	}
	
	public void ganhou() {
		int cont = 0;
		
		for(int i = 0; i< 9;i++) {
			if(click[i] == true) {
				cont++;
			}
		}
		
		if((bt[0].getText() == "X" && bt[1].getText() == "X" && bt[2].getText() == "X") || 
		   (bt[3].getText() == "X" && bt[4].getText() == "X" && bt[5].getText() == "X") || 
		   (bt[6].getText() == "X" && bt[7].getText() == "X" && bt[8].getText() == "X") || 
		   (bt[0].getText() == "X" && bt[3].getText() == "X" && bt[6].getText() == "X") || 
		   (bt[1].getText() == "X" && bt[4].getText() == "X" && bt[7].getText() == "X") || 
		   (bt[2].getText() == "X" && bt[5].getText() == "X" && bt[8].getText() == "X") || 
		   (bt[0].getText() == "X" && bt[4].getText() == "X" && bt[8].getText() == "X") || 
		   (bt[6].getText() == "X" && bt[4].getText() == "X" && bt[2].getText() == "X")) {
			
			JOptionPane.showMessageDialog(null, "X ganhou");
			PX++;
			atualizar();
			limpar();
			
		} else if((bt[0].getText() == "O" && bt[1].getText() == "O" && bt[2].getText() == "O") || 
				  (bt[3].getText() == "O" && bt[4].getText() == "O" && bt[5].getText() == "O") || 
				  (bt[6].getText() == "O" && bt[7].getText() == "O" && bt[8].getText() == "O") || 
				  (bt[0].getText() == "O" && bt[3].getText() == "O" && bt[6].getText() == "O") || 
				  (bt[1].getText() == "O" && bt[4].getText() == "O" && bt[7].getText() == "O") || 
				  (bt[2].getText() == "O" && bt[5].getText() == "O" && bt[8].getText() == "O") || 
				  (bt[0].getText() == "O" && bt[4].getText() == "O" && bt[8].getText() == "O") || 
				  (bt[6].getText() == "O" && bt[4].getText() == "O" && bt[2].getText() == "O")) {
					
					JOptionPane.showMessageDialog(null, "O ganhou");
					PO++;
					atualizar();
					limpar();
				}
		else if(cont == 9){
			JOptionPane.showMessageDialog(null, "Empate");
			limpar();
		}
	}
	
	public void limpar() {
		for (int i = 0; i < 9; i++) {
			bt[i].setText("");
			click[i] = false;
			xo = false;
		}
	}
	
	public static void main(String[] args) {		
		new Test();
	}

}

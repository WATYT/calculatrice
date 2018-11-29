package com.waty.calculatrice;

import java.awt.EventQueue;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calculatrice {

	private JFrame frame;
	public Float chiffre;
	public Float chiffre2;
	public String operateur;
	private String txt;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculatrice window = new calculatrice();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calculatrice() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new MigLayout("", "[][][][][]", "[][][][][][][]"));
		
		lblNewLabel = new JLabel("New label");
		frame.getContentPane().add(lblNewLabel, "cell 1 0 4 3,growx");
		
		JButton button = new JButton("1");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txt==null)
				{
					txt ="1";
				}else
				{
					txt =txt+"1";
				}
				lblNewLabel.setText(txt);
			}
		});
		frame.getContentPane().add(button, "cell 1 3,growx");
		
		JButton button_1 = new JButton("2");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txt==null)
				{
					txt ="2";
				}else
				{
					txt =txt+"2";
				}
				lblNewLabel.setText(txt);
			}
		});
		frame.getContentPane().add(button_1, "cell 2 3,growx");
		
		JButton button_2 = new JButton("3");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txt==null)
				{
					txt ="3";
				}else
				{
					txt =txt+"3";
				}
				lblNewLabel.setText(txt);
			}
		});
		frame.getContentPane().add(button_2, "cell 3 3,growx");
		
		JButton button_12 = new JButton("+");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chiffre = Float.valueOf(txt);
				txt = null;
				operateur = "+";
			}
		});
		frame.getContentPane().add(button_12, "cell 4 3,growx");
		
		JButton button_3 = new JButton("4");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txt==null)
				{
					txt ="4";
				}else
				{
					txt =txt+"4";
				}
				lblNewLabel.setText(txt);
			}
		});
		frame.getContentPane().add(button_3, "cell 1 4,growx");
		
		JButton button_4 = new JButton("5");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txt==null)
				{
					txt ="5";
				}else
				{
					txt =txt+"5";
				}
				lblNewLabel.setText(txt);
			}
		});
		frame.getContentPane().add(button_4, "cell 2 4,growx");
		
		JButton button_5 = new JButton("6");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txt==null)
				{
					txt ="6";
				}else
				{
					txt =txt+"6";
				}
				lblNewLabel.setText(txt);
			}
		});
		frame.getContentPane().add(button_5, "cell 3 4,growx");
		
		JButton button_13 = new JButton("-");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chiffre = Float.valueOf(txt);
				txt = null;
				operateur = "-";
			}
		});
		frame.getContentPane().add(button_13, "cell 4 4,growx");
		
		JButton button_6 = new JButton("7");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txt==null)
				{
					txt ="7";
				}else
				{
					txt =txt+"7";
				}
				lblNewLabel.setText(txt);
			}
		});
		frame.getContentPane().add(button_6, "cell 1 5,growx");
		
		JButton button_7 = new JButton("8");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txt==null)
				{
					txt ="8";
				}else
				{
					txt =txt+"8";
				}
				lblNewLabel.setText(txt);
			}
		});
		frame.getContentPane().add(button_7, "cell 2 5,growx");
		
		JButton button_8 = new JButton("9");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txt==null)
				{
					txt ="9";
				}else
				{
					txt =txt+"9";
				}
				lblNewLabel.setText(txt);
			}
		});
		frame.getContentPane().add(button_8, "cell 3 5,growx");
		
		JButton button_14 = new JButton("*");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chiffre = Float.valueOf(txt);
				txt = null;
				operateur = "*";
			}
		});
		frame.getContentPane().add(button_14, "cell 4 5,growx");
		
		JButton button_9 = new JButton(".");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txt==null)
				{
					txt =".";
				}else
				{
					txt =txt+".";
				}
				lblNewLabel.setText(txt);
			}
		});
		frame.getContentPane().add(button_9, "cell 1 6,growx");
		
		JButton button_10 = new JButton("0");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txt==null)
				{
					txt ="0";
				}else
				{
					txt =txt+"0";
				}
				lblNewLabel.setText(txt);
			}
		});
		frame.getContentPane().add(button_10, "cell 2 6,growx");
		
		JButton button_11 = new JButton("=");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Float result;
				chiffre2 = Float.valueOf(txt);
				if(operateur != null)
				{
					switch (operateur) {
					case "+":
						result = chiffre + chiffre2;
						break;
					case "-":
						result = chiffre - chiffre2;
						break;
					case "*":
						result = chiffre * chiffre2;
						break;
					case "/":
						result = chiffre / chiffre2;
						break;

					default:
						result = null;
						break;
					}
					
					lblNewLabel.setText(result.toString());
				}else
				{
					lblNewLabel.setText("erreur");
				}
			}
		});
		frame.getContentPane().add(button_11, "cell 3 6,growx");
		
		JButton button_15 = new JButton("/");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chiffre = Float.valueOf(txt);
				txt = null;
				operateur = "/";
			}
		});
		frame.getContentPane().add(button_15, "cell 4 6,growx");
	}

}

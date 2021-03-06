package calculadora;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.*;// LLAMA A TODAS LAS CLASES

public class Calcu {

	JFrame frame;// FRAME CREADOR DEL FORMULARIO
	JPanel mp;// PANEL PARA LOS BOTONES
	JPanel mp1;// PANEL PARA CAJA DE TEXTO
	JTextField Mostrar;// CAJA DE TEXTO

	// AQUI SE CREAN LOS BOTONES QUE VAN DENTRO DEL FRAME
	JButton B_1;
	JButton B_2;
	JButton B_3;
	JButton B_4;
	JButton B_5;
	JButton B_6;
	JButton B_7;
	JButton B_8;
	JButton B_9;
	JButton B_0;
	JButton B_S;
	JButton B_r;
	JButton B_I;
	JButton B_M;
	JButton B_D;
	JButton B_c;

	public String acum = "";// ACUMULA EL VALOR DIGITADO
	public double a; // ALMACENA EL PRIMER VALOR DIGITADO

	public double op;// ALMACENA EL VALOR DIGITADO Y REALIZA LA OPERACION SEGUN EL
						// SIGNO.
	public String c = "";// GUARDAMOS EL SIGNO DE LA OPERACION PARA LUEGO SER LLAMADO EN LA
							// CONDICION

	public static void main(String arg[]) { // METODO PRINCIPAL
		@SuppressWarnings("unused")
		Calcu n = new Calcu();

	}

	// CONSTRUCTOR
	public Calcu() {

		// 1. CREAMOS EL FRAME
		frame = new JFrame("Calculadora");// NOMBRE DE FRAME EL QUE SE UBICA EN LA PARTE DE ARRIBA DEL
								// FORMULARIO

		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		mp = new JPanel(new GridLayout(4, 5));// COLUMNAS Y FILAS DEL FORMULARIO
		mp1 = new JPanel(new GridLayout(1, 1));// SE CREA UN SEGUNDO PANEL PARA LA CAJA DE TEXTO

		// CUADROS DE TEXTO CON TAMAÑO
		Mostrar = new JTextField();// NO TIENE DIMENCION

		// INICIALIZAMOS BOTONES

		B_1 = new JButton("1");// ESTOS SON LOS NOMBRES DE LOS BOTONES
		B_2 = new JButton("2");
		B_3 = new JButton("3");
		B_4 = new JButton("4");
		B_5 = new JButton("5");
		B_6 = new JButton("6");
		B_7 = new JButton("7");
		B_8 = new JButton("8");
		B_9 = new JButton("9");
		B_0 = new JButton("0");
		B_S = new JButton("+");
		B_r = new JButton("-");
		B_M = new JButton("*");
		B_c = new JButton("c");
		B_I = new JButton("=");
		B_D = new JButton("/");

		// ANADIMOS LOS BOTONES EL PANEL

		mp1.add(Mostrar);// ANADE EL PANEL QUE TIENE LA CAJA DE TEXTO MP1
		mp.add(B_1);// ANADIMOS LOS BOTONES EL PANEL MP EN ORDEN DE LA CALCULADORA
		mp.add(B_2);
		mp.add(B_3);
		mp.add(B_S);
		mp.add(B_4);
		mp.add(B_5);
		mp.add(B_6);
		mp.add(B_r);
		mp.add(B_7);
		mp.add(B_8);
		mp.add(B_9);
		mp.add(B_M);
		mp.add(B_c);
		mp.add(B_0);
		mp.add(B_I);
		mp.add(B_D);

		// LLAMAR AL PANEL
		frame.getContentPane().add(mp1, BorderLayout.CENTER);// SEGUNDO PANEL EN EL FRAME O FORMULARIO
		frame.getContentPane().add(mp, BorderLayout.SOUTH);// PRIMER PANEL EN EL FRAME O FORMULARIO

		// ACCIONES PARA LOS BOTONES NUMERICOS
		B_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				acum = Mostrar.getText() + "1";

				Mostrar.setText(acum);
			}
		});

		B_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acum = Mostrar.getText() + "2";
				Mostrar.setText(acum);
			}
		});
		B_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acum = Mostrar.getText() + "3";
				Mostrar.setText(acum);
			}
		});
		B_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acum = Mostrar.getText() + "4";
				Mostrar.setText(acum);
			}
		});
		B_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acum = Mostrar.getText() + "5";
				Mostrar.setText(acum);
			}
		});
		B_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acum = Mostrar.getText() + "6";
				Mostrar.setText(acum);
			}
		});
		B_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acum = Mostrar.getText() + "7";
				Mostrar.setText(acum);
			}
		});
		B_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acum = Mostrar.getText() + "8";
				Mostrar.setText(acum);
			}
		});
		B_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acum = Mostrar.getText() + "9";
				Mostrar.setText(acum);
			}
		});
		B_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acum = Mostrar.getText() + "0";
				Mostrar.setText(acum);
			}
		});

		B_S.addActionListener(new ActionListener() {// BOTON QUE REALIZA LA OPERACION DE SUMAR
			public void actionPerformed(ActionEvent e) {
				acum = Mostrar.getText();
				a = (Double.parseDouble(acum));
				c = "+";

				Mostrar.setText("");
			}
		});

		B_M.addActionListener(new ActionListener() {// BOTON QUE REALIZA LA OPERACION DE MULTIPLICA
			public void actionPerformed(ActionEvent e) {
				acum = Mostrar.getText();
				a = (Double.parseDouble(acum));
				c = "*";
				Mostrar.setText("");
			}
		});

		B_r.addActionListener(new ActionListener() {// BOTON QUE REALIZA LA OPERACION DE RESTA
			public void actionPerformed(ActionEvent e) {
				acum = Mostrar.getText();
				a = (Double.parseDouble(acum));
				c = "-";
				Mostrar.setText("");
			}
		});

		B_D.addActionListener(new ActionListener() {// BOTON QUE REALIZA LA OPERACION DE DIVIDE
			public void actionPerformed(ActionEvent e) {
				acum = Mostrar.getText();
				a = (Double.parseDouble(acum));
				c = "/";
				Mostrar.setText("");
			}
		});
		B_c.addActionListener(new ActionListener() {// BOTON QUE REALIZA LA OPERACION DE BORRAR LOS NUMEROS QUE APARECEN
													// EN LA CAJA DE TEXTO
			public void actionPerformed(ActionEvent e) {
				acum = "";

				Mostrar.setText(acum);
			}
		});

		B_I.addActionListener(new ActionListener() {// BOTON IGUAL
			public void actionPerformed(ActionEvent e) {

				acum = Mostrar.getText();
				double b = (Double.parseDouble(acum));

				Llamado obj = new Llamado();

				if (c == "+") {// CONDICION PARA C "VARIABLE QUE ALMACENA LOS SIGNOS"

					Mostrar.setText(String.valueOf(obj.suma(a, b)));
				} else {
					if (c == "-") {
						Mostrar.setText(String.valueOf(obj.resta(a, b)));
					} else {
						if (c == "*") {
							Mostrar.setText(String.valueOf(obj.mul(a, b)));
						} else {
							if (c == "/") {

								Mostrar.setText(String.valueOf(obj.div(a, b)));

							}
						}
					}

				}

			}

		});

		// DIMENSIONES DEL JFRAME
		frame.setSize(200, 300);// TAMANO EL FORMULARIO O FRAME
		frame.setResizable(false);// FRAME ESTATICO
		frame.setLocationRelativeTo(frame.getParent());
		frame.setVisible(true);// PERMITE QUE EL FORMULARIO SEA VISIBLE

	}// fin del contructor

}

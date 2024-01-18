package es.studium.ejemplos;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.TextField;

public class Ejercicio11
{
	Frame ventana = new Frame("Mi Calculadora");
	Button btnUno = new Button("1");
	Button btnDos = new Button("2");
	Button btnTres = new Button("3");
	Button btnCuatro = new Button("4");
	Button btnCinco = new Button("5");
	Button btnSeis = new Button("6");
	Button btnSiete = new Button("7");
	Button btnOcho = new Button("8");
	Button btnNueve = new Button("9");
	Button btnCero = new Button("0");
	Button btnIgual = new Button("=");
	Button btnMas = new Button("+");
	Button btnMenos = new Button("-");
	Button btnPunto = new Button(".");
	Button btnAsterisco = new Button("*");
	Button btnBarra = new Button("/");
	Button btnBorrar = new Button("CE");
	TextField txtPantalla = new TextField(20);
	
	public Ejercicio11()
	{
		ventana.setSize(250,200);

		ventana.setLayout(new GridBagLayout());
		GridBagConstraints restricciones = new GridBagConstraints();

		// Comunes
		restricciones.fill = GridBagConstraints.BOTH;
		restricciones.weightx = 1.0;
		restricciones.weighty = 1.0;

		// Particulares

		restricciones.gridx = 0;
		restricciones.gridy = 0;
		restricciones.gridwidth = 4;
		ventana.add(txtPantalla, restricciones);
		restricciones.gridwidth = 1;

		restricciones.gridx = 0;
		restricciones.gridy = 1;
		ventana.add(btnBorrar, restricciones);

		restricciones.gridx = 1;
		restricciones.gridy = 1;
		ventana.add(btnBarra, restricciones);

		restricciones.gridx = 2;
		restricciones.gridy = 1;
		ventana.add(btnAsterisco, restricciones);

		restricciones.gridx = 3;
		restricciones.gridy = 1;

		ventana.add(btnMenos, restricciones);

		restricciones.gridx = 0;
		restricciones.gridy = 2;
		ventana.add(btnSiete, restricciones);

		restricciones.gridx = 1;
		restricciones.gridy = 2;
		ventana.add(btnOcho, restricciones);

		restricciones.gridx = 2;
		restricciones.gridy = 2;
		ventana.add(btnNueve, restricciones);

		restricciones.gridx = 3;
		restricciones.gridy = 2;
		restricciones.gridheight = 2;
		ventana.add(btnMas, restricciones);
		restricciones.gridheight = 1;

		restricciones.gridx = 0;
		restricciones.gridy = 3;
		ventana.add(btnCuatro, restricciones);

		restricciones.gridx = 1;
		restricciones.gridy = 3;
		ventana.add(btnCinco, restricciones);

		restricciones.gridx = 2;
		restricciones.gridy = 3;
		ventana.add(btnSeis, restricciones);

		restricciones.gridx = 0;
		restricciones.gridy = 4;
		ventana.add(btnUno, restricciones);

		restricciones.gridx = 1;
		restricciones.gridy = 4;
		ventana.add(btnDos, restricciones);

		restricciones.gridx = 2;
		restricciones.gridy = 4;
		ventana.add(btnTres, restricciones);

		restricciones.gridx = 3;
		restricciones.gridy = 4;
		restricciones.gridheight = 2;
		ventana.add(btnIgual, restricciones);
		restricciones.gridheight = 1;

		restricciones.gridx = 0;
		restricciones.gridy = 5;
		restricciones.gridwidth = 2;
		ventana.add(btnCero, restricciones);
		restricciones.gridwidth = 1;

		restricciones.gridx = 2;
		restricciones.gridy = 5;
		ventana.add(btnPunto, restricciones);

		//ventana.setResizable(false);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
		}

	public static void main(String[] args)
	{
		 new Ejercicio11();
	}
}
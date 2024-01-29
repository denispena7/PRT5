package es.studium.ejercicios;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

// Se implementan las interfaces 
public class Ejercicio2 implements WindowListener, ActionListener
{
	Frame ventana = new Frame();
	Label lblCantidad = new Label("Introduzca la cantidad");
	TextField txt1 = new TextField(20);
	Label lblPorcentaje = new Label("Introduzca el porcentaje");
	TextField txt2 = new TextField(20);
	Button btnCalcular = new Button("Calcular");
	Label lblResultado = new Label("Resultado");
	TextField txt3 = new TextField(20);
	
	public Ejercicio2 ()
	{
		/*
		 *  Añadir las interfaces
		 *  Para el boton de la 'x' usamos la ventana y la interfaz WindowListener
		 *  Para el boton interno implementamos la interfaz ActionListener
		 *  Entre paréntesis 'this'
		 */
		ventana.addWindowListener(this);
		btnCalcular.addActionListener(this);
		ventana.setTitle("Calcular el IVA");
		
		ventana.add(lblCantidad);
		ventana.add(txt1);
		ventana.add(lblPorcentaje);
		ventana.add(txt2);
		ventana.add(btnCalcular);
		ventana.add(lblResultado);
		ventana.add(txt3);
		
		ventana.setLayout(new FlowLayout());
		
		txt3.setEnabled(false);
		
		ventana.setSize(1000, 80);
		ventana.setBackground(Color.white);
		ventana.setResizable(false);
		ventana.setLocationRelativeTo(null);
		
		ventana.setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		new Ejercicio2();
	}

	// actionPerformed es para dar funcionalidad al botón de la aplicacion
	public void actionPerformed(ActionEvent e)
	{
		/*
		 *  El campo textfield solo acepta cadenas de texto, por lo tanto 'parseamos'.
		 *  Esto se hace para que el textfield acepte valores del tipo deseado.
		 */
		float cantidad = Float.parseFloat(txt1.getText());
		float porcentaje = Float.parseFloat(txt2.getText());
		float resultado = cantidad * porcentaje / 100.0f;
		txt3.setText(resultado + "");
	}

	@Override
	public void windowOpened(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	// En WindowClosing cerramos la ventana, con System.exit(0);
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
		
	}

	@Override
	public void windowClosed(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}
	
	/*
	 *  txtNombre.setEchoChar('*');
	 *  textApellidos.setEnabled(false);
	 */
}
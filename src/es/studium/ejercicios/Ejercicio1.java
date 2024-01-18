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

public class Ejercicio1 implements WindowListener, ActionListener
{
	Frame ventana = new Frame();
	TextField txt = new TextField(20);
	Button btnCalcular = new Button("Calcular");
	Label lbl = new Label("              ");
	
	public Ejercicio1 ()
	{
		ventana.addWindowListener(this);
		btnCalcular.addActionListener(this);
		ventana.setTitle("Par / Impar");
		
		ventana.add(txt);
		ventana.add(btnCalcular);
		ventana.add(lbl);
		
		// Distribucion
		ventana.setLayout(new FlowLayout());
		
		ventana.setSize(500, 80);
		ventana.setBackground(Color.white);
		ventana.setResizable(false);	
		ventana.setLocationRelativeTo(null);		// Cuando la ventana se ejecuta saldrá en el centro
		ventana.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new Ejercicio1();
	}

	@Override
	public void windowOpened(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
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

	@Override
	public void actionPerformed(ActionEvent e)
	{
		// Coger número escrito
		int numero = Integer.parseInt(txt.getText());
		
		// Comprobar si es par o impar
		String mensaje = "";
		if(numero % 2 == 0)
		{
			mensaje = "Es PAR";
		}
		else
		{
			mensaje = "Es IMPAR";
		}
		
		// Mostra el resultado
		lbl.setText(mensaje);
	}
}
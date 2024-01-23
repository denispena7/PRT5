package es.studium.ejercicios;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ejercicio3 implements WindowListener, ActionListener
{
	// Instanciar la ventana y sus componentes
    
	Frame ventana = new Frame("Conversión de temperaturas");
	Label lblC = new Label("Celcius");
	TextField txtC = new TextField(40);
	Label lblF = new Label("Fahrenheit");
	TextField txtF = new TextField(20);
	Button btnCF = new Button("Celcius a Fahrenheit");
	Button btnFC = new Button("Fahrenheit a Celcius");
	
	// Constructor
	public Ejercicio3()
	{
		ventana.addWindowListener(this);
		btnCF.addActionListener(this);
		btnFC.addActionListener(this);
		
		ventana.add(lblC);
		ventana.add(txtC);
		ventana.add(lblF);
		ventana.add(txtF);
		ventana.add(btnCF);
		ventana.add(btnFC);
		
		// Distribucion
		ventana.setLayout(new GridLayout(3, 2));
		
		ventana.setSize(380, 150);
		ventana.setBackground(Color.white);
		ventana.setResizable(false);			// Usuario NO modifica ventana
		ventana.setLocationRelativeTo(null);
		
		ventana.setVisible(true);
	}
	
	// En el main solo se crea el objeto
	public static void main(String[] args) 
	{
		new Ejercicio3();
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
	public void actionPerformed(ActionEvent evento)
	{
		if(evento.getSource().equals(btnCF))
		{
			float celsius = Float.parseFloat(txtC.getText());
			float resultado = (celsius * 9.0f / 5.0f) + 32.0f;
			txtF.setText(resultado + "");
		//	txtF.setText("");
		}
		else if(evento.getSource().equals(btnFC))
		{
			float fahrenheit = Float.parseFloat(txtF.getText());
			float resultado = (fahrenheit - 32.0f) * 5.0f / 9.0f;
			txtC.setText(resultado + "");
		//	txtC.setText("");
		}
	}
}
package es.studium.ejercicios;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ejercicio4 implements WindowListener, ActionListener
{
	Frame ventana = new Frame("Aficiones");
	Checkbox chk1 = new Checkbox("Correr");
	Checkbox chk2 = new Checkbox("Nadar");
	Checkbox chk3 = new Checkbox("Andar");
	Checkbox chk4 = new Checkbox("Leer");
	Checkbox chk5 = new Checkbox("Ir al cine");
	Checkbox chk6 = new Checkbox("Bailar");
	Checkbox chk7 = new Checkbox("Fútbol");
	Checkbox chk8 = new Checkbox("Tenis");
	Checkbox chk9 = new Checkbox("Baloncesto");
	Checkbox chk10 = new Checkbox("Deportes de vela");
	Button btn = new Button("Comprobar");
	TextArea txaResultado = new TextArea(10, 50);
	
	public Ejercicio4()
	{
		ventana.addWindowListener(this);
		btn.addActionListener(this);
		
		ventana.add(chk1);
		ventana.add(chk2);
		ventana.add(chk3);
		ventana.add(chk4);
		ventana.add(chk5);
		ventana.add(chk6);
		ventana.add(chk7);
		ventana.add(chk8);
		ventana.add(chk9);
		ventana.add(chk10);
		ventana.add(btn);
		ventana.add(txaResultado);
		
		ventana.setLayout(new FlowLayout());
		
		ventana.setSize(400, 300);
		ventana.setResizable(false);
		ventana.setBackground(Color.green);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		new Ejercicio4();
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
		if(chk1.getState())
		{
			txaResultado.append("Correr\n");
		}
		if(chk2.getState())
		{
			txaResultado.append("Nadar\n");
		}
		if(chk3.getState())
		{
			txaResultado.append("Andar\n");
		}
		if(chk4.getState())
		{
			txaResultado.append("Leer\n");
		}
		if(chk5.getState())
		{
			txaResultado.append("Ir al cine\n");
		}
		if(chk6.getState())
		{
			txaResultado.append("Bailar\n");
		}
		if(chk7.getState())
		{
			txaResultado.append("Fútbol\n");
		}
		if(chk8.getState())
		{
			txaResultado.append("Tenis\n");
		}
		if(chk9.getState())
		{
			txaResultado.append("Baloncesto\n");
		}
		if(chk10.getState())
		{
			txaResultado.append("Deportes de vela\n");
		}
	}
}
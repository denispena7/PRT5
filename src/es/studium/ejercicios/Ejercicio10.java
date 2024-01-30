package es.studium.ejercicios;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ejercicio10 implements WindowListener, ActionListener
{
	Frame ventana = new Frame("Tres en raya");
	Button btn1 = new Button(""); 
	Button btn2 = new Button(""); 
	Button btn3 = new Button(""); 
	Button btn4 = new Button(""); 
	Button btn5 = new Button(""); 
	Button btn6 = new Button(""); 
	Button btn7 = new Button(""); 
	Button btn8 = new Button("");
	Button btn9 = new Button(""); 
	
	Dialog digMensaje = new Dialog(ventana, "Fin", true);
	Label lblMensaje = new Label("                ");
	
	int turno = 0; // 0 --> O , 1 --> X
	int contador;
	boolean fin = false;
	
	public Ejercicio10()
	{
		ventana.setLayout(new GridLayout(3,3));
		ventana.addWindowListener(this);
		
		digMensaje.setLayout(new FlowLayout());
		digMensaje.addWindowListener(this);
		
		btn1.addActionListener(this);
		ventana.add(btn1);
		
		btn2.addActionListener(this);
		ventana.add(btn2);
		
		btn3.addActionListener(this);
		ventana.add(btn3);
		
		btn4.addActionListener(this);
		ventana.add(btn4);
		
		btn5.addActionListener(this);
		ventana.add(btn5);
		
		btn6.addActionListener(this);
		ventana.add(btn6);
		
		btn7.addActionListener(this);
		ventana.add(btn7);
		
		btn8.addActionListener(this);
		ventana.add(btn8);
		
		btn9.addActionListener(this);
		ventana.add(btn9);
		
		digMensaje.add(lblMensaje);
		
		digMensaje.setSize(200, 200);
		digMensaje.setLocationRelativeTo(null);
		
		ventana.setSize(400, 400);
		ventana.setLocationRelativeTo(null);
		ventana.setResizable(false);
		ventana.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new Ejercicio10();
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
		if(evento.getSource().equals(btn1))
		{
			if(turno == 0)
			{
				btn1.setLabel("O");
				turno = 1;
			}
			else
			{
				btn1.setLabel("X");
				turno = 0;
			}
			btn1.removeActionListener(this);
		}
		else if(evento.getSource().equals(btn2))
		{
			if(turno == 0)
			{
				btn2.setLabel("O");
				turno = 1;
			}
			else
			{
				btn2.setLabel("X");
				turno = 0;
			}
			btn2.removeActionListener(this);
		}
		else if(evento.getSource().equals(btn3))
		{
			if(turno == 0)
			{
				btn3.setLabel("O");
				turno = 1;
			}
			else
			{
				btn3.setLabel("X");
				turno = 0;
			}
			btn3.removeActionListener(this);
		}
		else if(evento.getSource().equals(btn4))
		{
			if(turno == 0)
			{
				btn4.setLabel("O");
				turno = 1;
			}
			else
			{
				btn4.setLabel("X");
				turno = 0;
			}
			btn4.removeActionListener(this);
		}
		else if(evento.getSource().equals(btn5))
		{
			if(turno == 0)
			{
				btn5.setLabel("O");
				turno = 1;
			}
			else
			{
				btn5.setLabel("X");
				turno = 0;
			}
			btn5.removeActionListener(this);
		}
		else if(evento.getSource().equals(btn6))
		{
			if(turno == 0)
			{
				btn6.setLabel("O");
				turno = 1;
			}
			else
			{
				btn6.setLabel("X");
				turno = 0;
			}
			btn6.removeActionListener(this);
		}
		else if(evento.getSource().equals(btn7))
		{
			if(turno == 0)
			{
				btn7.setLabel("O");
				turno = 1;
			}
			else
			{
				btn7.setLabel("X");
				turno = 0;
			}
			btn7.removeActionListener(this);
		}
		else if(evento.getSource().equals(btn8))
		{
			if(turno == 0)
			{
				btn8.setLabel("O");
				turno = 1;
			}
			else
			{
				btn8.setLabel("X");
				turno = 0;
			}
			btn8.removeActionListener(this);
		}
		else if(evento.getSource().equals(btn9))
		{
			if(turno == 0)
			{
				btn9.setLabel("O");
				turno = 1;
			}
			else
			{
				btn9.setLabel("X");
				turno = 0;
			}
			btn9.removeActionListener(this);
		}
		
		contador ++;
		comprobar();
		if(contador == 9)
		{
			lblMensaje.setText("Empate");
			digMensaje.add(lblMensaje);
			System.out.println("Empate");
		}
	}

	private void comprobar()
	{
		if((btn1.getLabel() == btn2.getLabel()) && (btn2.getLabel() == btn3.getLabel())
			&& (btn3.getLabel() == btn1.getLabel()))
		{
			lblMensaje.setText("Gana "+ btn1.getLabel());
			fin = true;
		}
		else if()
		{
			
		}
		
		if(fin == true)
		{
			digMensaje.add(lblMensaje);
			digMensaje.setVisible(true);
		}
	}
}
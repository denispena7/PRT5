package es.studium.ejercicios;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ejercicio5 implements WindowListener, ActionListener
{
	Frame ventana = new Frame("Vehiculo");
	
	Panel pnlDatos = new Panel();
	Panel pnlBoton = new Panel();
	
	Label lblM = new Label("Tipo de motorización:");
	CheckboxGroup chgMotor = new CheckboxGroup();
	Checkbox chkDiesel = new Checkbox("Diesel", false, chgMotor);
	Checkbox chkGasolina = new Checkbox("Gasolina", false, chgMotor);
	Checkbox chkHibrido = new Checkbox("Hibrido", false, chgMotor);
	Checkbox chkElectrico = new Checkbox("Electrico", false, chgMotor);
	
	Label lblP = new Label("Número de puertas:");
	CheckboxGroup chgPuertas = new CheckboxGroup();
	Checkbox chk3 = new Checkbox("3 puertas", false, chgPuertas);
	Checkbox chk4 = new Checkbox("4 puertas", false, chgPuertas);
	Checkbox chk5 = new Checkbox("5 puertas", false, chgPuertas);
	
	Label lblPM = new Label("Pintura Metalizada:");
	CheckboxGroup chgSiNo = new CheckboxGroup();
	Checkbox chks = new Checkbox("Si", false, chgSiNo);
	Checkbox chkn = new Checkbox("No", false, chgSiNo);
	
	Button btn = new Button("Calcular presupuesto");
	TextField txt = new TextField(20);
	
	public Ejercicio5()
	{
		ventana.addWindowListener(this);
		btn.addActionListener(this);
		ventana.setLayout(new BorderLayout());
		
		pnlDatos.add(lblM);
		pnlDatos.add(chkDiesel);
		pnlDatos.add(chkGasolina);
		pnlDatos.add(chkHibrido);
		pnlDatos.add(chkElectrico);
		
		pnlDatos.add(lblP);
		pnlDatos.add(chk3);
		pnlDatos.add(chk4);
		pnlDatos.add(chk5);
		pnlDatos.add(lblPM);
		pnlDatos.add(chks);
		pnlDatos.add(chkn);
		
		ventana.add("Center", pnlDatos);
		
		pnlBoton.add(btn);
		pnlBoton.add(txt);
		ventana.add("South", pnlBoton);
		
		ventana.setSize(450, 160);
		ventana.setLocationRelativeTo(null);
		ventana.setResizable(false);
		ventana.setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		new Ejercicio5();
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		int presupuesto = 0;
		if(chks.getState())
		{
			presupuesto = presupuesto + 1500;
		}
		else
		{
			presupuesto = presupuesto + 0;
		}
		txt.setText(presupuesto + "");
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
}
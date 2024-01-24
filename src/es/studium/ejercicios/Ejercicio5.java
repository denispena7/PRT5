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
		int diesel = 8000;
		int gasolina = 7000;
		int hibrido = 9000;
		int electrico = 8500;
		int tresp = 2000;
		int cuatrop = 3000;
		int cincop = 2500;

		// Diesel + 3 Puertas + PM,	  Diesel + 3 puertas + PNM
		if(chkDiesel.getState() && chk3.getState())
		{
			presupuesto = presupuesto + diesel + tresp;
		}
		txt.setText(presupuesto + " €");

		// Diesel + 4 Puertas + PM,	  Diesel + 4 puertas + PNM
		if(chkDiesel.getState() && chk4.getState())
		{
			presupuesto = presupuesto + diesel + cuatrop;
		}
		txt.setText(presupuesto + " €");

		// Diesel + 5 puertas + PM, 	Diesel + 5 puertas + PNM
		if(chkDiesel.getState() && chk5.getState())
		{
			presupuesto = presupuesto + diesel + cincop;
		}
		txt.setText(presupuesto + " €");

		// Gasolina + 3 puertas + PM,	Gasolina + 3 puertas + PNM
		if(chkGasolina.getState() && chk3.getState())
		{
			presupuesto = presupuesto + gasolina + tresp;
		}
		txt.setText(presupuesto + " €");

		// Gasolina + 4 puertas + PM,	Gasolina + 4 puertas + PNM
		if(chkGasolina.getState() && chk4.getState())
		{
			presupuesto = presupuesto + gasolina + cuatrop;
		}
		txt.setText(presupuesto + " €");

		// Gasolina + 5 puertas + PM,	Gasolina + 5 puertas + PNM
		if(chkGasolina.getState() && chk5.getState())
		{
			presupuesto = presupuesto + gasolina + cincop;
		}
		txt.setText(presupuesto + " €");

		// Hibrido + 3 puertas + PM,	Hibrido + 3 puertas + PNM
		if(chkHibrido.getState() && chk3.getState())
		{
			presupuesto = presupuesto + hibrido + tresp;
		}
		txt.setText(presupuesto + " €");

		// Hibrido + 4 puertas + PM,	Hibrido + 4 puertas + PNM
		if(chkHibrido.getState() && chk4.getState())
		{
			presupuesto = presupuesto + hibrido + cuatrop;
		}
		txt.setText(presupuesto + " €");

		// Hibrido + 5 puertas + PM,	Hibrido + 5 puertas + PNM
		if(chkHibrido.getState() && chk5.getState())
		{
			presupuesto = presupuesto + hibrido + cincop;
		}
		txt.setText(presupuesto + " €");

		// Electrico + 3 puertas + PM,	Electrico + 3 puertas + PNM
		if(chkElectrico.getState() && chk3.getState())
		{
			presupuesto = presupuesto + electrico + tresp;
		}
		txt.setText(presupuesto + " €");

		// Electrico + 4 puertas + PM,	Electrico + 4 puertas + PNM
		if(chkElectrico.getState() && chk4.getState())
		{
			presupuesto = presupuesto + electrico + cuatrop;
		}
		txt.setText(presupuesto + " €");

		// Electrico + 5 puertas + PM,	Electrico + 5 puertas + PNM
		if(chkElectrico.getState() && chk5.getState())
		{
			presupuesto = presupuesto + electrico +cincop;
		}
		txt.setText(presupuesto + " €");

		if(chks.getState())
		{
			presupuesto = presupuesto + 1500;
		}
		else
		{
			presupuesto = presupuesto + 0;
		}
		txt.setText(presupuesto + " €");
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
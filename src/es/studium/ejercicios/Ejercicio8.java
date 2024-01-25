package es.studium.ejercicios;

import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ejercicio8 implements WindowListener, ActionListener
{
	Frame ventana = new Frame("Menú");
	MenuBar barraMenu = new MenuBar();
	
	Menu mnuArticulos = new Menu("Articulos");
	MenuItem mniArticuloNuevo = new MenuItem("Nuevo Articulo");
	MenuItem mniArticuloEliminar = new MenuItem("Eliminar Articulo");
	MenuItem mniArticuloConsultar = new MenuItem("Consultar Articulo");
	
	Menu mnuClientes = new Menu("Clientes");
	MenuItem mniNuevoCliente = new MenuItem("Nuevo Cliente");
	MenuItem mniEliminarCliente = new MenuItem("Eliminar Cliente");
	MenuItem mniConsultarCliente = new MenuItem("Consultar Cliente");
	
	Menu mnuFacturas = new Menu("Facturas");
	MenuItem mniNuevaFactura = new MenuItem("Nueva Factura");
	MenuItem mniConsultarFactura = new MenuItem("Consultar Factura");
	
	Dialog digMensaje = new Dialog(ventana, "Dialogo con mensaje", true);
	Label lblMensaje = new Label("                ");
	
	public Ejercicio8()
	{
		ventana.setLayout(new FlowLayout());
		digMensaje.setLayout(new FlowLayout());
		
		ventana.addWindowListener(this);
		digMensaje.addWindowListener(this);
		mniArticuloNuevo.addActionListener(this);
		
		ventana.setMenuBar(barraMenu);
		
		barraMenu.add(mnuArticulos);
		mnuArticulos.add(mniArticuloNuevo);
		mnuArticulos.add(mniArticuloEliminar);
		mnuArticulos.add(mniArticuloConsultar);
		
		barraMenu.add(mnuClientes);
		mnuClientes.add(mniNuevoCliente);
		mnuClientes.add(mniEliminarCliente);
		mnuClientes.add(mniConsultarCliente);
		
		barraMenu.add(mnuFacturas);
		mnuFacturas.add(mniNuevaFactura);
		mnuFacturas.add(mniConsultarFactura);
		
		digMensaje.add(lblMensaje);
		
		ventana.setSize(450, 160);
		ventana.setResizable(false);
		ventana.setLocationRelativeTo(null);
		
		
		digMensaje.setSize(190, 100);
		digMensaje.setResizable(false);
		digMensaje.setLocationRelativeTo(null);
		
		ventana.setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		new Ejercicio8();
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		// Averiguar qué opción se ha elegido
		// getSource()
		digMensaje.setVisible(true);
	}

	@Override
	public void windowOpened(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e)
	{
		if(digMensaje.isActive())
		{
			digMensaje.setVisible(false);
		}
		else
		{
			System.exit(0);
		}
		
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
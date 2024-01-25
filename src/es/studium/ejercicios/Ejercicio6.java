package es.studium.ejercicios;

import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ejercicio6 implements WindowListener, ItemListener
{
	Frame ventana = new Frame("Provincias españolas");
	Choice choProvincias = new Choice();
	TextField txtGentilicios = new TextField(30);
	String[ ] provincias = {"Seleccione una provincia","Álava","Albacete","Alicante","Almería","Asturias","Ávila","Badajoz","Barcelona","Burgos","Cáceres", "Cádiz","Cantabria","Castellón","Ciudad Real","Córdoba","La Coruña","Cuenca","Gerona","Granada","Guadalajara","Guipúzcoa","Huelva","Huesca","Islas Baleares","Jaén","León","Lérida","Lugo","Madrid","Málaga","Murcia","Navarra","Orense","Palencia","Las Palmas","Pontevedra","La Rioja","Salamanca","Segovia","Sevilla","Soria","Tarragona",
"Santa Cruz de Tenerife","Teruel","Toledo","Valencia","Valladolid","Vizcaya","Zamora","Zaragoza"};
	String[]  gentilicios={"No ha elegido ninguna opción","Alavés/Alavesa o Babazorro/rra", "Albaceteño/ña o Albacetense", "Alicantino/na","Almeriense, Urcitano/na","Asturiano/na, Astur","Abulense, Avilés/esa", "Pacense, Badajocense, Badajoceño/ña", "Barcelonés/esa, Barcinonense", "Burgalés/esa", "Cacereño/ña", "Gaditano/na", "Cántabro/a","Castellonense", "Ciudadrealeño/ña", "Cordobés/esa","Coruñés", "Conquense", "Gerundense, Gironés/esa", "Granadino/na","Guadalajarño/ña, Caracense, Arriacense", "Guipuzcoano/na", "Onubense", "Oscense", "Balear", "Jaenés/esa, Jaenero/ro, Jienense, Giennense","Leonés/esa","Leridano","Lucense", "Madrileño/ña", "Malagueño/ña", "Murciano/na", "Navarro/rra", "Orensano/na", "Palentino/na", "Palmense", "Pontevedrés/esa","Riojano/a", "Salamanquino/na", "Segoviano/na", "Sevillano/na, Hispalense", "Soriano/na","Tarracconense/a","Santacrucero/ra", "Turolense", "Toledano/na", "Valenciano/na","Pucelano/na", "Vizcaíno/na",
			"Zamorano/na", "Zaragozano/na"};
	
	public Ejercicio6()
	{
		ventana.setLayout(new FlowLayout());
		
		ventana.addWindowListener(this);
		choProvincias.addItemListener(this);

		for(int i = 0; i < provincias.length; i++)
		{
		     choProvincias.add(provincias[i]);
		}
		
		choProvincias.add("Seleccione una provincia");

		ventana.add(choProvincias);
		ventana.add(txtGentilicios);

		ventana.setSize(450, 160);
		ventana.setResizable(false);
		ventana.setLocationRelativeTo(null);

		ventana.setVisible(true);
	}

	public static void main(String[] args) 
	{
		new Ejercicio6();
	}

	@Override
	public void itemStateChanged(ItemEvent evento)
	{
		/*
		int posicion = 0;
		for(String provincia: provincias)
		{
			if(provincia.equals(evento.getItem()))
			{
				txtGentilicios.setText(gentilicios[posicion]);
			}
			posicion++;
		}
		*/
		txtGentilicios.setText(gentilicios[choProvincias.getSelectedIndex()]);
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
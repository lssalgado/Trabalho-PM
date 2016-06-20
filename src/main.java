import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Element;

import accessories.Baixador;
import accessories.FactoryXML;
import accessories.LeitorXML;
import accessories.XmlUtils;
import control.Controller;

public class main {

	public static void main(String[] args) {

		Controller controlador = new Controller(args[0], args[1], args[2]);
		controlador.start();
		
	}
}

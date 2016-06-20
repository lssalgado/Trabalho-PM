package accessories;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * Essa classe é responsável por carregar um arquivo XML para o programa e gerar
 * uma lista de Element de acordo com uma tag especificada
 * 
 * @author Lucas
 */
public class FactoryXML {

	/**
	 * Retorna uma lista de Element de acordo com uma tag passada
	 */
	public static List<Element> getElementoXml(String filePath, String tagName) {
		List<Element> elementos = new ArrayList<Element>();

		NodeList nodeList = startFactory(filePath).getElementsByTagName(tagName);

		for (int i = 0; i < nodeList.getLength(); i++) {

			Node node = nodeList.item(i);

			if (node.getNodeType() == Node.ELEMENT_NODE) {
				Element eElement = (Element) node;

				elementos.add(eElement);
			}
		}

		return elementos;
	}

	/**
	 * Retorna os dados do XML em forma de Document
	 */
	public static Document startFactory(String filePath) {

		try {
			File inputFile = new File(filePath);

			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(inputFile);

			doc.getDocumentElement().normalize();

			return doc;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
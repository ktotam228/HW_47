package core;

import javax.xml.parsers.*;
import org.w3c.dom.*;

public class DOM_Parserv {

	public static void main(String[] args) throws Throwable, Exception,
			ParserConfigurationException {

		String url = "http://alex.academy/ebay.xml";

		String node = "kadu-response";

		String element_01 = "orig-kw";
		String element_02 = "engine";
		String element_03 = "kadu-version";
		String element_04 = "response-time";
		String element_05 = "deals";
		String element_06 ="product-id";
		String element_07 ="description";
		String element_08 = "addon";
		String element_09 = "manufacturer-id";
		String attribute_01 = "count";
		String element_name = "name";
		String element_price = "price";
		String attribute_discount = "discount";
		
		
		
		

		// Get the DOM Builder Factory
		DocumentBuilderFactory f = DocumentBuilderFactory.newInstance();

		// Get the DOM Builder
		DocumentBuilder b = f.newDocumentBuilder();

		// Load and Parse the XML document contains the complete XML as a Tree.
		Document doc = b.parse(url);

		// Optional
		doc.getDocumentElement().normalize();

		// Parsing elements
		System.out.println("Parser: \t DOM");
		System.out.println("Key Word: \t " + ((Element) doc.getElementsByTagName(node).item(0)).getElementsByTagName(element_01).item(0).getChildNodes().item(0).getNodeValue());
		System.out.println("Engine: \t " + ((Element) doc.getElementsByTagName(node).item(0)).getElementsByTagName(element_02).item(0).getChildNodes().item(0).getNodeValue());
		System.out.println("Version: \t " + ((Element) doc.getElementsByTagName(node).item(0)).getElementsByTagName(element_03).item(0).getChildNodes().item(0).getNodeValue());
		System.out.println("Response time: \t " + ((Element) doc.getElementsByTagName(node).item(0)).getElementsByTagName(element_04).item(0).getChildNodes().item(0).getNodeValue());
		System.out.println("Price USD: \t " + ((Element) doc.getElementsByTagName(node).item(0)).getElementsByTagName(element_price).item(0).getChildNodes().item(0).getNodeValue());	
		System.out.println("Product name: \t " + ((Element) doc.getElementsByTagName(node).item(0)).getElementsByTagName(element_name).item(0).getChildNodes().item(0).getNodeValue());
		System.out.println("Product ID: \t " + ((Element) doc.getElementsByTagName(node).item(0)).getElementsByTagName(element_06).item(0).getChildNodes().item(0).getNodeValue());
		System.out.println("Description: \t " + ((Element) doc.getElementsByTagName(node).item(0)).getElementsByTagName(element_07).item(0).getChildNodes().item(0).getNodeValue());
		System.out.println("Manufacturer-id: " + ((Element) doc.getElementsByTagName(element_05).item(0)).getAttribute(element_09).trim());
		
		// Parsing attribute
		System.out.println("Number of deals: " + ((Element) doc.getElementsByTagName(element_05).item(0)).getAttribute(attribute_01).trim());
		System.out.println("Discount:  \t " + ((Element) doc.getElementsByTagName(element_08).item(0)).getAttribute(attribute_discount).trim());
		
	}
}
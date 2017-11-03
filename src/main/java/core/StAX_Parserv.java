package core;

import java.io.*;
import java.net.URL;
import javax.xml.stream.*;

public class StAX_Parserv {
	public static void main(String[] args) throws XMLStreamException, IOException {

		URL url = new URL("http://alex.academy/ebay.xml");
		System.out.println("Parser: \t StAX");

		final String element_01 = "orig-kw";
		final String element_02 = "engine";
		final String element_03 = "kadu-version";
		final String element_04 = "response-time";
		final String element_05 = "deals";
		final String element_price = "price";
		final String element_name = "name";
		final String element_discount = "discount";
		final String element_07 ="product-id";
		final String element_08 ="description";
		final String element_09 = "manufacturer-id";
		
		InputStream in = url.openStream();

		XMLInputFactory factory = XMLInputFactory.newInstance();
		XMLStreamReader reader = factory.createXMLStreamReader(in);
		int eventType = reader.getEventType();

		while (reader.hasNext()) {

		eventType = reader.next();

			if (eventType == XMLStreamReader.START_ELEMENT) {
			if (reader.getLocalName() == element_01) {System.out.println("Key Word: \t " + reader.getElementText());}
			if (reader.getLocalName() == element_02) {System.out.println("Engine: \t " + reader.getElementText());}
			if (reader.getLocalName() == element_03) {System.out.println("Version: \t " + reader.getElementText());}
			if (reader.getLocalName() == element_04) {System.out.println("Response time: \t " + reader.getElementText());}
			if (reader.getLocalName() == element_05) {System.out.println("Number of deals: " + reader.getAttributeValue(0));}
			if (reader.getLocalName() == element_08) {System.out.println("Description: \t  " + reader.getElementText());}
			if (reader.getLocalName() == element_price) {System.out.println("Price USD: \t  " + reader.getElementText());}
			if (reader.getLocalName() == element_name) {System.out.println("Name of product: " + reader.getElementText());}
			if (reader.getLocalName() == element_discount) {System.out.println("Discount USD: \t " + reader.getAttributeValue(0));}
			if (reader.getLocalName() == element_07) {System.out.println("Product ID: \t  " + reader.getElementText());}
			if (reader.getLocalName() == element_09) {System.out.println("Manufacturer-ID: \t  " + reader.getElementText());}
			
			}
		}
	}
}
package com.fcibdemo.qa.pages;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import com.fcibdemo.qa.base.TestBase;

import org.w3c.dom.Node;

public class xmlFileReader extends TestBase {

	public static Map<String, String> mapTitle = new HashMap<String, String>();;


	public void fileReader() throws ParserConfigurationException {
		try {
		File fXmlFile = new File("./src/main/java/com/fcibdemo/qa/config/TestCaseModule1.xml");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(fXmlFile);
        doc.getDocumentElement().normalize();
        NodeList nList = doc.getElementsByTagName("init-param");
        
        for (int temp = 0; temp < nList.getLength(); temp++) {
    		Node nNode = nList.item(temp);
    		System.out.println("\nCurrent Element :" + nNode.getNodeName());			
    		if (nNode.getNodeType() == Node.ELEMENT_NODE) {
    			Element eElement = (Element) nNode;
    			System.out.println("Key : " + eElement.getElementsByTagName("param-name").item(0).getTextContent());
    			System.out.println("Value : " + eElement.getElementsByTagName("param-value").item(0).getTextContent());
    			mapTitle.put(eElement.getElementsByTagName("param-name").item(0).getTextContent(), eElement.getElementsByTagName("param-value").item(0).getTextContent());
		}
        }
		}
		catch (Exception e) 
	      {
	         e.printStackTrace();
	      }
		}
	
	public void fileReader1() throws ParserConfigurationException {
		try {
		File fXmlFile = new File("./src/main/java/com/fcibdemo/qa/config/TestCaseModule2.xml");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(fXmlFile);
        doc.getDocumentElement().normalize();
        NodeList nList = doc.getElementsByTagName("init-param");
        
        for (int temp = 0; temp < nList.getLength(); temp++) {
    		Node nNode = nList.item(temp);
    		System.out.println("\nCurrent Element :" + nNode.getNodeName());			
    		if (nNode.getNodeType() == Node.ELEMENT_NODE) {
    			Element eElement = (Element) nNode;
    			System.out.println("Key : " + eElement.getElementsByTagName("param-name").item(0).getTextContent());
    			System.out.println("Value : " + eElement.getElementsByTagName("param-value").item(0).getTextContent());
    			mapTitle.put(eElement.getElementsByTagName("param-name").item(0).getTextContent(), eElement.getElementsByTagName("param-value").item(0).getTextContent());
		}
        }
		}
		catch (Exception e) 
	      {
	         e.printStackTrace();
	      }
		}
		}

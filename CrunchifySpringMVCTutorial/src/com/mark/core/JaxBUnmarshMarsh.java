package com.mark.core;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.mark.process.Snack;

public class JaxBUnmarshMarsh {
private final static String XML_FILE_NAME = "snack.xml";	
	//private XMLConverter converter;
	
	@SuppressWarnings("unused")
	private boolean done;

	private boolean doWork(){
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		XMLConverter converter = (XMLConverter) appContext.getBean("XMLConverter");				
		try{
			Snack snack = new Snack();
			snack.setName("Bananna");
			snack.setHealthy(true);
					
			System.out.println("Convert Object to XML!");
			//from object to XML file
			converter.convertFromObjectToXML(snack, XML_FILE_NAME);
			System.out.println("Done \n");
			
			System.out.println("Convert XML back to Object!");
			//from XML to object
			Snack snack2 = (Snack)converter.convertFromXMLToObject(XML_FILE_NAME);
			System.out.println(snack2);
			System.out.println("Done");
		}catch (IOException e){
			((ConfigurableApplicationContext)appContext).close();
			return false;
		}		
		((ConfigurableApplicationContext)appContext).close();
		return true;
			
	}

	public boolean isDone() {
		return doWork();
	}

	@SuppressWarnings("unused")
	private void setDone(boolean done) {
		this.done = done;
	}

	//public XMLConverter getConverter() {
	//	return converter;
	//}

	//@Autowired
	//public void setConverter(XMLConverter converter) {
	//	this.converter = converter;
	//}
	
}

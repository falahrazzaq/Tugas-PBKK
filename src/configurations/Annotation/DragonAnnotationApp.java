package configurations.Annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import classes.dragon.Brezzas;
import classes.dragon.Dragon;

public class DragonAnnotationApp {

	public static void main(String[] args) {
		//Create IOC container
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("dragonConfig.xml");
		
		//Get bean objects
		Dragon dBrezzas = context.getBean("Brezzas", Dragon.class);
		Brezzas brezzas = (Brezzas)dBrezzas;
		
		//Use the bean
		System.out.println(dBrezzas.getClass());
		System.out.println(brezzas.getElement().getTypeElement());
		System.out.println(brezzas.getAtk());
		
		//Close context/IOC container
		context.close();
		
	}

}

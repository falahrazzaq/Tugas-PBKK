package configurations.XML;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import classes.element.TypeElement;
import classes.dragon.Rudronth;
import classes.dragon.Brezzas;
import classes.dragon.Dragon;


public class DragonXMLApp {

	public static void main(String[] args) {
		
		// Create IOC container
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("dragonstatConfig.xml"); 
		
		// Get bean object
		Dragon dRudronth = context.getBean("dragon", Dragon.class);			
		Rudronth rudronth = (Rudronth)rudronth;
		
		Dragon dBrezzas = context.getBean("dragon2", Dragon.class);
		Brezzas brezzas = (Brezzas)brezzas;
		
		Dragon dBrezzas2 = context.getBean("dragon2", Pokemon.class);
		Brezzas brezzas2 = (Brezzas)brezzas2;

		TypeElement electric = context.getBean("Element", TypeElement.class);
		
		// Use the bean object
		System.out.println("Dragon 1: " + rudronth.pickName() + "\nElement: " + rudronth.getElement().getTypeElement());
		System.out.println("Dragon 2: " + brezzas.pickName() + "\nElement: " + brezzas.getElement().getTypeElement());
		System.out.println("Dragon 3: " + brezzas2.pickName() + "\nElement: " + brezzas2.getElement().getTypeElement());
		brezzas2.setElement(electric);

		// Close IOC container
		context.close();
	}

}

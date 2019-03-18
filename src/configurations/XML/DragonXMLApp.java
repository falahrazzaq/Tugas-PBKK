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
		Dragon dRudronth = context.getBean("myPoke_1", Dragon.class);			
		Rudronth rudronth = (Rudronth)poke_1;
		
		Dragon dBrezzas = context.getBean("myPoke_2", Dragon.class);
		Brezzas brezzas = (Brezzas)poke_2;
		
		Dragon dBrezzas2 = context.getBean("myPoke_2", Pokemon.class);
		Brezzas brezzas2 = (Brezzas)poke_3;

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

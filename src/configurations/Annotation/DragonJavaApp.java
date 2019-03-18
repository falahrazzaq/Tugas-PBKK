package configurations.Java;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import classes.dragon.Rudronth;
import classes.dragon.Dragon;

public class DragonJavaApp {

	public static void main(String[] args) {
		
		// Create IOC container
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(DragonJavaConfig.class);
		
		// Get bean object
		Dragon dRudronth= context.getBean("Rudronth", Dragon.class);
		Rudronth rudronth = (Rudronth)dRudronth;
		
		// Use bean object
		System.out.println("Dragon 1: " + rudronth.pickName() + "\nElement: " + rudronth.getElement().getTypeElement());
		System.out.println("Hp: " + rudronth.getHp() + "\nAtk: " + rudronth.getAtk() + "\nDef: " + rudronth.getDef());
		
		// Close IOC container
		context.close();

	}

}

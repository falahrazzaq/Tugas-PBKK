package configurations.Java;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import classes.dragon.Dragon;
import classes.dragon.Rudronth;
import classes.element.TypeElement;
import classes.element.fire;

@Configuration
@PropertySource("classpath:dragon.properties")
public class DragonJavaConfig {

	@Bean
	public TypeElement fire() {
		return new fire();
	}
	
	@Bean
	public Pokemon Rudronth(TypeElement element, 
						   @Value("${dragon.atk}")int atk, 
						   @Value("${dragon.def}")int def,
						   @Value("${dragon.hp}")int hp){
		
		Rudronth rudronth1 = new Rudronth(Electric(), atk, def,  hp);
		
		return rudronth1;
	}

}

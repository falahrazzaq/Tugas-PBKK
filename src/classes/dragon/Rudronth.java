package classes.dragon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import classes.element.TypeElement;

@Component
public class Rudronth implements Dragon {
	
	private TypeElement element;	
	private int atk;
	private int def;
	private int hp;
	
	public Rudronth() {
		super();
	}
	
	@Autowired
	public Rudronth(@Qualifier("fire")TypeElement element, 
					 @Value("${dragon.atk}")int atk, 
					 @Value("${dragon.def}")int def, 
					 @Value("${dragon.hp}")int hp) {
		super();
		this.element = element;
		this.atk = atk;
		this.def = def;
		this.hp = hp;
	}

	public TypeElement getElement() {
		return element;
	}

	public void setElement(TypeElement element) {
		this.element = element;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	@Override
	public String PickName() {
		return "Rudronth";
	}

}

package classes.elemental;

import org.springframework.stereotype.Component;

@Component
public class Fire implements TypeElement {

	@Override
	public String getTypeElement() {
		return "Fire";
	}

}

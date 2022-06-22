
package com.consulting;
import org.springframework.stereotype.Component;

@Component
public class TechGuide implements Manual {

	@Override
	public String lookup() {
		return "Just a sec... Googling it.";
	}

}

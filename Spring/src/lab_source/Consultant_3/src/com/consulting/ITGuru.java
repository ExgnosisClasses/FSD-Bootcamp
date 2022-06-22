
package com.consulting;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ITGuru implements Consultant {

	@Override
	public String getAdvice() {
		return "Turn it off and on again";
	}
}

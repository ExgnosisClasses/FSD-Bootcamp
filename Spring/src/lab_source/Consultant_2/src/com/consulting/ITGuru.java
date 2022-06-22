
package com.consulting;

import org.springframework.stereotype.Component;

@Component
public class ITGuru implements Consultant {

	@Override
	public String getAdvice() {
		return "Turn it off and on again";
	}
}

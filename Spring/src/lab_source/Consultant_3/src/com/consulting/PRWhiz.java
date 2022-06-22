
package com.consulting;

import org.springframework.stereotype.Component;

@Component("SpinDoctor")
public class PRWhiz implements Consultant {

	@Override
	public String getAdvice() {
		return "Don't let them see you sweat";
	}
}

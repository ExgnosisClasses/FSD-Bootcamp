
package com.consulting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ITGuru implements Consultant {
	
	private Manual myManual;
	
	@Autowired
	public ITGuru(Manual m ) {
		this.myManual = m;
	}

	@Override
	public String getAdvice() {
		return this.myManual.lookup();
	}
}

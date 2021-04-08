package com.wipro.Springanno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Samsung {

	@Autowired
	MobilePro cpu;
	
	public MobilePro getCpu() {
		return cpu;
	}
	public void setCpu(MobilePro cpu) {
		this.cpu = cpu;
	}
	public void config()
	{
		System.out.println("Octa");
		cpu.process();
	}
}

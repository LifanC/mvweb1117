package model;

import org.springframework.context.annotation.*;

@Configuration
public class ContextTemperature {
	@Bean(name="temperatureBean")
	public Centigrade createCentigradeBean() {
		return new Centigrade();
		
	}
}

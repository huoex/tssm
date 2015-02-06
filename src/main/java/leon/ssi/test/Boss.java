package leon.ssi.test;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class Boss {
	
	/** 
	Car car;
	Office office;

	
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public Office getOffice() {
		return office;
	}
	public void setOffice(Office office) {
		this.office = office;
	}
	**/
	
	/** 
	 **/
	@Autowired
	Car car;
	@Autowired
	Office office;
	
	/** 
	@Resource
	Car car;
	@Resource
	Office office;
	**/
}

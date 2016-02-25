package poc.pocserialization.dto;

import java.io.Serializable;

public class ServiceDTO  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6843193630922735430L;

	public String toString() {
		System.out.println("Father class DTO");
		return "Father class DTO";
	}

}

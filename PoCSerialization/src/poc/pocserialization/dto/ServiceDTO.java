package poc.pocserialization.dto;

import java.io.Serializable;

public class ServiceDTO  implements Serializable{

	public String toString() {
		System.out.println("Father class DTO");
		return "Father class DTO";
	}

}

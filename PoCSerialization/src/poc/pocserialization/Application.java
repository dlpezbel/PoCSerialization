/**
 * 
 */
package poc.pocserialization;

import java.io.IOException;
import java.util.UUID;

import poc.pocserialization.dto.DetailedServiceDTO;
import poc.pocserialization.dto.ServiceDTO;

/**
 * @author dlopezbe
 *
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		UUID trxId = UUID.randomUUID();

		ServiceDTO detailedDTO_Out = new DetailedServiceDTO();
		try {
			SerializationUtil.serializeFS(detailedDTO_Out, trxId.toString());
			
			ServiceDTO detailedDTO_In = (DetailedServiceDTO)SerializationUtil.deserializeFS(trxId.toString());
			
			detailedDTO_In.toString();

		
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		

	}

}

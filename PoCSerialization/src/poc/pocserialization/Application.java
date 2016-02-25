/**
 * 
 */
package poc.pocserialization;

import java.io.IOException;

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
		String trxId = new String("12312-324234-234235-45435");
		
		ServiceDTO detailedDTO_Out = new DetailedServiceDTO();
		try {
			SerializationUtil.serializeFS(detailedDTO_Out, trxId);
			
			ServiceDTO detailedDTO_In = (DetailedServiceDTO)SerializationUtil.deserializeFS(trxId);
			
			detailedDTO_In.toString();

		
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		

	}

}

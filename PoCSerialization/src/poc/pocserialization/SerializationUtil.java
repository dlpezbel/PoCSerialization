package poc.pocserialization;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import poc.pocserialization.dto.ServiceDTO;

public class SerializationUtil {
	
	private static String FILE_SER_EXTENSION = "ser";
	private static String DOT = ".";
	

    public static ServiceDTO deserializeFS(String trxID) throws IOException,
            ClassNotFoundException {
        FileInputStream fis = new FileInputStream("C:\\tmp\\" + File.separator + trxID + DOT + FILE_SER_EXTENSION);
        BufferedInputStream bis = new BufferedInputStream(fis);
        ObjectInputStream ois = new ObjectInputStream(bis);
        ServiceDTO obj = (ServiceDTO) ois.readObject();
        ois.close();
        return obj;
    }
 

    public static void serializeFS(ServiceDTO obj, String trxID)
            throws IOException {
        FileOutputStream fos = new FileOutputStream("C:\\tmp\\" + trxID + ".ser");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(obj);
        oos.close();
    }

}

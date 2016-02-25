package poc.pocserialization;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import poc.pocserialization.dto.ServiceDTO;

public class SerializationUtil {
	

    public static ServiceDTO deserializeFS(String trxID) throws IOException,
            ClassNotFoundException {
        FileInputStream fis = new FileInputStream("C:\\tmp\\" + trxID + ".ser");
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

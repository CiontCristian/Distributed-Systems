
import java.rmi.RemoteException;
import org.apache.axis2.AxisFault;

import com.services.axis2server.TextFileContentRetrieverStub;
import com.services.axis2server.TextFileContentRetrieverStub.RetrieveTextFileContent;
import com.services.axis2server.TextFileContentRetrieverStub.RetrieveTextFileContentResponse;
import com.services.axis2server.TextFileContentRetrieverStub.Test;
import com.services.axis2server.TextFileContentRetrieverStub.TestResponse;


public class TextFileContentRetrieverClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			TextFileContentRetrieverStub stub = new TextFileContentRetrieverStub();
			Test test = new Test();
			TestResponse res1 = stub.test(test);
			System.out.println(res1.get_return());
			
			RetrieveTextFileContent retrieveFile = new RetrieveTextFileContent();
			String fileName = "C:\\Master\\SD\\Distributed-Systems\\textfile.txt";
			retrieveFile.setPath(fileName);
			RetrieveTextFileContentResponse res2 = stub.retrieveTextFileContent(retrieveFile);
			System.out.println(res2.get_return());
		}catch(AxisFault e) {
			e.printStackTrace();
		}catch(RemoteException e) {
			e.printStackTrace();
		}

	}

}

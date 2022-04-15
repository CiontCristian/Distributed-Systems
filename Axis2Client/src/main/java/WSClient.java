

import java.io.IOException;
import java.rmi.RemoteException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.axis2.AxisFault;

import com.services.axis2server.TextFileContentRetrieverStub;
import com.services.axis2server.TextFileContentRetrieverStub.RetrieveTextFileContent;
import com.services.axis2server.TextFileContentRetrieverStub.RetrieveTextFileContentResponse;
import com.services.axis2server.TextFileContentRetrieverStub.Test;
import com.services.axis2server.TextFileContentRetrieverStub.TestResponse;

/**
 * Servlet implementation class WSClient
 */
public class WSClient extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WSClient() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fcontent = "";
		try {
			TextFileContentRetrieverStub stub = new TextFileContentRetrieverStub();
			
			RetrieveTextFileContent retrieveFile = new RetrieveTextFileContent();
			retrieveFile.setPath(request.getParameter("fname"));
			RetrieveTextFileContentResponse res2 = stub.retrieveTextFileContent(retrieveFile);
			fcontent = res2.get_return();
			request.setAttribute("fname", request.getParameter("fname"));
		}catch(AxisFault e) {
			e.printStackTrace();
		}catch(RemoteException e) {
			e.printStackTrace();
		}
		
		getServletContext().getRequestDispatcher("/axis2client/wsclient.jsp?fcontent=" + fcontent).forward(request, response);
	}

}

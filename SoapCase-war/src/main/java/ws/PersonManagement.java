package ws;

import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService(name = "PersonManagementService")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL)
public interface PersonManagement {

    public PersonOut findPersonByCIN(@WebParam(name = "CIN") String CIN) throws PersonException;
}
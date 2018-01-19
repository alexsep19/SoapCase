package ws;

import javax.jws.WebService;
import javax.xml.ws.BindingType;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@WebService(endpointInterface = "com.aam.jaxws.server.PersonManagement", serviceName = "PersonManagementService", targetNamespace = "http://com.aam.jaxws.server/")
@BindingType(value = "http://java.sun.com/xml/ns/jaxws/2003/05/soap/bindings/HTTP/")
public class PersonManagementService implements PersonManagement {

    private static Map<String, PersonOut> persons = new HashMap<String, PersonOut>() {
        {put("p1", new PersonOut("p1", "aam", "aam", new Date()));}
        {put("p2", new PersonOut("p2", "bob", "bob", new Date()));}
    };

    @Override
    public PersonOut findPersonByCIN(String CIN) throws PersonException {
        return persons.get(CIN);
    };
}

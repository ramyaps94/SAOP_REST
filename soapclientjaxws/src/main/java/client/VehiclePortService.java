
package client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "VehiclePortService", targetNamespace = "http://parkinglot.com/vehicles", wsdlLocation = "http://localhost:8084/ws/vehicles.wsdl")
public class VehiclePortService
    extends Service
{

    private final static URL VEHICLEPORTSERVICE_WSDL_LOCATION;
    private final static WebServiceException VEHICLEPORTSERVICE_EXCEPTION;
    private final static QName VEHICLEPORTSERVICE_QNAME = new QName("http://parkinglot.com/vehicles", "VehiclePortService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8084/ws/vehicles.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        VEHICLEPORTSERVICE_WSDL_LOCATION = url;
        VEHICLEPORTSERVICE_EXCEPTION = e;
    }

    public VehiclePortService() {
        super(__getWsdlLocation(), VEHICLEPORTSERVICE_QNAME);
    }

    public VehiclePortService(WebServiceFeature... features) {
        super(__getWsdlLocation(), VEHICLEPORTSERVICE_QNAME, features);
    }

    public VehiclePortService(URL wsdlLocation) {
        super(wsdlLocation, VEHICLEPORTSERVICE_QNAME);
    }

    public VehiclePortService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, VEHICLEPORTSERVICE_QNAME, features);
    }

    public VehiclePortService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public VehiclePortService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns VehiclePort
     */
    @WebEndpoint(name = "VehiclePortSoap11")
    public VehiclePort getVehiclePortSoap11() {
        return super.getPort(new QName("http://parkinglot.com/vehicles", "VehiclePortSoap11"), VehiclePort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns VehiclePort
     */
    @WebEndpoint(name = "VehiclePortSoap11")
    public VehiclePort getVehiclePortSoap11(WebServiceFeature... features) {
        return super.getPort(new QName("http://parkinglot.com/vehicles", "VehiclePortSoap11"), VehiclePort.class, features);
    }

    private static URL __getWsdlLocation() {
        if (VEHICLEPORTSERVICE_EXCEPTION!= null) {
            throw VEHICLEPORTSERVICE_EXCEPTION;
        }
        return VEHICLEPORTSERVICE_WSDL_LOCATION;
    }

}

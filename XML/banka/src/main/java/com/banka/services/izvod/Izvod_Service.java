package com.banka.services.izvod;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.11
 * 2017-06-24T15:56:56.876+02:00
 * Generated source version: 3.1.11
 * 
 */
@WebServiceClient(name = "izvod", 
                  wsdlLocation = "classpath:wsdl/izvod.wsdl",
                  targetNamespace = "http://codenotfound.com/services/izvod") 
public class Izvod_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://codenotfound.com/services/izvod", "izvod");
    public final static QName IzvodSOAP = new QName("http://codenotfound.com/services/izvod", "izvodSOAP");
    static {
        URL url = Izvod_Service.class.getClassLoader().getResource("wsdl/izvod.wsdl");
        if (url == null) {
            java.util.logging.Logger.getLogger(Izvod_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "classpath:wsdl/izvod.wsdl");
        }       
        WSDL_LOCATION = url;   
    }

    public Izvod_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public Izvod_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Izvod_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public Izvod_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public Izvod_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public Izvod_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns Izvod
     */
    @WebEndpoint(name = "izvodSOAP")
    public Izvod getIzvodSOAP() {
        return super.getPort(IzvodSOAP, Izvod.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Izvod
     */
    @WebEndpoint(name = "izvodSOAP")
    public Izvod getIzvodSOAP(WebServiceFeature... features) {
        return super.getPort(IzvodSOAP, Izvod.class, features);
    }

}
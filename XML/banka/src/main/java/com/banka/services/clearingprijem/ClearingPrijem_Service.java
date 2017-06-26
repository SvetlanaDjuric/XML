package com.banka.services.clearingprijem;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by Apache CXF 3.1.11
 * 2017-06-26T16:13:29.505+02:00
 * Generated source version: 3.1.11
 * 
 */
@WebServiceClient(name = "clearingPrijem", 
                  wsdlLocation = "classpath:wsdl/clearingPrijem.wsdl",
                  targetNamespace = "http://codenotfound.com/services/clearingPrijem") 
public class ClearingPrijem_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://codenotfound.com/services/clearingPrijem", "clearingPrijem");
    public final static QName ClearingSOAP = new QName("http://codenotfound.com/services/clearingPrijem", "clearingSOAP");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/Sasa/git/XML/XML/banka/src/main/resources/wsdl/clearingPrijem.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ClearingPrijem_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/Sasa/git/XML/XML/banka/src/main/resources/wsdl/clearingPrijem.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ClearingPrijem_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ClearingPrijem_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ClearingPrijem_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public ClearingPrijem_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public ClearingPrijem_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public ClearingPrijem_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns ClearingPrijem
     */
    @WebEndpoint(name = "clearingSOAP")
    public ClearingPrijem getClearingSOAP() {
        return super.getPort(ClearingSOAP, ClearingPrijem.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ClearingPrijem
     */
    @WebEndpoint(name = "clearingSOAP")
    public ClearingPrijem getClearingSOAP(WebServiceFeature... features) {
        return super.getPort(ClearingSOAP, ClearingPrijem.class, features);
    }

}

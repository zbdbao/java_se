
package com.meme.webservice;

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
@WebServiceClient(name = "HelloWorldWService", targetNamespace = "http://webservice.meme.com/", wsdlLocation = "http://localhost:8080/jaxws-spring?wsdl")
public class HelloWorldWService
    extends Service
{

    private final static URL HELLOWORLDWSERVICE_WSDL_LOCATION;
    private final static WebServiceException HELLOWORLDWSERVICE_EXCEPTION;
    private final static QName HELLOWORLDWSERVICE_QNAME = new QName("http://webservice.meme.com/", "HelloWorldWService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/jaxws-spring?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        HELLOWORLDWSERVICE_WSDL_LOCATION = url;
        HELLOWORLDWSERVICE_EXCEPTION = e;
    }

    public HelloWorldWService() {
        super(__getWsdlLocation(), HELLOWORLDWSERVICE_QNAME);
    }

    public HelloWorldWService(WebServiceFeature... features) {
        super(__getWsdlLocation(), HELLOWORLDWSERVICE_QNAME, features);
    }

    public HelloWorldWService(URL wsdlLocation) {
        super(wsdlLocation, HELLOWORLDWSERVICE_QNAME);
    }

    public HelloWorldWService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, HELLOWORLDWSERVICE_QNAME, features);
    }

    public HelloWorldWService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HelloWorldWService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns HelloWorldWS
     */
    @WebEndpoint(name = "HelloWorldWSPort")
    public HelloWorldWS getHelloWorldWSPort() {
        return super.getPort(new QName("http://webservice.meme.com/", "HelloWorldWSPort"), HelloWorldWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HelloWorldWS
     */
    @WebEndpoint(name = "HelloWorldWSPort")
    public HelloWorldWS getHelloWorldWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservice.meme.com/", "HelloWorldWSPort"), HelloWorldWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (HELLOWORLDWSERVICE_EXCEPTION!= null) {
            throw HELLOWORLDWSERVICE_EXCEPTION;
        }
        return HELLOWORLDWSERVICE_WSDL_LOCATION;
    }

}
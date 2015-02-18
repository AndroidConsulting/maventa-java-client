/**
 * MaventaServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.maventa.secure;

public class MaventaServiceLocator extends org.apache.axis.client.Service implements com.maventa.secure.MaventaService {

    public MaventaServiceLocator() {
    }


    public MaventaServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public MaventaServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for MaventaApiPort
    private java.lang.String MaventaApiPort_address = "https://secure.maventa.com/apis/denver/api";

    public java.lang.String getMaventaApiPortAddress() {
        return MaventaApiPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String MaventaApiPortWSDDServiceName = "MaventaApiPort";

    public java.lang.String getMaventaApiPortWSDDServiceName() {
        return MaventaApiPortWSDDServiceName;
    }

    public void setMaventaApiPortWSDDServiceName(java.lang.String name) {
        MaventaApiPortWSDDServiceName = name;
    }

    public com.maventa.secure.MaventaApiPort getMaventaApiPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(MaventaApiPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getMaventaApiPort(endpoint);
    }

    public com.maventa.secure.MaventaApiPort getMaventaApiPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.maventa.secure.MaventaApiBindingStub _stub = new com.maventa.secure.MaventaApiBindingStub(portAddress, this);
            _stub.setPortName(getMaventaApiPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setMaventaApiPortEndpointAddress(java.lang.String address) {
        MaventaApiPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.maventa.secure.MaventaApiPort.class.isAssignableFrom(serviceEndpointInterface)) {
                com.maventa.secure.MaventaApiBindingStub _stub = new com.maventa.secure.MaventaApiBindingStub(new java.net.URL(MaventaApiPort_address), this);
                _stub.setPortName(getMaventaApiPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("MaventaApiPort".equals(inputPortName)) {
            return getMaventaApiPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("https://secure.maventa.com/", "MaventaService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("https://secure.maventa.com/", "MaventaApiPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("MaventaApiPort".equals(portName)) {
            setMaventaApiPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}

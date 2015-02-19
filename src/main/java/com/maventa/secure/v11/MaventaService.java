/**
 * MaventaService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.maventa.secure.v11;

public interface MaventaService extends javax.xml.rpc.Service {
    public java.lang.String getMaventaApiPortAddress();

    public MaventaApiPort getMaventaApiPort() throws javax.xml.rpc.ServiceException;

    public MaventaApiPort getMaventaApiPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}

/**
 * RouteDisable.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.maventa.secure;

public class RouteDisable  implements java.io.Serializable {
    private boolean paper;

    private boolean email;

    private boolean relay;

    public RouteDisable() {
    }

    public RouteDisable(
           boolean paper,
           boolean email,
           boolean relay) {
           this.paper = paper;
           this.email = email;
           this.relay = relay;
    }


    /**
     * Gets the paper value for this RouteDisable.
     * 
     * @return paper
     */
    public boolean isPaper() {
        return paper;
    }


    /**
     * Sets the paper value for this RouteDisable.
     * 
     * @param paper
     */
    public void setPaper(boolean paper) {
        this.paper = paper;
    }


    /**
     * Gets the email value for this RouteDisable.
     * 
     * @return email
     */
    public boolean isEmail() {
        return email;
    }


    /**
     * Sets the email value for this RouteDisable.
     * 
     * @param email
     */
    public void setEmail(boolean email) {
        this.email = email;
    }


    /**
     * Gets the relay value for this RouteDisable.
     * 
     * @return relay
     */
    public boolean isRelay() {
        return relay;
    }


    /**
     * Sets the relay value for this RouteDisable.
     * 
     * @param relay
     */
    public void setRelay(boolean relay) {
        this.relay = relay;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RouteDisable)) return false;
        RouteDisable other = (RouteDisable) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.paper == other.isPaper() &&
            this.email == other.isEmail() &&
            this.relay == other.isRelay();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += (isPaper() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isEmail() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isRelay() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RouteDisable.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://secure.maventa.com/", "RouteDisable"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paper");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paper"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relay");
        elemField.setXmlName(new javax.xml.namespace.QName("", "relay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}

/**
 * RegistrationParamsOutD.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.maventa.secure.v11;

public class RegistrationParamsOutD  implements java.io.Serializable {
    private java.lang.String status;

    private java.lang.String company_uuid;

    private java.lang.String e_invoice_address;

    private java.lang.String user_api_key;

    public RegistrationParamsOutD() {
    }

    public RegistrationParamsOutD(
           java.lang.String status,
           java.lang.String company_uuid,
           java.lang.String e_invoice_address,
           java.lang.String user_api_key) {
           this.status = status;
           this.company_uuid = company_uuid;
           this.e_invoice_address = e_invoice_address;
           this.user_api_key = user_api_key;
    }


    /**
     * Gets the status value for this RegistrationParamsOutD.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this RegistrationParamsOutD.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the company_uuid value for this RegistrationParamsOutD.
     * 
     * @return company_uuid
     */
    public java.lang.String getCompany_uuid() {
        return company_uuid;
    }


    /**
     * Sets the company_uuid value for this RegistrationParamsOutD.
     * 
     * @param company_uuid
     */
    public void setCompany_uuid(java.lang.String company_uuid) {
        this.company_uuid = company_uuid;
    }


    /**
     * Gets the e_invoice_address value for this RegistrationParamsOutD.
     * 
     * @return e_invoice_address
     */
    public java.lang.String getE_invoice_address() {
        return e_invoice_address;
    }


    /**
     * Sets the e_invoice_address value for this RegistrationParamsOutD.
     * 
     * @param e_invoice_address
     */
    public void setE_invoice_address(java.lang.String e_invoice_address) {
        this.e_invoice_address = e_invoice_address;
    }


    /**
     * Gets the user_api_key value for this RegistrationParamsOutD.
     * 
     * @return user_api_key
     */
    public java.lang.String getUser_api_key() {
        return user_api_key;
    }


    /**
     * Sets the user_api_key value for this RegistrationParamsOutD.
     * 
     * @param user_api_key
     */
    public void setUser_api_key(java.lang.String user_api_key) {
        this.user_api_key = user_api_key;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RegistrationParamsOutD)) return false;
        RegistrationParamsOutD other = (RegistrationParamsOutD) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.company_uuid==null && other.getCompany_uuid()==null) || 
             (this.company_uuid!=null &&
              this.company_uuid.equals(other.getCompany_uuid()))) &&
            ((this.e_invoice_address==null && other.getE_invoice_address()==null) || 
             (this.e_invoice_address!=null &&
              this.e_invoice_address.equals(other.getE_invoice_address()))) &&
            ((this.user_api_key==null && other.getUser_api_key()==null) || 
             (this.user_api_key!=null &&
              this.user_api_key.equals(other.getUser_api_key())));
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
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getCompany_uuid() != null) {
            _hashCode += getCompany_uuid().hashCode();
        }
        if (getE_invoice_address() != null) {
            _hashCode += getE_invoice_address().hashCode();
        }
        if (getUser_api_key() != null) {
            _hashCode += getUser_api_key().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RegistrationParamsOutD.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://secure.maventa.com/", "RegistrationParamsOutD"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("company_uuid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "company_uuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("e_invoice_address");
        elemField.setXmlName(new javax.xml.namespace.QName("", "e_invoice_address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user_api_key");
        elemField.setXmlName(new javax.xml.namespace.QName("", "user_api_key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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

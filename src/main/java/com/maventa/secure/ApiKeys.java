/**
 * ApiKeys.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.maventa.secure;

public class ApiKeys  implements java.io.Serializable {
    private java.lang.String company_uuid;

    private java.lang.String vendor_api_key;

    private java.lang.String user_api_key;

    public ApiKeys() {
    }

    public ApiKeys(
           java.lang.String company_uuid,
           java.lang.String vendor_api_key,
           java.lang.String user_api_key) {
           this.company_uuid = company_uuid;
           this.vendor_api_key = vendor_api_key;
           this.user_api_key = user_api_key;
    }


    /**
     * Gets the company_uuid value for this ApiKeys.
     * 
     * @return company_uuid
     */
    public java.lang.String getCompany_uuid() {
        return company_uuid;
    }


    /**
     * Sets the company_uuid value for this ApiKeys.
     * 
     * @param company_uuid
     */
    public void setCompany_uuid(java.lang.String company_uuid) {
        this.company_uuid = company_uuid;
    }


    /**
     * Gets the vendor_api_key value for this ApiKeys.
     * 
     * @return vendor_api_key
     */
    public java.lang.String getVendor_api_key() {
        return vendor_api_key;
    }


    /**
     * Sets the vendor_api_key value for this ApiKeys.
     * 
     * @param vendor_api_key
     */
    public void setVendor_api_key(java.lang.String vendor_api_key) {
        this.vendor_api_key = vendor_api_key;
    }


    /**
     * Gets the user_api_key value for this ApiKeys.
     * 
     * @return user_api_key
     */
    public java.lang.String getUser_api_key() {
        return user_api_key;
    }


    /**
     * Sets the user_api_key value for this ApiKeys.
     * 
     * @param user_api_key
     */
    public void setUser_api_key(java.lang.String user_api_key) {
        this.user_api_key = user_api_key;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ApiKeys)) return false;
        ApiKeys other = (ApiKeys) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.company_uuid==null && other.getCompany_uuid()==null) || 
             (this.company_uuid!=null &&
              this.company_uuid.equals(other.getCompany_uuid()))) &&
            ((this.vendor_api_key==null && other.getVendor_api_key()==null) || 
             (this.vendor_api_key!=null &&
              this.vendor_api_key.equals(other.getVendor_api_key()))) &&
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
        if (getCompany_uuid() != null) {
            _hashCode += getCompany_uuid().hashCode();
        }
        if (getVendor_api_key() != null) {
            _hashCode += getVendor_api_key().hashCode();
        }
        if (getUser_api_key() != null) {
            _hashCode += getUser_api_key().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ApiKeys.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://secure.maventa.com/", "ApiKeys"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("company_uuid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "company_uuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendor_api_key");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vendor_api_key"));
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

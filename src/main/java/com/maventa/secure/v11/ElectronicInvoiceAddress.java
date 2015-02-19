/**
 * ElectronicInvoiceAddress.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.maventa.secure.v11;

public class ElectronicInvoiceAddress  implements java.io.Serializable {
    private java.lang.String eia;

    private java.lang.String operator_code;

    public ElectronicInvoiceAddress() {
    }

    public ElectronicInvoiceAddress(
           java.lang.String eia,
           java.lang.String operator_code) {
           this.eia = eia;
           this.operator_code = operator_code;
    }


    /**
     * Gets the eia value for this ElectronicInvoiceAddress.
     * 
     * @return eia
     */
    public java.lang.String getEia() {
        return eia;
    }


    /**
     * Sets the eia value for this ElectronicInvoiceAddress.
     * 
     * @param eia
     */
    public void setEia(java.lang.String eia) {
        this.eia = eia;
    }


    /**
     * Gets the operator_code value for this ElectronicInvoiceAddress.
     * 
     * @return operator_code
     */
    public java.lang.String getOperator_code() {
        return operator_code;
    }


    /**
     * Sets the operator_code value for this ElectronicInvoiceAddress.
     * 
     * @param operator_code
     */
    public void setOperator_code(java.lang.String operator_code) {
        this.operator_code = operator_code;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ElectronicInvoiceAddress)) return false;
        ElectronicInvoiceAddress other = (ElectronicInvoiceAddress) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.eia==null && other.getEia()==null) || 
             (this.eia!=null &&
              this.eia.equals(other.getEia()))) &&
            ((this.operator_code==null && other.getOperator_code()==null) || 
             (this.operator_code!=null &&
              this.operator_code.equals(other.getOperator_code())));
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
        if (getEia() != null) {
            _hashCode += getEia().hashCode();
        }
        if (getOperator_code() != null) {
            _hashCode += getOperator_code().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ElectronicInvoiceAddress.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://secure.maventa.com/", "ElectronicInvoiceAddress"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operator_code");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operator_code"));
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

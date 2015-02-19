/**
 * OperatorStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.maventa.secure.v11;

public class OperatorStruct  implements java.io.Serializable {
    private java.lang.String recipient_id;

    private boolean enabled;

    private java.lang.String operator_id;

    private java.lang.String sender_id;

    public OperatorStruct() {
    }

    public OperatorStruct(
           java.lang.String recipient_id,
           boolean enabled,
           java.lang.String operator_id,
           java.lang.String sender_id) {
           this.recipient_id = recipient_id;
           this.enabled = enabled;
           this.operator_id = operator_id;
           this.sender_id = sender_id;
    }


    /**
     * Gets the recipient_id value for this OperatorStruct.
     * 
     * @return recipient_id
     */
    public java.lang.String getRecipient_id() {
        return recipient_id;
    }


    /**
     * Sets the recipient_id value for this OperatorStruct.
     * 
     * @param recipient_id
     */
    public void setRecipient_id(java.lang.String recipient_id) {
        this.recipient_id = recipient_id;
    }


    /**
     * Gets the enabled value for this OperatorStruct.
     * 
     * @return enabled
     */
    public boolean isEnabled() {
        return enabled;
    }


    /**
     * Sets the enabled value for this OperatorStruct.
     * 
     * @param enabled
     */
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }


    /**
     * Gets the operator_id value for this OperatorStruct.
     * 
     * @return operator_id
     */
    public java.lang.String getOperator_id() {
        return operator_id;
    }


    /**
     * Sets the operator_id value for this OperatorStruct.
     * 
     * @param operator_id
     */
    public void setOperator_id(java.lang.String operator_id) {
        this.operator_id = operator_id;
    }


    /**
     * Gets the sender_id value for this OperatorStruct.
     * 
     * @return sender_id
     */
    public java.lang.String getSender_id() {
        return sender_id;
    }


    /**
     * Sets the sender_id value for this OperatorStruct.
     * 
     * @param sender_id
     */
    public void setSender_id(java.lang.String sender_id) {
        this.sender_id = sender_id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OperatorStruct)) return false;
        OperatorStruct other = (OperatorStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.recipient_id==null && other.getRecipient_id()==null) || 
             (this.recipient_id!=null &&
              this.recipient_id.equals(other.getRecipient_id()))) &&
            this.enabled == other.isEnabled() &&
            ((this.operator_id==null && other.getOperator_id()==null) || 
             (this.operator_id!=null &&
              this.operator_id.equals(other.getOperator_id()))) &&
            ((this.sender_id==null && other.getSender_id()==null) || 
             (this.sender_id!=null &&
              this.sender_id.equals(other.getSender_id())));
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
        if (getRecipient_id() != null) {
            _hashCode += getRecipient_id().hashCode();
        }
        _hashCode += (isEnabled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getOperator_id() != null) {
            _hashCode += getOperator_id().hashCode();
        }
        if (getSender_id() != null) {
            _hashCode += getSender_id().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OperatorStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://secure.maventa.com/", "OperatorStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipient_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "recipient_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enabled");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operator_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operator_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sender_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sender_id"));
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

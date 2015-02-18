/**
 * InboundInvoiceListItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.maventa.secure;

public class InboundInvoiceListItem  implements java.io.Serializable {
    private java.lang.String invoice_id;

    private java.lang.String recipient_id;

    private java.lang.String timestamp;

    public InboundInvoiceListItem() {
    }

    public InboundInvoiceListItem(
           java.lang.String invoice_id,
           java.lang.String recipient_id,
           java.lang.String timestamp) {
           this.invoice_id = invoice_id;
           this.recipient_id = recipient_id;
           this.timestamp = timestamp;
    }


    /**
     * Gets the invoice_id value for this InboundInvoiceListItem.
     * 
     * @return invoice_id
     */
    public java.lang.String getInvoice_id() {
        return invoice_id;
    }


    /**
     * Sets the invoice_id value for this InboundInvoiceListItem.
     * 
     * @param invoice_id
     */
    public void setInvoice_id(java.lang.String invoice_id) {
        this.invoice_id = invoice_id;
    }


    /**
     * Gets the recipient_id value for this InboundInvoiceListItem.
     * 
     * @return recipient_id
     */
    public java.lang.String getRecipient_id() {
        return recipient_id;
    }


    /**
     * Sets the recipient_id value for this InboundInvoiceListItem.
     * 
     * @param recipient_id
     */
    public void setRecipient_id(java.lang.String recipient_id) {
        this.recipient_id = recipient_id;
    }


    /**
     * Gets the timestamp value for this InboundInvoiceListItem.
     * 
     * @return timestamp
     */
    public java.lang.String getTimestamp() {
        return timestamp;
    }


    /**
     * Sets the timestamp value for this InboundInvoiceListItem.
     * 
     * @param timestamp
     */
    public void setTimestamp(java.lang.String timestamp) {
        this.timestamp = timestamp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InboundInvoiceListItem)) return false;
        InboundInvoiceListItem other = (InboundInvoiceListItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.invoice_id==null && other.getInvoice_id()==null) || 
             (this.invoice_id!=null &&
              this.invoice_id.equals(other.getInvoice_id()))) &&
            ((this.recipient_id==null && other.getRecipient_id()==null) || 
             (this.recipient_id!=null &&
              this.recipient_id.equals(other.getRecipient_id()))) &&
            ((this.timestamp==null && other.getTimestamp()==null) || 
             (this.timestamp!=null &&
              this.timestamp.equals(other.getTimestamp())));
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
        if (getInvoice_id() != null) {
            _hashCode += getInvoice_id().hashCode();
        }
        if (getRecipient_id() != null) {
            _hashCode += getRecipient_id().hashCode();
        }
        if (getTimestamp() != null) {
            _hashCode += getTimestamp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InboundInvoiceListItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://secure.maventa.com/", "InboundInvoiceListItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoice_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invoice_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipient_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "recipient_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timestamp"));
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

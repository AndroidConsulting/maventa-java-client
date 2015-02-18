/**
 * CompanyActionOutput.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.maventa.secure;

public class CompanyActionOutput  implements java.io.Serializable {
    private java.lang.String status;

    private java.lang.String[] incoming_orders;

    private java.lang.String[] invoice_errors;

    private java.lang.String[] incoming_invoices;

    public CompanyActionOutput() {
    }

    public CompanyActionOutput(
           java.lang.String status,
           java.lang.String[] incoming_orders,
           java.lang.String[] invoice_errors,
           java.lang.String[] incoming_invoices) {
           this.status = status;
           this.incoming_orders = incoming_orders;
           this.invoice_errors = invoice_errors;
           this.incoming_invoices = incoming_invoices;
    }


    /**
     * Gets the status value for this CompanyActionOutput.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this CompanyActionOutput.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the incoming_orders value for this CompanyActionOutput.
     * 
     * @return incoming_orders
     */
    public java.lang.String[] getIncoming_orders() {
        return incoming_orders;
    }


    /**
     * Sets the incoming_orders value for this CompanyActionOutput.
     * 
     * @param incoming_orders
     */
    public void setIncoming_orders(java.lang.String[] incoming_orders) {
        this.incoming_orders = incoming_orders;
    }


    /**
     * Gets the invoice_errors value for this CompanyActionOutput.
     * 
     * @return invoice_errors
     */
    public java.lang.String[] getInvoice_errors() {
        return invoice_errors;
    }


    /**
     * Sets the invoice_errors value for this CompanyActionOutput.
     * 
     * @param invoice_errors
     */
    public void setInvoice_errors(java.lang.String[] invoice_errors) {
        this.invoice_errors = invoice_errors;
    }


    /**
     * Gets the incoming_invoices value for this CompanyActionOutput.
     * 
     * @return incoming_invoices
     */
    public java.lang.String[] getIncoming_invoices() {
        return incoming_invoices;
    }


    /**
     * Sets the incoming_invoices value for this CompanyActionOutput.
     * 
     * @param incoming_invoices
     */
    public void setIncoming_invoices(java.lang.String[] incoming_invoices) {
        this.incoming_invoices = incoming_invoices;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CompanyActionOutput)) return false;
        CompanyActionOutput other = (CompanyActionOutput) obj;
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
            ((this.incoming_orders==null && other.getIncoming_orders()==null) || 
             (this.incoming_orders!=null &&
              java.util.Arrays.equals(this.incoming_orders, other.getIncoming_orders()))) &&
            ((this.invoice_errors==null && other.getInvoice_errors()==null) || 
             (this.invoice_errors!=null &&
              java.util.Arrays.equals(this.invoice_errors, other.getInvoice_errors()))) &&
            ((this.incoming_invoices==null && other.getIncoming_invoices()==null) || 
             (this.incoming_invoices!=null &&
              java.util.Arrays.equals(this.incoming_invoices, other.getIncoming_invoices())));
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
        if (getIncoming_orders() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIncoming_orders());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIncoming_orders(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInvoice_errors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInvoice_errors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInvoice_errors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIncoming_invoices() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIncoming_invoices());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIncoming_invoices(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CompanyActionOutput.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://secure.maventa.com/", "CompanyActionOutput"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("incoming_orders");
        elemField.setXmlName(new javax.xml.namespace.QName("", "incoming_orders"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoice_errors");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invoice_errors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("incoming_invoices");
        elemField.setXmlName(new javax.xml.namespace.QName("", "incoming_invoices"));
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

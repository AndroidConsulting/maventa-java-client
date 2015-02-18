/**
 * InvoiceStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.maventa.secure;

public class InvoiceStatus  implements java.io.Serializable {
    private java.lang.String status;

    private java.lang.String invoice_id;

    private com.maventa.secure.FileStatus[] file_statuses;

    public InvoiceStatus() {
    }

    public InvoiceStatus(
           java.lang.String status,
           java.lang.String invoice_id,
           com.maventa.secure.FileStatus[] file_statuses) {
           this.status = status;
           this.invoice_id = invoice_id;
           this.file_statuses = file_statuses;
    }


    /**
     * Gets the status value for this InvoiceStatus.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this InvoiceStatus.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the invoice_id value for this InvoiceStatus.
     * 
     * @return invoice_id
     */
    public java.lang.String getInvoice_id() {
        return invoice_id;
    }


    /**
     * Sets the invoice_id value for this InvoiceStatus.
     * 
     * @param invoice_id
     */
    public void setInvoice_id(java.lang.String invoice_id) {
        this.invoice_id = invoice_id;
    }


    /**
     * Gets the file_statuses value for this InvoiceStatus.
     * 
     * @return file_statuses
     */
    public com.maventa.secure.FileStatus[] getFile_statuses() {
        return file_statuses;
    }


    /**
     * Sets the file_statuses value for this InvoiceStatus.
     * 
     * @param file_statuses
     */
    public void setFile_statuses(com.maventa.secure.FileStatus[] file_statuses) {
        this.file_statuses = file_statuses;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InvoiceStatus)) return false;
        InvoiceStatus other = (InvoiceStatus) obj;
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
            ((this.invoice_id==null && other.getInvoice_id()==null) || 
             (this.invoice_id!=null &&
              this.invoice_id.equals(other.getInvoice_id()))) &&
            ((this.file_statuses==null && other.getFile_statuses()==null) || 
             (this.file_statuses!=null &&
              java.util.Arrays.equals(this.file_statuses, other.getFile_statuses())));
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
        if (getInvoice_id() != null) {
            _hashCode += getInvoice_id().hashCode();
        }
        if (getFile_statuses() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFile_statuses());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFile_statuses(), i);
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
        new org.apache.axis.description.TypeDesc(InvoiceStatus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://secure.maventa.com/", "InvoiceStatus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoice_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invoice_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("file_statuses");
        elemField.setXmlName(new javax.xml.namespace.QName("", "file_statuses"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://secure.maventa.com/", "FileStatus"));
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

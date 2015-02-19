/**
 * FinvoiceTrx.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.maventa.secure.v11;

public class FinvoiceTrx  implements java.io.Serializable {
    private byte[][] files;

    private java.lang.String[] filenames;

    public FinvoiceTrx() {
    }

    public FinvoiceTrx(
           byte[][] files,
           java.lang.String[] filenames) {
           this.files = files;
           this.filenames = filenames;
    }


    /**
     * Gets the files value for this FinvoiceTrx.
     * 
     * @return files
     */
    public byte[][] getFiles() {
        return files;
    }


    /**
     * Sets the files value for this FinvoiceTrx.
     * 
     * @param files
     */
    public void setFiles(byte[][] files) {
        this.files = files;
    }


    /**
     * Gets the filenames value for this FinvoiceTrx.
     * 
     * @return filenames
     */
    public java.lang.String[] getFilenames() {
        return filenames;
    }


    /**
     * Sets the filenames value for this FinvoiceTrx.
     * 
     * @param filenames
     */
    public void setFilenames(java.lang.String[] filenames) {
        this.filenames = filenames;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FinvoiceTrx)) return false;
        FinvoiceTrx other = (FinvoiceTrx) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.files==null && other.getFiles()==null) || 
             (this.files!=null &&
              java.util.Arrays.equals(this.files, other.getFiles()))) &&
            ((this.filenames==null && other.getFilenames()==null) || 
             (this.filenames!=null &&
              java.util.Arrays.equals(this.filenames, other.getFilenames())));
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
        if (getFiles() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFiles());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFiles(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFilenames() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFilenames());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFilenames(), i);
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
        new org.apache.axis.description.TypeDesc(FinvoiceTrx.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://secure.maventa.com/", "FinvoiceTrx"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("files");
        elemField.setXmlName(new javax.xml.namespace.QName("", "files"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "base64"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filenames");
        elemField.setXmlName(new javax.xml.namespace.QName("", "filenames"));
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

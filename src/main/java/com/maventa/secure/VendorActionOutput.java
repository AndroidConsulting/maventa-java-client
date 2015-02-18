/**
 * VendorActionOutput.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.maventa.secure;

public class VendorActionOutput  implements java.io.Serializable {
    private java.lang.String status;

    private com.maventa.secure.VendorAction[] vendor_actions;

    public VendorActionOutput() {
    }

    public VendorActionOutput(
           java.lang.String status,
           com.maventa.secure.VendorAction[] vendor_actions) {
           this.status = status;
           this.vendor_actions = vendor_actions;
    }


    /**
     * Gets the status value for this VendorActionOutput.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this VendorActionOutput.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the vendor_actions value for this VendorActionOutput.
     * 
     * @return vendor_actions
     */
    public com.maventa.secure.VendorAction[] getVendor_actions() {
        return vendor_actions;
    }


    /**
     * Sets the vendor_actions value for this VendorActionOutput.
     * 
     * @param vendor_actions
     */
    public void setVendor_actions(com.maventa.secure.VendorAction[] vendor_actions) {
        this.vendor_actions = vendor_actions;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VendorActionOutput)) return false;
        VendorActionOutput other = (VendorActionOutput) obj;
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
            ((this.vendor_actions==null && other.getVendor_actions()==null) || 
             (this.vendor_actions!=null &&
              java.util.Arrays.equals(this.vendor_actions, other.getVendor_actions())));
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
        if (getVendor_actions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVendor_actions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVendor_actions(), i);
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
        new org.apache.axis.description.TypeDesc(VendorActionOutput.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://secure.maventa.com/", "VendorActionOutput"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendor_actions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vendor_actions"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://secure.maventa.com/", "VendorAction"));
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

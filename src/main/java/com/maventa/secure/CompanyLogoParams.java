/**
 * CompanyLogoParams.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.maventa.secure;

public class CompanyLogoParams  implements java.io.Serializable {
    private int logo_w;

    private int logo_h;

    private int logo_x;

    private int logo_y;

    private byte[] logo;

    public CompanyLogoParams() {
    }

    public CompanyLogoParams(
           int logo_w,
           int logo_h,
           int logo_x,
           int logo_y,
           byte[] logo) {
           this.logo_w = logo_w;
           this.logo_h = logo_h;
           this.logo_x = logo_x;
           this.logo_y = logo_y;
           this.logo = logo;
    }


    /**
     * Gets the logo_w value for this CompanyLogoParams.
     * 
     * @return logo_w
     */
    public int getLogo_w() {
        return logo_w;
    }


    /**
     * Sets the logo_w value for this CompanyLogoParams.
     * 
     * @param logo_w
     */
    public void setLogo_w(int logo_w) {
        this.logo_w = logo_w;
    }


    /**
     * Gets the logo_h value for this CompanyLogoParams.
     * 
     * @return logo_h
     */
    public int getLogo_h() {
        return logo_h;
    }


    /**
     * Sets the logo_h value for this CompanyLogoParams.
     * 
     * @param logo_h
     */
    public void setLogo_h(int logo_h) {
        this.logo_h = logo_h;
    }


    /**
     * Gets the logo_x value for this CompanyLogoParams.
     * 
     * @return logo_x
     */
    public int getLogo_x() {
        return logo_x;
    }


    /**
     * Sets the logo_x value for this CompanyLogoParams.
     * 
     * @param logo_x
     */
    public void setLogo_x(int logo_x) {
        this.logo_x = logo_x;
    }


    /**
     * Gets the logo_y value for this CompanyLogoParams.
     * 
     * @return logo_y
     */
    public int getLogo_y() {
        return logo_y;
    }


    /**
     * Sets the logo_y value for this CompanyLogoParams.
     * 
     * @param logo_y
     */
    public void setLogo_y(int logo_y) {
        this.logo_y = logo_y;
    }


    /**
     * Gets the logo value for this CompanyLogoParams.
     * 
     * @return logo
     */
    public byte[] getLogo() {
        return logo;
    }


    /**
     * Sets the logo value for this CompanyLogoParams.
     * 
     * @param logo
     */
    public void setLogo(byte[] logo) {
        this.logo = logo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CompanyLogoParams)) return false;
        CompanyLogoParams other = (CompanyLogoParams) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.logo_w == other.getLogo_w() &&
            this.logo_h == other.getLogo_h() &&
            this.logo_x == other.getLogo_x() &&
            this.logo_y == other.getLogo_y() &&
            ((this.logo==null && other.getLogo()==null) || 
             (this.logo!=null &&
              java.util.Arrays.equals(this.logo, other.getLogo())));
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
        _hashCode += getLogo_w();
        _hashCode += getLogo_h();
        _hashCode += getLogo_x();
        _hashCode += getLogo_y();
        if (getLogo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLogo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLogo(), i);
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
        new org.apache.axis.description.TypeDesc(CompanyLogoParams.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://secure.maventa.com/", "CompanyLogoParams"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logo_w");
        elemField.setXmlName(new javax.xml.namespace.QName("", "logo_w"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logo_h");
        elemField.setXmlName(new javax.xml.namespace.QName("", "logo_h"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logo_x");
        elemField.setXmlName(new javax.xml.namespace.QName("", "logo_x"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logo_y");
        elemField.setXmlName(new javax.xml.namespace.QName("", "logo_y"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "logo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "base64"));
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

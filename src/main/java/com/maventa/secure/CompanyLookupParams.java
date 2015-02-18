/**
 * CompanyLookupParams.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.maventa.secure;

public class CompanyLookupParams  implements java.io.Serializable {
    private boolean disable_vies;

    private java.lang.String search_string;

    private int limit;

    private java.lang.String country_code;

    public CompanyLookupParams() {
    }

    public CompanyLookupParams(
           boolean disable_vies,
           java.lang.String search_string,
           int limit,
           java.lang.String country_code) {
           this.disable_vies = disable_vies;
           this.search_string = search_string;
           this.limit = limit;
           this.country_code = country_code;
    }


    /**
     * Gets the disable_vies value for this CompanyLookupParams.
     * 
     * @return disable_vies
     */
    public boolean isDisable_vies() {
        return disable_vies;
    }


    /**
     * Sets the disable_vies value for this CompanyLookupParams.
     * 
     * @param disable_vies
     */
    public void setDisable_vies(boolean disable_vies) {
        this.disable_vies = disable_vies;
    }


    /**
     * Gets the search_string value for this CompanyLookupParams.
     * 
     * @return search_string
     */
    public java.lang.String getSearch_string() {
        return search_string;
    }


    /**
     * Sets the search_string value for this CompanyLookupParams.
     * 
     * @param search_string
     */
    public void setSearch_string(java.lang.String search_string) {
        this.search_string = search_string;
    }


    /**
     * Gets the limit value for this CompanyLookupParams.
     * 
     * @return limit
     */
    public int getLimit() {
        return limit;
    }


    /**
     * Sets the limit value for this CompanyLookupParams.
     * 
     * @param limit
     */
    public void setLimit(int limit) {
        this.limit = limit;
    }


    /**
     * Gets the country_code value for this CompanyLookupParams.
     * 
     * @return country_code
     */
    public java.lang.String getCountry_code() {
        return country_code;
    }


    /**
     * Sets the country_code value for this CompanyLookupParams.
     * 
     * @param country_code
     */
    public void setCountry_code(java.lang.String country_code) {
        this.country_code = country_code;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CompanyLookupParams)) return false;
        CompanyLookupParams other = (CompanyLookupParams) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.disable_vies == other.isDisable_vies() &&
            ((this.search_string==null && other.getSearch_string()==null) || 
             (this.search_string!=null &&
              this.search_string.equals(other.getSearch_string()))) &&
            this.limit == other.getLimit() &&
            ((this.country_code==null && other.getCountry_code()==null) || 
             (this.country_code!=null &&
              this.country_code.equals(other.getCountry_code())));
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
        _hashCode += (isDisable_vies() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getSearch_string() != null) {
            _hashCode += getSearch_string().hashCode();
        }
        _hashCode += getLimit();
        if (getCountry_code() != null) {
            _hashCode += getCountry_code().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CompanyLookupParams.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://secure.maventa.com/", "CompanyLookupParams"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disable_vies");
        elemField.setXmlName(new javax.xml.namespace.QName("", "disable_vies"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("search_string");
        elemField.setXmlName(new javax.xml.namespace.QName("", "search_string"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "limit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country_code");
        elemField.setXmlName(new javax.xml.namespace.QName("", "country_code"));
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

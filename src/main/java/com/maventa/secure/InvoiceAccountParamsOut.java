/**
 * InvoiceAccountParamsOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.maventa.secure;

public class InvoiceAccountParamsOut  implements java.io.Serializable {
    private java.lang.String status;

    private java.lang.String iban;

    private java.lang.String account;

    private java.lang.String bank;

    private java.lang.String swift;

    public InvoiceAccountParamsOut() {
    }

    public InvoiceAccountParamsOut(
           java.lang.String status,
           java.lang.String iban,
           java.lang.String account,
           java.lang.String bank,
           java.lang.String swift) {
           this.status = status;
           this.iban = iban;
           this.account = account;
           this.bank = bank;
           this.swift = swift;
    }


    /**
     * Gets the status value for this InvoiceAccountParamsOut.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this InvoiceAccountParamsOut.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the iban value for this InvoiceAccountParamsOut.
     * 
     * @return iban
     */
    public java.lang.String getIban() {
        return iban;
    }


    /**
     * Sets the iban value for this InvoiceAccountParamsOut.
     * 
     * @param iban
     */
    public void setIban(java.lang.String iban) {
        this.iban = iban;
    }


    /**
     * Gets the account value for this InvoiceAccountParamsOut.
     * 
     * @return account
     */
    public java.lang.String getAccount() {
        return account;
    }


    /**
     * Sets the account value for this InvoiceAccountParamsOut.
     * 
     * @param account
     */
    public void setAccount(java.lang.String account) {
        this.account = account;
    }


    /**
     * Gets the bank value for this InvoiceAccountParamsOut.
     * 
     * @return bank
     */
    public java.lang.String getBank() {
        return bank;
    }


    /**
     * Sets the bank value for this InvoiceAccountParamsOut.
     * 
     * @param bank
     */
    public void setBank(java.lang.String bank) {
        this.bank = bank;
    }


    /**
     * Gets the swift value for this InvoiceAccountParamsOut.
     * 
     * @return swift
     */
    public java.lang.String getSwift() {
        return swift;
    }


    /**
     * Sets the swift value for this InvoiceAccountParamsOut.
     * 
     * @param swift
     */
    public void setSwift(java.lang.String swift) {
        this.swift = swift;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InvoiceAccountParamsOut)) return false;
        InvoiceAccountParamsOut other = (InvoiceAccountParamsOut) obj;
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
            ((this.iban==null && other.getIban()==null) || 
             (this.iban!=null &&
              this.iban.equals(other.getIban()))) &&
            ((this.account==null && other.getAccount()==null) || 
             (this.account!=null &&
              this.account.equals(other.getAccount()))) &&
            ((this.bank==null && other.getBank()==null) || 
             (this.bank!=null &&
              this.bank.equals(other.getBank()))) &&
            ((this.swift==null && other.getSwift()==null) || 
             (this.swift!=null &&
              this.swift.equals(other.getSwift())));
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
        if (getIban() != null) {
            _hashCode += getIban().hashCode();
        }
        if (getAccount() != null) {
            _hashCode += getAccount().hashCode();
        }
        if (getBank() != null) {
            _hashCode += getBank().hashCode();
        }
        if (getSwift() != null) {
            _hashCode += getSwift().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InvoiceAccountParamsOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://secure.maventa.com/", "InvoiceAccountParamsOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iban");
        elemField.setXmlName(new javax.xml.namespace.QName("", "iban"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("", "account"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bank");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bank"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("swift");
        elemField.setXmlName(new javax.xml.namespace.QName("", "swift"));
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

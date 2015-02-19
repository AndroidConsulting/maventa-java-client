/**
 * TrxListItemD.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.maventa.secure.v11;

public class TrxListItemD  implements java.io.Serializable {
    private java.lang.String customer_bid;

    private int pages;

    private java.lang.String invoice_id;

    private java.lang.String customer_name;

    private java.lang.String action;

    private java.lang.String customer_company_uuid;

    private java.lang.String invoice_nr;

    private java.lang.String price_maventa;

    private java.lang.String id;

    private java.lang.String timestamp;

    public TrxListItemD() {
    }

    public TrxListItemD(
           java.lang.String customer_bid,
           int pages,
           java.lang.String invoice_id,
           java.lang.String customer_name,
           java.lang.String action,
           java.lang.String customer_company_uuid,
           java.lang.String invoice_nr,
           java.lang.String price_maventa,
           java.lang.String id,
           java.lang.String timestamp) {
           this.customer_bid = customer_bid;
           this.pages = pages;
           this.invoice_id = invoice_id;
           this.customer_name = customer_name;
           this.action = action;
           this.customer_company_uuid = customer_company_uuid;
           this.invoice_nr = invoice_nr;
           this.price_maventa = price_maventa;
           this.id = id;
           this.timestamp = timestamp;
    }


    /**
     * Gets the customer_bid value for this TrxListItemD.
     * 
     * @return customer_bid
     */
    public java.lang.String getCustomer_bid() {
        return customer_bid;
    }


    /**
     * Sets the customer_bid value for this TrxListItemD.
     * 
     * @param customer_bid
     */
    public void setCustomer_bid(java.lang.String customer_bid) {
        this.customer_bid = customer_bid;
    }


    /**
     * Gets the pages value for this TrxListItemD.
     * 
     * @return pages
     */
    public int getPages() {
        return pages;
    }


    /**
     * Sets the pages value for this TrxListItemD.
     * 
     * @param pages
     */
    public void setPages(int pages) {
        this.pages = pages;
    }


    /**
     * Gets the invoice_id value for this TrxListItemD.
     * 
     * @return invoice_id
     */
    public java.lang.String getInvoice_id() {
        return invoice_id;
    }


    /**
     * Sets the invoice_id value for this TrxListItemD.
     * 
     * @param invoice_id
     */
    public void setInvoice_id(java.lang.String invoice_id) {
        this.invoice_id = invoice_id;
    }


    /**
     * Gets the customer_name value for this TrxListItemD.
     * 
     * @return customer_name
     */
    public java.lang.String getCustomer_name() {
        return customer_name;
    }


    /**
     * Sets the customer_name value for this TrxListItemD.
     * 
     * @param customer_name
     */
    public void setCustomer_name(java.lang.String customer_name) {
        this.customer_name = customer_name;
    }


    /**
     * Gets the action value for this TrxListItemD.
     * 
     * @return action
     */
    public java.lang.String getAction() {
        return action;
    }


    /**
     * Sets the action value for this TrxListItemD.
     * 
     * @param action
     */
    public void setAction(java.lang.String action) {
        this.action = action;
    }


    /**
     * Gets the customer_company_uuid value for this TrxListItemD.
     * 
     * @return customer_company_uuid
     */
    public java.lang.String getCustomer_company_uuid() {
        return customer_company_uuid;
    }


    /**
     * Sets the customer_company_uuid value for this TrxListItemD.
     * 
     * @param customer_company_uuid
     */
    public void setCustomer_company_uuid(java.lang.String customer_company_uuid) {
        this.customer_company_uuid = customer_company_uuid;
    }


    /**
     * Gets the invoice_nr value for this TrxListItemD.
     * 
     * @return invoice_nr
     */
    public java.lang.String getInvoice_nr() {
        return invoice_nr;
    }


    /**
     * Sets the invoice_nr value for this TrxListItemD.
     * 
     * @param invoice_nr
     */
    public void setInvoice_nr(java.lang.String invoice_nr) {
        this.invoice_nr = invoice_nr;
    }


    /**
     * Gets the price_maventa value for this TrxListItemD.
     * 
     * @return price_maventa
     */
    public java.lang.String getPrice_maventa() {
        return price_maventa;
    }


    /**
     * Sets the price_maventa value for this TrxListItemD.
     * 
     * @param price_maventa
     */
    public void setPrice_maventa(java.lang.String price_maventa) {
        this.price_maventa = price_maventa;
    }


    /**
     * Gets the id value for this TrxListItemD.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this TrxListItemD.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the timestamp value for this TrxListItemD.
     * 
     * @return timestamp
     */
    public java.lang.String getTimestamp() {
        return timestamp;
    }


    /**
     * Sets the timestamp value for this TrxListItemD.
     * 
     * @param timestamp
     */
    public void setTimestamp(java.lang.String timestamp) {
        this.timestamp = timestamp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TrxListItemD)) return false;
        TrxListItemD other = (TrxListItemD) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customer_bid==null && other.getCustomer_bid()==null) || 
             (this.customer_bid!=null &&
              this.customer_bid.equals(other.getCustomer_bid()))) &&
            this.pages == other.getPages() &&
            ((this.invoice_id==null && other.getInvoice_id()==null) || 
             (this.invoice_id!=null &&
              this.invoice_id.equals(other.getInvoice_id()))) &&
            ((this.customer_name==null && other.getCustomer_name()==null) || 
             (this.customer_name!=null &&
              this.customer_name.equals(other.getCustomer_name()))) &&
            ((this.action==null && other.getAction()==null) || 
             (this.action!=null &&
              this.action.equals(other.getAction()))) &&
            ((this.customer_company_uuid==null && other.getCustomer_company_uuid()==null) || 
             (this.customer_company_uuid!=null &&
              this.customer_company_uuid.equals(other.getCustomer_company_uuid()))) &&
            ((this.invoice_nr==null && other.getInvoice_nr()==null) || 
             (this.invoice_nr!=null &&
              this.invoice_nr.equals(other.getInvoice_nr()))) &&
            ((this.price_maventa==null && other.getPrice_maventa()==null) || 
             (this.price_maventa!=null &&
              this.price_maventa.equals(other.getPrice_maventa()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
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
        if (getCustomer_bid() != null) {
            _hashCode += getCustomer_bid().hashCode();
        }
        _hashCode += getPages();
        if (getInvoice_id() != null) {
            _hashCode += getInvoice_id().hashCode();
        }
        if (getCustomer_name() != null) {
            _hashCode += getCustomer_name().hashCode();
        }
        if (getAction() != null) {
            _hashCode += getAction().hashCode();
        }
        if (getCustomer_company_uuid() != null) {
            _hashCode += getCustomer_company_uuid().hashCode();
        }
        if (getInvoice_nr() != null) {
            _hashCode += getInvoice_nr().hashCode();
        }
        if (getPrice_maventa() != null) {
            _hashCode += getPrice_maventa().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getTimestamp() != null) {
            _hashCode += getTimestamp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TrxListItemD.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://secure.maventa.com/", "TrxListItemD"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customer_bid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customer_bid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pages");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoice_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invoice_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customer_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customer_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("action");
        elemField.setXmlName(new javax.xml.namespace.QName("", "action"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customer_company_uuid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customer_company_uuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoice_nr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invoice_nr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("price_maventa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "price_maventa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
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

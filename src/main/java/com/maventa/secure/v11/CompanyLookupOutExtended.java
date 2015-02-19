/**
 * CompanyLookupOutExtended.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.maventa.secure.v11;

public class CompanyLookupOutExtended  implements java.io.Serializable {
    private java.lang.String status;

    private java.lang.String address2;

    private java.lang.String country;

    private java.lang.String post_code;

    private java.lang.String state;

    private java.lang.String bid;

    private boolean receive_invoices;

    private boolean receive_orders;

    private java.lang.String maventa_id;

    private java.lang.String name;

    private ElectronicInvoiceAddress[] edis;

    private java.lang.String address1;

    private java.lang.String post_office;

    public CompanyLookupOutExtended() {
    }

    public CompanyLookupOutExtended(
           java.lang.String status,
           java.lang.String address2,
           java.lang.String country,
           java.lang.String post_code,
           java.lang.String state,
           java.lang.String bid,
           boolean receive_invoices,
           boolean receive_orders,
           java.lang.String maventa_id,
           java.lang.String name,
           ElectronicInvoiceAddress[] edis,
           java.lang.String address1,
           java.lang.String post_office) {
           this.status = status;
           this.address2 = address2;
           this.country = country;
           this.post_code = post_code;
           this.state = state;
           this.bid = bid;
           this.receive_invoices = receive_invoices;
           this.receive_orders = receive_orders;
           this.maventa_id = maventa_id;
           this.name = name;
           this.edis = edis;
           this.address1 = address1;
           this.post_office = post_office;
    }


    /**
     * Gets the status value for this CompanyLookupOutExtended.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this CompanyLookupOutExtended.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the address2 value for this CompanyLookupOutExtended.
     * 
     * @return address2
     */
    public java.lang.String getAddress2() {
        return address2;
    }


    /**
     * Sets the address2 value for this CompanyLookupOutExtended.
     * 
     * @param address2
     */
    public void setAddress2(java.lang.String address2) {
        this.address2 = address2;
    }


    /**
     * Gets the country value for this CompanyLookupOutExtended.
     * 
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this CompanyLookupOutExtended.
     * 
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }


    /**
     * Gets the post_code value for this CompanyLookupOutExtended.
     * 
     * @return post_code
     */
    public java.lang.String getPost_code() {
        return post_code;
    }


    /**
     * Sets the post_code value for this CompanyLookupOutExtended.
     * 
     * @param post_code
     */
    public void setPost_code(java.lang.String post_code) {
        this.post_code = post_code;
    }


    /**
     * Gets the state value for this CompanyLookupOutExtended.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this CompanyLookupOutExtended.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the bid value for this CompanyLookupOutExtended.
     * 
     * @return bid
     */
    public java.lang.String getBid() {
        return bid;
    }


    /**
     * Sets the bid value for this CompanyLookupOutExtended.
     * 
     * @param bid
     */
    public void setBid(java.lang.String bid) {
        this.bid = bid;
    }


    /**
     * Gets the receive_invoices value for this CompanyLookupOutExtended.
     * 
     * @return receive_invoices
     */
    public boolean isReceive_invoices() {
        return receive_invoices;
    }


    /**
     * Sets the receive_invoices value for this CompanyLookupOutExtended.
     * 
     * @param receive_invoices
     */
    public void setReceive_invoices(boolean receive_invoices) {
        this.receive_invoices = receive_invoices;
    }


    /**
     * Gets the receive_orders value for this CompanyLookupOutExtended.
     * 
     * @return receive_orders
     */
    public boolean isReceive_orders() {
        return receive_orders;
    }


    /**
     * Sets the receive_orders value for this CompanyLookupOutExtended.
     * 
     * @param receive_orders
     */
    public void setReceive_orders(boolean receive_orders) {
        this.receive_orders = receive_orders;
    }


    /**
     * Gets the maventa_id value for this CompanyLookupOutExtended.
     * 
     * @return maventa_id
     */
    public java.lang.String getMaventa_id() {
        return maventa_id;
    }


    /**
     * Sets the maventa_id value for this CompanyLookupOutExtended.
     * 
     * @param maventa_id
     */
    public void setMaventa_id(java.lang.String maventa_id) {
        this.maventa_id = maventa_id;
    }


    /**
     * Gets the name value for this CompanyLookupOutExtended.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this CompanyLookupOutExtended.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the edis value for this CompanyLookupOutExtended.
     * 
     * @return edis
     */
    public ElectronicInvoiceAddress[] getEdis() {
        return edis;
    }


    /**
     * Sets the edis value for this CompanyLookupOutExtended.
     * 
     * @param edis
     */
    public void setEdis(ElectronicInvoiceAddress[] edis) {
        this.edis = edis;
    }


    /**
     * Gets the address1 value for this CompanyLookupOutExtended.
     * 
     * @return address1
     */
    public java.lang.String getAddress1() {
        return address1;
    }


    /**
     * Sets the address1 value for this CompanyLookupOutExtended.
     * 
     * @param address1
     */
    public void setAddress1(java.lang.String address1) {
        this.address1 = address1;
    }


    /**
     * Gets the post_office value for this CompanyLookupOutExtended.
     * 
     * @return post_office
     */
    public java.lang.String getPost_office() {
        return post_office;
    }


    /**
     * Sets the post_office value for this CompanyLookupOutExtended.
     * 
     * @param post_office
     */
    public void setPost_office(java.lang.String post_office) {
        this.post_office = post_office;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CompanyLookupOutExtended)) return false;
        CompanyLookupOutExtended other = (CompanyLookupOutExtended) obj;
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
            ((this.address2==null && other.getAddress2()==null) || 
             (this.address2!=null &&
              this.address2.equals(other.getAddress2()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.post_code==null && other.getPost_code()==null) || 
             (this.post_code!=null &&
              this.post_code.equals(other.getPost_code()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.bid==null && other.getBid()==null) || 
             (this.bid!=null &&
              this.bid.equals(other.getBid()))) &&
            this.receive_invoices == other.isReceive_invoices() &&
            this.receive_orders == other.isReceive_orders() &&
            ((this.maventa_id==null && other.getMaventa_id()==null) || 
             (this.maventa_id!=null &&
              this.maventa_id.equals(other.getMaventa_id()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.edis==null && other.getEdis()==null) || 
             (this.edis!=null &&
              java.util.Arrays.equals(this.edis, other.getEdis()))) &&
            ((this.address1==null && other.getAddress1()==null) || 
             (this.address1!=null &&
              this.address1.equals(other.getAddress1()))) &&
            ((this.post_office==null && other.getPost_office()==null) || 
             (this.post_office!=null &&
              this.post_office.equals(other.getPost_office())));
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
        if (getAddress2() != null) {
            _hashCode += getAddress2().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getPost_code() != null) {
            _hashCode += getPost_code().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getBid() != null) {
            _hashCode += getBid().hashCode();
        }
        _hashCode += (isReceive_invoices() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isReceive_orders() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getMaventa_id() != null) {
            _hashCode += getMaventa_id().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getEdis() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEdis());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEdis(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAddress1() != null) {
            _hashCode += getAddress1().hashCode();
        }
        if (getPost_office() != null) {
            _hashCode += getPost_office().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CompanyLookupOutExtended.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://secure.maventa.com/", "CompanyLookupOutExtended"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "address2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("", "country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("post_code");
        elemField.setXmlName(new javax.xml.namespace.QName("", "post_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receive_invoices");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receive_invoices"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receive_orders");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receive_orders"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maventa_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maventa_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("edis");
        elemField.setXmlName(new javax.xml.namespace.QName("", "edis"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://secure.maventa.com/", "ElectronicInvoiceAddress"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "address1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("post_office");
        elemField.setXmlName(new javax.xml.namespace.QName("", "post_office"));
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

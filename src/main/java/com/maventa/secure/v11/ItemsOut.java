/**
 * ItemsOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.maventa.secure.v11;

public class ItemsOut  implements java.io.Serializable {
    private java.lang.String status;

    private java.lang.String subject;

    private double amount;

    private double discount;

    private java.lang.String item_code;

    private double tax;

    private java.lang.String definition;

    private java.lang.String unit_type;

    private int position;

    private java.lang.String sum;

    private java.lang.String price;

    private java.lang.String sum_tax;

    public ItemsOut() {
    }

    public ItemsOut(
           java.lang.String status,
           java.lang.String subject,
           double amount,
           double discount,
           java.lang.String item_code,
           double tax,
           java.lang.String definition,
           java.lang.String unit_type,
           int position,
           java.lang.String sum,
           java.lang.String price,
           java.lang.String sum_tax) {
           this.status = status;
           this.subject = subject;
           this.amount = amount;
           this.discount = discount;
           this.item_code = item_code;
           this.tax = tax;
           this.definition = definition;
           this.unit_type = unit_type;
           this.position = position;
           this.sum = sum;
           this.price = price;
           this.sum_tax = sum_tax;
    }


    /**
     * Gets the status value for this ItemsOut.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ItemsOut.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the subject value for this ItemsOut.
     * 
     * @return subject
     */
    public java.lang.String getSubject() {
        return subject;
    }


    /**
     * Sets the subject value for this ItemsOut.
     * 
     * @param subject
     */
    public void setSubject(java.lang.String subject) {
        this.subject = subject;
    }


    /**
     * Gets the amount value for this ItemsOut.
     * 
     * @return amount
     */
    public double getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this ItemsOut.
     * 
     * @param amount
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }


    /**
     * Gets the discount value for this ItemsOut.
     * 
     * @return discount
     */
    public double getDiscount() {
        return discount;
    }


    /**
     * Sets the discount value for this ItemsOut.
     * 
     * @param discount
     */
    public void setDiscount(double discount) {
        this.discount = discount;
    }


    /**
     * Gets the item_code value for this ItemsOut.
     * 
     * @return item_code
     */
    public java.lang.String getItem_code() {
        return item_code;
    }


    /**
     * Sets the item_code value for this ItemsOut.
     * 
     * @param item_code
     */
    public void setItem_code(java.lang.String item_code) {
        this.item_code = item_code;
    }


    /**
     * Gets the tax value for this ItemsOut.
     * 
     * @return tax
     */
    public double getTax() {
        return tax;
    }


    /**
     * Sets the tax value for this ItemsOut.
     * 
     * @param tax
     */
    public void setTax(double tax) {
        this.tax = tax;
    }


    /**
     * Gets the definition value for this ItemsOut.
     * 
     * @return definition
     */
    public java.lang.String getDefinition() {
        return definition;
    }


    /**
     * Sets the definition value for this ItemsOut.
     * 
     * @param definition
     */
    public void setDefinition(java.lang.String definition) {
        this.definition = definition;
    }


    /**
     * Gets the unit_type value for this ItemsOut.
     * 
     * @return unit_type
     */
    public java.lang.String getUnit_type() {
        return unit_type;
    }


    /**
     * Sets the unit_type value for this ItemsOut.
     * 
     * @param unit_type
     */
    public void setUnit_type(java.lang.String unit_type) {
        this.unit_type = unit_type;
    }


    /**
     * Gets the position value for this ItemsOut.
     * 
     * @return position
     */
    public int getPosition() {
        return position;
    }


    /**
     * Sets the position value for this ItemsOut.
     * 
     * @param position
     */
    public void setPosition(int position) {
        this.position = position;
    }


    /**
     * Gets the sum value for this ItemsOut.
     * 
     * @return sum
     */
    public java.lang.String getSum() {
        return sum;
    }


    /**
     * Sets the sum value for this ItemsOut.
     * 
     * @param sum
     */
    public void setSum(java.lang.String sum) {
        this.sum = sum;
    }


    /**
     * Gets the price value for this ItemsOut.
     * 
     * @return price
     */
    public java.lang.String getPrice() {
        return price;
    }


    /**
     * Sets the price value for this ItemsOut.
     * 
     * @param price
     */
    public void setPrice(java.lang.String price) {
        this.price = price;
    }


    /**
     * Gets the sum_tax value for this ItemsOut.
     * 
     * @return sum_tax
     */
    public java.lang.String getSum_tax() {
        return sum_tax;
    }


    /**
     * Sets the sum_tax value for this ItemsOut.
     * 
     * @param sum_tax
     */
    public void setSum_tax(java.lang.String sum_tax) {
        this.sum_tax = sum_tax;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ItemsOut)) return false;
        ItemsOut other = (ItemsOut) obj;
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
            ((this.subject==null && other.getSubject()==null) || 
             (this.subject!=null &&
              this.subject.equals(other.getSubject()))) &&
            this.amount == other.getAmount() &&
            this.discount == other.getDiscount() &&
            ((this.item_code==null && other.getItem_code()==null) || 
             (this.item_code!=null &&
              this.item_code.equals(other.getItem_code()))) &&
            this.tax == other.getTax() &&
            ((this.definition==null && other.getDefinition()==null) || 
             (this.definition!=null &&
              this.definition.equals(other.getDefinition()))) &&
            ((this.unit_type==null && other.getUnit_type()==null) || 
             (this.unit_type!=null &&
              this.unit_type.equals(other.getUnit_type()))) &&
            this.position == other.getPosition() &&
            ((this.sum==null && other.getSum()==null) || 
             (this.sum!=null &&
              this.sum.equals(other.getSum()))) &&
            ((this.price==null && other.getPrice()==null) || 
             (this.price!=null &&
              this.price.equals(other.getPrice()))) &&
            ((this.sum_tax==null && other.getSum_tax()==null) || 
             (this.sum_tax!=null &&
              this.sum_tax.equals(other.getSum_tax())));
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
        if (getSubject() != null) {
            _hashCode += getSubject().hashCode();
        }
        _hashCode += new Double(getAmount()).hashCode();
        _hashCode += new Double(getDiscount()).hashCode();
        if (getItem_code() != null) {
            _hashCode += getItem_code().hashCode();
        }
        _hashCode += new Double(getTax()).hashCode();
        if (getDefinition() != null) {
            _hashCode += getDefinition().hashCode();
        }
        if (getUnit_type() != null) {
            _hashCode += getUnit_type().hashCode();
        }
        _hashCode += getPosition();
        if (getSum() != null) {
            _hashCode += getSum().hashCode();
        }
        if (getPrice() != null) {
            _hashCode += getPrice().hashCode();
        }
        if (getSum_tax() != null) {
            _hashCode += getSum_tax().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ItemsOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://secure.maventa.com/", "ItemsOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subject");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "discount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item_code");
        elemField.setXmlName(new javax.xml.namespace.QName("", "item_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("definition");
        elemField.setXmlName(new javax.xml.namespace.QName("", "definition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unit_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unit_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("position");
        elemField.setXmlName(new javax.xml.namespace.QName("", "position"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("price");
        elemField.setXmlName(new javax.xml.namespace.QName("", "price"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sum_tax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sum_tax"));
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

/**
 * RegistrationParamsInD.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.maventa.secure;

public class RegistrationParamsInD  implements java.io.Serializable {
    private java.lang.String address2;

    private java.lang.String country;

    private com.maventa.secure.BankAccountParamsIn[] bank_accounts;

    private java.lang.String user_last_name;

    private java.lang.String user_phone;

    private java.lang.String post_code;

    private java.lang.String company_bid;

    private java.lang.String vendor_api_key;

    private java.lang.String state;

    private boolean receive_invoices;

    private java.lang.String user_email;

    private boolean license_agreement;

    private java.lang.String company_email;

    private java.lang.String city;

    private boolean email_activation;

    private boolean no_vat;

    private java.lang.String company_name;

    private java.lang.String address1;

    private java.lang.String post_office;

    private java.lang.String user_first_name;

    public RegistrationParamsInD() {
    }

    public RegistrationParamsInD(
           java.lang.String address2,
           java.lang.String country,
           com.maventa.secure.BankAccountParamsIn[] bank_accounts,
           java.lang.String user_last_name,
           java.lang.String user_phone,
           java.lang.String post_code,
           java.lang.String company_bid,
           java.lang.String vendor_api_key,
           java.lang.String state,
           boolean receive_invoices,
           java.lang.String user_email,
           boolean license_agreement,
           java.lang.String company_email,
           java.lang.String city,
           boolean email_activation,
           boolean no_vat,
           java.lang.String company_name,
           java.lang.String address1,
           java.lang.String post_office,
           java.lang.String user_first_name) {
           this.address2 = address2;
           this.country = country;
           this.bank_accounts = bank_accounts;
           this.user_last_name = user_last_name;
           this.user_phone = user_phone;
           this.post_code = post_code;
           this.company_bid = company_bid;
           this.vendor_api_key = vendor_api_key;
           this.state = state;
           this.receive_invoices = receive_invoices;
           this.user_email = user_email;
           this.license_agreement = license_agreement;
           this.company_email = company_email;
           this.city = city;
           this.email_activation = email_activation;
           this.no_vat = no_vat;
           this.company_name = company_name;
           this.address1 = address1;
           this.post_office = post_office;
           this.user_first_name = user_first_name;
    }


    /**
     * Gets the address2 value for this RegistrationParamsInD.
     * 
     * @return address2
     */
    public java.lang.String getAddress2() {
        return address2;
    }


    /**
     * Sets the address2 value for this RegistrationParamsInD.
     * 
     * @param address2
     */
    public void setAddress2(java.lang.String address2) {
        this.address2 = address2;
    }


    /**
     * Gets the country value for this RegistrationParamsInD.
     * 
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this RegistrationParamsInD.
     * 
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }


    /**
     * Gets the bank_accounts value for this RegistrationParamsInD.
     * 
     * @return bank_accounts
     */
    public com.maventa.secure.BankAccountParamsIn[] getBank_accounts() {
        return bank_accounts;
    }


    /**
     * Sets the bank_accounts value for this RegistrationParamsInD.
     * 
     * @param bank_accounts
     */
    public void setBank_accounts(com.maventa.secure.BankAccountParamsIn[] bank_accounts) {
        this.bank_accounts = bank_accounts;
    }


    /**
     * Gets the user_last_name value for this RegistrationParamsInD.
     * 
     * @return user_last_name
     */
    public java.lang.String getUser_last_name() {
        return user_last_name;
    }


    /**
     * Sets the user_last_name value for this RegistrationParamsInD.
     * 
     * @param user_last_name
     */
    public void setUser_last_name(java.lang.String user_last_name) {
        this.user_last_name = user_last_name;
    }


    /**
     * Gets the user_phone value for this RegistrationParamsInD.
     * 
     * @return user_phone
     */
    public java.lang.String getUser_phone() {
        return user_phone;
    }


    /**
     * Sets the user_phone value for this RegistrationParamsInD.
     * 
     * @param user_phone
     */
    public void setUser_phone(java.lang.String user_phone) {
        this.user_phone = user_phone;
    }


    /**
     * Gets the post_code value for this RegistrationParamsInD.
     * 
     * @return post_code
     */
    public java.lang.String getPost_code() {
        return post_code;
    }


    /**
     * Sets the post_code value for this RegistrationParamsInD.
     * 
     * @param post_code
     */
    public void setPost_code(java.lang.String post_code) {
        this.post_code = post_code;
    }


    /**
     * Gets the company_bid value for this RegistrationParamsInD.
     * 
     * @return company_bid
     */
    public java.lang.String getCompany_bid() {
        return company_bid;
    }


    /**
     * Sets the company_bid value for this RegistrationParamsInD.
     * 
     * @param company_bid
     */
    public void setCompany_bid(java.lang.String company_bid) {
        this.company_bid = company_bid;
    }


    /**
     * Gets the vendor_api_key value for this RegistrationParamsInD.
     * 
     * @return vendor_api_key
     */
    public java.lang.String getVendor_api_key() {
        return vendor_api_key;
    }


    /**
     * Sets the vendor_api_key value for this RegistrationParamsInD.
     * 
     * @param vendor_api_key
     */
    public void setVendor_api_key(java.lang.String vendor_api_key) {
        this.vendor_api_key = vendor_api_key;
    }


    /**
     * Gets the state value for this RegistrationParamsInD.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this RegistrationParamsInD.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the receive_invoices value for this RegistrationParamsInD.
     * 
     * @return receive_invoices
     */
    public boolean isReceive_invoices() {
        return receive_invoices;
    }


    /**
     * Sets the receive_invoices value for this RegistrationParamsInD.
     * 
     * @param receive_invoices
     */
    public void setReceive_invoices(boolean receive_invoices) {
        this.receive_invoices = receive_invoices;
    }


    /**
     * Gets the user_email value for this RegistrationParamsInD.
     * 
     * @return user_email
     */
    public java.lang.String getUser_email() {
        return user_email;
    }


    /**
     * Sets the user_email value for this RegistrationParamsInD.
     * 
     * @param user_email
     */
    public void setUser_email(java.lang.String user_email) {
        this.user_email = user_email;
    }


    /**
     * Gets the license_agreement value for this RegistrationParamsInD.
     * 
     * @return license_agreement
     */
    public boolean isLicense_agreement() {
        return license_agreement;
    }


    /**
     * Sets the license_agreement value for this RegistrationParamsInD.
     * 
     * @param license_agreement
     */
    public void setLicense_agreement(boolean license_agreement) {
        this.license_agreement = license_agreement;
    }


    /**
     * Gets the company_email value for this RegistrationParamsInD.
     * 
     * @return company_email
     */
    public java.lang.String getCompany_email() {
        return company_email;
    }


    /**
     * Sets the company_email value for this RegistrationParamsInD.
     * 
     * @param company_email
     */
    public void setCompany_email(java.lang.String company_email) {
        this.company_email = company_email;
    }


    /**
     * Gets the city value for this RegistrationParamsInD.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this RegistrationParamsInD.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the email_activation value for this RegistrationParamsInD.
     * 
     * @return email_activation
     */
    public boolean isEmail_activation() {
        return email_activation;
    }


    /**
     * Sets the email_activation value for this RegistrationParamsInD.
     * 
     * @param email_activation
     */
    public void setEmail_activation(boolean email_activation) {
        this.email_activation = email_activation;
    }


    /**
     * Gets the no_vat value for this RegistrationParamsInD.
     * 
     * @return no_vat
     */
    public boolean isNo_vat() {
        return no_vat;
    }


    /**
     * Sets the no_vat value for this RegistrationParamsInD.
     * 
     * @param no_vat
     */
    public void setNo_vat(boolean no_vat) {
        this.no_vat = no_vat;
    }


    /**
     * Gets the company_name value for this RegistrationParamsInD.
     * 
     * @return company_name
     */
    public java.lang.String getCompany_name() {
        return company_name;
    }


    /**
     * Sets the company_name value for this RegistrationParamsInD.
     * 
     * @param company_name
     */
    public void setCompany_name(java.lang.String company_name) {
        this.company_name = company_name;
    }


    /**
     * Gets the address1 value for this RegistrationParamsInD.
     * 
     * @return address1
     */
    public java.lang.String getAddress1() {
        return address1;
    }


    /**
     * Sets the address1 value for this RegistrationParamsInD.
     * 
     * @param address1
     */
    public void setAddress1(java.lang.String address1) {
        this.address1 = address1;
    }


    /**
     * Gets the post_office value for this RegistrationParamsInD.
     * 
     * @return post_office
     */
    public java.lang.String getPost_office() {
        return post_office;
    }


    /**
     * Sets the post_office value for this RegistrationParamsInD.
     * 
     * @param post_office
     */
    public void setPost_office(java.lang.String post_office) {
        this.post_office = post_office;
    }


    /**
     * Gets the user_first_name value for this RegistrationParamsInD.
     * 
     * @return user_first_name
     */
    public java.lang.String getUser_first_name() {
        return user_first_name;
    }


    /**
     * Sets the user_first_name value for this RegistrationParamsInD.
     * 
     * @param user_first_name
     */
    public void setUser_first_name(java.lang.String user_first_name) {
        this.user_first_name = user_first_name;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RegistrationParamsInD)) return false;
        RegistrationParamsInD other = (RegistrationParamsInD) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.address2==null && other.getAddress2()==null) || 
             (this.address2!=null &&
              this.address2.equals(other.getAddress2()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.bank_accounts==null && other.getBank_accounts()==null) || 
             (this.bank_accounts!=null &&
              java.util.Arrays.equals(this.bank_accounts, other.getBank_accounts()))) &&
            ((this.user_last_name==null && other.getUser_last_name()==null) || 
             (this.user_last_name!=null &&
              this.user_last_name.equals(other.getUser_last_name()))) &&
            ((this.user_phone==null && other.getUser_phone()==null) || 
             (this.user_phone!=null &&
              this.user_phone.equals(other.getUser_phone()))) &&
            ((this.post_code==null && other.getPost_code()==null) || 
             (this.post_code!=null &&
              this.post_code.equals(other.getPost_code()))) &&
            ((this.company_bid==null && other.getCompany_bid()==null) || 
             (this.company_bid!=null &&
              this.company_bid.equals(other.getCompany_bid()))) &&
            ((this.vendor_api_key==null && other.getVendor_api_key()==null) || 
             (this.vendor_api_key!=null &&
              this.vendor_api_key.equals(other.getVendor_api_key()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            this.receive_invoices == other.isReceive_invoices() &&
            ((this.user_email==null && other.getUser_email()==null) || 
             (this.user_email!=null &&
              this.user_email.equals(other.getUser_email()))) &&
            this.license_agreement == other.isLicense_agreement() &&
            ((this.company_email==null && other.getCompany_email()==null) || 
             (this.company_email!=null &&
              this.company_email.equals(other.getCompany_email()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            this.email_activation == other.isEmail_activation() &&
            this.no_vat == other.isNo_vat() &&
            ((this.company_name==null && other.getCompany_name()==null) || 
             (this.company_name!=null &&
              this.company_name.equals(other.getCompany_name()))) &&
            ((this.address1==null && other.getAddress1()==null) || 
             (this.address1!=null &&
              this.address1.equals(other.getAddress1()))) &&
            ((this.post_office==null && other.getPost_office()==null) || 
             (this.post_office!=null &&
              this.post_office.equals(other.getPost_office()))) &&
            ((this.user_first_name==null && other.getUser_first_name()==null) || 
             (this.user_first_name!=null &&
              this.user_first_name.equals(other.getUser_first_name())));
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
        if (getAddress2() != null) {
            _hashCode += getAddress2().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getBank_accounts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBank_accounts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBank_accounts(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUser_last_name() != null) {
            _hashCode += getUser_last_name().hashCode();
        }
        if (getUser_phone() != null) {
            _hashCode += getUser_phone().hashCode();
        }
        if (getPost_code() != null) {
            _hashCode += getPost_code().hashCode();
        }
        if (getCompany_bid() != null) {
            _hashCode += getCompany_bid().hashCode();
        }
        if (getVendor_api_key() != null) {
            _hashCode += getVendor_api_key().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        _hashCode += (isReceive_invoices() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getUser_email() != null) {
            _hashCode += getUser_email().hashCode();
        }
        _hashCode += (isLicense_agreement() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getCompany_email() != null) {
            _hashCode += getCompany_email().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        _hashCode += (isEmail_activation() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isNo_vat() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getCompany_name() != null) {
            _hashCode += getCompany_name().hashCode();
        }
        if (getAddress1() != null) {
            _hashCode += getAddress1().hashCode();
        }
        if (getPost_office() != null) {
            _hashCode += getPost_office().hashCode();
        }
        if (getUser_first_name() != null) {
            _hashCode += getUser_first_name().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RegistrationParamsInD.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://secure.maventa.com/", "RegistrationParamsInD"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("bank_accounts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bank_accounts"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://secure.maventa.com/", "BankAccountParamsIn"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user_last_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "user_last_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user_phone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "user_phone"));
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
        elemField.setFieldName("company_bid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "company_bid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendor_api_key");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vendor_api_key"));
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
        elemField.setFieldName("receive_invoices");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receive_invoices"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user_email");
        elemField.setXmlName(new javax.xml.namespace.QName("", "user_email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("license_agreement");
        elemField.setXmlName(new javax.xml.namespace.QName("", "license_agreement"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("company_email");
        elemField.setXmlName(new javax.xml.namespace.QName("", "company_email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("", "city"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email_activation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "email_activation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("no_vat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "no_vat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("company_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "company_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user_first_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "user_first_name"));
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

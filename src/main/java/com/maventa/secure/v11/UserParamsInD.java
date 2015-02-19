/**
 * UserParamsInD.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.maventa.secure.v11;

public class UserParamsInD  implements java.io.Serializable {
    private java.lang.String email;

    private boolean notifications_disabled;

    private java.lang.String phone;

    private java.lang.String user_role;

    private java.lang.String password_confirmation;

    private java.lang.String password;

    private java.lang.String last_name;

    private java.lang.String first_name;

    public UserParamsInD() {
    }

    public UserParamsInD(
           java.lang.String email,
           boolean notifications_disabled,
           java.lang.String phone,
           java.lang.String user_role,
           java.lang.String password_confirmation,
           java.lang.String password,
           java.lang.String last_name,
           java.lang.String first_name) {
           this.email = email;
           this.notifications_disabled = notifications_disabled;
           this.phone = phone;
           this.user_role = user_role;
           this.password_confirmation = password_confirmation;
           this.password = password;
           this.last_name = last_name;
           this.first_name = first_name;
    }


    /**
     * Gets the email value for this UserParamsInD.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this UserParamsInD.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the notifications_disabled value for this UserParamsInD.
     * 
     * @return notifications_disabled
     */
    public boolean isNotifications_disabled() {
        return notifications_disabled;
    }


    /**
     * Sets the notifications_disabled value for this UserParamsInD.
     * 
     * @param notifications_disabled
     */
    public void setNotifications_disabled(boolean notifications_disabled) {
        this.notifications_disabled = notifications_disabled;
    }


    /**
     * Gets the phone value for this UserParamsInD.
     * 
     * @return phone
     */
    public java.lang.String getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this UserParamsInD.
     * 
     * @param phone
     */
    public void setPhone(java.lang.String phone) {
        this.phone = phone;
    }


    /**
     * Gets the user_role value for this UserParamsInD.
     * 
     * @return user_role
     */
    public java.lang.String getUser_role() {
        return user_role;
    }


    /**
     * Sets the user_role value for this UserParamsInD.
     * 
     * @param user_role
     */
    public void setUser_role(java.lang.String user_role) {
        this.user_role = user_role;
    }


    /**
     * Gets the password_confirmation value for this UserParamsInD.
     * 
     * @return password_confirmation
     */
    public java.lang.String getPassword_confirmation() {
        return password_confirmation;
    }


    /**
     * Sets the password_confirmation value for this UserParamsInD.
     * 
     * @param password_confirmation
     */
    public void setPassword_confirmation(java.lang.String password_confirmation) {
        this.password_confirmation = password_confirmation;
    }


    /**
     * Gets the password value for this UserParamsInD.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this UserParamsInD.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the last_name value for this UserParamsInD.
     * 
     * @return last_name
     */
    public java.lang.String getLast_name() {
        return last_name;
    }


    /**
     * Sets the last_name value for this UserParamsInD.
     * 
     * @param last_name
     */
    public void setLast_name(java.lang.String last_name) {
        this.last_name = last_name;
    }


    /**
     * Gets the first_name value for this UserParamsInD.
     * 
     * @return first_name
     */
    public java.lang.String getFirst_name() {
        return first_name;
    }


    /**
     * Sets the first_name value for this UserParamsInD.
     * 
     * @param first_name
     */
    public void setFirst_name(java.lang.String first_name) {
        this.first_name = first_name;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserParamsInD)) return false;
        UserParamsInD other = (UserParamsInD) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            this.notifications_disabled == other.isNotifications_disabled() &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              this.phone.equals(other.getPhone()))) &&
            ((this.user_role==null && other.getUser_role()==null) || 
             (this.user_role!=null &&
              this.user_role.equals(other.getUser_role()))) &&
            ((this.password_confirmation==null && other.getPassword_confirmation()==null) || 
             (this.password_confirmation!=null &&
              this.password_confirmation.equals(other.getPassword_confirmation()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.last_name==null && other.getLast_name()==null) || 
             (this.last_name!=null &&
              this.last_name.equals(other.getLast_name()))) &&
            ((this.first_name==null && other.getFirst_name()==null) || 
             (this.first_name!=null &&
              this.first_name.equals(other.getFirst_name())));
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
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        _hashCode += (isNotifications_disabled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getPhone() != null) {
            _hashCode += getPhone().hashCode();
        }
        if (getUser_role() != null) {
            _hashCode += getUser_role().hashCode();
        }
        if (getPassword_confirmation() != null) {
            _hashCode += getPassword_confirmation().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getLast_name() != null) {
            _hashCode += getLast_name().hashCode();
        }
        if (getFirst_name() != null) {
            _hashCode += getFirst_name().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserParamsInD.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://secure.maventa.com/", "UserParamsInD"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notifications_disabled");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notifications_disabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user_role");
        elemField.setXmlName(new javax.xml.namespace.QName("", "user_role"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password_confirmation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "password_confirmation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("", "password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("last_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "last_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("first_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "first_name"));
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

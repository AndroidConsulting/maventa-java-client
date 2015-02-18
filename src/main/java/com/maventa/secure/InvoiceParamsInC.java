/**
 * InvoiceParamsInC.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.maventa.secure;

public class InvoiceParamsInC  implements java.io.Serializable {
    private java.lang.String lang;

    private java.lang.String delivery_date;

    private java.lang.String date_due;

    private com.maventa.secure.ItemsInC[] items;

    private com.maventa.secure.BankAccountParamsIn[] bank_accounts;

    private java.lang.String payment_terms;

    private java.lang.String work_order_nr;

    private com.maventa.secure.RouteDisable disabled_routes;

    private java.lang.String data;

    private java.lang.String company_comment;

    private com.maventa.secure.FileAttachment[] attachments;

    private java.lang.String company_reference;

    private com.maventa.secure.InvoiceDeliveryAddressIn invoice_delivery_address;

    private java.lang.String currency;

    private com.maventa.secure.CustomerParamsInC customer;

    private com.maventa.secure.PostalAddressParamsIn company_postal;

    private java.lang.String notes;

    private java.lang.String date;

    private java.lang.String customer_maventa_id;

    private java.lang.String invoice_nr;

    private java.lang.String company_reminder;

    private boolean require_sign;

    private java.lang.String company_interest;

    private java.lang.String delivery_type;

    private com.maventa.secure.InvoiceSellerInformationIn invoice_seller_information;

    private java.lang.String company_paper_fee;

    private java.lang.String order_nr;

    private java.lang.String sum;

    private java.lang.String reference_nr;

    private java.lang.String customer_reference;

    private java.lang.String sum_tax;

    private java.lang.String company_website;

    public InvoiceParamsInC() {
    }

    public InvoiceParamsInC(
           java.lang.String lang,
           java.lang.String delivery_date,
           java.lang.String date_due,
           com.maventa.secure.ItemsInC[] items,
           com.maventa.secure.BankAccountParamsIn[] bank_accounts,
           java.lang.String payment_terms,
           java.lang.String work_order_nr,
           com.maventa.secure.RouteDisable disabled_routes,
           java.lang.String data,
           java.lang.String company_comment,
           com.maventa.secure.FileAttachment[] attachments,
           java.lang.String company_reference,
           com.maventa.secure.InvoiceDeliveryAddressIn invoice_delivery_address,
           java.lang.String currency,
           com.maventa.secure.CustomerParamsInC customer,
           com.maventa.secure.PostalAddressParamsIn company_postal,
           java.lang.String notes,
           java.lang.String date,
           java.lang.String customer_maventa_id,
           java.lang.String invoice_nr,
           java.lang.String company_reminder,
           boolean require_sign,
           java.lang.String company_interest,
           java.lang.String delivery_type,
           com.maventa.secure.InvoiceSellerInformationIn invoice_seller_information,
           java.lang.String company_paper_fee,
           java.lang.String order_nr,
           java.lang.String sum,
           java.lang.String reference_nr,
           java.lang.String customer_reference,
           java.lang.String sum_tax,
           java.lang.String company_website) {
           this.lang = lang;
           this.delivery_date = delivery_date;
           this.date_due = date_due;
           this.items = items;
           this.bank_accounts = bank_accounts;
           this.payment_terms = payment_terms;
           this.work_order_nr = work_order_nr;
           this.disabled_routes = disabled_routes;
           this.data = data;
           this.company_comment = company_comment;
           this.attachments = attachments;
           this.company_reference = company_reference;
           this.invoice_delivery_address = invoice_delivery_address;
           this.currency = currency;
           this.customer = customer;
           this.company_postal = company_postal;
           this.notes = notes;
           this.date = date;
           this.customer_maventa_id = customer_maventa_id;
           this.invoice_nr = invoice_nr;
           this.company_reminder = company_reminder;
           this.require_sign = require_sign;
           this.company_interest = company_interest;
           this.delivery_type = delivery_type;
           this.invoice_seller_information = invoice_seller_information;
           this.company_paper_fee = company_paper_fee;
           this.order_nr = order_nr;
           this.sum = sum;
           this.reference_nr = reference_nr;
           this.customer_reference = customer_reference;
           this.sum_tax = sum_tax;
           this.company_website = company_website;
    }


    /**
     * Gets the lang value for this InvoiceParamsInC.
     * 
     * @return lang
     */
    public java.lang.String getLang() {
        return lang;
    }


    /**
     * Sets the lang value for this InvoiceParamsInC.
     * 
     * @param lang
     */
    public void setLang(java.lang.String lang) {
        this.lang = lang;
    }


    /**
     * Gets the delivery_date value for this InvoiceParamsInC.
     * 
     * @return delivery_date
     */
    public java.lang.String getDelivery_date() {
        return delivery_date;
    }


    /**
     * Sets the delivery_date value for this InvoiceParamsInC.
     * 
     * @param delivery_date
     */
    public void setDelivery_date(java.lang.String delivery_date) {
        this.delivery_date = delivery_date;
    }


    /**
     * Gets the date_due value for this InvoiceParamsInC.
     * 
     * @return date_due
     */
    public java.lang.String getDate_due() {
        return date_due;
    }


    /**
     * Sets the date_due value for this InvoiceParamsInC.
     * 
     * @param date_due
     */
    public void setDate_due(java.lang.String date_due) {
        this.date_due = date_due;
    }


    /**
     * Gets the items value for this InvoiceParamsInC.
     * 
     * @return items
     */
    public com.maventa.secure.ItemsInC[] getItems() {
        return items;
    }


    /**
     * Sets the items value for this InvoiceParamsInC.
     * 
     * @param items
     */
    public void setItems(com.maventa.secure.ItemsInC[] items) {
        this.items = items;
    }


    /**
     * Gets the bank_accounts value for this InvoiceParamsInC.
     * 
     * @return bank_accounts
     */
    public com.maventa.secure.BankAccountParamsIn[] getBank_accounts() {
        return bank_accounts;
    }


    /**
     * Sets the bank_accounts value for this InvoiceParamsInC.
     * 
     * @param bank_accounts
     */
    public void setBank_accounts(com.maventa.secure.BankAccountParamsIn[] bank_accounts) {
        this.bank_accounts = bank_accounts;
    }


    /**
     * Gets the payment_terms value for this InvoiceParamsInC.
     * 
     * @return payment_terms
     */
    public java.lang.String getPayment_terms() {
        return payment_terms;
    }


    /**
     * Sets the payment_terms value for this InvoiceParamsInC.
     * 
     * @param payment_terms
     */
    public void setPayment_terms(java.lang.String payment_terms) {
        this.payment_terms = payment_terms;
    }


    /**
     * Gets the work_order_nr value for this InvoiceParamsInC.
     * 
     * @return work_order_nr
     */
    public java.lang.String getWork_order_nr() {
        return work_order_nr;
    }


    /**
     * Sets the work_order_nr value for this InvoiceParamsInC.
     * 
     * @param work_order_nr
     */
    public void setWork_order_nr(java.lang.String work_order_nr) {
        this.work_order_nr = work_order_nr;
    }


    /**
     * Gets the disabled_routes value for this InvoiceParamsInC.
     * 
     * @return disabled_routes
     */
    public com.maventa.secure.RouteDisable getDisabled_routes() {
        return disabled_routes;
    }


    /**
     * Sets the disabled_routes value for this InvoiceParamsInC.
     * 
     * @param disabled_routes
     */
    public void setDisabled_routes(com.maventa.secure.RouteDisable disabled_routes) {
        this.disabled_routes = disabled_routes;
    }


    /**
     * Gets the data value for this InvoiceParamsInC.
     * 
     * @return data
     */
    public java.lang.String getData() {
        return data;
    }


    /**
     * Sets the data value for this InvoiceParamsInC.
     * 
     * @param data
     */
    public void setData(java.lang.String data) {
        this.data = data;
    }


    /**
     * Gets the company_comment value for this InvoiceParamsInC.
     * 
     * @return company_comment
     */
    public java.lang.String getCompany_comment() {
        return company_comment;
    }


    /**
     * Sets the company_comment value for this InvoiceParamsInC.
     * 
     * @param company_comment
     */
    public void setCompany_comment(java.lang.String company_comment) {
        this.company_comment = company_comment;
    }


    /**
     * Gets the attachments value for this InvoiceParamsInC.
     * 
     * @return attachments
     */
    public com.maventa.secure.FileAttachment[] getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this InvoiceParamsInC.
     * 
     * @param attachments
     */
    public void setAttachments(com.maventa.secure.FileAttachment[] attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the company_reference value for this InvoiceParamsInC.
     * 
     * @return company_reference
     */
    public java.lang.String getCompany_reference() {
        return company_reference;
    }


    /**
     * Sets the company_reference value for this InvoiceParamsInC.
     * 
     * @param company_reference
     */
    public void setCompany_reference(java.lang.String company_reference) {
        this.company_reference = company_reference;
    }


    /**
     * Gets the invoice_delivery_address value for this InvoiceParamsInC.
     * 
     * @return invoice_delivery_address
     */
    public com.maventa.secure.InvoiceDeliveryAddressIn getInvoice_delivery_address() {
        return invoice_delivery_address;
    }


    /**
     * Sets the invoice_delivery_address value for this InvoiceParamsInC.
     * 
     * @param invoice_delivery_address
     */
    public void setInvoice_delivery_address(com.maventa.secure.InvoiceDeliveryAddressIn invoice_delivery_address) {
        this.invoice_delivery_address = invoice_delivery_address;
    }


    /**
     * Gets the currency value for this InvoiceParamsInC.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this InvoiceParamsInC.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the customer value for this InvoiceParamsInC.
     * 
     * @return customer
     */
    public com.maventa.secure.CustomerParamsInC getCustomer() {
        return customer;
    }


    /**
     * Sets the customer value for this InvoiceParamsInC.
     * 
     * @param customer
     */
    public void setCustomer(com.maventa.secure.CustomerParamsInC customer) {
        this.customer = customer;
    }


    /**
     * Gets the company_postal value for this InvoiceParamsInC.
     * 
     * @return company_postal
     */
    public com.maventa.secure.PostalAddressParamsIn getCompany_postal() {
        return company_postal;
    }


    /**
     * Sets the company_postal value for this InvoiceParamsInC.
     * 
     * @param company_postal
     */
    public void setCompany_postal(com.maventa.secure.PostalAddressParamsIn company_postal) {
        this.company_postal = company_postal;
    }


    /**
     * Gets the notes value for this InvoiceParamsInC.
     * 
     * @return notes
     */
    public java.lang.String getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this InvoiceParamsInC.
     * 
     * @param notes
     */
    public void setNotes(java.lang.String notes) {
        this.notes = notes;
    }


    /**
     * Gets the date value for this InvoiceParamsInC.
     * 
     * @return date
     */
    public java.lang.String getDate() {
        return date;
    }


    /**
     * Sets the date value for this InvoiceParamsInC.
     * 
     * @param date
     */
    public void setDate(java.lang.String date) {
        this.date = date;
    }


    /**
     * Gets the customer_maventa_id value for this InvoiceParamsInC.
     * 
     * @return customer_maventa_id
     */
    public java.lang.String getCustomer_maventa_id() {
        return customer_maventa_id;
    }


    /**
     * Sets the customer_maventa_id value for this InvoiceParamsInC.
     * 
     * @param customer_maventa_id
     */
    public void setCustomer_maventa_id(java.lang.String customer_maventa_id) {
        this.customer_maventa_id = customer_maventa_id;
    }


    /**
     * Gets the invoice_nr value for this InvoiceParamsInC.
     * 
     * @return invoice_nr
     */
    public java.lang.String getInvoice_nr() {
        return invoice_nr;
    }


    /**
     * Sets the invoice_nr value for this InvoiceParamsInC.
     * 
     * @param invoice_nr
     */
    public void setInvoice_nr(java.lang.String invoice_nr) {
        this.invoice_nr = invoice_nr;
    }


    /**
     * Gets the company_reminder value for this InvoiceParamsInC.
     * 
     * @return company_reminder
     */
    public java.lang.String getCompany_reminder() {
        return company_reminder;
    }


    /**
     * Sets the company_reminder value for this InvoiceParamsInC.
     * 
     * @param company_reminder
     */
    public void setCompany_reminder(java.lang.String company_reminder) {
        this.company_reminder = company_reminder;
    }


    /**
     * Gets the require_sign value for this InvoiceParamsInC.
     * 
     * @return require_sign
     */
    public boolean isRequire_sign() {
        return require_sign;
    }


    /**
     * Sets the require_sign value for this InvoiceParamsInC.
     * 
     * @param require_sign
     */
    public void setRequire_sign(boolean require_sign) {
        this.require_sign = require_sign;
    }


    /**
     * Gets the company_interest value for this InvoiceParamsInC.
     * 
     * @return company_interest
     */
    public java.lang.String getCompany_interest() {
        return company_interest;
    }


    /**
     * Sets the company_interest value for this InvoiceParamsInC.
     * 
     * @param company_interest
     */
    public void setCompany_interest(java.lang.String company_interest) {
        this.company_interest = company_interest;
    }


    /**
     * Gets the delivery_type value for this InvoiceParamsInC.
     * 
     * @return delivery_type
     */
    public java.lang.String getDelivery_type() {
        return delivery_type;
    }


    /**
     * Sets the delivery_type value for this InvoiceParamsInC.
     * 
     * @param delivery_type
     */
    public void setDelivery_type(java.lang.String delivery_type) {
        this.delivery_type = delivery_type;
    }


    /**
     * Gets the invoice_seller_information value for this InvoiceParamsInC.
     * 
     * @return invoice_seller_information
     */
    public com.maventa.secure.InvoiceSellerInformationIn getInvoice_seller_information() {
        return invoice_seller_information;
    }


    /**
     * Sets the invoice_seller_information value for this InvoiceParamsInC.
     * 
     * @param invoice_seller_information
     */
    public void setInvoice_seller_information(com.maventa.secure.InvoiceSellerInformationIn invoice_seller_information) {
        this.invoice_seller_information = invoice_seller_information;
    }


    /**
     * Gets the company_paper_fee value for this InvoiceParamsInC.
     * 
     * @return company_paper_fee
     */
    public java.lang.String getCompany_paper_fee() {
        return company_paper_fee;
    }


    /**
     * Sets the company_paper_fee value for this InvoiceParamsInC.
     * 
     * @param company_paper_fee
     */
    public void setCompany_paper_fee(java.lang.String company_paper_fee) {
        this.company_paper_fee = company_paper_fee;
    }


    /**
     * Gets the order_nr value for this InvoiceParamsInC.
     * 
     * @return order_nr
     */
    public java.lang.String getOrder_nr() {
        return order_nr;
    }


    /**
     * Sets the order_nr value for this InvoiceParamsInC.
     * 
     * @param order_nr
     */
    public void setOrder_nr(java.lang.String order_nr) {
        this.order_nr = order_nr;
    }


    /**
     * Gets the sum value for this InvoiceParamsInC.
     * 
     * @return sum
     */
    public java.lang.String getSum() {
        return sum;
    }


    /**
     * Sets the sum value for this InvoiceParamsInC.
     * 
     * @param sum
     */
    public void setSum(java.lang.String sum) {
        this.sum = sum;
    }


    /**
     * Gets the reference_nr value for this InvoiceParamsInC.
     * 
     * @return reference_nr
     */
    public java.lang.String getReference_nr() {
        return reference_nr;
    }


    /**
     * Sets the reference_nr value for this InvoiceParamsInC.
     * 
     * @param reference_nr
     */
    public void setReference_nr(java.lang.String reference_nr) {
        this.reference_nr = reference_nr;
    }


    /**
     * Gets the customer_reference value for this InvoiceParamsInC.
     * 
     * @return customer_reference
     */
    public java.lang.String getCustomer_reference() {
        return customer_reference;
    }


    /**
     * Sets the customer_reference value for this InvoiceParamsInC.
     * 
     * @param customer_reference
     */
    public void setCustomer_reference(java.lang.String customer_reference) {
        this.customer_reference = customer_reference;
    }


    /**
     * Gets the sum_tax value for this InvoiceParamsInC.
     * 
     * @return sum_tax
     */
    public java.lang.String getSum_tax() {
        return sum_tax;
    }


    /**
     * Sets the sum_tax value for this InvoiceParamsInC.
     * 
     * @param sum_tax
     */
    public void setSum_tax(java.lang.String sum_tax) {
        this.sum_tax = sum_tax;
    }


    /**
     * Gets the company_website value for this InvoiceParamsInC.
     * 
     * @return company_website
     */
    public java.lang.String getCompany_website() {
        return company_website;
    }


    /**
     * Sets the company_website value for this InvoiceParamsInC.
     * 
     * @param company_website
     */
    public void setCompany_website(java.lang.String company_website) {
        this.company_website = company_website;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InvoiceParamsInC)) return false;
        InvoiceParamsInC other = (InvoiceParamsInC) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.lang==null && other.getLang()==null) || 
             (this.lang!=null &&
              this.lang.equals(other.getLang()))) &&
            ((this.delivery_date==null && other.getDelivery_date()==null) || 
             (this.delivery_date!=null &&
              this.delivery_date.equals(other.getDelivery_date()))) &&
            ((this.date_due==null && other.getDate_due()==null) || 
             (this.date_due!=null &&
              this.date_due.equals(other.getDate_due()))) &&
            ((this.items==null && other.getItems()==null) || 
             (this.items!=null &&
              java.util.Arrays.equals(this.items, other.getItems()))) &&
            ((this.bank_accounts==null && other.getBank_accounts()==null) || 
             (this.bank_accounts!=null &&
              java.util.Arrays.equals(this.bank_accounts, other.getBank_accounts()))) &&
            ((this.payment_terms==null && other.getPayment_terms()==null) || 
             (this.payment_terms!=null &&
              this.payment_terms.equals(other.getPayment_terms()))) &&
            ((this.work_order_nr==null && other.getWork_order_nr()==null) || 
             (this.work_order_nr!=null &&
              this.work_order_nr.equals(other.getWork_order_nr()))) &&
            ((this.disabled_routes==null && other.getDisabled_routes()==null) || 
             (this.disabled_routes!=null &&
              this.disabled_routes.equals(other.getDisabled_routes()))) &&
            ((this.data==null && other.getData()==null) || 
             (this.data!=null &&
              this.data.equals(other.getData()))) &&
            ((this.company_comment==null && other.getCompany_comment()==null) || 
             (this.company_comment!=null &&
              this.company_comment.equals(other.getCompany_comment()))) &&
            ((this.attachments==null && other.getAttachments()==null) || 
             (this.attachments!=null &&
              java.util.Arrays.equals(this.attachments, other.getAttachments()))) &&
            ((this.company_reference==null && other.getCompany_reference()==null) || 
             (this.company_reference!=null &&
              this.company_reference.equals(other.getCompany_reference()))) &&
            ((this.invoice_delivery_address==null && other.getInvoice_delivery_address()==null) || 
             (this.invoice_delivery_address!=null &&
              this.invoice_delivery_address.equals(other.getInvoice_delivery_address()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.customer==null && other.getCustomer()==null) || 
             (this.customer!=null &&
              this.customer.equals(other.getCustomer()))) &&
            ((this.company_postal==null && other.getCompany_postal()==null) || 
             (this.company_postal!=null &&
              this.company_postal.equals(other.getCompany_postal()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.customer_maventa_id==null && other.getCustomer_maventa_id()==null) || 
             (this.customer_maventa_id!=null &&
              this.customer_maventa_id.equals(other.getCustomer_maventa_id()))) &&
            ((this.invoice_nr==null && other.getInvoice_nr()==null) || 
             (this.invoice_nr!=null &&
              this.invoice_nr.equals(other.getInvoice_nr()))) &&
            ((this.company_reminder==null && other.getCompany_reminder()==null) || 
             (this.company_reminder!=null &&
              this.company_reminder.equals(other.getCompany_reminder()))) &&
            this.require_sign == other.isRequire_sign() &&
            ((this.company_interest==null && other.getCompany_interest()==null) || 
             (this.company_interest!=null &&
              this.company_interest.equals(other.getCompany_interest()))) &&
            ((this.delivery_type==null && other.getDelivery_type()==null) || 
             (this.delivery_type!=null &&
              this.delivery_type.equals(other.getDelivery_type()))) &&
            ((this.invoice_seller_information==null && other.getInvoice_seller_information()==null) || 
             (this.invoice_seller_information!=null &&
              this.invoice_seller_information.equals(other.getInvoice_seller_information()))) &&
            ((this.company_paper_fee==null && other.getCompany_paper_fee()==null) || 
             (this.company_paper_fee!=null &&
              this.company_paper_fee.equals(other.getCompany_paper_fee()))) &&
            ((this.order_nr==null && other.getOrder_nr()==null) || 
             (this.order_nr!=null &&
              this.order_nr.equals(other.getOrder_nr()))) &&
            ((this.sum==null && other.getSum()==null) || 
             (this.sum!=null &&
              this.sum.equals(other.getSum()))) &&
            ((this.reference_nr==null && other.getReference_nr()==null) || 
             (this.reference_nr!=null &&
              this.reference_nr.equals(other.getReference_nr()))) &&
            ((this.customer_reference==null && other.getCustomer_reference()==null) || 
             (this.customer_reference!=null &&
              this.customer_reference.equals(other.getCustomer_reference()))) &&
            ((this.sum_tax==null && other.getSum_tax()==null) || 
             (this.sum_tax!=null &&
              this.sum_tax.equals(other.getSum_tax()))) &&
            ((this.company_website==null && other.getCompany_website()==null) || 
             (this.company_website!=null &&
              this.company_website.equals(other.getCompany_website())));
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
        if (getLang() != null) {
            _hashCode += getLang().hashCode();
        }
        if (getDelivery_date() != null) {
            _hashCode += getDelivery_date().hashCode();
        }
        if (getDate_due() != null) {
            _hashCode += getDate_due().hashCode();
        }
        if (getItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItems(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        if (getPayment_terms() != null) {
            _hashCode += getPayment_terms().hashCode();
        }
        if (getWork_order_nr() != null) {
            _hashCode += getWork_order_nr().hashCode();
        }
        if (getDisabled_routes() != null) {
            _hashCode += getDisabled_routes().hashCode();
        }
        if (getData() != null) {
            _hashCode += getData().hashCode();
        }
        if (getCompany_comment() != null) {
            _hashCode += getCompany_comment().hashCode();
        }
        if (getAttachments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAttachments());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAttachments(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCompany_reference() != null) {
            _hashCode += getCompany_reference().hashCode();
        }
        if (getInvoice_delivery_address() != null) {
            _hashCode += getInvoice_delivery_address().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getCustomer() != null) {
            _hashCode += getCustomer().hashCode();
        }
        if (getCompany_postal() != null) {
            _hashCode += getCompany_postal().hashCode();
        }
        if (getNotes() != null) {
            _hashCode += getNotes().hashCode();
        }
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getCustomer_maventa_id() != null) {
            _hashCode += getCustomer_maventa_id().hashCode();
        }
        if (getInvoice_nr() != null) {
            _hashCode += getInvoice_nr().hashCode();
        }
        if (getCompany_reminder() != null) {
            _hashCode += getCompany_reminder().hashCode();
        }
        _hashCode += (isRequire_sign() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getCompany_interest() != null) {
            _hashCode += getCompany_interest().hashCode();
        }
        if (getDelivery_type() != null) {
            _hashCode += getDelivery_type().hashCode();
        }
        if (getInvoice_seller_information() != null) {
            _hashCode += getInvoice_seller_information().hashCode();
        }
        if (getCompany_paper_fee() != null) {
            _hashCode += getCompany_paper_fee().hashCode();
        }
        if (getOrder_nr() != null) {
            _hashCode += getOrder_nr().hashCode();
        }
        if (getSum() != null) {
            _hashCode += getSum().hashCode();
        }
        if (getReference_nr() != null) {
            _hashCode += getReference_nr().hashCode();
        }
        if (getCustomer_reference() != null) {
            _hashCode += getCustomer_reference().hashCode();
        }
        if (getSum_tax() != null) {
            _hashCode += getSum_tax().hashCode();
        }
        if (getCompany_website() != null) {
            _hashCode += getCompany_website().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InvoiceParamsInC.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://secure.maventa.com/", "InvoiceParamsInC"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lang");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lang"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delivery_date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "delivery_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_due");
        elemField.setXmlName(new javax.xml.namespace.QName("", "date_due"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("items");
        elemField.setXmlName(new javax.xml.namespace.QName("", "items"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://secure.maventa.com/", "ItemsInC"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bank_accounts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bank_accounts"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://secure.maventa.com/", "BankAccountParamsIn"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payment_terms");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payment_terms"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("work_order_nr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "work_order_nr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disabled_routes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "disabled_routes"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://secure.maventa.com/", "RouteDisable"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("data");
        elemField.setXmlName(new javax.xml.namespace.QName("", "data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("company_comment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "company_comment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachments");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attachments"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://secure.maventa.com/", "FileAttachment"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("company_reference");
        elemField.setXmlName(new javax.xml.namespace.QName("", "company_reference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoice_delivery_address");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invoice_delivery_address"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://secure.maventa.com/", "InvoiceDeliveryAddressIn"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customer"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://secure.maventa.com/", "CustomerParamsInC"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("company_postal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "company_postal"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://secure.maventa.com/", "PostalAddressParamsIn"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customer_maventa_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customer_maventa_id"));
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
        elemField.setFieldName("company_reminder");
        elemField.setXmlName(new javax.xml.namespace.QName("", "company_reminder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("require_sign");
        elemField.setXmlName(new javax.xml.namespace.QName("", "require_sign"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("company_interest");
        elemField.setXmlName(new javax.xml.namespace.QName("", "company_interest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delivery_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "delivery_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoice_seller_information");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invoice_seller_information"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://secure.maventa.com/", "InvoiceSellerInformationIn"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("company_paper_fee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "company_paper_fee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("order_nr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "order_nr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reference_nr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reference_nr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customer_reference");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customer_reference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sum_tax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sum_tax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("company_website");
        elemField.setXmlName(new javax.xml.namespace.QName("", "company_website"));
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

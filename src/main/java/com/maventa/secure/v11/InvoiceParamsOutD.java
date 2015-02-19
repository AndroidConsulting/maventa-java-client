/**
 * InvoiceParamsOutD.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.maventa.secure.v11;

public class InvoiceParamsOutD  implements java.io.Serializable {
    private java.lang.String customer_post_office;

    private java.lang.String date_due;

    private java.lang.String delivery_date;

    private java.lang.String status;

    private java.lang.String lang;

    private java.lang.String customer_bid;

    private java.lang.String payment_terms;

    private ItemsOut[] items;

    private java.lang.String customer_address1;

    private InvoiceActionParamsOut[] actions;

    private java.lang.String customer_contact_p;

    private java.lang.String customer_post_code;

    private java.lang.String customer_ovt;

    private java.lang.String work_order_nr;

    private java.lang.String customer_address2;

    private java.lang.String company_comment;

    private java.lang.String error_message;

    private int state;

    private java.lang.String customer_name;

    private java.lang.String data;

    private FileAttachment[] attachments;

    private java.lang.String company_reference;

    private java.lang.String customer_country;

    private java.lang.String currency;

    private java.lang.String customer_state;

    private InvoiceDeliveryAddressOut invoice_delivery_address;

    private java.lang.String notes;

    private java.lang.String company_reminder;

    private java.lang.String invoice_nr;

    private java.lang.String date;

    private InvoiceSellerInformationOut invoice_seller_information;

    private java.lang.String customer_nr;

    private java.lang.String delivery_type;

    private java.lang.String company_interest;

    private java.lang.String customer_email;

    private InvoiceAccountParamsOut[] accounts;

    private java.lang.String customer_reference;

    private java.lang.String reference_nr;

    private java.lang.String sum;

    private java.lang.String id;

    private java.lang.String order_nr;

    private java.lang.String company_paper_fee;

    private java.lang.String sum_tax;

    private java.lang.String customer_comment;

    public InvoiceParamsOutD() {
    }

    public InvoiceParamsOutD(
           java.lang.String customer_post_office,
           java.lang.String date_due,
           java.lang.String delivery_date,
           java.lang.String status,
           java.lang.String lang,
           java.lang.String customer_bid,
           java.lang.String payment_terms,
           ItemsOut[] items,
           java.lang.String customer_address1,
           InvoiceActionParamsOut[] actions,
           java.lang.String customer_contact_p,
           java.lang.String customer_post_code,
           java.lang.String customer_ovt,
           java.lang.String work_order_nr,
           java.lang.String customer_address2,
           java.lang.String company_comment,
           java.lang.String error_message,
           int state,
           java.lang.String customer_name,
           java.lang.String data,
           FileAttachment[] attachments,
           java.lang.String company_reference,
           java.lang.String customer_country,
           java.lang.String currency,
           java.lang.String customer_state,
           InvoiceDeliveryAddressOut invoice_delivery_address,
           java.lang.String notes,
           java.lang.String company_reminder,
           java.lang.String invoice_nr,
           java.lang.String date,
           InvoiceSellerInformationOut invoice_seller_information,
           java.lang.String customer_nr,
           java.lang.String delivery_type,
           java.lang.String company_interest,
           java.lang.String customer_email,
           InvoiceAccountParamsOut[] accounts,
           java.lang.String customer_reference,
           java.lang.String reference_nr,
           java.lang.String sum,
           java.lang.String id,
           java.lang.String order_nr,
           java.lang.String company_paper_fee,
           java.lang.String sum_tax,
           java.lang.String customer_comment) {
           this.customer_post_office = customer_post_office;
           this.date_due = date_due;
           this.delivery_date = delivery_date;
           this.status = status;
           this.lang = lang;
           this.customer_bid = customer_bid;
           this.payment_terms = payment_terms;
           this.items = items;
           this.customer_address1 = customer_address1;
           this.actions = actions;
           this.customer_contact_p = customer_contact_p;
           this.customer_post_code = customer_post_code;
           this.customer_ovt = customer_ovt;
           this.work_order_nr = work_order_nr;
           this.customer_address2 = customer_address2;
           this.company_comment = company_comment;
           this.error_message = error_message;
           this.state = state;
           this.customer_name = customer_name;
           this.data = data;
           this.attachments = attachments;
           this.company_reference = company_reference;
           this.customer_country = customer_country;
           this.currency = currency;
           this.customer_state = customer_state;
           this.invoice_delivery_address = invoice_delivery_address;
           this.notes = notes;
           this.company_reminder = company_reminder;
           this.invoice_nr = invoice_nr;
           this.date = date;
           this.invoice_seller_information = invoice_seller_information;
           this.customer_nr = customer_nr;
           this.delivery_type = delivery_type;
           this.company_interest = company_interest;
           this.customer_email = customer_email;
           this.accounts = accounts;
           this.customer_reference = customer_reference;
           this.reference_nr = reference_nr;
           this.sum = sum;
           this.id = id;
           this.order_nr = order_nr;
           this.company_paper_fee = company_paper_fee;
           this.sum_tax = sum_tax;
           this.customer_comment = customer_comment;
    }


    /**
     * Gets the customer_post_office value for this InvoiceParamsOutD.
     * 
     * @return customer_post_office
     */
    public java.lang.String getCustomer_post_office() {
        return customer_post_office;
    }


    /**
     * Sets the customer_post_office value for this InvoiceParamsOutD.
     * 
     * @param customer_post_office
     */
    public void setCustomer_post_office(java.lang.String customer_post_office) {
        this.customer_post_office = customer_post_office;
    }


    /**
     * Gets the date_due value for this InvoiceParamsOutD.
     * 
     * @return date_due
     */
    public java.lang.String getDate_due() {
        return date_due;
    }


    /**
     * Sets the date_due value for this InvoiceParamsOutD.
     * 
     * @param date_due
     */
    public void setDate_due(java.lang.String date_due) {
        this.date_due = date_due;
    }


    /**
     * Gets the delivery_date value for this InvoiceParamsOutD.
     * 
     * @return delivery_date
     */
    public java.lang.String getDelivery_date() {
        return delivery_date;
    }


    /**
     * Sets the delivery_date value for this InvoiceParamsOutD.
     * 
     * @param delivery_date
     */
    public void setDelivery_date(java.lang.String delivery_date) {
        this.delivery_date = delivery_date;
    }


    /**
     * Gets the status value for this InvoiceParamsOutD.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this InvoiceParamsOutD.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the lang value for this InvoiceParamsOutD.
     * 
     * @return lang
     */
    public java.lang.String getLang() {
        return lang;
    }


    /**
     * Sets the lang value for this InvoiceParamsOutD.
     * 
     * @param lang
     */
    public void setLang(java.lang.String lang) {
        this.lang = lang;
    }


    /**
     * Gets the customer_bid value for this InvoiceParamsOutD.
     * 
     * @return customer_bid
     */
    public java.lang.String getCustomer_bid() {
        return customer_bid;
    }


    /**
     * Sets the customer_bid value for this InvoiceParamsOutD.
     * 
     * @param customer_bid
     */
    public void setCustomer_bid(java.lang.String customer_bid) {
        this.customer_bid = customer_bid;
    }


    /**
     * Gets the payment_terms value for this InvoiceParamsOutD.
     * 
     * @return payment_terms
     */
    public java.lang.String getPayment_terms() {
        return payment_terms;
    }


    /**
     * Sets the payment_terms value for this InvoiceParamsOutD.
     * 
     * @param payment_terms
     */
    public void setPayment_terms(java.lang.String payment_terms) {
        this.payment_terms = payment_terms;
    }


    /**
     * Gets the items value for this InvoiceParamsOutD.
     * 
     * @return items
     */
    public ItemsOut[] getItems() {
        return items;
    }


    /**
     * Sets the items value for this InvoiceParamsOutD.
     * 
     * @param items
     */
    public void setItems(ItemsOut[] items) {
        this.items = items;
    }


    /**
     * Gets the customer_address1 value for this InvoiceParamsOutD.
     * 
     * @return customer_address1
     */
    public java.lang.String getCustomer_address1() {
        return customer_address1;
    }


    /**
     * Sets the customer_address1 value for this InvoiceParamsOutD.
     * 
     * @param customer_address1
     */
    public void setCustomer_address1(java.lang.String customer_address1) {
        this.customer_address1 = customer_address1;
    }


    /**
     * Gets the actions value for this InvoiceParamsOutD.
     * 
     * @return actions
     */
    public InvoiceActionParamsOut[] getActions() {
        return actions;
    }


    /**
     * Sets the actions value for this InvoiceParamsOutD.
     * 
     * @param actions
     */
    public void setActions(InvoiceActionParamsOut[] actions) {
        this.actions = actions;
    }


    /**
     * Gets the customer_contact_p value for this InvoiceParamsOutD.
     * 
     * @return customer_contact_p
     */
    public java.lang.String getCustomer_contact_p() {
        return customer_contact_p;
    }


    /**
     * Sets the customer_contact_p value for this InvoiceParamsOutD.
     * 
     * @param customer_contact_p
     */
    public void setCustomer_contact_p(java.lang.String customer_contact_p) {
        this.customer_contact_p = customer_contact_p;
    }


    /**
     * Gets the customer_post_code value for this InvoiceParamsOutD.
     * 
     * @return customer_post_code
     */
    public java.lang.String getCustomer_post_code() {
        return customer_post_code;
    }


    /**
     * Sets the customer_post_code value for this InvoiceParamsOutD.
     * 
     * @param customer_post_code
     */
    public void setCustomer_post_code(java.lang.String customer_post_code) {
        this.customer_post_code = customer_post_code;
    }


    /**
     * Gets the customer_ovt value for this InvoiceParamsOutD.
     * 
     * @return customer_ovt
     */
    public java.lang.String getCustomer_ovt() {
        return customer_ovt;
    }


    /**
     * Sets the customer_ovt value for this InvoiceParamsOutD.
     * 
     * @param customer_ovt
     */
    public void setCustomer_ovt(java.lang.String customer_ovt) {
        this.customer_ovt = customer_ovt;
    }


    /**
     * Gets the work_order_nr value for this InvoiceParamsOutD.
     * 
     * @return work_order_nr
     */
    public java.lang.String getWork_order_nr() {
        return work_order_nr;
    }


    /**
     * Sets the work_order_nr value for this InvoiceParamsOutD.
     * 
     * @param work_order_nr
     */
    public void setWork_order_nr(java.lang.String work_order_nr) {
        this.work_order_nr = work_order_nr;
    }


    /**
     * Gets the customer_address2 value for this InvoiceParamsOutD.
     * 
     * @return customer_address2
     */
    public java.lang.String getCustomer_address2() {
        return customer_address2;
    }


    /**
     * Sets the customer_address2 value for this InvoiceParamsOutD.
     * 
     * @param customer_address2
     */
    public void setCustomer_address2(java.lang.String customer_address2) {
        this.customer_address2 = customer_address2;
    }


    /**
     * Gets the company_comment value for this InvoiceParamsOutD.
     * 
     * @return company_comment
     */
    public java.lang.String getCompany_comment() {
        return company_comment;
    }


    /**
     * Sets the company_comment value for this InvoiceParamsOutD.
     * 
     * @param company_comment
     */
    public void setCompany_comment(java.lang.String company_comment) {
        this.company_comment = company_comment;
    }


    /**
     * Gets the error_message value for this InvoiceParamsOutD.
     * 
     * @return error_message
     */
    public java.lang.String getError_message() {
        return error_message;
    }


    /**
     * Sets the error_message value for this InvoiceParamsOutD.
     * 
     * @param error_message
     */
    public void setError_message(java.lang.String error_message) {
        this.error_message = error_message;
    }


    /**
     * Gets the state value for this InvoiceParamsOutD.
     * 
     * @return state
     */
    public int getState() {
        return state;
    }


    /**
     * Sets the state value for this InvoiceParamsOutD.
     * 
     * @param state
     */
    public void setState(int state) {
        this.state = state;
    }


    /**
     * Gets the customer_name value for this InvoiceParamsOutD.
     * 
     * @return customer_name
     */
    public java.lang.String getCustomer_name() {
        return customer_name;
    }


    /**
     * Sets the customer_name value for this InvoiceParamsOutD.
     * 
     * @param customer_name
     */
    public void setCustomer_name(java.lang.String customer_name) {
        this.customer_name = customer_name;
    }


    /**
     * Gets the data value for this InvoiceParamsOutD.
     * 
     * @return data
     */
    public java.lang.String getData() {
        return data;
    }


    /**
     * Sets the data value for this InvoiceParamsOutD.
     * 
     * @param data
     */
    public void setData(java.lang.String data) {
        this.data = data;
    }


    /**
     * Gets the attachments value for this InvoiceParamsOutD.
     * 
     * @return attachments
     */
    public FileAttachment[] getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this InvoiceParamsOutD.
     * 
     * @param attachments
     */
    public void setAttachments(FileAttachment[] attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the company_reference value for this InvoiceParamsOutD.
     * 
     * @return company_reference
     */
    public java.lang.String getCompany_reference() {
        return company_reference;
    }


    /**
     * Sets the company_reference value for this InvoiceParamsOutD.
     * 
     * @param company_reference
     */
    public void setCompany_reference(java.lang.String company_reference) {
        this.company_reference = company_reference;
    }


    /**
     * Gets the customer_country value for this InvoiceParamsOutD.
     * 
     * @return customer_country
     */
    public java.lang.String getCustomer_country() {
        return customer_country;
    }


    /**
     * Sets the customer_country value for this InvoiceParamsOutD.
     * 
     * @param customer_country
     */
    public void setCustomer_country(java.lang.String customer_country) {
        this.customer_country = customer_country;
    }


    /**
     * Gets the currency value for this InvoiceParamsOutD.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this InvoiceParamsOutD.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the customer_state value for this InvoiceParamsOutD.
     * 
     * @return customer_state
     */
    public java.lang.String getCustomer_state() {
        return customer_state;
    }


    /**
     * Sets the customer_state value for this InvoiceParamsOutD.
     * 
     * @param customer_state
     */
    public void setCustomer_state(java.lang.String customer_state) {
        this.customer_state = customer_state;
    }


    /**
     * Gets the invoice_delivery_address value for this InvoiceParamsOutD.
     * 
     * @return invoice_delivery_address
     */
    public InvoiceDeliveryAddressOut getInvoice_delivery_address() {
        return invoice_delivery_address;
    }


    /**
     * Sets the invoice_delivery_address value for this InvoiceParamsOutD.
     * 
     * @param invoice_delivery_address
     */
    public void setInvoice_delivery_address(InvoiceDeliveryAddressOut invoice_delivery_address) {
        this.invoice_delivery_address = invoice_delivery_address;
    }


    /**
     * Gets the notes value for this InvoiceParamsOutD.
     * 
     * @return notes
     */
    public java.lang.String getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this InvoiceParamsOutD.
     * 
     * @param notes
     */
    public void setNotes(java.lang.String notes) {
        this.notes = notes;
    }


    /**
     * Gets the company_reminder value for this InvoiceParamsOutD.
     * 
     * @return company_reminder
     */
    public java.lang.String getCompany_reminder() {
        return company_reminder;
    }


    /**
     * Sets the company_reminder value for this InvoiceParamsOutD.
     * 
     * @param company_reminder
     */
    public void setCompany_reminder(java.lang.String company_reminder) {
        this.company_reminder = company_reminder;
    }


    /**
     * Gets the invoice_nr value for this InvoiceParamsOutD.
     * 
     * @return invoice_nr
     */
    public java.lang.String getInvoice_nr() {
        return invoice_nr;
    }


    /**
     * Sets the invoice_nr value for this InvoiceParamsOutD.
     * 
     * @param invoice_nr
     */
    public void setInvoice_nr(java.lang.String invoice_nr) {
        this.invoice_nr = invoice_nr;
    }


    /**
     * Gets the date value for this InvoiceParamsOutD.
     * 
     * @return date
     */
    public java.lang.String getDate() {
        return date;
    }


    /**
     * Sets the date value for this InvoiceParamsOutD.
     * 
     * @param date
     */
    public void setDate(java.lang.String date) {
        this.date = date;
    }


    /**
     * Gets the invoice_seller_information value for this InvoiceParamsOutD.
     * 
     * @return invoice_seller_information
     */
    public InvoiceSellerInformationOut getInvoice_seller_information() {
        return invoice_seller_information;
    }


    /**
     * Sets the invoice_seller_information value for this InvoiceParamsOutD.
     * 
     * @param invoice_seller_information
     */
    public void setInvoice_seller_information(InvoiceSellerInformationOut invoice_seller_information) {
        this.invoice_seller_information = invoice_seller_information;
    }


    /**
     * Gets the customer_nr value for this InvoiceParamsOutD.
     * 
     * @return customer_nr
     */
    public java.lang.String getCustomer_nr() {
        return customer_nr;
    }


    /**
     * Sets the customer_nr value for this InvoiceParamsOutD.
     * 
     * @param customer_nr
     */
    public void setCustomer_nr(java.lang.String customer_nr) {
        this.customer_nr = customer_nr;
    }


    /**
     * Gets the delivery_type value for this InvoiceParamsOutD.
     * 
     * @return delivery_type
     */
    public java.lang.String getDelivery_type() {
        return delivery_type;
    }


    /**
     * Sets the delivery_type value for this InvoiceParamsOutD.
     * 
     * @param delivery_type
     */
    public void setDelivery_type(java.lang.String delivery_type) {
        this.delivery_type = delivery_type;
    }


    /**
     * Gets the company_interest value for this InvoiceParamsOutD.
     * 
     * @return company_interest
     */
    public java.lang.String getCompany_interest() {
        return company_interest;
    }


    /**
     * Sets the company_interest value for this InvoiceParamsOutD.
     * 
     * @param company_interest
     */
    public void setCompany_interest(java.lang.String company_interest) {
        this.company_interest = company_interest;
    }


    /**
     * Gets the customer_email value for this InvoiceParamsOutD.
     * 
     * @return customer_email
     */
    public java.lang.String getCustomer_email() {
        return customer_email;
    }


    /**
     * Sets the customer_email value for this InvoiceParamsOutD.
     * 
     * @param customer_email
     */
    public void setCustomer_email(java.lang.String customer_email) {
        this.customer_email = customer_email;
    }


    /**
     * Gets the accounts value for this InvoiceParamsOutD.
     * 
     * @return accounts
     */
    public InvoiceAccountParamsOut[] getAccounts() {
        return accounts;
    }


    /**
     * Sets the accounts value for this InvoiceParamsOutD.
     * 
     * @param accounts
     */
    public void setAccounts(InvoiceAccountParamsOut[] accounts) {
        this.accounts = accounts;
    }


    /**
     * Gets the customer_reference value for this InvoiceParamsOutD.
     * 
     * @return customer_reference
     */
    public java.lang.String getCustomer_reference() {
        return customer_reference;
    }


    /**
     * Sets the customer_reference value for this InvoiceParamsOutD.
     * 
     * @param customer_reference
     */
    public void setCustomer_reference(java.lang.String customer_reference) {
        this.customer_reference = customer_reference;
    }


    /**
     * Gets the reference_nr value for this InvoiceParamsOutD.
     * 
     * @return reference_nr
     */
    public java.lang.String getReference_nr() {
        return reference_nr;
    }


    /**
     * Sets the reference_nr value for this InvoiceParamsOutD.
     * 
     * @param reference_nr
     */
    public void setReference_nr(java.lang.String reference_nr) {
        this.reference_nr = reference_nr;
    }


    /**
     * Gets the sum value for this InvoiceParamsOutD.
     * 
     * @return sum
     */
    public java.lang.String getSum() {
        return sum;
    }


    /**
     * Sets the sum value for this InvoiceParamsOutD.
     * 
     * @param sum
     */
    public void setSum(java.lang.String sum) {
        this.sum = sum;
    }


    /**
     * Gets the id value for this InvoiceParamsOutD.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this InvoiceParamsOutD.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the order_nr value for this InvoiceParamsOutD.
     * 
     * @return order_nr
     */
    public java.lang.String getOrder_nr() {
        return order_nr;
    }


    /**
     * Sets the order_nr value for this InvoiceParamsOutD.
     * 
     * @param order_nr
     */
    public void setOrder_nr(java.lang.String order_nr) {
        this.order_nr = order_nr;
    }


    /**
     * Gets the company_paper_fee value for this InvoiceParamsOutD.
     * 
     * @return company_paper_fee
     */
    public java.lang.String getCompany_paper_fee() {
        return company_paper_fee;
    }


    /**
     * Sets the company_paper_fee value for this InvoiceParamsOutD.
     * 
     * @param company_paper_fee
     */
    public void setCompany_paper_fee(java.lang.String company_paper_fee) {
        this.company_paper_fee = company_paper_fee;
    }


    /**
     * Gets the sum_tax value for this InvoiceParamsOutD.
     * 
     * @return sum_tax
     */
    public java.lang.String getSum_tax() {
        return sum_tax;
    }


    /**
     * Sets the sum_tax value for this InvoiceParamsOutD.
     * 
     * @param sum_tax
     */
    public void setSum_tax(java.lang.String sum_tax) {
        this.sum_tax = sum_tax;
    }


    /**
     * Gets the customer_comment value for this InvoiceParamsOutD.
     * 
     * @return customer_comment
     */
    public java.lang.String getCustomer_comment() {
        return customer_comment;
    }


    /**
     * Sets the customer_comment value for this InvoiceParamsOutD.
     * 
     * @param customer_comment
     */
    public void setCustomer_comment(java.lang.String customer_comment) {
        this.customer_comment = customer_comment;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InvoiceParamsOutD)) return false;
        InvoiceParamsOutD other = (InvoiceParamsOutD) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customer_post_office==null && other.getCustomer_post_office()==null) || 
             (this.customer_post_office!=null &&
              this.customer_post_office.equals(other.getCustomer_post_office()))) &&
            ((this.date_due==null && other.getDate_due()==null) || 
             (this.date_due!=null &&
              this.date_due.equals(other.getDate_due()))) &&
            ((this.delivery_date==null && other.getDelivery_date()==null) || 
             (this.delivery_date!=null &&
              this.delivery_date.equals(other.getDelivery_date()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.lang==null && other.getLang()==null) || 
             (this.lang!=null &&
              this.lang.equals(other.getLang()))) &&
            ((this.customer_bid==null && other.getCustomer_bid()==null) || 
             (this.customer_bid!=null &&
              this.customer_bid.equals(other.getCustomer_bid()))) &&
            ((this.payment_terms==null && other.getPayment_terms()==null) || 
             (this.payment_terms!=null &&
              this.payment_terms.equals(other.getPayment_terms()))) &&
            ((this.items==null && other.getItems()==null) || 
             (this.items!=null &&
              java.util.Arrays.equals(this.items, other.getItems()))) &&
            ((this.customer_address1==null && other.getCustomer_address1()==null) || 
             (this.customer_address1!=null &&
              this.customer_address1.equals(other.getCustomer_address1()))) &&
            ((this.actions==null && other.getActions()==null) || 
             (this.actions!=null &&
              java.util.Arrays.equals(this.actions, other.getActions()))) &&
            ((this.customer_contact_p==null && other.getCustomer_contact_p()==null) || 
             (this.customer_contact_p!=null &&
              this.customer_contact_p.equals(other.getCustomer_contact_p()))) &&
            ((this.customer_post_code==null && other.getCustomer_post_code()==null) || 
             (this.customer_post_code!=null &&
              this.customer_post_code.equals(other.getCustomer_post_code()))) &&
            ((this.customer_ovt==null && other.getCustomer_ovt()==null) || 
             (this.customer_ovt!=null &&
              this.customer_ovt.equals(other.getCustomer_ovt()))) &&
            ((this.work_order_nr==null && other.getWork_order_nr()==null) || 
             (this.work_order_nr!=null &&
              this.work_order_nr.equals(other.getWork_order_nr()))) &&
            ((this.customer_address2==null && other.getCustomer_address2()==null) || 
             (this.customer_address2!=null &&
              this.customer_address2.equals(other.getCustomer_address2()))) &&
            ((this.company_comment==null && other.getCompany_comment()==null) || 
             (this.company_comment!=null &&
              this.company_comment.equals(other.getCompany_comment()))) &&
            ((this.error_message==null && other.getError_message()==null) || 
             (this.error_message!=null &&
              this.error_message.equals(other.getError_message()))) &&
            this.state == other.getState() &&
            ((this.customer_name==null && other.getCustomer_name()==null) || 
             (this.customer_name!=null &&
              this.customer_name.equals(other.getCustomer_name()))) &&
            ((this.data==null && other.getData()==null) || 
             (this.data!=null &&
              this.data.equals(other.getData()))) &&
            ((this.attachments==null && other.getAttachments()==null) || 
             (this.attachments!=null &&
              java.util.Arrays.equals(this.attachments, other.getAttachments()))) &&
            ((this.company_reference==null && other.getCompany_reference()==null) || 
             (this.company_reference!=null &&
              this.company_reference.equals(other.getCompany_reference()))) &&
            ((this.customer_country==null && other.getCustomer_country()==null) || 
             (this.customer_country!=null &&
              this.customer_country.equals(other.getCustomer_country()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.customer_state==null && other.getCustomer_state()==null) || 
             (this.customer_state!=null &&
              this.customer_state.equals(other.getCustomer_state()))) &&
            ((this.invoice_delivery_address==null && other.getInvoice_delivery_address()==null) || 
             (this.invoice_delivery_address!=null &&
              this.invoice_delivery_address.equals(other.getInvoice_delivery_address()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.company_reminder==null && other.getCompany_reminder()==null) || 
             (this.company_reminder!=null &&
              this.company_reminder.equals(other.getCompany_reminder()))) &&
            ((this.invoice_nr==null && other.getInvoice_nr()==null) || 
             (this.invoice_nr!=null &&
              this.invoice_nr.equals(other.getInvoice_nr()))) &&
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.invoice_seller_information==null && other.getInvoice_seller_information()==null) || 
             (this.invoice_seller_information!=null &&
              this.invoice_seller_information.equals(other.getInvoice_seller_information()))) &&
            ((this.customer_nr==null && other.getCustomer_nr()==null) || 
             (this.customer_nr!=null &&
              this.customer_nr.equals(other.getCustomer_nr()))) &&
            ((this.delivery_type==null && other.getDelivery_type()==null) || 
             (this.delivery_type!=null &&
              this.delivery_type.equals(other.getDelivery_type()))) &&
            ((this.company_interest==null && other.getCompany_interest()==null) || 
             (this.company_interest!=null &&
              this.company_interest.equals(other.getCompany_interest()))) &&
            ((this.customer_email==null && other.getCustomer_email()==null) || 
             (this.customer_email!=null &&
              this.customer_email.equals(other.getCustomer_email()))) &&
            ((this.accounts==null && other.getAccounts()==null) || 
             (this.accounts!=null &&
              java.util.Arrays.equals(this.accounts, other.getAccounts()))) &&
            ((this.customer_reference==null && other.getCustomer_reference()==null) || 
             (this.customer_reference!=null &&
              this.customer_reference.equals(other.getCustomer_reference()))) &&
            ((this.reference_nr==null && other.getReference_nr()==null) || 
             (this.reference_nr!=null &&
              this.reference_nr.equals(other.getReference_nr()))) &&
            ((this.sum==null && other.getSum()==null) || 
             (this.sum!=null &&
              this.sum.equals(other.getSum()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.order_nr==null && other.getOrder_nr()==null) || 
             (this.order_nr!=null &&
              this.order_nr.equals(other.getOrder_nr()))) &&
            ((this.company_paper_fee==null && other.getCompany_paper_fee()==null) || 
             (this.company_paper_fee!=null &&
              this.company_paper_fee.equals(other.getCompany_paper_fee()))) &&
            ((this.sum_tax==null && other.getSum_tax()==null) || 
             (this.sum_tax!=null &&
              this.sum_tax.equals(other.getSum_tax()))) &&
            ((this.customer_comment==null && other.getCustomer_comment()==null) || 
             (this.customer_comment!=null &&
              this.customer_comment.equals(other.getCustomer_comment())));
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
        if (getCustomer_post_office() != null) {
            _hashCode += getCustomer_post_office().hashCode();
        }
        if (getDate_due() != null) {
            _hashCode += getDate_due().hashCode();
        }
        if (getDelivery_date() != null) {
            _hashCode += getDelivery_date().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getLang() != null) {
            _hashCode += getLang().hashCode();
        }
        if (getCustomer_bid() != null) {
            _hashCode += getCustomer_bid().hashCode();
        }
        if (getPayment_terms() != null) {
            _hashCode += getPayment_terms().hashCode();
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
        if (getCustomer_address1() != null) {
            _hashCode += getCustomer_address1().hashCode();
        }
        if (getActions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getActions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getActions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCustomer_contact_p() != null) {
            _hashCode += getCustomer_contact_p().hashCode();
        }
        if (getCustomer_post_code() != null) {
            _hashCode += getCustomer_post_code().hashCode();
        }
        if (getCustomer_ovt() != null) {
            _hashCode += getCustomer_ovt().hashCode();
        }
        if (getWork_order_nr() != null) {
            _hashCode += getWork_order_nr().hashCode();
        }
        if (getCustomer_address2() != null) {
            _hashCode += getCustomer_address2().hashCode();
        }
        if (getCompany_comment() != null) {
            _hashCode += getCompany_comment().hashCode();
        }
        if (getError_message() != null) {
            _hashCode += getError_message().hashCode();
        }
        _hashCode += getState();
        if (getCustomer_name() != null) {
            _hashCode += getCustomer_name().hashCode();
        }
        if (getData() != null) {
            _hashCode += getData().hashCode();
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
        if (getCustomer_country() != null) {
            _hashCode += getCustomer_country().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getCustomer_state() != null) {
            _hashCode += getCustomer_state().hashCode();
        }
        if (getInvoice_delivery_address() != null) {
            _hashCode += getInvoice_delivery_address().hashCode();
        }
        if (getNotes() != null) {
            _hashCode += getNotes().hashCode();
        }
        if (getCompany_reminder() != null) {
            _hashCode += getCompany_reminder().hashCode();
        }
        if (getInvoice_nr() != null) {
            _hashCode += getInvoice_nr().hashCode();
        }
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getInvoice_seller_information() != null) {
            _hashCode += getInvoice_seller_information().hashCode();
        }
        if (getCustomer_nr() != null) {
            _hashCode += getCustomer_nr().hashCode();
        }
        if (getDelivery_type() != null) {
            _hashCode += getDelivery_type().hashCode();
        }
        if (getCompany_interest() != null) {
            _hashCode += getCompany_interest().hashCode();
        }
        if (getCustomer_email() != null) {
            _hashCode += getCustomer_email().hashCode();
        }
        if (getAccounts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAccounts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAccounts(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCustomer_reference() != null) {
            _hashCode += getCustomer_reference().hashCode();
        }
        if (getReference_nr() != null) {
            _hashCode += getReference_nr().hashCode();
        }
        if (getSum() != null) {
            _hashCode += getSum().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getOrder_nr() != null) {
            _hashCode += getOrder_nr().hashCode();
        }
        if (getCompany_paper_fee() != null) {
            _hashCode += getCompany_paper_fee().hashCode();
        }
        if (getSum_tax() != null) {
            _hashCode += getSum_tax().hashCode();
        }
        if (getCustomer_comment() != null) {
            _hashCode += getCustomer_comment().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InvoiceParamsOutD.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://secure.maventa.com/", "InvoiceParamsOutD"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customer_post_office");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customer_post_office"));
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
        elemField.setFieldName("delivery_date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "delivery_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lang");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lang"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customer_bid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customer_bid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payment_terms");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payment_terms"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("items");
        elemField.setXmlName(new javax.xml.namespace.QName("", "items"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://secure.maventa.com/", "ItemsOut"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customer_address1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customer_address1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "actions"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://secure.maventa.com/", "InvoiceActionParamsOut"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customer_contact_p");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customer_contact_p"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customer_post_code");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customer_post_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customer_ovt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customer_ovt"));
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
        elemField.setFieldName("customer_address2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customer_address2"));
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
        elemField.setFieldName("error_message");
        elemField.setXmlName(new javax.xml.namespace.QName("", "error_message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customer_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customer_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("data");
        elemField.setXmlName(new javax.xml.namespace.QName("", "data"));
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
        elemField.setFieldName("customer_country");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customer_country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customer_state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customer_state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoice_delivery_address");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invoice_delivery_address"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://secure.maventa.com/", "InvoiceDeliveryAddressOut"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notes"));
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
        elemField.setFieldName("invoice_nr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invoice_nr"));
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
        elemField.setFieldName("invoice_seller_information");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invoice_seller_information"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://secure.maventa.com/", "InvoiceSellerInformationOut"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customer_nr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customer_nr"));
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
        elemField.setFieldName("company_interest");
        elemField.setXmlName(new javax.xml.namespace.QName("", "company_interest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customer_email");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customer_email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accounts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accounts"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://secure.maventa.com/", "InvoiceAccountParamsOut"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customer_reference");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customer_reference"));
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
        elemField.setFieldName("sum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sum"));
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
        elemField.setFieldName("order_nr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "order_nr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("company_paper_fee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "company_paper_fee"));
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
        elemField.setFieldName("customer_comment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customer_comment"));
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

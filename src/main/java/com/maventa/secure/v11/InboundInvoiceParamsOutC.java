/**
 * InboundInvoiceParamsOutC.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.maventa.secure.v11;

public class InboundInvoiceParamsOutC  implements java.io.Serializable {
    private java.lang.String company_post_code;

    private java.lang.String customer_post_office;

    private java.lang.String date_due;

    private java.lang.String delivery_date;

    private java.lang.String status;

    private java.lang.String lang;

    private java.lang.String customer_bid;

    private ItemsOut[] items;

    private java.lang.String company_city;

    private java.lang.String customer_address1;

    private java.lang.String user_phone;

    private java.lang.String payment_terms;

    private java.lang.String work_order_nr;

    private java.lang.String customer_contact_p;

    private java.lang.String customer_post_code;

    private java.lang.String customer_ovt;

    private java.lang.String company_bid;

    private java.lang.String company_post_office;

    private java.lang.String company_country;

    private java.lang.String customer_address2;

    private int state;

    private java.lang.String company_comment;

    private java.lang.String customer_name;

    private FileAttachment[] attachments;

    private java.lang.String company_reference;

    private java.lang.String user_name;

    private InvoiceDeliveryAddressOut invoice_delivery_address;

    private java.lang.String customer_country;

    private java.lang.String currency;

    private java.lang.String customer_state;

    private java.lang.String company_fax;

    private java.lang.String user_email;

    private java.lang.String notes;

    private java.lang.String invoice_nr;

    private java.lang.String date;

    private java.lang.String company_reminder;

    private java.lang.String company_interest;

    private java.lang.String company_email;

    private java.lang.String customer_nr;

    private java.lang.String delivery_type;

    private InvoiceSellerInformationOut invoice_seller_information;

    private java.lang.String company_address1;

    private java.lang.String customer_email;

    private java.lang.String company_state;

    private java.lang.String company_paper_fee;

    private java.lang.String company_name;

    private java.lang.String reference_nr;

    private java.lang.String sum;

    private java.lang.String id;

    private java.lang.String order_nr;

    private java.lang.String customer_reference;

    private java.lang.String company_phone;

    private InvoiceAccountParamsOut[] accounts;

    private java.lang.String company_gsm;

    private java.lang.String sum_tax;

    private java.lang.String company_address2;

    private java.lang.String company_website;

    public InboundInvoiceParamsOutC() {
    }

    public InboundInvoiceParamsOutC(
           java.lang.String company_post_code,
           java.lang.String customer_post_office,
           java.lang.String date_due,
           java.lang.String delivery_date,
           java.lang.String status,
           java.lang.String lang,
           java.lang.String customer_bid,
           ItemsOut[] items,
           java.lang.String company_city,
           java.lang.String customer_address1,
           java.lang.String user_phone,
           java.lang.String payment_terms,
           java.lang.String work_order_nr,
           java.lang.String customer_contact_p,
           java.lang.String customer_post_code,
           java.lang.String customer_ovt,
           java.lang.String company_bid,
           java.lang.String company_post_office,
           java.lang.String company_country,
           java.lang.String customer_address2,
           int state,
           java.lang.String company_comment,
           java.lang.String customer_name,
           FileAttachment[] attachments,
           java.lang.String company_reference,
           java.lang.String user_name,
           InvoiceDeliveryAddressOut invoice_delivery_address,
           java.lang.String customer_country,
           java.lang.String currency,
           java.lang.String customer_state,
           java.lang.String company_fax,
           java.lang.String user_email,
           java.lang.String notes,
           java.lang.String invoice_nr,
           java.lang.String date,
           java.lang.String company_reminder,
           java.lang.String company_interest,
           java.lang.String company_email,
           java.lang.String customer_nr,
           java.lang.String delivery_type,
           InvoiceSellerInformationOut invoice_seller_information,
           java.lang.String company_address1,
           java.lang.String customer_email,
           java.lang.String company_state,
           java.lang.String company_paper_fee,
           java.lang.String company_name,
           java.lang.String reference_nr,
           java.lang.String sum,
           java.lang.String id,
           java.lang.String order_nr,
           java.lang.String customer_reference,
           java.lang.String company_phone,
           InvoiceAccountParamsOut[] accounts,
           java.lang.String company_gsm,
           java.lang.String sum_tax,
           java.lang.String company_address2,
           java.lang.String company_website) {
           this.company_post_code = company_post_code;
           this.customer_post_office = customer_post_office;
           this.date_due = date_due;
           this.delivery_date = delivery_date;
           this.status = status;
           this.lang = lang;
           this.customer_bid = customer_bid;
           this.items = items;
           this.company_city = company_city;
           this.customer_address1 = customer_address1;
           this.user_phone = user_phone;
           this.payment_terms = payment_terms;
           this.work_order_nr = work_order_nr;
           this.customer_contact_p = customer_contact_p;
           this.customer_post_code = customer_post_code;
           this.customer_ovt = customer_ovt;
           this.company_bid = company_bid;
           this.company_post_office = company_post_office;
           this.company_country = company_country;
           this.customer_address2 = customer_address2;
           this.state = state;
           this.company_comment = company_comment;
           this.customer_name = customer_name;
           this.attachments = attachments;
           this.company_reference = company_reference;
           this.user_name = user_name;
           this.invoice_delivery_address = invoice_delivery_address;
           this.customer_country = customer_country;
           this.currency = currency;
           this.customer_state = customer_state;
           this.company_fax = company_fax;
           this.user_email = user_email;
           this.notes = notes;
           this.invoice_nr = invoice_nr;
           this.date = date;
           this.company_reminder = company_reminder;
           this.company_interest = company_interest;
           this.company_email = company_email;
           this.customer_nr = customer_nr;
           this.delivery_type = delivery_type;
           this.invoice_seller_information = invoice_seller_information;
           this.company_address1 = company_address1;
           this.customer_email = customer_email;
           this.company_state = company_state;
           this.company_paper_fee = company_paper_fee;
           this.company_name = company_name;
           this.reference_nr = reference_nr;
           this.sum = sum;
           this.id = id;
           this.order_nr = order_nr;
           this.customer_reference = customer_reference;
           this.company_phone = company_phone;
           this.accounts = accounts;
           this.company_gsm = company_gsm;
           this.sum_tax = sum_tax;
           this.company_address2 = company_address2;
           this.company_website = company_website;
    }


    /**
     * Gets the company_post_code value for this InboundInvoiceParamsOutC.
     * 
     * @return company_post_code
     */
    public java.lang.String getCompany_post_code() {
        return company_post_code;
    }


    /**
     * Sets the company_post_code value for this InboundInvoiceParamsOutC.
     * 
     * @param company_post_code
     */
    public void setCompany_post_code(java.lang.String company_post_code) {
        this.company_post_code = company_post_code;
    }


    /**
     * Gets the customer_post_office value for this InboundInvoiceParamsOutC.
     * 
     * @return customer_post_office
     */
    public java.lang.String getCustomer_post_office() {
        return customer_post_office;
    }


    /**
     * Sets the customer_post_office value for this InboundInvoiceParamsOutC.
     * 
     * @param customer_post_office
     */
    public void setCustomer_post_office(java.lang.String customer_post_office) {
        this.customer_post_office = customer_post_office;
    }


    /**
     * Gets the date_due value for this InboundInvoiceParamsOutC.
     * 
     * @return date_due
     */
    public java.lang.String getDate_due() {
        return date_due;
    }


    /**
     * Sets the date_due value for this InboundInvoiceParamsOutC.
     * 
     * @param date_due
     */
    public void setDate_due(java.lang.String date_due) {
        this.date_due = date_due;
    }


    /**
     * Gets the delivery_date value for this InboundInvoiceParamsOutC.
     * 
     * @return delivery_date
     */
    public java.lang.String getDelivery_date() {
        return delivery_date;
    }


    /**
     * Sets the delivery_date value for this InboundInvoiceParamsOutC.
     * 
     * @param delivery_date
     */
    public void setDelivery_date(java.lang.String delivery_date) {
        this.delivery_date = delivery_date;
    }


    /**
     * Gets the status value for this InboundInvoiceParamsOutC.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this InboundInvoiceParamsOutC.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the lang value for this InboundInvoiceParamsOutC.
     * 
     * @return lang
     */
    public java.lang.String getLang() {
        return lang;
    }


    /**
     * Sets the lang value for this InboundInvoiceParamsOutC.
     * 
     * @param lang
     */
    public void setLang(java.lang.String lang) {
        this.lang = lang;
    }


    /**
     * Gets the customer_bid value for this InboundInvoiceParamsOutC.
     * 
     * @return customer_bid
     */
    public java.lang.String getCustomer_bid() {
        return customer_bid;
    }


    /**
     * Sets the customer_bid value for this InboundInvoiceParamsOutC.
     * 
     * @param customer_bid
     */
    public void setCustomer_bid(java.lang.String customer_bid) {
        this.customer_bid = customer_bid;
    }


    /**
     * Gets the items value for this InboundInvoiceParamsOutC.
     * 
     * @return items
     */
    public ItemsOut[] getItems() {
        return items;
    }


    /**
     * Sets the items value for this InboundInvoiceParamsOutC.
     * 
     * @param items
     */
    public void setItems(ItemsOut[] items) {
        this.items = items;
    }


    /**
     * Gets the company_city value for this InboundInvoiceParamsOutC.
     * 
     * @return company_city
     */
    public java.lang.String getCompany_city() {
        return company_city;
    }


    /**
     * Sets the company_city value for this InboundInvoiceParamsOutC.
     * 
     * @param company_city
     */
    public void setCompany_city(java.lang.String company_city) {
        this.company_city = company_city;
    }


    /**
     * Gets the customer_address1 value for this InboundInvoiceParamsOutC.
     * 
     * @return customer_address1
     */
    public java.lang.String getCustomer_address1() {
        return customer_address1;
    }


    /**
     * Sets the customer_address1 value for this InboundInvoiceParamsOutC.
     * 
     * @param customer_address1
     */
    public void setCustomer_address1(java.lang.String customer_address1) {
        this.customer_address1 = customer_address1;
    }


    /**
     * Gets the user_phone value for this InboundInvoiceParamsOutC.
     * 
     * @return user_phone
     */
    public java.lang.String getUser_phone() {
        return user_phone;
    }


    /**
     * Sets the user_phone value for this InboundInvoiceParamsOutC.
     * 
     * @param user_phone
     */
    public void setUser_phone(java.lang.String user_phone) {
        this.user_phone = user_phone;
    }


    /**
     * Gets the payment_terms value for this InboundInvoiceParamsOutC.
     * 
     * @return payment_terms
     */
    public java.lang.String getPayment_terms() {
        return payment_terms;
    }


    /**
     * Sets the payment_terms value for this InboundInvoiceParamsOutC.
     * 
     * @param payment_terms
     */
    public void setPayment_terms(java.lang.String payment_terms) {
        this.payment_terms = payment_terms;
    }


    /**
     * Gets the work_order_nr value for this InboundInvoiceParamsOutC.
     * 
     * @return work_order_nr
     */
    public java.lang.String getWork_order_nr() {
        return work_order_nr;
    }


    /**
     * Sets the work_order_nr value for this InboundInvoiceParamsOutC.
     * 
     * @param work_order_nr
     */
    public void setWork_order_nr(java.lang.String work_order_nr) {
        this.work_order_nr = work_order_nr;
    }


    /**
     * Gets the customer_contact_p value for this InboundInvoiceParamsOutC.
     * 
     * @return customer_contact_p
     */
    public java.lang.String getCustomer_contact_p() {
        return customer_contact_p;
    }


    /**
     * Sets the customer_contact_p value for this InboundInvoiceParamsOutC.
     * 
     * @param customer_contact_p
     */
    public void setCustomer_contact_p(java.lang.String customer_contact_p) {
        this.customer_contact_p = customer_contact_p;
    }


    /**
     * Gets the customer_post_code value for this InboundInvoiceParamsOutC.
     * 
     * @return customer_post_code
     */
    public java.lang.String getCustomer_post_code() {
        return customer_post_code;
    }


    /**
     * Sets the customer_post_code value for this InboundInvoiceParamsOutC.
     * 
     * @param customer_post_code
     */
    public void setCustomer_post_code(java.lang.String customer_post_code) {
        this.customer_post_code = customer_post_code;
    }


    /**
     * Gets the customer_ovt value for this InboundInvoiceParamsOutC.
     * 
     * @return customer_ovt
     */
    public java.lang.String getCustomer_ovt() {
        return customer_ovt;
    }


    /**
     * Sets the customer_ovt value for this InboundInvoiceParamsOutC.
     * 
     * @param customer_ovt
     */
    public void setCustomer_ovt(java.lang.String customer_ovt) {
        this.customer_ovt = customer_ovt;
    }


    /**
     * Gets the company_bid value for this InboundInvoiceParamsOutC.
     * 
     * @return company_bid
     */
    public java.lang.String getCompany_bid() {
        return company_bid;
    }


    /**
     * Sets the company_bid value for this InboundInvoiceParamsOutC.
     * 
     * @param company_bid
     */
    public void setCompany_bid(java.lang.String company_bid) {
        this.company_bid = company_bid;
    }


    /**
     * Gets the company_post_office value for this InboundInvoiceParamsOutC.
     * 
     * @return company_post_office
     */
    public java.lang.String getCompany_post_office() {
        return company_post_office;
    }


    /**
     * Sets the company_post_office value for this InboundInvoiceParamsOutC.
     * 
     * @param company_post_office
     */
    public void setCompany_post_office(java.lang.String company_post_office) {
        this.company_post_office = company_post_office;
    }


    /**
     * Gets the company_country value for this InboundInvoiceParamsOutC.
     * 
     * @return company_country
     */
    public java.lang.String getCompany_country() {
        return company_country;
    }


    /**
     * Sets the company_country value for this InboundInvoiceParamsOutC.
     * 
     * @param company_country
     */
    public void setCompany_country(java.lang.String company_country) {
        this.company_country = company_country;
    }


    /**
     * Gets the customer_address2 value for this InboundInvoiceParamsOutC.
     * 
     * @return customer_address2
     */
    public java.lang.String getCustomer_address2() {
        return customer_address2;
    }


    /**
     * Sets the customer_address2 value for this InboundInvoiceParamsOutC.
     * 
     * @param customer_address2
     */
    public void setCustomer_address2(java.lang.String customer_address2) {
        this.customer_address2 = customer_address2;
    }


    /**
     * Gets the state value for this InboundInvoiceParamsOutC.
     * 
     * @return state
     */
    public int getState() {
        return state;
    }


    /**
     * Sets the state value for this InboundInvoiceParamsOutC.
     * 
     * @param state
     */
    public void setState(int state) {
        this.state = state;
    }


    /**
     * Gets the company_comment value for this InboundInvoiceParamsOutC.
     * 
     * @return company_comment
     */
    public java.lang.String getCompany_comment() {
        return company_comment;
    }


    /**
     * Sets the company_comment value for this InboundInvoiceParamsOutC.
     * 
     * @param company_comment
     */
    public void setCompany_comment(java.lang.String company_comment) {
        this.company_comment = company_comment;
    }


    /**
     * Gets the customer_name value for this InboundInvoiceParamsOutC.
     * 
     * @return customer_name
     */
    public java.lang.String getCustomer_name() {
        return customer_name;
    }


    /**
     * Sets the customer_name value for this InboundInvoiceParamsOutC.
     * 
     * @param customer_name
     */
    public void setCustomer_name(java.lang.String customer_name) {
        this.customer_name = customer_name;
    }


    /**
     * Gets the attachments value for this InboundInvoiceParamsOutC.
     * 
     * @return attachments
     */
    public FileAttachment[] getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this InboundInvoiceParamsOutC.
     * 
     * @param attachments
     */
    public void setAttachments(FileAttachment[] attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the company_reference value for this InboundInvoiceParamsOutC.
     * 
     * @return company_reference
     */
    public java.lang.String getCompany_reference() {
        return company_reference;
    }


    /**
     * Sets the company_reference value for this InboundInvoiceParamsOutC.
     * 
     * @param company_reference
     */
    public void setCompany_reference(java.lang.String company_reference) {
        this.company_reference = company_reference;
    }


    /**
     * Gets the user_name value for this InboundInvoiceParamsOutC.
     * 
     * @return user_name
     */
    public java.lang.String getUser_name() {
        return user_name;
    }


    /**
     * Sets the user_name value for this InboundInvoiceParamsOutC.
     * 
     * @param user_name
     */
    public void setUser_name(java.lang.String user_name) {
        this.user_name = user_name;
    }


    /**
     * Gets the invoice_delivery_address value for this InboundInvoiceParamsOutC.
     * 
     * @return invoice_delivery_address
     */
    public InvoiceDeliveryAddressOut getInvoice_delivery_address() {
        return invoice_delivery_address;
    }


    /**
     * Sets the invoice_delivery_address value for this InboundInvoiceParamsOutC.
     * 
     * @param invoice_delivery_address
     */
    public void setInvoice_delivery_address(InvoiceDeliveryAddressOut invoice_delivery_address) {
        this.invoice_delivery_address = invoice_delivery_address;
    }


    /**
     * Gets the customer_country value for this InboundInvoiceParamsOutC.
     * 
     * @return customer_country
     */
    public java.lang.String getCustomer_country() {
        return customer_country;
    }


    /**
     * Sets the customer_country value for this InboundInvoiceParamsOutC.
     * 
     * @param customer_country
     */
    public void setCustomer_country(java.lang.String customer_country) {
        this.customer_country = customer_country;
    }


    /**
     * Gets the currency value for this InboundInvoiceParamsOutC.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this InboundInvoiceParamsOutC.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the customer_state value for this InboundInvoiceParamsOutC.
     * 
     * @return customer_state
     */
    public java.lang.String getCustomer_state() {
        return customer_state;
    }


    /**
     * Sets the customer_state value for this InboundInvoiceParamsOutC.
     * 
     * @param customer_state
     */
    public void setCustomer_state(java.lang.String customer_state) {
        this.customer_state = customer_state;
    }


    /**
     * Gets the company_fax value for this InboundInvoiceParamsOutC.
     * 
     * @return company_fax
     */
    public java.lang.String getCompany_fax() {
        return company_fax;
    }


    /**
     * Sets the company_fax value for this InboundInvoiceParamsOutC.
     * 
     * @param company_fax
     */
    public void setCompany_fax(java.lang.String company_fax) {
        this.company_fax = company_fax;
    }


    /**
     * Gets the user_email value for this InboundInvoiceParamsOutC.
     * 
     * @return user_email
     */
    public java.lang.String getUser_email() {
        return user_email;
    }


    /**
     * Sets the user_email value for this InboundInvoiceParamsOutC.
     * 
     * @param user_email
     */
    public void setUser_email(java.lang.String user_email) {
        this.user_email = user_email;
    }


    /**
     * Gets the notes value for this InboundInvoiceParamsOutC.
     * 
     * @return notes
     */
    public java.lang.String getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this InboundInvoiceParamsOutC.
     * 
     * @param notes
     */
    public void setNotes(java.lang.String notes) {
        this.notes = notes;
    }


    /**
     * Gets the invoice_nr value for this InboundInvoiceParamsOutC.
     * 
     * @return invoice_nr
     */
    public java.lang.String getInvoice_nr() {
        return invoice_nr;
    }


    /**
     * Sets the invoice_nr value for this InboundInvoiceParamsOutC.
     * 
     * @param invoice_nr
     */
    public void setInvoice_nr(java.lang.String invoice_nr) {
        this.invoice_nr = invoice_nr;
    }


    /**
     * Gets the date value for this InboundInvoiceParamsOutC.
     * 
     * @return date
     */
    public java.lang.String getDate() {
        return date;
    }


    /**
     * Sets the date value for this InboundInvoiceParamsOutC.
     * 
     * @param date
     */
    public void setDate(java.lang.String date) {
        this.date = date;
    }


    /**
     * Gets the company_reminder value for this InboundInvoiceParamsOutC.
     * 
     * @return company_reminder
     */
    public java.lang.String getCompany_reminder() {
        return company_reminder;
    }


    /**
     * Sets the company_reminder value for this InboundInvoiceParamsOutC.
     * 
     * @param company_reminder
     */
    public void setCompany_reminder(java.lang.String company_reminder) {
        this.company_reminder = company_reminder;
    }


    /**
     * Gets the company_interest value for this InboundInvoiceParamsOutC.
     * 
     * @return company_interest
     */
    public java.lang.String getCompany_interest() {
        return company_interest;
    }


    /**
     * Sets the company_interest value for this InboundInvoiceParamsOutC.
     * 
     * @param company_interest
     */
    public void setCompany_interest(java.lang.String company_interest) {
        this.company_interest = company_interest;
    }


    /**
     * Gets the company_email value for this InboundInvoiceParamsOutC.
     * 
     * @return company_email
     */
    public java.lang.String getCompany_email() {
        return company_email;
    }


    /**
     * Sets the company_email value for this InboundInvoiceParamsOutC.
     * 
     * @param company_email
     */
    public void setCompany_email(java.lang.String company_email) {
        this.company_email = company_email;
    }


    /**
     * Gets the customer_nr value for this InboundInvoiceParamsOutC.
     * 
     * @return customer_nr
     */
    public java.lang.String getCustomer_nr() {
        return customer_nr;
    }


    /**
     * Sets the customer_nr value for this InboundInvoiceParamsOutC.
     * 
     * @param customer_nr
     */
    public void setCustomer_nr(java.lang.String customer_nr) {
        this.customer_nr = customer_nr;
    }


    /**
     * Gets the delivery_type value for this InboundInvoiceParamsOutC.
     * 
     * @return delivery_type
     */
    public java.lang.String getDelivery_type() {
        return delivery_type;
    }


    /**
     * Sets the delivery_type value for this InboundInvoiceParamsOutC.
     * 
     * @param delivery_type
     */
    public void setDelivery_type(java.lang.String delivery_type) {
        this.delivery_type = delivery_type;
    }


    /**
     * Gets the invoice_seller_information value for this InboundInvoiceParamsOutC.
     * 
     * @return invoice_seller_information
     */
    public InvoiceSellerInformationOut getInvoice_seller_information() {
        return invoice_seller_information;
    }


    /**
     * Sets the invoice_seller_information value for this InboundInvoiceParamsOutC.
     * 
     * @param invoice_seller_information
     */
    public void setInvoice_seller_information(InvoiceSellerInformationOut invoice_seller_information) {
        this.invoice_seller_information = invoice_seller_information;
    }


    /**
     * Gets the company_address1 value for this InboundInvoiceParamsOutC.
     * 
     * @return company_address1
     */
    public java.lang.String getCompany_address1() {
        return company_address1;
    }


    /**
     * Sets the company_address1 value for this InboundInvoiceParamsOutC.
     * 
     * @param company_address1
     */
    public void setCompany_address1(java.lang.String company_address1) {
        this.company_address1 = company_address1;
    }


    /**
     * Gets the customer_email value for this InboundInvoiceParamsOutC.
     * 
     * @return customer_email
     */
    public java.lang.String getCustomer_email() {
        return customer_email;
    }


    /**
     * Sets the customer_email value for this InboundInvoiceParamsOutC.
     * 
     * @param customer_email
     */
    public void setCustomer_email(java.lang.String customer_email) {
        this.customer_email = customer_email;
    }


    /**
     * Gets the company_state value for this InboundInvoiceParamsOutC.
     * 
     * @return company_state
     */
    public java.lang.String getCompany_state() {
        return company_state;
    }


    /**
     * Sets the company_state value for this InboundInvoiceParamsOutC.
     * 
     * @param company_state
     */
    public void setCompany_state(java.lang.String company_state) {
        this.company_state = company_state;
    }


    /**
     * Gets the company_paper_fee value for this InboundInvoiceParamsOutC.
     * 
     * @return company_paper_fee
     */
    public java.lang.String getCompany_paper_fee() {
        return company_paper_fee;
    }


    /**
     * Sets the company_paper_fee value for this InboundInvoiceParamsOutC.
     * 
     * @param company_paper_fee
     */
    public void setCompany_paper_fee(java.lang.String company_paper_fee) {
        this.company_paper_fee = company_paper_fee;
    }


    /**
     * Gets the company_name value for this InboundInvoiceParamsOutC.
     * 
     * @return company_name
     */
    public java.lang.String getCompany_name() {
        return company_name;
    }


    /**
     * Sets the company_name value for this InboundInvoiceParamsOutC.
     * 
     * @param company_name
     */
    public void setCompany_name(java.lang.String company_name) {
        this.company_name = company_name;
    }


    /**
     * Gets the reference_nr value for this InboundInvoiceParamsOutC.
     * 
     * @return reference_nr
     */
    public java.lang.String getReference_nr() {
        return reference_nr;
    }


    /**
     * Sets the reference_nr value for this InboundInvoiceParamsOutC.
     * 
     * @param reference_nr
     */
    public void setReference_nr(java.lang.String reference_nr) {
        this.reference_nr = reference_nr;
    }


    /**
     * Gets the sum value for this InboundInvoiceParamsOutC.
     * 
     * @return sum
     */
    public java.lang.String getSum() {
        return sum;
    }


    /**
     * Sets the sum value for this InboundInvoiceParamsOutC.
     * 
     * @param sum
     */
    public void setSum(java.lang.String sum) {
        this.sum = sum;
    }


    /**
     * Gets the id value for this InboundInvoiceParamsOutC.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this InboundInvoiceParamsOutC.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the order_nr value for this InboundInvoiceParamsOutC.
     * 
     * @return order_nr
     */
    public java.lang.String getOrder_nr() {
        return order_nr;
    }


    /**
     * Sets the order_nr value for this InboundInvoiceParamsOutC.
     * 
     * @param order_nr
     */
    public void setOrder_nr(java.lang.String order_nr) {
        this.order_nr = order_nr;
    }


    /**
     * Gets the customer_reference value for this InboundInvoiceParamsOutC.
     * 
     * @return customer_reference
     */
    public java.lang.String getCustomer_reference() {
        return customer_reference;
    }


    /**
     * Sets the customer_reference value for this InboundInvoiceParamsOutC.
     * 
     * @param customer_reference
     */
    public void setCustomer_reference(java.lang.String customer_reference) {
        this.customer_reference = customer_reference;
    }


    /**
     * Gets the company_phone value for this InboundInvoiceParamsOutC.
     * 
     * @return company_phone
     */
    public java.lang.String getCompany_phone() {
        return company_phone;
    }


    /**
     * Sets the company_phone value for this InboundInvoiceParamsOutC.
     * 
     * @param company_phone
     */
    public void setCompany_phone(java.lang.String company_phone) {
        this.company_phone = company_phone;
    }


    /**
     * Gets the accounts value for this InboundInvoiceParamsOutC.
     * 
     * @return accounts
     */
    public InvoiceAccountParamsOut[] getAccounts() {
        return accounts;
    }


    /**
     * Sets the accounts value for this InboundInvoiceParamsOutC.
     * 
     * @param accounts
     */
    public void setAccounts(InvoiceAccountParamsOut[] accounts) {
        this.accounts = accounts;
    }


    /**
     * Gets the company_gsm value for this InboundInvoiceParamsOutC.
     * 
     * @return company_gsm
     */
    public java.lang.String getCompany_gsm() {
        return company_gsm;
    }


    /**
     * Sets the company_gsm value for this InboundInvoiceParamsOutC.
     * 
     * @param company_gsm
     */
    public void setCompany_gsm(java.lang.String company_gsm) {
        this.company_gsm = company_gsm;
    }


    /**
     * Gets the sum_tax value for this InboundInvoiceParamsOutC.
     * 
     * @return sum_tax
     */
    public java.lang.String getSum_tax() {
        return sum_tax;
    }


    /**
     * Sets the sum_tax value for this InboundInvoiceParamsOutC.
     * 
     * @param sum_tax
     */
    public void setSum_tax(java.lang.String sum_tax) {
        this.sum_tax = sum_tax;
    }


    /**
     * Gets the company_address2 value for this InboundInvoiceParamsOutC.
     * 
     * @return company_address2
     */
    public java.lang.String getCompany_address2() {
        return company_address2;
    }


    /**
     * Sets the company_address2 value for this InboundInvoiceParamsOutC.
     * 
     * @param company_address2
     */
    public void setCompany_address2(java.lang.String company_address2) {
        this.company_address2 = company_address2;
    }


    /**
     * Gets the company_website value for this InboundInvoiceParamsOutC.
     * 
     * @return company_website
     */
    public java.lang.String getCompany_website() {
        return company_website;
    }


    /**
     * Sets the company_website value for this InboundInvoiceParamsOutC.
     * 
     * @param company_website
     */
    public void setCompany_website(java.lang.String company_website) {
        this.company_website = company_website;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InboundInvoiceParamsOutC)) return false;
        InboundInvoiceParamsOutC other = (InboundInvoiceParamsOutC) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.company_post_code==null && other.getCompany_post_code()==null) || 
             (this.company_post_code!=null &&
              this.company_post_code.equals(other.getCompany_post_code()))) &&
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
            ((this.items==null && other.getItems()==null) || 
             (this.items!=null &&
              java.util.Arrays.equals(this.items, other.getItems()))) &&
            ((this.company_city==null && other.getCompany_city()==null) || 
             (this.company_city!=null &&
              this.company_city.equals(other.getCompany_city()))) &&
            ((this.customer_address1==null && other.getCustomer_address1()==null) || 
             (this.customer_address1!=null &&
              this.customer_address1.equals(other.getCustomer_address1()))) &&
            ((this.user_phone==null && other.getUser_phone()==null) || 
             (this.user_phone!=null &&
              this.user_phone.equals(other.getUser_phone()))) &&
            ((this.payment_terms==null && other.getPayment_terms()==null) || 
             (this.payment_terms!=null &&
              this.payment_terms.equals(other.getPayment_terms()))) &&
            ((this.work_order_nr==null && other.getWork_order_nr()==null) || 
             (this.work_order_nr!=null &&
              this.work_order_nr.equals(other.getWork_order_nr()))) &&
            ((this.customer_contact_p==null && other.getCustomer_contact_p()==null) || 
             (this.customer_contact_p!=null &&
              this.customer_contact_p.equals(other.getCustomer_contact_p()))) &&
            ((this.customer_post_code==null && other.getCustomer_post_code()==null) || 
             (this.customer_post_code!=null &&
              this.customer_post_code.equals(other.getCustomer_post_code()))) &&
            ((this.customer_ovt==null && other.getCustomer_ovt()==null) || 
             (this.customer_ovt!=null &&
              this.customer_ovt.equals(other.getCustomer_ovt()))) &&
            ((this.company_bid==null && other.getCompany_bid()==null) || 
             (this.company_bid!=null &&
              this.company_bid.equals(other.getCompany_bid()))) &&
            ((this.company_post_office==null && other.getCompany_post_office()==null) || 
             (this.company_post_office!=null &&
              this.company_post_office.equals(other.getCompany_post_office()))) &&
            ((this.company_country==null && other.getCompany_country()==null) || 
             (this.company_country!=null &&
              this.company_country.equals(other.getCompany_country()))) &&
            ((this.customer_address2==null && other.getCustomer_address2()==null) || 
             (this.customer_address2!=null &&
              this.customer_address2.equals(other.getCustomer_address2()))) &&
            this.state == other.getState() &&
            ((this.company_comment==null && other.getCompany_comment()==null) || 
             (this.company_comment!=null &&
              this.company_comment.equals(other.getCompany_comment()))) &&
            ((this.customer_name==null && other.getCustomer_name()==null) || 
             (this.customer_name!=null &&
              this.customer_name.equals(other.getCustomer_name()))) &&
            ((this.attachments==null && other.getAttachments()==null) || 
             (this.attachments!=null &&
              java.util.Arrays.equals(this.attachments, other.getAttachments()))) &&
            ((this.company_reference==null && other.getCompany_reference()==null) || 
             (this.company_reference!=null &&
              this.company_reference.equals(other.getCompany_reference()))) &&
            ((this.user_name==null && other.getUser_name()==null) || 
             (this.user_name!=null &&
              this.user_name.equals(other.getUser_name()))) &&
            ((this.invoice_delivery_address==null && other.getInvoice_delivery_address()==null) || 
             (this.invoice_delivery_address!=null &&
              this.invoice_delivery_address.equals(other.getInvoice_delivery_address()))) &&
            ((this.customer_country==null && other.getCustomer_country()==null) || 
             (this.customer_country!=null &&
              this.customer_country.equals(other.getCustomer_country()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.customer_state==null && other.getCustomer_state()==null) || 
             (this.customer_state!=null &&
              this.customer_state.equals(other.getCustomer_state()))) &&
            ((this.company_fax==null && other.getCompany_fax()==null) || 
             (this.company_fax!=null &&
              this.company_fax.equals(other.getCompany_fax()))) &&
            ((this.user_email==null && other.getUser_email()==null) || 
             (this.user_email!=null &&
              this.user_email.equals(other.getUser_email()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.invoice_nr==null && other.getInvoice_nr()==null) || 
             (this.invoice_nr!=null &&
              this.invoice_nr.equals(other.getInvoice_nr()))) &&
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.company_reminder==null && other.getCompany_reminder()==null) || 
             (this.company_reminder!=null &&
              this.company_reminder.equals(other.getCompany_reminder()))) &&
            ((this.company_interest==null && other.getCompany_interest()==null) || 
             (this.company_interest!=null &&
              this.company_interest.equals(other.getCompany_interest()))) &&
            ((this.company_email==null && other.getCompany_email()==null) || 
             (this.company_email!=null &&
              this.company_email.equals(other.getCompany_email()))) &&
            ((this.customer_nr==null && other.getCustomer_nr()==null) || 
             (this.customer_nr!=null &&
              this.customer_nr.equals(other.getCustomer_nr()))) &&
            ((this.delivery_type==null && other.getDelivery_type()==null) || 
             (this.delivery_type!=null &&
              this.delivery_type.equals(other.getDelivery_type()))) &&
            ((this.invoice_seller_information==null && other.getInvoice_seller_information()==null) || 
             (this.invoice_seller_information!=null &&
              this.invoice_seller_information.equals(other.getInvoice_seller_information()))) &&
            ((this.company_address1==null && other.getCompany_address1()==null) || 
             (this.company_address1!=null &&
              this.company_address1.equals(other.getCompany_address1()))) &&
            ((this.customer_email==null && other.getCustomer_email()==null) || 
             (this.customer_email!=null &&
              this.customer_email.equals(other.getCustomer_email()))) &&
            ((this.company_state==null && other.getCompany_state()==null) || 
             (this.company_state!=null &&
              this.company_state.equals(other.getCompany_state()))) &&
            ((this.company_paper_fee==null && other.getCompany_paper_fee()==null) || 
             (this.company_paper_fee!=null &&
              this.company_paper_fee.equals(other.getCompany_paper_fee()))) &&
            ((this.company_name==null && other.getCompany_name()==null) || 
             (this.company_name!=null &&
              this.company_name.equals(other.getCompany_name()))) &&
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
            ((this.customer_reference==null && other.getCustomer_reference()==null) || 
             (this.customer_reference!=null &&
              this.customer_reference.equals(other.getCustomer_reference()))) &&
            ((this.company_phone==null && other.getCompany_phone()==null) || 
             (this.company_phone!=null &&
              this.company_phone.equals(other.getCompany_phone()))) &&
            ((this.accounts==null && other.getAccounts()==null) || 
             (this.accounts!=null &&
              java.util.Arrays.equals(this.accounts, other.getAccounts()))) &&
            ((this.company_gsm==null && other.getCompany_gsm()==null) || 
             (this.company_gsm!=null &&
              this.company_gsm.equals(other.getCompany_gsm()))) &&
            ((this.sum_tax==null && other.getSum_tax()==null) || 
             (this.sum_tax!=null &&
              this.sum_tax.equals(other.getSum_tax()))) &&
            ((this.company_address2==null && other.getCompany_address2()==null) || 
             (this.company_address2!=null &&
              this.company_address2.equals(other.getCompany_address2()))) &&
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
        if (getCompany_post_code() != null) {
            _hashCode += getCompany_post_code().hashCode();
        }
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
        if (getCompany_city() != null) {
            _hashCode += getCompany_city().hashCode();
        }
        if (getCustomer_address1() != null) {
            _hashCode += getCustomer_address1().hashCode();
        }
        if (getUser_phone() != null) {
            _hashCode += getUser_phone().hashCode();
        }
        if (getPayment_terms() != null) {
            _hashCode += getPayment_terms().hashCode();
        }
        if (getWork_order_nr() != null) {
            _hashCode += getWork_order_nr().hashCode();
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
        if (getCompany_bid() != null) {
            _hashCode += getCompany_bid().hashCode();
        }
        if (getCompany_post_office() != null) {
            _hashCode += getCompany_post_office().hashCode();
        }
        if (getCompany_country() != null) {
            _hashCode += getCompany_country().hashCode();
        }
        if (getCustomer_address2() != null) {
            _hashCode += getCustomer_address2().hashCode();
        }
        _hashCode += getState();
        if (getCompany_comment() != null) {
            _hashCode += getCompany_comment().hashCode();
        }
        if (getCustomer_name() != null) {
            _hashCode += getCustomer_name().hashCode();
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
        if (getUser_name() != null) {
            _hashCode += getUser_name().hashCode();
        }
        if (getInvoice_delivery_address() != null) {
            _hashCode += getInvoice_delivery_address().hashCode();
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
        if (getCompany_fax() != null) {
            _hashCode += getCompany_fax().hashCode();
        }
        if (getUser_email() != null) {
            _hashCode += getUser_email().hashCode();
        }
        if (getNotes() != null) {
            _hashCode += getNotes().hashCode();
        }
        if (getInvoice_nr() != null) {
            _hashCode += getInvoice_nr().hashCode();
        }
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getCompany_reminder() != null) {
            _hashCode += getCompany_reminder().hashCode();
        }
        if (getCompany_interest() != null) {
            _hashCode += getCompany_interest().hashCode();
        }
        if (getCompany_email() != null) {
            _hashCode += getCompany_email().hashCode();
        }
        if (getCustomer_nr() != null) {
            _hashCode += getCustomer_nr().hashCode();
        }
        if (getDelivery_type() != null) {
            _hashCode += getDelivery_type().hashCode();
        }
        if (getInvoice_seller_information() != null) {
            _hashCode += getInvoice_seller_information().hashCode();
        }
        if (getCompany_address1() != null) {
            _hashCode += getCompany_address1().hashCode();
        }
        if (getCustomer_email() != null) {
            _hashCode += getCustomer_email().hashCode();
        }
        if (getCompany_state() != null) {
            _hashCode += getCompany_state().hashCode();
        }
        if (getCompany_paper_fee() != null) {
            _hashCode += getCompany_paper_fee().hashCode();
        }
        if (getCompany_name() != null) {
            _hashCode += getCompany_name().hashCode();
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
        if (getCustomer_reference() != null) {
            _hashCode += getCustomer_reference().hashCode();
        }
        if (getCompany_phone() != null) {
            _hashCode += getCompany_phone().hashCode();
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
        if (getCompany_gsm() != null) {
            _hashCode += getCompany_gsm().hashCode();
        }
        if (getSum_tax() != null) {
            _hashCode += getSum_tax().hashCode();
        }
        if (getCompany_address2() != null) {
            _hashCode += getCompany_address2().hashCode();
        }
        if (getCompany_website() != null) {
            _hashCode += getCompany_website().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InboundInvoiceParamsOutC.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://secure.maventa.com/", "InboundInvoiceParamsOutC"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("company_post_code");
        elemField.setXmlName(new javax.xml.namespace.QName("", "company_post_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("items");
        elemField.setXmlName(new javax.xml.namespace.QName("", "items"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://secure.maventa.com/", "ItemsOut"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("company_city");
        elemField.setXmlName(new javax.xml.namespace.QName("", "company_city"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customer_address1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customer_address1"));
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
        elemField.setFieldName("company_bid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "company_bid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("company_post_office");
        elemField.setXmlName(new javax.xml.namespace.QName("", "company_post_office"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("company_country");
        elemField.setXmlName(new javax.xml.namespace.QName("", "company_country"));
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
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("company_comment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "company_comment"));
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
        elemField.setFieldName("user_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "user_name"));
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
        elemField.setFieldName("company_fax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "company_fax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user_email");
        elemField.setXmlName(new javax.xml.namespace.QName("", "user_email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notes"));
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
        elemField.setFieldName("company_reminder");
        elemField.setXmlName(new javax.xml.namespace.QName("", "company_reminder"));
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
        elemField.setFieldName("company_email");
        elemField.setXmlName(new javax.xml.namespace.QName("", "company_email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("invoice_seller_information");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invoice_seller_information"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://secure.maventa.com/", "InvoiceSellerInformationOut"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("company_address1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "company_address1"));
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
        elemField.setFieldName("company_state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "company_state"));
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
        elemField.setFieldName("company_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "company_name"));
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
        elemField.setFieldName("customer_reference");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customer_reference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("company_phone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "company_phone"));
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
        elemField.setFieldName("company_gsm");
        elemField.setXmlName(new javax.xml.namespace.QName("", "company_gsm"));
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
        elemField.setFieldName("company_address2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "company_address2"));
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

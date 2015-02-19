/**
 * MaventaApiPort.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.maventa.secure.v11;

public interface MaventaApiPort extends java.rmi.Remote {
    public java.lang.String get_invoice_id(ApiKeys api_keys, java.lang.String invoice_number) throws java.rmi.RemoteException;
    public java.lang.String company_invoice_receiving(ApiKeys api_keys, boolean receive) throws java.rmi.RemoteException;
    public InboundInvoiceParamsOutC[] invoice_list_inbound_between_dates(ApiKeys api_keys, java.lang.String timestamp_start, java.lang.String timestamp_end) throws java.rmi.RemoteException;
    public CompanyParamsOut[] company_list(ApiKeys api_keys) throws java.rmi.RemoteException;
    public java.lang.String user_update_e(ApiKeys api_keys, java.lang.String id, UserParamsInE user_params) throws java.rmi.RemoteException;
    public CompanyActionOutput list_company_actions(ApiKeys api_keys, java.lang.String timestamp) throws java.rmi.RemoteException;
    public FileOut invoice_show_operator_file(ApiKeys api_keys, java.lang.String id) throws java.rmi.RemoteException;
    public java.lang.String user_update(ApiKeys api_keys, java.lang.String id, UserParamsInD user_params) throws java.rmi.RemoteException;
    public InvoiceStatus invoice_put_finvoice(ApiKeys api_keys, FinvoiceTrx finvoice_in) throws java.rmi.RemoteException;
    public PostalAddressParamsOut[] postal_address_list(ApiKeys api_keys) throws java.rmi.RemoteException;
    public FileAttachment[] get_invoice_image_as_format(ApiKeys api_keys, java.lang.String id, java.lang.String image_format) throws java.rmi.RemoteException;
    public CollectionResponse[] collection_send(ApiKeys api_keys, java.lang.String[] invoices, java.lang.String collection_type) throws java.rmi.RemoteException;
    public CompanyLookupOutExtended[] company_lookup_with_operator(ApiKeys api_keys, CompanyLookupParams company_lookup_params) throws java.rmi.RemoteException;
    public UserParamsOut[] user_list(ApiKeys api_keys) throws java.rmi.RemoteException;
    public java.lang.String server_time() throws java.rmi.RemoteException;
    public java.lang.String invoice_confirm(ApiKeys api_keys, java.lang.String id, java.lang.String payment_date) throws java.rmi.RemoteException;
    public InvoiceStatus invoice_put_invoice(ApiKeys api_keys, FileAttachment file_in, java.lang.String xmlformat) throws java.rmi.RemoteException;
    public java.lang.String unlink_vendor_api_key(ApiKeys api_keys) throws java.rmi.RemoteException;
    public OperatorInfo[] list_operators() throws java.rmi.RemoteException;
    public CompanyParamsOut company_show(ApiKeys api_keys) throws java.rmi.RemoteException;
    public InvoiceState[] invoice_state_list(ApiKeys api_keys, java.lang.String[] invoices) throws java.rmi.RemoteException;
    public CompanyLookupOutD[] company_lookup(ApiKeys api_keys, CompanyLookupParams company_lookup_params) throws java.rmi.RemoteException;
    public CompanySettingsParamsD company_settings_show(ApiKeys api_keys) throws java.rmi.RemoteException;
    public java.lang.String hello_world() throws java.rmi.RemoteException;
    public java.lang.String invoice_accept(ApiKeys api_keys, java.lang.String id) throws java.rmi.RemoteException;
    public java.lang.String postal_address_create(ApiKeys api_keys, PostalAddressParamsIn postal_address_params) throws java.rmi.RemoteException;
    public VendorActionOutput list_vendor_actions(ApiKeys api_keys, java.lang.String timestamp) throws java.rmi.RemoteException;
    public SediOrderStatus sedi_order_put(ApiKeys api_keys, FileAttachment order_in) throws java.rmi.RemoteException;
    public java.lang.String configure_company(ApiKeys api_keys, SettingValue[] settings) throws java.rmi.RemoteException;
    public InvoiceParamsOutD invoice_show(ApiKeys api_keys, java.lang.String id, boolean include_files, java.lang.String xmlformat) throws java.rmi.RemoteException;
    public InboundInvoiceList list_vendor_inbound_invoices(ApiKeys api_keys, java.lang.String timestamp_start, java.lang.String timestamp_end) throws java.rmi.RemoteException;
    public InvoiceStatus invoice_create(ApiKeys api_keys, InvoiceParamsInC invoice_params) throws java.rmi.RemoteException;
    public InboundInvoiceParamsOutC inbound_invoice_show(ApiKeys api_keys, java.lang.String id, boolean include_files, java.lang.String xmlformat) throws java.rmi.RemoteException;
    public java.lang.String user_delete(ApiKeys api_keys, java.lang.String id) throws java.rmi.RemoteException;
    public RegistrationParamsOutD register(RegistrationParamsInD registration_params) throws java.rmi.RemoteException;
    public java.lang.String company_settings_update(ApiKeys api_keys, CompanySettingsParamsD company_setting_params) throws java.rmi.RemoteException;
    public java.lang.String remove_logo(ApiKeys api_keys) throws java.rmi.RemoteException;
    public ScanAccountParamsOut scan_account_show(ApiKeys api_keys) throws java.rmi.RemoteException;
    public InvoiceStatus invoice_put_invoice_with_metadata(ApiKeys api_keys, FileAttachment file_in, java.lang.String xmlformat, java.lang.String metadata) throws java.rmi.RemoteException;
    public RegistrationParamsOutD register_with_password(RegistrationParamsInD registration_params, java.lang.String user_password) throws java.rmi.RemoteException;
    public java.lang.String enable_operator(ApiKeys api_keys, OperatorStruct operator_struct) throws java.rmi.RemoteException;
    public PostalAddressParamsOut postal_address_show(ApiKeys api_keys, java.lang.String id) throws java.rmi.RemoteException;
    public FileStatus[] invoice_put_file(ApiKeys api_keys, FileAttachment file_in) throws java.rmi.RemoteException;
    public SediOrderParamsOut[] sedi_order_list_inbound(ApiKeys api_keys, java.lang.String timestamp) throws java.rmi.RemoteException;
    public FileOut invoice_show_original_xml(ApiKeys api_keys, java.lang.String id) throws java.rmi.RemoteException;
    public java.lang.String company_order_receiving(ApiKeys api_keys, boolean receive) throws java.rmi.RemoteException;
    public java.lang.String update_logo(ApiKeys api_keys, CompanyLogoParams company_logo_params) throws java.rmi.RemoteException;
    public java.lang.String postal_address_update(ApiKeys api_keys, java.lang.String id, PostalAddressParamsIn postal_address_params) throws java.rmi.RemoteException;
    public java.lang.String invoice_decline(ApiKeys api_keys, java.lang.String id, java.lang.String message) throws java.rmi.RemoteException;
    public UserParamsOut user_show(ApiKeys api_keys, java.lang.String id) throws java.rmi.RemoteException;
    public TrxListResponseD partner_trx_list(ApiKeys api_keys, java.lang.String date_start, java.lang.String date_end, boolean csv_file) throws java.rmi.RemoteException;
    public ScanAccountParamsOut scan_account_order(ApiKeys api_keys, ScanAddress return_address) throws java.rmi.RemoteException;
    public java.lang.String link_vendor_api_key(ApiKeys api_keys) throws java.rmi.RemoteException;
    public com.maventa.secure.v11.SettingValuesOut show_company_configuration(ApiKeys api_keys) throws java.rmi.RemoteException;
    public java.lang.String user_create(ApiKeys api_keys, UserParamsInD user_params) throws java.rmi.RemoteException;
    public InvoiceParamsOutC[] invoice_list_between_dates(ApiKeys api_keys, java.lang.String timestamp_start, java.lang.String timestamp_end, int all) throws java.rmi.RemoteException;
    public java.lang.String postal_address_delete(ApiKeys api_keys, java.lang.String id) throws java.rmi.RemoteException;
    public SediOrderFile sedi_order_show_inbound(ApiKeys api_keys, java.lang.String order_id) throws java.rmi.RemoteException;
    public java.lang.String invoice_dispute(ApiKeys api_keys, java.lang.String id, java.lang.String message) throws java.rmi.RemoteException;
    public java.lang.String user_create_e(ApiKeys api_keys, UserParamsInE user_params) throws java.rmi.RemoteException;
}

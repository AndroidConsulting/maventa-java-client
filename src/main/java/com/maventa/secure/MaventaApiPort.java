/**
 * MaventaApiPort.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.maventa.secure;

public interface MaventaApiPort extends java.rmi.Remote {
    public java.lang.String get_invoice_id(com.maventa.secure.ApiKeys api_keys, java.lang.String invoice_number) throws java.rmi.RemoteException;
    public java.lang.String company_invoice_receiving(com.maventa.secure.ApiKeys api_keys, boolean receive) throws java.rmi.RemoteException;
    public com.maventa.secure.InboundInvoiceParamsOutC[] invoice_list_inbound_between_dates(com.maventa.secure.ApiKeys api_keys, java.lang.String timestamp_start, java.lang.String timestamp_end) throws java.rmi.RemoteException;
    public com.maventa.secure.CompanyParamsOut[] company_list(com.maventa.secure.ApiKeys api_keys) throws java.rmi.RemoteException;
    public java.lang.String user_update_e(com.maventa.secure.ApiKeys api_keys, java.lang.String id, com.maventa.secure.UserParamsInE user_params) throws java.rmi.RemoteException;
    public com.maventa.secure.CompanyActionOutput list_company_actions(com.maventa.secure.ApiKeys api_keys, java.lang.String timestamp) throws java.rmi.RemoteException;
    public com.maventa.secure.FileOut invoice_show_operator_file(com.maventa.secure.ApiKeys api_keys, java.lang.String id) throws java.rmi.RemoteException;
    public java.lang.String user_update(com.maventa.secure.ApiKeys api_keys, java.lang.String id, com.maventa.secure.UserParamsInD user_params) throws java.rmi.RemoteException;
    public com.maventa.secure.InvoiceStatus invoice_put_finvoice(com.maventa.secure.ApiKeys api_keys, com.maventa.secure.FinvoiceTrx finvoice_in) throws java.rmi.RemoteException;
    public com.maventa.secure.PostalAddressParamsOut[] postal_address_list(com.maventa.secure.ApiKeys api_keys) throws java.rmi.RemoteException;
    public com.maventa.secure.FileAttachment[] get_invoice_image_as_format(com.maventa.secure.ApiKeys api_keys, java.lang.String id, java.lang.String image_format) throws java.rmi.RemoteException;
    public com.maventa.secure.CollectionResponse[] collection_send(com.maventa.secure.ApiKeys api_keys, java.lang.String[] invoices, java.lang.String collection_type) throws java.rmi.RemoteException;
    public com.maventa.secure.CompanyLookupOutExtended[] company_lookup_with_operator(com.maventa.secure.ApiKeys api_keys, com.maventa.secure.CompanyLookupParams company_lookup_params) throws java.rmi.RemoteException;
    public com.maventa.secure.UserParamsOut[] user_list(com.maventa.secure.ApiKeys api_keys) throws java.rmi.RemoteException;
    public java.lang.String server_time() throws java.rmi.RemoteException;
    public java.lang.String invoice_confirm(com.maventa.secure.ApiKeys api_keys, java.lang.String id, java.lang.String payment_date) throws java.rmi.RemoteException;
    public com.maventa.secure.InvoiceStatus invoice_put_invoice(com.maventa.secure.ApiKeys api_keys, com.maventa.secure.FileAttachment file_in, java.lang.String xmlformat) throws java.rmi.RemoteException;
    public java.lang.String unlink_vendor_api_key(com.maventa.secure.ApiKeys api_keys) throws java.rmi.RemoteException;
    public com.maventa.secure.OperatorInfo[] list_operators() throws java.rmi.RemoteException;
    public com.maventa.secure.CompanyParamsOut company_show(com.maventa.secure.ApiKeys api_keys) throws java.rmi.RemoteException;
    public com.maventa.secure.InvoiceState[] invoice_state_list(com.maventa.secure.ApiKeys api_keys, java.lang.String[] invoices) throws java.rmi.RemoteException;
    public com.maventa.secure.CompanyLookupOutD[] company_lookup(com.maventa.secure.ApiKeys api_keys, com.maventa.secure.CompanyLookupParams company_lookup_params) throws java.rmi.RemoteException;
    public com.maventa.secure.CompanySettingsParamsD company_settings_show(com.maventa.secure.ApiKeys api_keys) throws java.rmi.RemoteException;
    public java.lang.String hello_world() throws java.rmi.RemoteException;
    public java.lang.String invoice_accept(com.maventa.secure.ApiKeys api_keys, java.lang.String id) throws java.rmi.RemoteException;
    public java.lang.String postal_address_create(com.maventa.secure.ApiKeys api_keys, com.maventa.secure.PostalAddressParamsIn postal_address_params) throws java.rmi.RemoteException;
    public com.maventa.secure.VendorActionOutput list_vendor_actions(com.maventa.secure.ApiKeys api_keys, java.lang.String timestamp) throws java.rmi.RemoteException;
    public com.maventa.secure.SediOrderStatus sedi_order_put(com.maventa.secure.ApiKeys api_keys, com.maventa.secure.FileAttachment order_in) throws java.rmi.RemoteException;
    public java.lang.String configure_company(com.maventa.secure.ApiKeys api_keys, com.maventa.secure.SettingValue[] settings) throws java.rmi.RemoteException;
    public com.maventa.secure.InvoiceParamsOutD invoice_show(com.maventa.secure.ApiKeys api_keys, java.lang.String id, boolean include_files, java.lang.String xmlformat) throws java.rmi.RemoteException;
    public com.maventa.secure.InboundInvoiceList list_vendor_inbound_invoices(com.maventa.secure.ApiKeys api_keys, java.lang.String timestamp_start, java.lang.String timestamp_end) throws java.rmi.RemoteException;
    public com.maventa.secure.InvoiceStatus invoice_create(com.maventa.secure.ApiKeys api_keys, com.maventa.secure.InvoiceParamsInC invoice_params) throws java.rmi.RemoteException;
    public com.maventa.secure.InboundInvoiceParamsOutC inbound_invoice_show(com.maventa.secure.ApiKeys api_keys, java.lang.String id, boolean include_files, java.lang.String xmlformat) throws java.rmi.RemoteException;
    public java.lang.String user_delete(com.maventa.secure.ApiKeys api_keys, java.lang.String id) throws java.rmi.RemoteException;
    public com.maventa.secure.RegistrationParamsOutD register(com.maventa.secure.RegistrationParamsInD registration_params) throws java.rmi.RemoteException;
    public java.lang.String company_settings_update(com.maventa.secure.ApiKeys api_keys, com.maventa.secure.CompanySettingsParamsD company_setting_params) throws java.rmi.RemoteException;
    public java.lang.String remove_logo(com.maventa.secure.ApiKeys api_keys) throws java.rmi.RemoteException;
    public com.maventa.secure.ScanAccountParamsOut scan_account_show(com.maventa.secure.ApiKeys api_keys) throws java.rmi.RemoteException;
    public com.maventa.secure.InvoiceStatus invoice_put_invoice_with_metadata(com.maventa.secure.ApiKeys api_keys, com.maventa.secure.FileAttachment file_in, java.lang.String xmlformat, java.lang.String metadata) throws java.rmi.RemoteException;
    public com.maventa.secure.RegistrationParamsOutD register_with_password(com.maventa.secure.RegistrationParamsInD registration_params, java.lang.String user_password) throws java.rmi.RemoteException;
    public java.lang.String enable_operator(com.maventa.secure.ApiKeys api_keys, com.maventa.secure.OperatorStruct operator_struct) throws java.rmi.RemoteException;
    public com.maventa.secure.PostalAddressParamsOut postal_address_show(com.maventa.secure.ApiKeys api_keys, java.lang.String id) throws java.rmi.RemoteException;
    public com.maventa.secure.FileStatus[] invoice_put_file(com.maventa.secure.ApiKeys api_keys, com.maventa.secure.FileAttachment file_in) throws java.rmi.RemoteException;
    public com.maventa.secure.SediOrderParamsOut[] sedi_order_list_inbound(com.maventa.secure.ApiKeys api_keys, java.lang.String timestamp) throws java.rmi.RemoteException;
    public com.maventa.secure.FileOut invoice_show_original_xml(com.maventa.secure.ApiKeys api_keys, java.lang.String id) throws java.rmi.RemoteException;
    public java.lang.String company_order_receiving(com.maventa.secure.ApiKeys api_keys, boolean receive) throws java.rmi.RemoteException;
    public java.lang.String update_logo(com.maventa.secure.ApiKeys api_keys, com.maventa.secure.CompanyLogoParams company_logo_params) throws java.rmi.RemoteException;
    public java.lang.String postal_address_update(com.maventa.secure.ApiKeys api_keys, java.lang.String id, com.maventa.secure.PostalAddressParamsIn postal_address_params) throws java.rmi.RemoteException;
    public java.lang.String invoice_decline(com.maventa.secure.ApiKeys api_keys, java.lang.String id, java.lang.String message) throws java.rmi.RemoteException;
    public com.maventa.secure.UserParamsOut user_show(com.maventa.secure.ApiKeys api_keys, java.lang.String id) throws java.rmi.RemoteException;
    public com.maventa.secure.TrxListResponseD partner_trx_list(com.maventa.secure.ApiKeys api_keys, java.lang.String date_start, java.lang.String date_end, boolean csv_file) throws java.rmi.RemoteException;
    public com.maventa.secure.ScanAccountParamsOut scan_account_order(com.maventa.secure.ApiKeys api_keys, com.maventa.secure.ScanAddress return_address) throws java.rmi.RemoteException;
    public java.lang.String link_vendor_api_key(com.maventa.secure.ApiKeys api_keys) throws java.rmi.RemoteException;
    public com.maventa.secure.SettingValuesOut show_company_configuration(com.maventa.secure.ApiKeys api_keys) throws java.rmi.RemoteException;
    public java.lang.String user_create(com.maventa.secure.ApiKeys api_keys, com.maventa.secure.UserParamsInD user_params) throws java.rmi.RemoteException;
    public com.maventa.secure.InvoiceParamsOutC[] invoice_list_between_dates(com.maventa.secure.ApiKeys api_keys, java.lang.String timestamp_start, java.lang.String timestamp_end, int all) throws java.rmi.RemoteException;
    public java.lang.String postal_address_delete(com.maventa.secure.ApiKeys api_keys, java.lang.String id) throws java.rmi.RemoteException;
    public com.maventa.secure.SediOrderFile sedi_order_show_inbound(com.maventa.secure.ApiKeys api_keys, java.lang.String order_id) throws java.rmi.RemoteException;
    public java.lang.String invoice_dispute(com.maventa.secure.ApiKeys api_keys, java.lang.String id, java.lang.String message) throws java.rmi.RemoteException;
    public java.lang.String user_create_e(com.maventa.secure.ApiKeys api_keys, com.maventa.secure.UserParamsInE user_params) throws java.rmi.RemoteException;
}

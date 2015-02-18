/**
 * MaventaApiBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.maventa.secure;

public class MaventaApiBindingStub extends org.apache.axis.client.Stub implements com.maventa.secure.MaventaApiPort {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[60];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
        _initOperationDesc5();
        _initOperationDesc6();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_invoice_id");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "api_keys"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://secure.maventa.com/", "ApiKeys"), com.maventa.secure.ApiKeys.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "invoice_number"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("company_invoice_receiving");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "api_keys"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://secure.maventa.com/", "ApiKeys"), com.maventa.secure.ApiKeys.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receive"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("invoice_list_inbound_between_dates");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "api_keys"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://secure.maventa.com/", "ApiKeys"), com.maventa.secure.ApiKeys.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "timestamp_start"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "timestamp_end"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://secure.maventa.com/", "InboundInvoiceParamsOutCArray"));
        oper.setReturnClass(com.maventa.secure.InboundInvoiceParamsOutC[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("company_list");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "api_keys"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://secure.maventa.com/", "ApiKeys"), com.maventa.secure.ApiKeys.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://secure.maventa.com/", "CompanyParamsOutArray"));
        oper.setReturnClass(com.maventa.secure.CompanyParamsOut[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("user_update_e");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "api_keys"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://secure.maventa.com/", "ApiKeys"), com.maventa.secure.ApiKeys.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user_params"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://secure.maventa.com/", "UserParamsInE"), com.maventa.secure.UserParamsInE.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("list_company_actions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "api_keys"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://secure.maventa.com/", "ApiKeys"), com.maventa.secure.ApiKeys.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "timestamp"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://secure.maventa.com/", "CompanyActionOutput"));
        oper.setReturnClass(com.maventa.secure.CompanyActionOutput.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("invoice_show_operator_file");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "api_keys"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://secure.maventa.com/", "ApiKeys"), com.maventa.secure.ApiKeys.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://secure.maventa.com/", "FileOut"));
        oper.setReturnClass(com.maventa.secure.FileOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("user_update");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "api_keys"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://secure.maventa.com/", "ApiKeys"), com.maventa.secure.ApiKeys.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user_params"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://secure.maventa.com/", "UserParamsInD"), com.maventa.secure.UserParamsInD.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("invoice_put_finvoice");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "api_keys"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://secure.maventa.com/", "ApiKeys"), com.maventa.secure.ApiKeys.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "finvoice_in"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://secure.maventa.com/", "FinvoiceTrx"), com.maventa.secure.FinvoiceTrx.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://secure.maventa.com/", "InvoiceStatus"));
        oper.setReturnClass(com.maventa.secure.InvoiceStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("postal_address_list");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "api_keys"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://secure.maventa.com/", "ApiKeys"), com.maventa.secure.ApiKeys.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://secure.maventa.com/", "PostalAddressParamsOutArray"));
        oper.setReturnClass(com.maventa.secure.PostalAddressParamsOut[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_invoice_image_as_format");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "api_keys"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://secure.maventa.com/", "ApiKeys"), com.maventa.secure.ApiKeys.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "image_format"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://secure.maventa.com/", "FileAttachmentArray"));
        oper.setReturnClass(com.maventa.secure.FileAttachment[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("collection_send");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "api_keys"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://secure.maventa.com/", "ApiKeys"), com.maventa.secure.ApiKeys.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "invoices"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://secure.maventa.com/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "collection_type"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://secure.maventa.com/", "CollectionResponseArray"));
        oper.setReturnClass(com.maventa.secure.CollectionResponse[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("company_lookup_with_operator");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "api_keys"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://secure.maventa.com/", "ApiKeys"), com.maventa.secure.ApiKeys.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "company_lookup_params"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://secure.maventa.com/", "CompanyLookupParams"), com.maventa.secure.CompanyLookupParams.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://secure.maventa.com/", "CompanyLookupOutExtendedArray"));
        oper.setReturnClass(com.maventa.secure.CompanyLookupOutExtended[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("user_list");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "api_keys"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://secure.maventa.com/", "ApiKeys"), com.maventa.secure.ApiKeys.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://secure.maventa.com/", "UserParamsOutArray"));
        oper.setReturnClass(com.maventa.secure.UserParamsOut[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("server_time");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("invoice_confirm");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "api_keys"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://secure.maventa.com/", "ApiKeys"), com.maventa.secure.ApiKeys.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "payment_date"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("invoice_put_invoice");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "api_keys"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://secure.maventa.com/", "ApiKeys"), com.maventa.secure.ApiKeys.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "file_in"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://secure.maventa.com/", "FileAttachment"), com.maventa.secure.FileAttachment.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "xmlformat"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://secure.maventa.com/", "InvoiceStatus"));
        oper.setReturnClass(com.maventa.secure.InvoiceStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("unlink_vendor_api_key");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "api_keys"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://secure.maventa.com/", "ApiKeys"), com.maventa.secure.ApiKeys.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("list_operators");
        oper.setReturnType(new javax.xml.namespace.QName("https://secure.maventa.com/", "OperatorInfoArray"));
        oper.setReturnClass(com.maventa.secure.OperatorInfo[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("company_show");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "api_keys"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://secure.maventa.com/", "ApiKeys"), com.maventa.secure.ApiKeys.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://secure.maventa.com/", "CompanyParamsOut"));
        oper.setReturnClass(com.maventa.secure.CompanyParamsOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("invoice_state_list");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "api_keys"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://secure.maventa.com/", "ApiKeys"), com.maventa.secure.ApiKeys.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "invoices"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://secure.maventa.com/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://secure.maventa.com/", "InvoiceStateArray"));
        oper.setReturnClass(com.maventa.secure.InvoiceState[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("company_lookup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "api_keys"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://secure.maventa.com/", "ApiKeys"), com.maventa.secure.ApiKeys.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "company_lookup_params"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://secure.maventa.com/", "CompanyLookupParams"), com.maventa.secure.CompanyLookupParams.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://secure.maventa.com/", "CompanyLookupOutDArray"));
        oper.setReturnClass(com.maventa.secure.CompanyLookupOutD[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("company_settings_show");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "api_keys"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://secure.maventa.com/", "ApiKeys"), com.maventa.secure.ApiKeys.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://secure.maventa.com/", "CompanySettingsParamsD"));
        oper.setReturnClass(com.maventa.secure.CompanySettingsParamsD.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("hello_world");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("invoice_accept");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "api_keys"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://secure.maventa.com/", "ApiKeys"), com.maventa.secure.ApiKeys.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("postal_address_create");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "api_keys"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://secure.maventa.com/", "ApiKeys"), com.maventa.secure.ApiKeys.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "postal_address_params"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://secure.maventa.com/", "PostalAddressParamsIn"), com.maventa.secure.PostalAddressParamsIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("list_vendor_actions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "api_keys"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://secure.maventa.com/", "ApiKeys"), com.maventa.secure.ApiKeys.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "timestamp"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://secure.maventa.com/", "VendorActionOutput"));
        oper.setReturnClass(com.maventa.secure.VendorActionOutput.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("sedi_order_put");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "api_keys"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://secure.maventa.com/", "ApiKeys"), com.maventa.secure.ApiKeys.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "order_in"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://secure.maventa.com/", "FileAttachment"), com.maventa.secure.FileAttachment.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://secure.maventa.com/", "SediOrderStatus"));
        oper.setReturnClass(com.maventa.secure.SediOrderStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("configure_company");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "api_keys"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://secure.maventa.com/", "ApiKeys"), com.maventa.secure.ApiKeys.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "settings"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://secure.maventa.com/", "SettingValueArray"), com.maventa.secure.SettingValue[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("invoice_show");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "api_keys"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://secure.maventa.com/", "ApiKeys"), com.maventa.secure.ApiKeys.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "include_files"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "xmlformat"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://secure.maventa.com/", "InvoiceParamsOutD"));
        oper.setReturnClass(com.maventa.secure.InvoiceParamsOutD.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("list_vendor_inbound_invoices");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "api_keys"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://secure.maventa.com/", "ApiKeys"), com.maventa.secure.ApiKeys.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "timestamp_start"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "timestamp_end"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://secure.maventa.com/", "InboundInvoiceList"));
        oper.setReturnClass(com.maventa.secure.InboundInvoiceList.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("invoice_create");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "api_keys"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://secure.maventa.com/", "ApiKeys"), com.maventa.secure.ApiKeys.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "invoice_params"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://secure.maventa.com/", "InvoiceParamsInC"), com.maventa.secure.InvoiceParamsInC.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://secure.maventa.com/", "InvoiceStatus"));
        oper.setReturnClass(com.maventa.secure.InvoiceStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("inbound_invoice_show");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "api_keys"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://secure.maventa.com/", "ApiKeys"), com.maventa.secure.ApiKeys.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "include_files"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "xmlformat"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://secure.maventa.com/", "InboundInvoiceParamsOutC"));
        oper.setReturnClass(com.maventa.secure.InboundInvoiceParamsOutC.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("user_delete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "api_keys"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://secure.maventa.com/", "ApiKeys"), com.maventa.secure.ApiKeys.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("register");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "registration_params"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://secure.maventa.com/", "RegistrationParamsInD"), com.maventa.secure.RegistrationParamsInD.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://secure.maventa.com/", "RegistrationParamsOutD"));
        oper.setReturnClass(com.maventa.secure.RegistrationParamsOutD.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("company_settings_update");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "api_keys"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://secure.maventa.com/", "ApiKeys"), com.maventa.secure.ApiKeys.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "company_setting_params"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://secure.maventa.com/", "CompanySettingsParamsD"), com.maventa.secure.CompanySettingsParamsD.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("remove_logo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "api_keys"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://secure.maventa.com/", "ApiKeys"), com.maventa.secure.ApiKeys.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("scan_account_show");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "api_keys"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://secure.maventa.com/", "ApiKeys"), com.maventa.secure.ApiKeys.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://secure.maventa.com/", "ScanAccountParamsOut"));
        oper.setReturnClass(com.maventa.secure.ScanAccountParamsOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("invoice_put_invoice_with_metadata");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "api_keys"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://secure.maventa.com/", "ApiKeys"), com.maventa.secure.ApiKeys.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "file_in"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://secure.maventa.com/", "FileAttachment"), com.maventa.secure.FileAttachment.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "xmlformat"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "metadata"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://secure.maventa.com/", "InvoiceStatus"));
        oper.setReturnClass(com.maventa.secure.InvoiceStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("register_with_password");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "registration_params"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://secure.maventa.com/", "RegistrationParamsInD"), com.maventa.secure.RegistrationParamsInD.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user_password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://secure.maventa.com/", "RegistrationParamsOutD"));
        oper.setReturnClass(com.maventa.secure.RegistrationParamsOutD.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[39] = oper;

    }

    private static void _initOperationDesc5(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("enable_operator");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "api_keys"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://secure.maventa.com/", "ApiKeys"), com.maventa.secure.ApiKeys.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "operator_struct"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://secure.maventa.com/", "OperatorStruct"), com.maventa.secure.OperatorStruct.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[40] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("postal_address_show");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "api_keys"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://secure.maventa.com/", "ApiKeys"), com.maventa.secure.ApiKeys.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://secure.maventa.com/", "PostalAddressParamsOut"));
        oper.setReturnClass(com.maventa.secure.PostalAddressParamsOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[41] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("invoice_put_file");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "api_keys"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://secure.maventa.com/", "ApiKeys"), com.maventa.secure.ApiKeys.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "file_in"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://secure.maventa.com/", "FileAttachment"), com.maventa.secure.FileAttachment.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://secure.maventa.com/", "FileStatusArray"));
        oper.setReturnClass(com.maventa.secure.FileStatus[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[42] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("sedi_order_list_inbound");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "api_keys"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://secure.maventa.com/", "ApiKeys"), com.maventa.secure.ApiKeys.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "timestamp"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://secure.maventa.com/", "SediOrderParamsOutArray"));
        oper.setReturnClass(com.maventa.secure.SediOrderParamsOut[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[43] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("invoice_show_original_xml");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "api_keys"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://secure.maventa.com/", "ApiKeys"), com.maventa.secure.ApiKeys.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://secure.maventa.com/", "FileOut"));
        oper.setReturnClass(com.maventa.secure.FileOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[44] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("company_order_receiving");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "api_keys"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://secure.maventa.com/", "ApiKeys"), com.maventa.secure.ApiKeys.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receive"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[45] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("update_logo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "api_keys"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://secure.maventa.com/", "ApiKeys"), com.maventa.secure.ApiKeys.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "company_logo_params"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://secure.maventa.com/", "CompanyLogoParams"), com.maventa.secure.CompanyLogoParams.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[46] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("postal_address_update");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "api_keys"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://secure.maventa.com/", "ApiKeys"), com.maventa.secure.ApiKeys.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "postal_address_params"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://secure.maventa.com/", "PostalAddressParamsIn"), com.maventa.secure.PostalAddressParamsIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[47] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("invoice_decline");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "api_keys"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://secure.maventa.com/", "ApiKeys"), com.maventa.secure.ApiKeys.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "message"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[48] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("user_show");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "api_keys"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://secure.maventa.com/", "ApiKeys"), com.maventa.secure.ApiKeys.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://secure.maventa.com/", "UserParamsOut"));
        oper.setReturnClass(com.maventa.secure.UserParamsOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[49] = oper;

    }

    private static void _initOperationDesc6(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("partner_trx_list");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "api_keys"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://secure.maventa.com/", "ApiKeys"), com.maventa.secure.ApiKeys.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "date_start"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "date_end"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "csv_file"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://secure.maventa.com/", "TrxListResponseD"));
        oper.setReturnClass(com.maventa.secure.TrxListResponseD.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[50] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("scan_account_order");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "api_keys"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://secure.maventa.com/", "ApiKeys"), com.maventa.secure.ApiKeys.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "return_address"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://secure.maventa.com/", "ScanAddress"), com.maventa.secure.ScanAddress.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://secure.maventa.com/", "ScanAccountParamsOut"));
        oper.setReturnClass(com.maventa.secure.ScanAccountParamsOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[51] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("link_vendor_api_key");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "api_keys"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://secure.maventa.com/", "ApiKeys"), com.maventa.secure.ApiKeys.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[52] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("show_company_configuration");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "api_keys"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://secure.maventa.com/", "ApiKeys"), com.maventa.secure.ApiKeys.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://secure.maventa.com/", "SettingValuesOut"));
        oper.setReturnClass(com.maventa.secure.SettingValuesOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[53] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("user_create");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "api_keys"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://secure.maventa.com/", "ApiKeys"), com.maventa.secure.ApiKeys.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user_params"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://secure.maventa.com/", "UserParamsInD"), com.maventa.secure.UserParamsInD.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[54] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("invoice_list_between_dates");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "api_keys"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://secure.maventa.com/", "ApiKeys"), com.maventa.secure.ApiKeys.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "timestamp_start"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "timestamp_end"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "all"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://secure.maventa.com/", "InvoiceParamsOutCArray"));
        oper.setReturnClass(com.maventa.secure.InvoiceParamsOutC[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[55] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("postal_address_delete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "api_keys"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://secure.maventa.com/", "ApiKeys"), com.maventa.secure.ApiKeys.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[56] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("sedi_order_show_inbound");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "api_keys"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://secure.maventa.com/", "ApiKeys"), com.maventa.secure.ApiKeys.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "order_id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://secure.maventa.com/", "SediOrderFile"));
        oper.setReturnClass(com.maventa.secure.SediOrderFile.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[57] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("invoice_dispute");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "api_keys"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://secure.maventa.com/", "ApiKeys"), com.maventa.secure.ApiKeys.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "message"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[58] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("user_create_e");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "api_keys"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://secure.maventa.com/", "ApiKeys"), com.maventa.secure.ApiKeys.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user_params"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://secure.maventa.com/", "UserParamsInE"), com.maventa.secure.UserParamsInE.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[59] = oper;

    }

    public MaventaApiBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public MaventaApiBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public MaventaApiBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "ActionWebService..Base64Array");
            cachedSerQNames.add(qName);
            cls = byte[][].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "base64");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "ApiKeys");
            cachedSerQNames.add(qName);
            cls = com.maventa.secure.ApiKeys.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "BankAccountParamsIn");
            cachedSerQNames.add(qName);
            cls = com.maventa.secure.BankAccountParamsIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "BankAccountParamsInArray");
            cachedSerQNames.add(qName);
            cls = com.maventa.secure.BankAccountParamsIn[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "BankAccountParamsIn");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "CollectionResponse");
            cachedSerQNames.add(qName);
            cls = com.maventa.secure.CollectionResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "CollectionResponseArray");
            cachedSerQNames.add(qName);
            cls = com.maventa.secure.CollectionResponse[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "CollectionResponse");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "CompanyActionOutput");
            cachedSerQNames.add(qName);
            cls = com.maventa.secure.CompanyActionOutput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "CompanyLogoParams");
            cachedSerQNames.add(qName);
            cls = com.maventa.secure.CompanyLogoParams.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "CompanyLookupOutD");
            cachedSerQNames.add(qName);
            cls = com.maventa.secure.CompanyLookupOutD.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "CompanyLookupOutDArray");
            cachedSerQNames.add(qName);
            cls = com.maventa.secure.CompanyLookupOutD[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "CompanyLookupOutD");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "CompanyLookupOutExtended");
            cachedSerQNames.add(qName);
            cls = com.maventa.secure.CompanyLookupOutExtended.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "CompanyLookupOutExtendedArray");
            cachedSerQNames.add(qName);
            cls = com.maventa.secure.CompanyLookupOutExtended[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "CompanyLookupOutExtended");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "CompanyLookupParams");
            cachedSerQNames.add(qName);
            cls = com.maventa.secure.CompanyLookupParams.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "CompanyParamsOut");
            cachedSerQNames.add(qName);
            cls = com.maventa.secure.CompanyParamsOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "CompanyParamsOutArray");
            cachedSerQNames.add(qName);
            cls = com.maventa.secure.CompanyParamsOut[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "CompanyParamsOut");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "CompanySettingsParamsD");
            cachedSerQNames.add(qName);
            cls = com.maventa.secure.CompanySettingsParamsD.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "CustomerParamsInC");
            cachedSerQNames.add(qName);
            cls = com.maventa.secure.CustomerParamsInC.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "ElectronicInvoiceAddress");
            cachedSerQNames.add(qName);
            cls = com.maventa.secure.ElectronicInvoiceAddress.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "ElectronicInvoiceAddressArray");
            cachedSerQNames.add(qName);
            cls = com.maventa.secure.ElectronicInvoiceAddress[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "ElectronicInvoiceAddress");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "FileAttachment");
            cachedSerQNames.add(qName);
            cls = com.maventa.secure.FileAttachment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "FileAttachmentArray");
            cachedSerQNames.add(qName);
            cls = com.maventa.secure.FileAttachment[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "FileAttachment");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "FileOut");
            cachedSerQNames.add(qName);
            cls = com.maventa.secure.FileOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "FileStatus");
            cachedSerQNames.add(qName);
            cls = com.maventa.secure.FileStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "FileStatusArray");
            cachedSerQNames.add(qName);
            cls = com.maventa.secure.FileStatus[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "FileStatus");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "FinvoiceTrx");
            cachedSerQNames.add(qName);
            cls = com.maventa.secure.FinvoiceTrx.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "InboundInvoiceList");
            cachedSerQNames.add(qName);
            cls = com.maventa.secure.InboundInvoiceList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "InboundInvoiceListItem");
            cachedSerQNames.add(qName);
            cls = com.maventa.secure.InboundInvoiceListItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "InboundInvoiceListItemArray");
            cachedSerQNames.add(qName);
            cls = com.maventa.secure.InboundInvoiceListItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "InboundInvoiceListItem");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "InboundInvoiceParamsOutC");
            cachedSerQNames.add(qName);
            cls = com.maventa.secure.InboundInvoiceParamsOutC.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "InboundInvoiceParamsOutCArray");
            cachedSerQNames.add(qName);
            cls = com.maventa.secure.InboundInvoiceParamsOutC[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "InboundInvoiceParamsOutC");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "InvoiceAccountParamsOut");
            cachedSerQNames.add(qName);
            cls = com.maventa.secure.InvoiceAccountParamsOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "InvoiceAccountParamsOutArray");
            cachedSerQNames.add(qName);
            cls = com.maventa.secure.InvoiceAccountParamsOut[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "InvoiceAccountParamsOut");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "InvoiceActionParamsOut");
            cachedSerQNames.add(qName);
            cls = com.maventa.secure.InvoiceActionParamsOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "InvoiceActionParamsOutArray");
            cachedSerQNames.add(qName);
            cls = com.maventa.secure.InvoiceActionParamsOut[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "InvoiceActionParamsOut");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "InvoiceDeliveryAddressIn");
            cachedSerQNames.add(qName);
            cls = com.maventa.secure.InvoiceDeliveryAddressIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "InvoiceDeliveryAddressOut");
            cachedSerQNames.add(qName);
            cls = com.maventa.secure.InvoiceDeliveryAddressOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "InvoiceParamsInC");
            cachedSerQNames.add(qName);
            cls = com.maventa.secure.InvoiceParamsInC.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "InvoiceParamsOutC");
            cachedSerQNames.add(qName);
            cls = com.maventa.secure.InvoiceParamsOutC.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "InvoiceParamsOutCArray");
            cachedSerQNames.add(qName);
            cls = com.maventa.secure.InvoiceParamsOutC[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "InvoiceParamsOutC");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "InvoiceParamsOutD");
            cachedSerQNames.add(qName);
            cls = com.maventa.secure.InvoiceParamsOutD.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "InvoiceSellerInformationIn");
            cachedSerQNames.add(qName);
            cls = com.maventa.secure.InvoiceSellerInformationIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "InvoiceSellerInformationOut");
            cachedSerQNames.add(qName);
            cls = com.maventa.secure.InvoiceSellerInformationOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "InvoiceState");
            cachedSerQNames.add(qName);
            cls = com.maventa.secure.InvoiceState.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "InvoiceStateArray");
            cachedSerQNames.add(qName);
            cls = com.maventa.secure.InvoiceState[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "InvoiceState");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "InvoiceStatus");
            cachedSerQNames.add(qName);
            cls = com.maventa.secure.InvoiceStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "ItemsInC");
            cachedSerQNames.add(qName);
            cls = com.maventa.secure.ItemsInC.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "ItemsInCArray");
            cachedSerQNames.add(qName);
            cls = com.maventa.secure.ItemsInC[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "ItemsInC");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "ItemsOut");
            cachedSerQNames.add(qName);
            cls = com.maventa.secure.ItemsOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "ItemsOutArray");
            cachedSerQNames.add(qName);
            cls = com.maventa.secure.ItemsOut[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "ItemsOut");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "OperatorInfo");
            cachedSerQNames.add(qName);
            cls = com.maventa.secure.OperatorInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "OperatorInfoArray");
            cachedSerQNames.add(qName);
            cls = com.maventa.secure.OperatorInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "OperatorInfo");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "OperatorStruct");
            cachedSerQNames.add(qName);
            cls = com.maventa.secure.OperatorStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "PostalAddressParamsIn");
            cachedSerQNames.add(qName);
            cls = com.maventa.secure.PostalAddressParamsIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "PostalAddressParamsOut");
            cachedSerQNames.add(qName);
            cls = com.maventa.secure.PostalAddressParamsOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "PostalAddressParamsOutArray");
            cachedSerQNames.add(qName);
            cls = com.maventa.secure.PostalAddressParamsOut[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "PostalAddressParamsOut");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "RegistrationParamsInD");
            cachedSerQNames.add(qName);
            cls = com.maventa.secure.RegistrationParamsInD.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "RegistrationParamsOutD");
            cachedSerQNames.add(qName);
            cls = com.maventa.secure.RegistrationParamsOutD.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "RouteDisable");
            cachedSerQNames.add(qName);
            cls = com.maventa.secure.RouteDisable.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "ScanAccountParamsOut");
            cachedSerQNames.add(qName);
            cls = com.maventa.secure.ScanAccountParamsOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "ScanAddress");
            cachedSerQNames.add(qName);
            cls = com.maventa.secure.ScanAddress.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "SediOrderFile");
            cachedSerQNames.add(qName);
            cls = com.maventa.secure.SediOrderFile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "SediOrderParamsOut");
            cachedSerQNames.add(qName);
            cls = com.maventa.secure.SediOrderParamsOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "SediOrderParamsOutArray");
            cachedSerQNames.add(qName);
            cls = com.maventa.secure.SediOrderParamsOut[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "SediOrderParamsOut");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "SediOrderStatus");
            cachedSerQNames.add(qName);
            cls = com.maventa.secure.SediOrderStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "SettingValue");
            cachedSerQNames.add(qName);
            cls = com.maventa.secure.SettingValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "SettingValueArray");
            cachedSerQNames.add(qName);
            cls = com.maventa.secure.SettingValue[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "SettingValue");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "SettingValuesOut");
            cachedSerQNames.add(qName);
            cls = com.maventa.secure.SettingValuesOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "StringArray");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "TrxListItemD");
            cachedSerQNames.add(qName);
            cls = com.maventa.secure.TrxListItemD.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "TrxListItemDArray");
            cachedSerQNames.add(qName);
            cls = com.maventa.secure.TrxListItemD[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "TrxListItemD");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "TrxListResponseD");
            cachedSerQNames.add(qName);
            cls = com.maventa.secure.TrxListResponseD.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "UserParamsInD");
            cachedSerQNames.add(qName);
            cls = com.maventa.secure.UserParamsInD.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "UserParamsInE");
            cachedSerQNames.add(qName);
            cls = com.maventa.secure.UserParamsInE.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "UserParamsOut");
            cachedSerQNames.add(qName);
            cls = com.maventa.secure.UserParamsOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "UserParamsOutArray");
            cachedSerQNames.add(qName);
            cls = com.maventa.secure.UserParamsOut[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "UserParamsOut");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "VendorAction");
            cachedSerQNames.add(qName);
            cls = com.maventa.secure.VendorAction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "VendorActionArray");
            cachedSerQNames.add(qName);
            cls = com.maventa.secure.VendorAction[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "VendorAction");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://secure.maventa.com/", "VendorActionOutput");
            cachedSerQNames.add(qName);
            cls = com.maventa.secure.VendorActionOutput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
                    _call.setEncodingStyle(org.apache.axis.Constants.URI_SOAP11_ENC);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public java.lang.String get_invoice_id(com.maventa.secure.ApiKeys api_keys, java.lang.String invoice_number) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("/denver/api/get_invoice_id");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://secure.maventa.com/", "get_invoice_id"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {api_keys, invoice_number});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String company_invoice_receiving(com.maventa.secure.ApiKeys api_keys, boolean receive) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("/denver/api/company_invoice_receiving");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://secure.maventa.com/", "company_invoice_receiving"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {api_keys, new java.lang.Boolean(receive)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.maventa.secure.InboundInvoiceParamsOutC[] invoice_list_inbound_between_dates(com.maventa.secure.ApiKeys api_keys, java.lang.String timestamp_start, java.lang.String timestamp_end) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("/denver/api/invoice_list_inbound_between_dates");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://secure.maventa.com/", "invoice_list_inbound_between_dates"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {api_keys, timestamp_start, timestamp_end});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.maventa.secure.InboundInvoiceParamsOutC[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.maventa.secure.InboundInvoiceParamsOutC[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.maventa.secure.InboundInvoiceParamsOutC[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.maventa.secure.CompanyParamsOut[] company_list(com.maventa.secure.ApiKeys api_keys) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("/denver/api/company_list");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://secure.maventa.com/", "company_list"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {api_keys});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.maventa.secure.CompanyParamsOut[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.maventa.secure.CompanyParamsOut[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.maventa.secure.CompanyParamsOut[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String user_update_e(com.maventa.secure.ApiKeys api_keys, java.lang.String id, com.maventa.secure.UserParamsInE user_params) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("/denver/api/user_update_e");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://secure.maventa.com/", "user_update_e"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {api_keys, id, user_params});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.maventa.secure.CompanyActionOutput list_company_actions(com.maventa.secure.ApiKeys api_keys, java.lang.String timestamp) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("/denver/api/list_company_actions");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://secure.maventa.com/", "list_company_actions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {api_keys, timestamp});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.maventa.secure.CompanyActionOutput) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.maventa.secure.CompanyActionOutput) org.apache.axis.utils.JavaUtils.convert(_resp, com.maventa.secure.CompanyActionOutput.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.maventa.secure.FileOut invoice_show_operator_file(com.maventa.secure.ApiKeys api_keys, java.lang.String id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("/denver/api/invoice_show_operator_file");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://secure.maventa.com/", "invoice_show_operator_file"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {api_keys, id});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.maventa.secure.FileOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.maventa.secure.FileOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.maventa.secure.FileOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String user_update(com.maventa.secure.ApiKeys api_keys, java.lang.String id, com.maventa.secure.UserParamsInD user_params) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("/denver/api/user_update");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://secure.maventa.com/", "user_update"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {api_keys, id, user_params});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.maventa.secure.InvoiceStatus invoice_put_finvoice(com.maventa.secure.ApiKeys api_keys, com.maventa.secure.FinvoiceTrx finvoice_in) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("/denver/api/invoice_put_finvoice");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://secure.maventa.com/", "invoice_put_finvoice"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {api_keys, finvoice_in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.maventa.secure.InvoiceStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.maventa.secure.InvoiceStatus) org.apache.axis.utils.JavaUtils.convert(_resp, com.maventa.secure.InvoiceStatus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.maventa.secure.PostalAddressParamsOut[] postal_address_list(com.maventa.secure.ApiKeys api_keys) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("/denver/api/postal_address_list");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://secure.maventa.com/", "postal_address_list"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {api_keys});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.maventa.secure.PostalAddressParamsOut[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.maventa.secure.PostalAddressParamsOut[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.maventa.secure.PostalAddressParamsOut[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.maventa.secure.FileAttachment[] get_invoice_image_as_format(com.maventa.secure.ApiKeys api_keys, java.lang.String id, java.lang.String image_format) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("/denver/api/get_invoice_image_as_format");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://secure.maventa.com/", "get_invoice_image_as_format"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {api_keys, id, image_format});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.maventa.secure.FileAttachment[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.maventa.secure.FileAttachment[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.maventa.secure.FileAttachment[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.maventa.secure.CollectionResponse[] collection_send(com.maventa.secure.ApiKeys api_keys, java.lang.String[] invoices, java.lang.String collection_type) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("/denver/api/collection_send");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://secure.maventa.com/", "collection_send"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {api_keys, invoices, collection_type});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.maventa.secure.CollectionResponse[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.maventa.secure.CollectionResponse[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.maventa.secure.CollectionResponse[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.maventa.secure.CompanyLookupOutExtended[] company_lookup_with_operator(com.maventa.secure.ApiKeys api_keys, com.maventa.secure.CompanyLookupParams company_lookup_params) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("/denver/api/company_lookup_with_operator");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://secure.maventa.com/", "company_lookup_with_operator"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {api_keys, company_lookup_params});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.maventa.secure.CompanyLookupOutExtended[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.maventa.secure.CompanyLookupOutExtended[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.maventa.secure.CompanyLookupOutExtended[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.maventa.secure.UserParamsOut[] user_list(com.maventa.secure.ApiKeys api_keys) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("/denver/api/user_list");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://secure.maventa.com/", "user_list"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {api_keys});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.maventa.secure.UserParamsOut[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.maventa.secure.UserParamsOut[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.maventa.secure.UserParamsOut[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String server_time() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("/denver/api/server_time");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://secure.maventa.com/", "server_time"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String invoice_confirm(com.maventa.secure.ApiKeys api_keys, java.lang.String id, java.lang.String payment_date) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("/denver/api/invoice_confirm");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://secure.maventa.com/", "invoice_confirm"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {api_keys, id, payment_date});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.maventa.secure.InvoiceStatus invoice_put_invoice(com.maventa.secure.ApiKeys api_keys, com.maventa.secure.FileAttachment file_in, java.lang.String xmlformat) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("/denver/api/invoice_put_invoice");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://secure.maventa.com/", "invoice_put_invoice"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {api_keys, file_in, xmlformat});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.maventa.secure.InvoiceStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.maventa.secure.InvoiceStatus) org.apache.axis.utils.JavaUtils.convert(_resp, com.maventa.secure.InvoiceStatus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String unlink_vendor_api_key(com.maventa.secure.ApiKeys api_keys) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("/denver/api/unlink_vendor_api_key");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://secure.maventa.com/", "unlink_vendor_api_key"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {api_keys});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.maventa.secure.OperatorInfo[] list_operators() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("/denver/api/list_operators");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://secure.maventa.com/", "list_operators"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.maventa.secure.OperatorInfo[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.maventa.secure.OperatorInfo[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.maventa.secure.OperatorInfo[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.maventa.secure.CompanyParamsOut company_show(com.maventa.secure.ApiKeys api_keys) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("/denver/api/company_show");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://secure.maventa.com/", "company_show"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {api_keys});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.maventa.secure.CompanyParamsOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.maventa.secure.CompanyParamsOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.maventa.secure.CompanyParamsOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.maventa.secure.InvoiceState[] invoice_state_list(com.maventa.secure.ApiKeys api_keys, java.lang.String[] invoices) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("/denver/api/invoice_state_list");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://secure.maventa.com/", "invoice_state_list"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {api_keys, invoices});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.maventa.secure.InvoiceState[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.maventa.secure.InvoiceState[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.maventa.secure.InvoiceState[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.maventa.secure.CompanyLookupOutD[] company_lookup(com.maventa.secure.ApiKeys api_keys, com.maventa.secure.CompanyLookupParams company_lookup_params) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("/denver/api/company_lookup");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://secure.maventa.com/", "company_lookup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {api_keys, company_lookup_params});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.maventa.secure.CompanyLookupOutD[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.maventa.secure.CompanyLookupOutD[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.maventa.secure.CompanyLookupOutD[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.maventa.secure.CompanySettingsParamsD company_settings_show(com.maventa.secure.ApiKeys api_keys) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("/denver/api/company_settings_show");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://secure.maventa.com/", "company_settings_show"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {api_keys});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.maventa.secure.CompanySettingsParamsD) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.maventa.secure.CompanySettingsParamsD) org.apache.axis.utils.JavaUtils.convert(_resp, com.maventa.secure.CompanySettingsParamsD.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String hello_world() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("/denver/api/hello_world");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://secure.maventa.com/", "hello_world"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String invoice_accept(com.maventa.secure.ApiKeys api_keys, java.lang.String id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("/denver/api/invoice_accept");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://secure.maventa.com/", "invoice_accept"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {api_keys, id});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String postal_address_create(com.maventa.secure.ApiKeys api_keys, com.maventa.secure.PostalAddressParamsIn postal_address_params) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("/denver/api/postal_address_create");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://secure.maventa.com/", "postal_address_create"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {api_keys, postal_address_params});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.maventa.secure.VendorActionOutput list_vendor_actions(com.maventa.secure.ApiKeys api_keys, java.lang.String timestamp) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("/denver/api/list_vendor_actions");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://secure.maventa.com/", "list_vendor_actions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {api_keys, timestamp});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.maventa.secure.VendorActionOutput) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.maventa.secure.VendorActionOutput) org.apache.axis.utils.JavaUtils.convert(_resp, com.maventa.secure.VendorActionOutput.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.maventa.secure.SediOrderStatus sedi_order_put(com.maventa.secure.ApiKeys api_keys, com.maventa.secure.FileAttachment order_in) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("/denver/api/sedi_order_put");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://secure.maventa.com/", "sedi_order_put"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {api_keys, order_in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.maventa.secure.SediOrderStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.maventa.secure.SediOrderStatus) org.apache.axis.utils.JavaUtils.convert(_resp, com.maventa.secure.SediOrderStatus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String configure_company(com.maventa.secure.ApiKeys api_keys, com.maventa.secure.SettingValue[] settings) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("/denver/api/configure_company");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://secure.maventa.com/", "configure_company"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {api_keys, settings});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.maventa.secure.InvoiceParamsOutD invoice_show(com.maventa.secure.ApiKeys api_keys, java.lang.String id, boolean include_files, java.lang.String xmlformat) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("/denver/api/invoice_show");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://secure.maventa.com/", "invoice_show"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {api_keys, id, new java.lang.Boolean(include_files), xmlformat});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.maventa.secure.InvoiceParamsOutD) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.maventa.secure.InvoiceParamsOutD) org.apache.axis.utils.JavaUtils.convert(_resp, com.maventa.secure.InvoiceParamsOutD.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.maventa.secure.InboundInvoiceList list_vendor_inbound_invoices(com.maventa.secure.ApiKeys api_keys, java.lang.String timestamp_start, java.lang.String timestamp_end) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("/denver/api/list_vendor_inbound_invoices");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://secure.maventa.com/", "list_vendor_inbound_invoices"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {api_keys, timestamp_start, timestamp_end});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.maventa.secure.InboundInvoiceList) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.maventa.secure.InboundInvoiceList) org.apache.axis.utils.JavaUtils.convert(_resp, com.maventa.secure.InboundInvoiceList.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.maventa.secure.InvoiceStatus invoice_create(com.maventa.secure.ApiKeys api_keys, com.maventa.secure.InvoiceParamsInC invoice_params) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("/denver/api/invoice_create");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://secure.maventa.com/", "invoice_create"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {api_keys, invoice_params});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.maventa.secure.InvoiceStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.maventa.secure.InvoiceStatus) org.apache.axis.utils.JavaUtils.convert(_resp, com.maventa.secure.InvoiceStatus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.maventa.secure.InboundInvoiceParamsOutC inbound_invoice_show(com.maventa.secure.ApiKeys api_keys, java.lang.String id, boolean include_files, java.lang.String xmlformat) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("/denver/api/inbound_invoice_show");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://secure.maventa.com/", "inbound_invoice_show"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {api_keys, id, new java.lang.Boolean(include_files), xmlformat});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.maventa.secure.InboundInvoiceParamsOutC) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.maventa.secure.InboundInvoiceParamsOutC) org.apache.axis.utils.JavaUtils.convert(_resp, com.maventa.secure.InboundInvoiceParamsOutC.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String user_delete(com.maventa.secure.ApiKeys api_keys, java.lang.String id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("/denver/api/user_delete");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://secure.maventa.com/", "user_delete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {api_keys, id});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.maventa.secure.RegistrationParamsOutD register(com.maventa.secure.RegistrationParamsInD registration_params) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("/denver/api/register");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://secure.maventa.com/", "register"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {registration_params});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.maventa.secure.RegistrationParamsOutD) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.maventa.secure.RegistrationParamsOutD) org.apache.axis.utils.JavaUtils.convert(_resp, com.maventa.secure.RegistrationParamsOutD.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String company_settings_update(com.maventa.secure.ApiKeys api_keys, com.maventa.secure.CompanySettingsParamsD company_setting_params) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("/denver/api/company_settings_update");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://secure.maventa.com/", "company_settings_update"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {api_keys, company_setting_params});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String remove_logo(com.maventa.secure.ApiKeys api_keys) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("/denver/api/remove_logo");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://secure.maventa.com/", "remove_logo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {api_keys});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.maventa.secure.ScanAccountParamsOut scan_account_show(com.maventa.secure.ApiKeys api_keys) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[37]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("/denver/api/scan_account_show");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://secure.maventa.com/", "scan_account_show"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {api_keys});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.maventa.secure.ScanAccountParamsOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.maventa.secure.ScanAccountParamsOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.maventa.secure.ScanAccountParamsOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.maventa.secure.InvoiceStatus invoice_put_invoice_with_metadata(com.maventa.secure.ApiKeys api_keys, com.maventa.secure.FileAttachment file_in, java.lang.String xmlformat, java.lang.String metadata) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[38]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("/denver/api/invoice_put_invoice_with_metadata");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://secure.maventa.com/", "invoice_put_invoice_with_metadata"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {api_keys, file_in, xmlformat, metadata});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.maventa.secure.InvoiceStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.maventa.secure.InvoiceStatus) org.apache.axis.utils.JavaUtils.convert(_resp, com.maventa.secure.InvoiceStatus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.maventa.secure.RegistrationParamsOutD register_with_password(com.maventa.secure.RegistrationParamsInD registration_params, java.lang.String user_password) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[39]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("/denver/api/register_with_password");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://secure.maventa.com/", "register_with_password"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {registration_params, user_password});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.maventa.secure.RegistrationParamsOutD) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.maventa.secure.RegistrationParamsOutD) org.apache.axis.utils.JavaUtils.convert(_resp, com.maventa.secure.RegistrationParamsOutD.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String enable_operator(com.maventa.secure.ApiKeys api_keys, com.maventa.secure.OperatorStruct operator_struct) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[40]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("/denver/api/enable_operator");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://secure.maventa.com/", "enable_operator"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {api_keys, operator_struct});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.maventa.secure.PostalAddressParamsOut postal_address_show(com.maventa.secure.ApiKeys api_keys, java.lang.String id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[41]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("/denver/api/postal_address_show");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://secure.maventa.com/", "postal_address_show"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {api_keys, id});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.maventa.secure.PostalAddressParamsOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.maventa.secure.PostalAddressParamsOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.maventa.secure.PostalAddressParamsOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.maventa.secure.FileStatus[] invoice_put_file(com.maventa.secure.ApiKeys api_keys, com.maventa.secure.FileAttachment file_in) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[42]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("/denver/api/invoice_put_file");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://secure.maventa.com/", "invoice_put_file"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {api_keys, file_in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.maventa.secure.FileStatus[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.maventa.secure.FileStatus[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.maventa.secure.FileStatus[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.maventa.secure.SediOrderParamsOut[] sedi_order_list_inbound(com.maventa.secure.ApiKeys api_keys, java.lang.String timestamp) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[43]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("/denver/api/sedi_order_list_inbound");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://secure.maventa.com/", "sedi_order_list_inbound"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {api_keys, timestamp});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.maventa.secure.SediOrderParamsOut[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.maventa.secure.SediOrderParamsOut[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.maventa.secure.SediOrderParamsOut[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.maventa.secure.FileOut invoice_show_original_xml(com.maventa.secure.ApiKeys api_keys, java.lang.String id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[44]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("/denver/api/invoice_show_original_xml");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://secure.maventa.com/", "invoice_show_original_xml"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {api_keys, id});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.maventa.secure.FileOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.maventa.secure.FileOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.maventa.secure.FileOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String company_order_receiving(com.maventa.secure.ApiKeys api_keys, boolean receive) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[45]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("/denver/api/company_order_receiving");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://secure.maventa.com/", "company_order_receiving"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {api_keys, new java.lang.Boolean(receive)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String update_logo(com.maventa.secure.ApiKeys api_keys, com.maventa.secure.CompanyLogoParams company_logo_params) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[46]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("/denver/api/update_logo");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://secure.maventa.com/", "update_logo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {api_keys, company_logo_params});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String postal_address_update(com.maventa.secure.ApiKeys api_keys, java.lang.String id, com.maventa.secure.PostalAddressParamsIn postal_address_params) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[47]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("/denver/api/postal_address_update");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://secure.maventa.com/", "postal_address_update"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {api_keys, id, postal_address_params});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String invoice_decline(com.maventa.secure.ApiKeys api_keys, java.lang.String id, java.lang.String message) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[48]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("/denver/api/invoice_decline");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://secure.maventa.com/", "invoice_decline"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {api_keys, id, message});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.maventa.secure.UserParamsOut user_show(com.maventa.secure.ApiKeys api_keys, java.lang.String id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[49]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("/denver/api/user_show");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://secure.maventa.com/", "user_show"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {api_keys, id});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.maventa.secure.UserParamsOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.maventa.secure.UserParamsOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.maventa.secure.UserParamsOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.maventa.secure.TrxListResponseD partner_trx_list(com.maventa.secure.ApiKeys api_keys, java.lang.String date_start, java.lang.String date_end, boolean csv_file) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[50]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("/denver/api/partner_trx_list");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://secure.maventa.com/", "partner_trx_list"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {api_keys, date_start, date_end, new java.lang.Boolean(csv_file)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.maventa.secure.TrxListResponseD) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.maventa.secure.TrxListResponseD) org.apache.axis.utils.JavaUtils.convert(_resp, com.maventa.secure.TrxListResponseD.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.maventa.secure.ScanAccountParamsOut scan_account_order(com.maventa.secure.ApiKeys api_keys, com.maventa.secure.ScanAddress return_address) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[51]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("/denver/api/scan_account_order");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://secure.maventa.com/", "scan_account_order"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {api_keys, return_address});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.maventa.secure.ScanAccountParamsOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.maventa.secure.ScanAccountParamsOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.maventa.secure.ScanAccountParamsOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String link_vendor_api_key(com.maventa.secure.ApiKeys api_keys) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[52]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("/denver/api/link_vendor_api_key");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://secure.maventa.com/", "link_vendor_api_key"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {api_keys});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.maventa.secure.SettingValuesOut show_company_configuration(com.maventa.secure.ApiKeys api_keys) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[53]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("/denver/api/show_company_configuration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://secure.maventa.com/", "show_company_configuration"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {api_keys});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.maventa.secure.SettingValuesOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.maventa.secure.SettingValuesOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.maventa.secure.SettingValuesOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String user_create(com.maventa.secure.ApiKeys api_keys, com.maventa.secure.UserParamsInD user_params) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[54]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("/denver/api/user_create");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://secure.maventa.com/", "user_create"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {api_keys, user_params});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.maventa.secure.InvoiceParamsOutC[] invoice_list_between_dates(com.maventa.secure.ApiKeys api_keys, java.lang.String timestamp_start, java.lang.String timestamp_end, int all) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[55]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("/denver/api/invoice_list_between_dates");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://secure.maventa.com/", "invoice_list_between_dates"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {api_keys, timestamp_start, timestamp_end, new java.lang.Integer(all)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.maventa.secure.InvoiceParamsOutC[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.maventa.secure.InvoiceParamsOutC[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.maventa.secure.InvoiceParamsOutC[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String postal_address_delete(com.maventa.secure.ApiKeys api_keys, java.lang.String id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[56]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("/denver/api/postal_address_delete");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://secure.maventa.com/", "postal_address_delete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {api_keys, id});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.maventa.secure.SediOrderFile sedi_order_show_inbound(com.maventa.secure.ApiKeys api_keys, java.lang.String order_id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[57]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("/denver/api/sedi_order_show_inbound");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://secure.maventa.com/", "sedi_order_show_inbound"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {api_keys, order_id});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.maventa.secure.SediOrderFile) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.maventa.secure.SediOrderFile) org.apache.axis.utils.JavaUtils.convert(_resp, com.maventa.secure.SediOrderFile.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String invoice_dispute(com.maventa.secure.ApiKeys api_keys, java.lang.String id, java.lang.String message) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[58]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("/denver/api/invoice_dispute");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://secure.maventa.com/", "invoice_dispute"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {api_keys, id, message});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String user_create_e(com.maventa.secure.ApiKeys api_keys, com.maventa.secure.UserParamsInE user_params) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[59]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("/denver/api/user_create_e");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://secure.maventa.com/", "user_create_e"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {api_keys, user_params});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}

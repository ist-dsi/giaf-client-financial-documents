Giaf Client for Generating Financial Documents
===

The current implementation allows the client to generate an invoice in a Giaf 
Financial installation. This service is provided by Giaf via a SOAP web service.


#Generating Stubs

To generate the necessary stubs you can obtain the WSDL and use the wsimport 
tool (for example) to generate the source code. Here is an example command line 
instruction to do this:

```
wsimport -keep -verbose -Xnocompile -s src/main/java http://mygiaftest.adm:8080/mygiaf/services/ISTExternalServices?wsdl
```

This step only needs to be done in case the web service is changes, otherwise 
this software package already provides the generated stubs.


#Configuring the Client

To configure the client you must provide authentication credentials that will 
be used on invocations to the web service. To do this set a valid password for 
property:

```
pt.indra.mygiaf.services.ist.istexternalservices.ISTExternalServicesPortType.password
```

in your applications /configuration.properties file.


#Using the Client

A simple client java API is provided by the following class: 

```
pt.ist.giaf.client.financialDocuments.InvoiceClient
```

In this class the produceInvoice() method receives a JSON object with the 
following structure:

```
{
    "id": "<value>",
    "date": "<value>",
    "type": "<value>",
    "series": "<value>",
    "group": "<value>",
    "clientId": "<value>",
    "vatNumber": "<value>",
    "name": "<value>",
    "country": "<value>",
    "postalCode": "<value>",
    "locality": "<value>",
    "street": "<value>",
    "doorNumber": <value>,
    "paymentType": "<value>",
    "sellerId": "<value>",
    "currency": "<value>",
    "accountingUnit": "<value>",
    "reference": "<value>",
    "observation": "<value>",
    "username": "<value>",
    "invoiceId"; "<value>",
    "dueDate"; "<value>",
    "paymentDate"; "<value>",
    "paymentMethod"; "<value>",
    "documentNumber"; "<value>",
    "entries": [
    	{
            "line": <value>,
            "type": "<value>",
            "article": "<value>",
            "description": "<value>",
            "unitType": "<value>",
            "quantity": <value>,
            "unitPrice": <value>,
            "vat": <value>,
            "discount": <value>,
            "costCenter": "<value>",
            "responsible": "<value>",
            "subCenter": "<value>",
            "legalArticle": "<value>",
            "rubrica": "<value>",
            "observation": "<value>"
    	}
    ]
}
```

The result of this method is also a JSON object but with the following structure:

```
{
    "documentNumber": "<value>",
    "pdfBase64": "<value>",
    "errorMessage": "<value>"
}
```


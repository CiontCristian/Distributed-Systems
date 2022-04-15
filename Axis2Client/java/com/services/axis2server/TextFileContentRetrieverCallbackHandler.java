
/**
 * TextFileContentRetrieverCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */

    package com.services.axis2server;

    /**
     *  TextFileContentRetrieverCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class TextFileContentRetrieverCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public TextFileContentRetrieverCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public TextFileContentRetrieverCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for retrieveTextFileContent method
            * override this method for handling normal response from retrieveTextFileContent operation
            */
           public void receiveResultretrieveTextFileContent(
                    com.services.axis2server.TextFileContentRetrieverStub.RetrieveTextFileContentResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from retrieveTextFileContent operation
           */
            public void receiveErrorretrieveTextFileContent(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for test method
            * override this method for handling normal response from test operation
            */
           public void receiveResulttest(
                    com.services.axis2server.TextFileContentRetrieverStub.TestResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from test operation
           */
            public void receiveErrortest(java.lang.Exception e) {
            }
                


    }
    
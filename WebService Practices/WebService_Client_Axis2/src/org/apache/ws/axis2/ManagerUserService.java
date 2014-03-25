

/**
 * ManagerUserService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package org.apache.ws.axis2;

    /*
     *  ManagerUserService java interface
     */

    public interface ManagerUserService {
          

        /**
          * Auto generated method signature
          * 
                    * @param editUser0
                
         */

         
                     public org.apache.ws.axis2.EditUserResponse editUser(

                        org.apache.ws.axis2.EditUser editUser0)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param editUser0
            
          */
        public void starteditUser(

            org.apache.ws.axis2.EditUser editUser0,

            final org.apache.ws.axis2.ManagerUserServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getUsers2
                
         */

         
                     public org.apache.ws.axis2.GetUsersResponse getUsers(

                        org.apache.ws.axis2.GetUsers getUsers2)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getUsers2
            
          */
        public void startgetUsers(

            org.apache.ws.axis2.GetUsers getUsers2,

            final org.apache.ws.axis2.ManagerUserServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getUserArray4
                
         */

         
                     public org.apache.ws.axis2.GetUserArrayResponse getUserArray(

                        org.apache.ws.axis2.GetUserArray getUserArray4)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getUserArray4
            
          */
        public void startgetUserArray(

            org.apache.ws.axis2.GetUserArray getUserArray4,

            final org.apache.ws.axis2.ManagerUserServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getUserMap6
                
         */

         
                     public org.apache.ws.axis2.GetUserMapResponse getUserMap(

                        org.apache.ws.axis2.GetUserMap getUserMap6)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getUserMap6
            
          */
        public void startgetUserMap(

            org.apache.ws.axis2.GetUserMap getUserMap6,

            final org.apache.ws.axis2.ManagerUserServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    
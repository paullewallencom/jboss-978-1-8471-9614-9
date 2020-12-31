<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>

<html>
 <head>
  <title></title>
 </head>
 <body>
  <f:view>
   <h2>Registration successfully done!</h2>
    <h:panelGrid columns="2">
     <h:outputText value="Inserted Name:"/>
     <h:outputText value="#{personBean.personName}"/>
    <h:outputText value="Inserted Age:"/>
    <h:outputText value="#{personBean.personAge}"/>
    <h:outputText value="Inserted Birth Date:"/>
    <h:outputText value="#{personBean.personBirthDate}"/>
    <h:outputText value="Inserted Phone Number:"/>
    <h:outputText value="#{personBean.personPhone.allNumber}"/>
    <h:outputText value="Inserted Phone Number Country Code:"/>
    <h:outputText value="#{personBean.personPhone.countryCode}"/>
    <h:outputText value="Inserted Phone Number Area Code:"/>
    <h:outputText value="#{personBean.personPhone.areaCode}"/>
    <h:outputText value="Inserted Phone Number Prefix:"/>
    <h:outputText value="#{personBean.personPhone.prefixNumber}"/>
   </h:panelGrid>
  </f:view>
 </body>	
</html>  

<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>

<html>
<head>
<title></title>
</head>
<body>
<f:view>
	<h2>Registration form:</h2>
	<h:form id="success">
		<h:panelGrid columns="3">
			<h:outputLabel for="#{personBean.personName}" id="personNameLabel">
				<h:outputText value="Your Name:" />
			</h:outputLabel>
			<h:inputText value="#{personBean.personName}" id="personName" />
			<h:message for="personName" id="personNameError"
				style="color: red; text-decoration: overline" />
			<h:outputLabel for="#{personBean.personAge}" id="personAgeLabel">
				<h:outputText value="Your Age:" />
			</h:outputLabel>
			<h:inputText id="personAge" value="#{personBean.personAge}">
				<f:converter converterId="javax.faces.Integer" />
				<f:validateLongRange maximum="150" minimum="0" />
			</h:inputText>
			<h:message for="personAge" id="personAgeError"
				style="color: red; text-decoration: overline" />
			<h:outputLabel for="#{personBean.personBirthDate}"
				id="personBirthDateLabel">
				<h:outputText value="Your Birth Date (dd/MM/yyyy):" />
			</h:outputLabel>
			<h:inputText id="personBirthDate"
				value="#{personBean.personBirthDate}">
				<f:convertDateTime pattern="dd/MM/yyyy" />
			</h:inputText>
			<h:message for="personBirthDate" id="personBirthDateError"
				style="color: red; text-decoration: overline" />
			<h:outputLabel for="#{personBean.personPhone}" id="personPhoneLabel">
				<h:outputText value="Your Phone Number (x[x]-xxx-xxx-xxxx):" />
			</h:outputLabel>
			<h:inputText id="personPhone" value="#{personBean.personPhone}">
				<f:converter converterId="phoneConverter" />
				<f:validator validatorId="phoneValidator" />
			</h:inputText>
			<h:message for="personPhone" id="personPhoneError"
				style="color: red; text-decoration: overline" />
		</h:panelGrid>
		<h:commandButton action="success" value="Register" />

	</h:form>

</f:view>
</body>
</html>

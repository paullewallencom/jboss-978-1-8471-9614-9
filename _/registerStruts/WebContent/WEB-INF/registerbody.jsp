<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<html:javascript formName="registerFormBean"/>

<table bgcolor="#c0c0c0" border="1" width="100%">
	<tr>
		<th>		
		<html:errors/> 
		<html:form action="/success.do"> <!-- onsubmit="return validateRegisterFormBean(this)" -->
			Your name:<html:text property="name"/>
			Your zip:<html:text property="zip"/>
			Your e-mail:<html:text property="email"/>
			<html:submit value="Register">				
			</html:submit>
		</html:form>		
		</th>
	</tr>
</table>

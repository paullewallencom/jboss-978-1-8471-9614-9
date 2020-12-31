<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<table bgcolor="#c0c0c0" border="1" width="100%">
	<tr>
		<td>
		 Inserted name:<bean:write name="registerFormBean"  
                                 property="name"/>
		</td>
		<td> 
		 Inserted zip:<bean:write name="registerFormBean" 
                                 property="zip"/>
		</td>
		<td> 
		 Inserted e-mail:<bean:write name="registerFormBean" 
                                   property="email"/>
		</td>
	</tr>
</table>

<%@ taglib uri="http://java.sun.com/portlet" prefix="portlet" %>

<h3>Edit Temperature Preferences</h3>
<br />
<%=request.getAttribute("errorAttr")%>
<br />
<form method="post" action="<portlet:actionURL/>">
<table>
  <tr>
      <td>FROM:</td>
      <td><input type="text" name="from_what" value="<%= request.getAttribute("fromWhatAttr") %>"></td>
  </tr>
  <tr>  
      <td>TO:</td>
      <td><input type="text" name="to_what" value="<%= request.getAttribute("toWhatAttr") %>"></td>
  </tr>    
  <tr>
   <td><input type="submit" value="Send"></td>
   <td><input type="reset" value="Reset"></td>
  </tr>
 </table>
</form>

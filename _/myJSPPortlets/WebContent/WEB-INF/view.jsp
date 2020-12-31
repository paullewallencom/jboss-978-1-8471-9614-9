<%@ taglib uri="http://java.sun.com/portlet" prefix="portlet" %>

<h3>Converter Temperature</h3>
<br />
<%=request.getAttribute("errorAttr")%>
<br />
<p>
Conversion Type: <%= request.getAttribute("fromWhatAttr") %> to <%= request.getAttribute("toWhatAttr") %><br />
Value to convert: <%= request.getAttribute("tempValAttr") %><br />
Conversion result: <%= request.getAttribute("convValAttr") %><br />

<form method="post" action="<portlet:actionURL/>">
Enter New Temperature (convert from <%= request.getAttribute("fromWhatAttr") %> to <%= request.getAttribute("toWhatAttr") %>):<br />

<input type="text" name="temp_val" value="">
<input type="submit" name="submit" value="Convert">

</form>
<p>

<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
<html>
<head>
	<title>
		<tiles:getAsString name="tiles.title"/>
	</title>
</head>	
 <body>    
	<tiles:insert attribute="tiles.header"></tiles:insert>
	<tiles:getAsString name="tiles.title"/>
	<tiles:insert attribute="tiles.body"></tiles:insert>
	<tiles:insert attribute="tiles.footer"></tiles:insert>		
 </body>
</html>

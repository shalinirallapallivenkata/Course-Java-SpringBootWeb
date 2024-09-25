<%--Spring looks for folder webapp for homepage i.e: index.jsp--%>
<%@page language="java" %>
<%-- inside this there is java code run it with html tags--%>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="../../resources/static/style.css">
</head>
<body>
<%--<h2>A Result Page:  <%=session.getAttribute("result")%></h2>--%>
<%--putting into jsp code. adding java code in jsp--%>
<%--jsp gives the session object added in HomeController--%>
<%--put = to get the value in jsp code--%>
<%--or--%>
<%--<h2>A Result Page: ${result}</h2>--%>
<h2>Simple Developer Page</h2>
<p>${developer}</p>
<h2>Welcome to ${name} World!</h2>
<%--can be done by jstl way -- JSP standard library allows u to use some tags like above and add $ saying it is jstl--%>
</body>
</html>

<%--jsp is view technology.jsp. index.jsp. Request goes to controller. JSP will be called by JSP not client--%>
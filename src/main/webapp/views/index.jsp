<%--Spring looks for folder webapp for homepage i.e: index.jsp--%>
<%@page language="java" %>
<%-- inside this there is java code run it with html tags--%>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="../../resources/static/style.css">
</head>
    <body>
        <h2>A simple JSP Page</h2>
<%--        <form action="add">--%>
<%--            <label for="numOne">Enter the first number :</label>--%>
<%--            <input type="text" id="numOne" name="numOne"><br>--%>
<%--            <label for="numTwo">Enter the second number :</label>--%>
<%--            <input type="text" id="numTwo" name="numTwo"><br>--%>
<%--            <input type="submit" value="submit">--%>
<%--        </form>--%>
            <form action="addDeveloper">
                <label for="devId">Enter the developer id :</label>
                <input type="text" id="devId" name="devId"><br>
                <label for="devName">Enter the developer name :</label>
                <input type="text" id="devname" name="devName"><br>
                <input type="submit" value="submit">
            </form>
    </body>
</html>

<%--jsp is view technology.jsp. index.jsp. Request goes to controller. JSP will be called by JSP not client--%>
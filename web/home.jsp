<%@ page import="java.util.Scanner" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    out.println("Hiiii");
//    Scanner scanner = new Scanner(System.in);
%>
<h1>Hello World!</h1>
<%!
    int coef = 9;

    public int adunare() {
        return coef + 9;
    }
%>
<%out.println(adunare() + 5);%>

My favourite number is <%=coef%>

</body>
</html>

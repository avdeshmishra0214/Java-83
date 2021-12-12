<%@page import="java.util.Date" language="java" info="JSP Program for Directives" %>
<h2>
<%
 Date today = new Date();
 out.println(today);
%>
<hr>
<%=getServletInfo() %>
</h2>
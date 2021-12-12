<h2>
<%
 String uid = request.getParameter("txt_uid");
 out.println("Hello, " + uid);
 pageContext.setAttribute("name", uid, pageContext.SESSION_SCOPE);
%>
</h2>
<a href="pagecontext2.jsp">Next Page</a>
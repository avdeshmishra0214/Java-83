<!-- declaration block -->
<%!
 String cname = "edureka";
 public int add(int x, int y){
	 return x+y;
 }
%>
<h2>
<%
 out.println("My Company = " + cname + "<br>");
 out.println("Sum = " + add(11,43));
%>
</h2>
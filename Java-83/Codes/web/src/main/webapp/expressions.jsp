<%!
 String cname = "edureka";
 public int add(int x, int y){
	 return x+y;
 }
%>
<h2>
My Company Name = <%=cname %>
<br><br>
<%= "Sum = " + add(12,32) %>
</h2>
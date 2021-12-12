<html>
	<head>
		<title>jsp</title>
		<style>
			body{
				text-align:center;
				background:linear-gradient(to right, red, yellow, red)
			}
		</style>
	</head>
	<body>
		<h1>
			<%
			 out.println("edureka limited");
			%>
		</h1>	
		<h3>
			<%
			 out.println("bangalore, karnataka, India");	
			%>
		</h3>
		<p style=text-align:left;font-size:20px;>
			<%
				int a = 10;
				int b = 21;
				int c = a + b;
				out.println(a + " + " + b + " = " + c);
			%>
		</p>
	</body>
</html>
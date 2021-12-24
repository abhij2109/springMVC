<!DOCTYPE html>
<html>
	<body>
		<h1>This is Body.</h1>
		<%
			String name=(String)request.getAttribute("name");
			Integer n=(Integer)request.getAttribute("id");
			List<String> friend=(List<String>)request.getAttribute("f");
		%>
		<h1>Name is:<%=name%></h1>
		<h2>Id is:<%=n%></h2>

		<%
			for(String s: friend)
			{
				out.pritnln(s);
			}
		%>
	</body>
</html>






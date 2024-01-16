<html>
	<head>
	 <title>useBean,setProperty and getProperty action example</title>
	</head>
	<body>
	 <h4>Student detail:</h4>
	 <jsp:useBean id="student" class="com.java.User"/>
         <jsp:setProperty name="student" property="*"/>
         Name:<jsp:getProperty name="student" property="name"/><br>
         RollNo:<jsp:getProperty name="student" property="rollNo"/><br>
	</body>
</html>
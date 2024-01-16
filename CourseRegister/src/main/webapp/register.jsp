<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
   .container{
         width: 40%;
         border: 1px solid black;
         margin: auto;
         padding: 20px;
         font-size: 20px;
   }
   
   #myfrom table tr td input textarea{
         font-size: 20px;
   }
</style>
</head>
<body>
	<div class="container">
		<h1>Course Registration</h1>

		<form id="myform" action="RegisterServlet" method="post">
			<table>
				<tr>
					<td> Course Id :</td>
					<td><input type="number" name="courseId" required="required" /></td>
				</tr>

				<tr>
					<td>Course Name :</td>
					<td><input type="text" name="courseName" required="required" /></td>
				</tr>

				<tr>
					<td>Course Details :</td>
					<td><textarea name="courseDetails" rows="4" cols="40" required></textarea></td>
				</tr>

				<tr>
					<td>Joining Date :</td>
					<td><input type="date" name="joiningDate" required></td>
				</tr>

				<tr>
					<td><label for="budget">Budget :</label></td>
					<td><select id="budget" name="budget">
							<option>Select an Option</option>
							<option >3000 - 5000</option>
							<option >5000 - 8000</option>
							<option >8000 - 500000</option>
					</select></td>
				</tr>

				<tr>
					<td><label>Courses:</label></td>
					<td><input type="checkbox" name="courses" value="Java">Java
						 <input type="checkbox" name="courses" value="Python">Python
						 <input type="checkbox" name="courses" value="C++">C++
						</td>
				</tr>

				<tr>
					<td></td>

					<td>
						<button type="submit">Register</button>
						<button type="reset">Reset</button>
					</td>
				</tr>

			</table>

		</form>
	</div>
</body>
</html>
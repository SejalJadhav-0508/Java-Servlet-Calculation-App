<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="CalculationController2">
		<table>
			<tr>
				<td>Enter first number:</td>
				<td><input type = "text" name="num1"></td>
			</tr>
			<tr>
				<td>Enter second number:</td>
				<td><input type = "text" name="num2"></td>
			</tr>
		</table>
		
		<br>
		<p>Select an Operation:</p><br>
		<input type="radio" id="add" name="opr" value="+">
  		<label for="add">Addition</label><br>
		<input type="radio" id="sub" name="opr" value="-">
  		<label for="sub">Subtraction</label><br>
		<input type="radio" id="mul" name="opr" value="*">
  		<label for="mul">Multiplication</label><br>
		<input type="radio" id="div" name="opr" value="/">
  		<label for="div">Division</label><br>
		
		<input type="submit" value="Calculate" >
		
	</form>
</body>
</html>
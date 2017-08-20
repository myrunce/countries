<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JPA Queries</title>
</head>
<body>
	<h3>Countries that speak Slovene</h3>
	<ul>
	<c:forEach items="${slovene}" var="row">
		<li>${row[0].name} - ${row[1].language} - ${row[1].percentage}%</li>
	</c:forEach>
	</ul>
	
	<h3>Total Num of cities in each country</h3>
	<ul>
		<c:forEach items="${two}" var="row">
			<li>${row[0]} - ${row[1]}</li>
		</c:forEach>
	</ul>
	
	<h3>Cities in Mexico with pop > 500000</h3>
	<ul>
		<c:forEach items="${three}" var="row">
			<li>${row[0]} - ${row[1]}</li>
		</c:forEach>
	</ul>
	
	<h3>Languages in each country with percentage greater that 89%</h3>
	<ul>
		<c:forEach items="${four}" var="row">
			<li>${row[0]} - ${row[1]} - ${row[2]}</li>
		</c:forEach>
	</ul>
	
	<h3>Surface Area below 501 and Population greater than 100,000</h3>
	<ul>
		<c:forEach items="${five}" var="row">
			<li>${row[0]} - ${row[1]} - ${row[2]}</li>
		</c:forEach>
	</ul>
	
	<h3>countries with only Constitutional Monarchy with a capital greater than 200 and a life expectancy greater than 75 years</h3>
	<ul>
		<c:forEach items="${six}" var="row">
			<li>${row[0]} - ${row[1]} - ${row[2]} - ${row[3]}</li>
		</c:forEach>
	</ul>
	
	<h3>all the cities of Argentina inside the Buenos Aires district and have the population greater than 500,000</h3>
	<ul>
		<c:forEach items="${seven}" var="row">
			<li>${row[0]} - ${row[1]} - ${row[2]} - ${row[3]}</li>
		</c:forEach>
	</ul>
	
	<h3>number of countries in each region</h3>
	<ul>
		<c:forEach items="${eight}" var="row">
			<li>${row[0]} - ${row[1]}</li>
		</c:forEach>
	</ul>
</body>
</html>
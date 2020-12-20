<%@ include file="/WEB-INF/views/common/include.jsp"%>
<%@page isELIgnored="false" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
    .error {
        color: red; font-weight: bold;
    }
</style>
</head>
<body style="background-color: whitesmoke">
<jsp:include page="bootstrap.jsp"></jsp:include>
<jsp:include page="menu.jsp"></jsp:include>
<div class="container">

<h3>New Department</h3>
<div class="card" style="width: 35rem;">
<div class="card-body" style="background-color: skyblue">



<form:form action="edit_department.htm" method="post" modelAttribute="department">
<form:hidden path="departmentId"/>
 <div class="form-group" >
    <label for="departmentName">Department Name</label>
    <form:input type="text"  path="departmentName"   class="form-control" placeholder="Enter Name"/><br>
    <form:errors path="departmentName" cssClass="error"/><br>
  </div>

<input type="submit" value="Save" />
</form:form>
</div>
</div>
</div>
</body>
</html>
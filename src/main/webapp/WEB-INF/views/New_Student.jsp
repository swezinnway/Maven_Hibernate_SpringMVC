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
<h3>New Student</h3>
<div class="card" style="width: 50rem;">
<div class="card-body" style="background-color: skyblue">

<form:form action="new_student.hm" method="post" modelAttribute="student">

<div class="row">
    <div class="col">
      <label for="gradeId">Grade</label>
		<form:select path="grades.gradeId" class="form-control">
	<c:forEach items="${gradeList }" var="grt">
	<form:option value="${grt.gradeId }">${grt.gradeName}</form:option>
	
	</c:forEach>
	
</form:select>
    </div>
    <div class="col">
       <label for="studentName">Student Name</label>
    <form:input type="text"  path="studentName"   class="form-control" placeholder=" select studentName"/><br>
     <form:errors path="studentName" cssClass="error"/><br>
    </div>
  </div>
  
  <div class="row">
    
    <div class="col">
      <label for="rollno"> Roll No</label>
    <form:input type="text"  path="rollno"   class="form-control" placeholder="Enter rollno"/><br>
    <form:errors path="rollno" cssClass="error"/><br>
    </div>
    <div class="col">
      <label for="email">Email</label>
    <form:input type="text"  path="email"   class="form-control" placeholder="Enter email"/><br>
    <form:errors path="email" cssClass="error"/><br>
    </div>
  </div>
 <div class="row">
    
    <div class="col">
      <label for="phone"> Phone</label>
    <form:input type="text"  path="phone"   class="form-control" placeholder="Enter phone"/><br>
    <form:errors path="phone" cssClass="error"/><br>
    </div>
    
    <div class="col">
      <label for="gender">Gender</label><br>
      	Male <form:radiobutton path="gender" value="Male"/>  
        Female <form:radiobutton path="gender" value="Female"/> 
      <form:errors path="gender" cssClass="error"/><br>
    </div>
  </div>

 <div class="row">
    
    <div class="col">
      <label for="nrc"> NRC</label>
    <form:input type="text"  path="nrc"   class="form-control" placeholder="Enter nrc"/><br>
    <form:errors path="nrc" cssClass="error"/><br>
    </div>
    
     <div class="col">
      <label for="address"> Address</label>
    <form:input type="text"  path="address"   class="form-control" placeholder="Enter address"/><br>
    <form:errors path="address" cssClass="error"/><br>
    </div>
  </div>

<input type="submit" value="Save" />
</form:form>
</div>
</div>
</div>
</body>
</html>
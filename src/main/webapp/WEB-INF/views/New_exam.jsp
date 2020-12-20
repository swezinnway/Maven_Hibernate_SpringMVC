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
<h3 align="center">New Exam</h3>
<div class="card" style="width: 50rem;">
<div class="card-body" style="background-color: skyblue">

<form:form action="new_exam.htm" method="post" modelAttribute="exam">

<div class="row">
    <div class="col">
      <label for="teacherId">Teacher Name</label>
		<form:select path="teachers.teacherId" class="form-control">
	<c:forEach items="${teacherList }" var="te">
	<form:option value="${te.teacherId }">${te.teacherName}</form:option>
	
	</c:forEach>
	
</form:select>
    </div>
    
    <div class="col">
       <label for="examName">Exam Name</label>
    <form:input type="text"  path="examName"   class="form-control" placeholder=" select examName"/><br>
     <form:errors path="examName" cssClass="error"/><br>
    </div>
  </div>
  
 
    
    <div class="col-6">
      <label for="totalmark"> Total Mark</label>
    <form:input type="text"  path="totalmark"   class="form-control" placeholder="Enter totalmark"/><br>
    <form:errors path="totalmark" cssClass="error"/><br>
    </div>
   
<input type="submit" value="Save" />
</form:form>
</div>
</div>
</div>
</body>
</html>
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

<form:form action="new_examType.htm" method="post" modelAttribute="extype">


    <div class="col_4">
      <label for="examId">Exam</label>
		<form:select path="exams.examId" class="form-control">
	<c:forEach items="${examList }" var="ex">
	<form:option value="${ex.examId }">${ex.examName}</form:option>
	
	</c:forEach>
	
</form:select>
    </div>
    
    <div class="col_4">
       <label for="examTypeName">ExamType Name</label>
    <form:input type="text"  path="examTypeName"   class="form-control" placeholder=" select examTypeName"/><br>
     <form:errors path="examTypeName" cssClass="error"/><br>
    </div>

  
 
    
   
   
<input type="submit" value="Save" />
</form:form>
</div>
</div>
</div>
</body>
</html>
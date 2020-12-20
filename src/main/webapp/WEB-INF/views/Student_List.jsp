<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
<%@ include file="/WEB-INF/views/common/include.jsp"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>

.container {
  padding: 2rem 0rem;
}

h4 {
  margin: 2rem 0rem 1rem;
}

.table-image {
  td, th {
    vertical-align: middle;
  }
}



</style>
</head>
<body style="background-color: whitesmoke">
<jsp:include page="bootstrap.jsp"></jsp:include>
<jsp:include page="menu.jsp"></jsp:include>

<div class="container">
<h3 align="center">Student List</h3><br>

  <div class="row">
    <div class="col-12">
    <a href="new_student.htm">New Student</a>
  <table class="table table-bordered">
	<thead class="thead-dark">
		<tr>
			<th scope="col">No</th>
			<th scope="col">Student Name</th>
			<th scope="col">NRC</th>
			<th scope="col">Email</th>
			<th scope="col">Phone</th>
			<th scope="col">Gender</th>
			<th scope="col">Address</th>
		
			<th scope="col">Grade</th>
			<th scope="col">Actions</th>
		</tr>
	</thead>
	<tbody>
	
	
	<c:forEach items="${studentList }" var="st" varStatus="row">
			<tr>
				<td>${row.count }</td>
				<td>${st. studentName }</td>
				<td>${st. nrc}</td>
				<td>${st. email }</td>
				<td>${st. phone}</td>
				<td>${st. gender}</td>
				<td>${st. address}</td>
				
				<td>${st. grades.gradeName}</td>
				<td>
            
           <button type="button" class="btn btn-success"><a href = '<c:url value="/editDep/${dep.departmentId}"/>'><i class="fas fa-edit"></i> </a> </button>
           	 <button type="button" class="btn btn-danger"><a href = '<c:url value="/deleteDep/${dep.departmentId}"/>'><i class="far fa-trash-alt"></i> </a> </button>
           	 
           	 
           	                       
            </td>
			</tr>
		</c:forEach>
	
		
	</tbody>
</table>
</div>
</div>
</div>
</body>
</html>
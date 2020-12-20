<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
    <%@ include file="/WEB-INF/views/common/include.jsp"%>
        <%@ include file="/WEB-INF/views/bootstrap.jsp"%>
        
    <meta name="viewport" content="width=device-width, initial-scale=1">
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
  
    <nav class="navbar navbar-expand-lg navbar-light bg-danger">
  <a class="navbar-brand" href="ItemShow.htm">University Management System</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
        Add Item
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
          <a class="dropdown-item" href="new_category.htm">Add Category </a>
          <a class="dropdown-item" href="new_itemstock.htm">Add Item Stock</a>
          <a class="dropdown-item" href="new_Itemsale.htm">Add Item Sale</a>
          
        </div>
      </li>
     <!-- <li class="nav-item dropdown ml-4 text-light">
      <form:form class="form-inline" action="selectCategory" method="get">
			<select name="categoryId">
				<c:forEach items="${categoryList }" var="item" varStatus="row">
          		<option value="${item.categoryId }">${item.categoryName}</option>
          		</c:forEach>
        </select>
        <input type="submit" value="Submit"/>
        </form:form>
      </li>  --> 
     
      
    </ul>
   <form:form class="form-inline" action="user_show" method="GET">
      <input class="form-control" type="search" placeholder="Search" name="search"/>
      <input type="submit" class="btn btn-light ml-3" value="Search">
      </form:form>
  </div>
</nav>
    
  
    
    
    
    
    



<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<link href="//netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//netdna.bootstrapcdn.com/bootstrap/3.1.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container">    
  <div id="loginbox" style="margin-top:50px;" class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">                    
    <div class="panel panel-info" >
     <div class="panel-heading">
      <div class="panel-title">Edit Employee</div>
      </div>
      <div style="padding-top:30px" class="panel-body" >

       <div style="display:none" id="login-alert" class="alert alert-danger col-sm-12"></div>   
       <form:form method="POST" action="/SpringMVCCRUD/editsave">    
        <table >    
        <tr>  
        <td></td>    
         <td><form:hidden  path="id" /></td>  
         </tr>   
         <div style="margin-bottom: 25px" class="input-group">    
          <label>Name : </label>   
          <form:input path="name" class="form-control" />  
         </div>    
         <div style="margin-bottom: 25px" class="input-group">     
          <label>Salary :</label>    
         <form:input path="salary" class="form-control" />  
         </div>   
         <div style="margin-bottom: 25px" class="input-group">     
          <label>Designation :</label>    
         <form:input path="designation" class="form-control" />  
         </div>   
           
         <div style="margin-top:10px" class="form-group">
         <div class="col-sm-12 controls">
         <div style="border-top: 1px solid#888; padding-top:15px; font-size:85%" >   
          <input type="submit" value="Edit Save" class="btn btn-success" />   
          </div> 
        </div>
        </div>     
        </table>    
       </form:form>   
       </div>                     
   </div>
  </div>                     
 </div>   
</body>
</html>
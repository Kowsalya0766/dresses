<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:url value="/admin/addproduct" var="url"></c:url>
 <form:form modelAttribute="product" action="${url}" method="post" enctype="multipart/form-data">
 
   <table>
    <tr>
      <td></td>
       <td><form:hidden path="id"></form:hidden></td>
    </tr>
      
     <tr>   
       
        <td>Enter product Name</td>
        <td><form:input path="productname"></form:input>
     <form:errors path="productname" cssStyle="color:red"></form:errors> 
        </td>
       </tr>
     <tr> 
        <td>Enter product Description</td>
         <td><form:textarea path="productdescription"></form:textarea>
    <form:errors path="productdescription" cssStyle="color:red"></form:errors> 
    </td>
          </tr>
      <tr> 
         <td>Enter product price</td>
          <td><form:input path="price"></form:input>
           <form:errors path="price" cssStyle="color:red"></form:errors>  
           </td>
          </tr>
      <tr>     
           <td>Enter product Quantity</td>
            <td><form:input path="quantity" ></form:input>
           <form:errors path="quantity" cssStyle="color:red"></form:errors> 
           </td>
            </tr>
            <tr><td>Select the Category</td>
          <td><form:select path="category.id">
           
            <!--below we are explicitly setting the values for path category.id -->
         
              <!--       <form:option value="100">Educational Books</form:option>
            <form:option value="101">Furniture</form:option>
            <form:option value="102">Educational Books</form:option>
            <form:option value="103">Dinning Table</form:option>
            <form:option value="104">Kitchen</form:option>
            <form:option value="105">Dairy Milk</form:option>
            <form:option value="106">Redmi</form:option>
            <form:option value="107">Samsung Galaxy</form:option>
            <form:option value="108">Rko</form:option>
            <form:option value="109">wildstone</form:option>
            <form:option value="110">Iphone</form:option>
            <form:option value="111">Royal Enfield</form:option>
            <form:option value="112">park evnue</form:option>
            <form:option value="1130">kfc</form:option>  -->
            
            <c:forEach items="${categories }" var="c">
            <form:option value="${c.id }">${c.categoryname }</form:option>
             </c:forEach>
            </form:select></td></tr>
            <tr><td>Upload Image</td><td>
            <form:input path="image" type="file"/>
            </td></tr>
            
           
            <td><input type="submit" value="Add Product"></td>
          
   </table>


</form:form>


</body>
</html>

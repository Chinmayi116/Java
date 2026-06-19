EmployeeBean.java
package beans;
public class EmployeeBean {
 private int empId;
 private String empName;
 // Default Constructor
 public EmployeeBean() {
 }
 // Setter Methods
 public void setEmpId(int empId) {
 this.empId = empId;
 }
 public void setEmpName(String empName) {
 this.empName = empName;
 }
 // Getter Methods
 public int getEmpId() {
 return empId;
 }
 public String getEmpName() {
return empName;
 }
}
Employee.jsp
<%@ page language="java" contentType="text/html" %>
<jsp:useBean id="emp" class="beans.EmployeeBean" />
<%
 emp.setEmpId(101);
 emp.setEmpName("Ramesh");
%>
<html>
<head>
<title>Employee Information</title>
</head>
<body>
<h2>Employee Details</h2>
Employee ID : <%= emp.getEmpId() %><br><br>
Employee Name : <%= emp.getEmpName() %>
</body>
</html>

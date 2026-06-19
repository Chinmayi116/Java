package beans;
public class StudentBean {
 private String name;
 private int age;
 public StudentBean() {
 }
 public void setName(String name) {
 this.name = name;
 }
 public void setAge(int age) {
 this.age = age;
 }
 public String getName() {
 return name;
 }
 public int getAge() {
 return age;
 }
}
Student.jsp
<%@ page language="java" contentType="text/html" %>
<jsp:useBean id="student" class="beans.StudentBean" />
<%
 student.setName("Rahul");
 student.setAge(21);
%>
<html>
<head>
<title>JavaBean Example</title>
</head>
<body>
<h2>Student Information</h2>
Name : <%= student.getName() %><br><br>
Age : <%= student.getAge() %>
</body>
</html>

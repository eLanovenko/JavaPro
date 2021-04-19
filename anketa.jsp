<%--
  Created by IntelliJ IDEA.
  User: ev.lanovenko
  Date: 15.04.2021
  Time: 18:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<style>
table,th,td{
    border: 1px solid black;
    border-collapse: collapse;
}
</style>
    <title>homework1</title>
</head>
<body>
<h1>Answer some questions</h1>
<form action="/table" method="POST">
    <p>1.Do you like Java?</p>
    <input type="radio" id="question1_yes" name="question1" value="q1_yes" required>
    <label for="question1_yes">YES</label><br>
    <input type="radio" id="question1_no" name="question1" value="q1_no" >
    <label for="question1_no">NO</label><br>
    <p>2.Do you like Python?</p>
    <input type="radio" id="question2_yes" name="question2" value="q2_yes" required>
    <label for="question2_yes">YES</label><br>
    <input type="radio" id="question2_no" name="question2" value="q2_no" >
    <label for="question2_no">NO</label><br>
    <p>3.Do you like C++?</p>
    <input type="radio" id="question3_yes" name="question3" value="q3_yes" required>
    <label for="question3_yes">YES</label><br>
    <input type="radio" id="question3_no" name="question3" value="q3_no">
    <label for="question3_no">NO</label><br>
    <br>
    <input type="submit" value="Send info">

    <br>
<h1>Statistics</h1>
<table>
    <tr>
        <th></th>
        <th>Question 1</th>
        <th>Question 2</th>
        <th>Question 3</th>
    </tr>
    <tr>
        <td>Yes</td>
        <td>${q1_yes}</td>
        <td>${q2_yes}</td>
        <td>${q3_yes}</td>
    </tr>
    <tr>
        <td>No</td>
        <td>${q1_no}</td>
        <td>${q2_no}</td>
        <td>${q3_no}</td>
    </tr>
</table>

</form>
</body>
</html>

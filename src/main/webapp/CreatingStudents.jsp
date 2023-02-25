<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 25.02.2023
  Time: 22:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <link rel="stylesheet" href="resources/css/imploee.css">
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Document</title>
</head>
<body>
<button><a href="index.html" > на главную</a></button>
<button><a href="students.jsp" > назад</a></button>
<h2 class="text-shadow-2" align="center">Создание студента</h2>
<h3 align="center">Для создания студента, заполните все поля и нажмите "Создать"</h3>
<form>
  <fieldset>
    <legend>Контактная информация</legend>
    <p><label for="name">Имя <em></em></label><input type="text" id="name"></p>
    <p><label for="surname">фамилия<em></em></label><input type="surname" id="surname"></p>
    <p><label for="group">группа <em></em></label><input type="group" id="group"></p>
    <p><label for="datetime-local">Дата поступления</label><input type="datetime-local" id="datetime-local"></p>
  </fieldset>
  <button href="" class="gradient-button">создать</button>

</form>



</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 25.02.2023
  Time: 22:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <link rel="stylesheet" href="resources/css/imploee.css">
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=, initial-scale=1.0">
  <title>Student progress</title>
</head>
<body>
<button><a href="index.jsp"> на главную</a></button>
<button><a href="students.jsp" > назад</a></button>
<h2 class="text-shadow-2" align="center">Успеваемость студентов</h2>
<div class="flexbox">
  <table border="1">
    <h3>Отображена успеваемость для следующего студента:</h3>
    <tbody>
    <tr>
      <th>фамилия</th>
      <th>Имя</th>
      <th>группа</th>
      <th>Дата поступления</th>

    </tr>
    <tr>
      <td>
        Кочурова
      </td>
      <td>
        Алиса
      </td>
      <td>
        Александровна
      </td>
      <td>
        01.09.2000
      </td>
    </tr>


    </tbody>
</div>
</table>
<h6>
  <label for="">Выбрать Семестр <select>
    <option>Семестр 1</option>
    <option>Семестр 2</option>
    <option>Семестр 3</option>
    <option>Семестр 4</option>
  </select></label>
  <h6>

  </h6>
  <table border="1" class="gggg">
    <tbody>
    <tr >
      <th>
        Дисциплина
      </th>

      <th>
        Оценка
      </th>
    </tr>
    <tr>
      <td>
        Информатика
      </td>
      <td>
        5
      </td>

    </tr>
    <tr>
      <td>
        математика
      </td>
      <td>
        5
      </td>
    </tr>
    <tr>
      <td>
        Системный анализ
      </td>
      <td>
        5
      </td>
    </tr>
    <tr>
      <td>
        Основы дискретной математики
      </td>
      <td>
        5
      </td>

    </tr>


    </tbody>
  </table>

</body>
</html>

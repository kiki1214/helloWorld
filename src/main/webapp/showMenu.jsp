<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<head>
    <meta charset="UTF-8">
    <title>MENU·ALL</title>
    <script type="text/javascript" src="./js/jquery-3.4.1.min.js" ></script>
</head>
<body>
    <center>
        <h2>MENU·ALL</h2>
        菜单标题：<input type="text" name="title" placeholder="请输入菜单标题"/>
        <button>查询</button>
        <table style="text-align: center">
            <caption>
                <button>insert</button>
            </caption>
            <tr>
                <td>menuid</td>
                <td>title</td>
                <td>state</td>
                <td>url</td>
                <td>pid</td>
                <td>iconCls</td>
                <td colspan="2">operation</td>
            </tr>
            <c:forEach var="menu" items="${menuList}">
                <tr>
                    <td>${menu.menuid}</td>
                    <td>${menu.title}</td>
                    <td>${menu.state}</td>
                    <td>${menu.url}</td>
                    <td>${menu.pid}</td>
                    <td>${menu.iconCls}</td>
                    <td colspan="2">
                        <button onclick="delete(${menu.menuid})">delete</button>
                        <button>update</button>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </center>

</body>

<script type="text/javascript">
    $(function(){
        alert("hello")
    })
</script>

</html>
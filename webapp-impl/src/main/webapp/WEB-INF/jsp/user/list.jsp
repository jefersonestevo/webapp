<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>User Form</title>
</head>
<body>
    <form action="<c:url value='/user/add'/>" method="post">
        <fmt:message key="userName.field"/>
        <input type="text" name="user.fullName"/><br/>
        <fmt:message key="nickname.field"/>
        <input type="text" name="user.nickname"/><br/>

        <input type="submit" value="Save" />
    </form>

<br />
<br />

    <table>
        <c:forEach items="${users}" var="user">
            <tr>
                <td>${user.id}</td>
                <td>${user.fullName}</td>
                <td>${user.nickname}</td>
            </tr>
        </c:forEach>
    </table>

</body>
</html>
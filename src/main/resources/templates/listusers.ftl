<html>
<head>
    <title>Users</title>
</head>
<body>
<table>
    <tr>
        <th>ID</th>
        <th>name</th>
        <th>password</th>
    </tr>
    <#list users as user>
        <tr>
            <td>#{user.id}</td>
            <td>${user.name}</td>
            <td>${user.password}</td>
        </tr>
    </#list>
</table>
</body>
</html>
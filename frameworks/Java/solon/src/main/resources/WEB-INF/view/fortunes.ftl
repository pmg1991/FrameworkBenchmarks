<!DOCTYPE html>
<html>
<head>
    <title>Fortunes</title>
</head>
<body>
<table>
    <tr>
        <th>id</th>
        <th>message</th>
    </tr>
    <#list fortunes as item>
    <tr>
        <td>${item.id}</td>
        <td>${item.message}</td>
    </tr>
    </#list>
</table>
</body>
</html>
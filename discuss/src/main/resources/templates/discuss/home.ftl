<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Hello!</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="http://code.jquery.com/jquery-3.1.1.min.js"></script>
</head>
<body>

    <#if discussion??>
        <th scope="row"><#if discussion.did??>${discussion.did}</#if></th>
            <td><#if discussion.writer??>${discussion.writer}</#if></td>
            <td><#if discussion.content??>${discussion.content}</#if></td>
            <td><#if discussion.created??>${discussion.created}</#if></td>
    <#else>
    </#if>
</body>
</html>
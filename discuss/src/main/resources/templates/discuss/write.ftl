<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Hello!</title>
    <script  src="http://code.jquery.com/jquery-3.1.1.min.js"></script>
    <link rel="stylesheet" href="/webjars/bootstrap/4.2.1/css/bootstrap.min.css">
    <script type="text/javascript" src="/smarteditor/js/service/HuskyEZCreator.js" charset="utf-8"></script>
    <script type="text/javascript" src="/js/write.js"></script>

</head>
<#include "*/common/header.ftl">
<body>
    <h5>discuss/write</h5>
    <form action="/discuss/write" method="post" id="text-editor-form" enctype="multipart/form-data">
        <textarea name="text-editor" id="text-editor" style="width: 700px; height: 400px;"></textarea>
        <input type="button" id="write-btn" value="고민 등록" />
        <input type="button" id="cancel-btn" value="취소" />
    </form>

</body><#include "*/common/footer.ftl">
</html>
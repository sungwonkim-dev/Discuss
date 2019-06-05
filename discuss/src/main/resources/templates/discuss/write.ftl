<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>write</title>
    <script src="http://code.jquery.com/jquery-3.1.1.min.js"></script>
    <link rel="stylesheet" href="/webjars/bootstrap/4.2.1/css/bootstrap.min.css">
    <script type="text/javascript" src="/smarteditor/js/service/HuskyEZCreator.js" charset="utf-8"></script>
    <link rel="stylesheet" href="/css/discuss/write.css">
    <script type="text/javascript" src="/js/discuss/write.js"></script>
</head>
<#include "*/common/header.ftl">
<body>
<div class="write-center-wrapper">
    <form action="/discuss/save-content" method="post" id="text-editor-form" enctype="multipart/form-data">
        <input type="text" name="title" id="title" placeholder="제목"/>
        <textarea name="text-editor" id="text-editor" style="width: 700px; height: 400px;"></textarea>
        <input type="button" id="write-btn" value="고민 등록"/>
        <input type="button" id="cancel-btn" value="취소"/>
    </form>
</div>
<form action="/discuss/detail" method="post" id="detail-frm">
    <input type="hidden" name="did" value="">
</form>
</body><#include "*/common/footer.ftl">
</html>
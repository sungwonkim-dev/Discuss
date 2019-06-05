<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>detail</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="http://code.jquery.com/jquery-3.1.1.min.js"></script>
    <script type="text/javascript" src="/smarteditor/js/service/HuskyEZCreator.js" charset="utf-8"></script>
    <link rel="stylesheet" href="/css/common/common.css">
    <script type="text/javascript" src="/js/discuss/comment.js"></script>
</head>
<body>
<div class="center-wrapper">
    <h2>&nbsp;&nbsp;상세 페이지&nbsp;&nbsp;</h2>
    <table class="table table-striped">
        <div class="discuss-detail">
            <#if discussion??>
                <thead>
                <tr>
                    <th>게시물 번호</th>
                    <td><#if discussion.did??>${discussion.did}</#if></td>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <th>작성자</th>
                    <td><#if discussion.writer??>${discussion.writer}</#if></td>
                </tr>
                <tr>
                    <th>작성일</th>
                    <td><#if discussion.created??>${discussion.created}</#if></td>
                </tr>
                <tr>
                    <th>내용</th>
                    <td><#if discussion.content??>${discussion.content}</#if></td>
                </tr>
                </tbody>
            <#else>
            </#if>
        </div>
    </table>
    <table class="comment">
        <#if comments??>
            <table>
                <#list comments as comment>
                    <tr>
                        <th style="font-size: 2em;">댓글&nbsp;&nbsp;&nbsp;&nbsp;</th>
                        <td style="font-size: 2em;"><#if comment.text??>${comment.text}</#if></td>
                    </tr>
                <#else>
                </#list>
            </table>
        <#else>
        </#if>
    </table>
    <br><br>
    <form action="/discuss/save-comment" method="post" id="text-editor-form" enctype="multipart/form-data">
        <textarea name="text-editor" id="text-editor" style="width: 700px; height: 400px;"></textarea>
        <input type="button" id="write-btn" value="댓글 등록"/>
        <input type="button" id="cancel-btn" value="이전 페이지로"/>
        <input type="hidden" name="t-did" value=<#if discussion.did??>${discussion.did}</#if>>
    </form>
    <form action="/discuss/detail" method="post" id="detail-frm">
        <input type="hidden" name="did" value="">
    </form>
</div>
</body>
</html>
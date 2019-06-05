<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Hello!</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="http://code.jquery.com/jquery-3.1.1.min.js"></script>
    <script type="text/javascript" src="/js/common/common.js"></script>
    <link rel="stylesheet" href="/css/common/common.css">
</head>
<body>
<div class="center-wrapper">
    <table class="table table-striped">
        <thead>
        <th scope="col">글번호</th>
        <th scope="col">글쓴이</th>
        <th scope="col">내용</th>
        <th scope="col">작성일</th>
        </thead>
        <tbody>
        <#if discussionList??>
            <#list discussionList as discussion>
                <tr>
                    <th scope="row"><#if discussion.did??>${discussion.did}</#if></th>
                    <td><#if discussion.writer??>${discussion.writer}</#if></td>
                    <td><a href="detail?did=${discussion.did}"><#if discussion.content??>${discussion.content}</#if></a>
                    </td>
                    <td><#if discussion.created??>${discussion.created}</#if></td>
                </tr>
            <#else>
            </#list>
        <#else>
        </#if>
        </tbody>
    </table>
    <nav aria-label="Page navigation example">
        <ul class="pagination pagination-md justify-content-center paging">
        </ul>
    </nav>
</div>
a
<form action="/test" method="post" id="frm">
    <input type="hidden" name="pageNo" value=<#if pageNo??>${pageNo}</#if>>
    <input type="hidden" name="discussionCount" value=<#if discussionCount??>${discussionCount}</#if>>
    <input type="hidden" name="size" value=<#if size??>${size}</#if>>
</form>

</body>
</html>
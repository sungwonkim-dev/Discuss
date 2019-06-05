<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Hello!</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script  src="http://code.jquery.com/jquery-3.1.1.min.js"></script>
    <script type="text/javascript" src="/js/common.js"></script>
    <script type="text/javascript" src="/js/chamgo.js"></script>
</head>
<body>

<#if discussionList??>
    <#list discussionList as discussion>
        ${discussion.content}
        <#else>1
    </#list>
<#else>2
</#if>

<#if discussionCount??>${discussionCount}</#if>
<#if pageNo??>${pageNo}</#if>


<nav aria-label="Page navigation example">
    <ul class="pagination pagination-md justify-content-center paging">
    </ul>
</nav>

<form action="/test" method="post" id="frm">
    <input type="hidden" name="pageNo" value=<#if pageNo??>${pageNo}</#if>>
    <input type="hidden" name="discussionCount" value=<#if discussionCount??>${discussionCount}</#if>>
    <input type="hidden" name="size" value=<#if size??>${size}</#if>>
</form>

</body>
</html>
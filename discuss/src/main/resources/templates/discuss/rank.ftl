<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>rank</title>
        <script type="text/javascript" src="/js/common/pagination.js"></script>
    </head>
    <#include "*/common/header.ftl">
    <body>
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
                        <td><a class="move-page-btn" id="${discussion.did}"><#if discussion.title??>${discussion.title}</#if></a>
                        <td><#if discussion.writer??>${discussion.writer}</#if></td>
                        </td>
                        <td><#if discussion.created??>${discussion.created}</#if></td>
                    </tr>
                <#else>
                </#list>
            <#else>
            </#if>
            </tbody>
        </table>
    </body><#include "*/common/footer.ftl">
</html>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Hello!</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="http://code.jquery.com/jquery-3.1.1.min.js"></script>
    <link rel="stylesheet" href="/css/common/common.css">
</head>
<body>
<div class="header-panel">
    <nav class="nav-item">
        <tr>
            <td><a class="menu-btn" href="/discuss">&nbsp;&nbsp;메인 페이지&nbsp;&nbsp;</a></td>
            <td><a class="menu-btn" href="/discuss/debate">&nbsp;&nbsp;&nbsp;고민 토론&nbsp;&nbsp;&nbsp;</a></td>
            <td><a class="menu-btn" href="/discuss/interested">관심있는 고민</a></td>
            <td><a class="menu-btn" href="/discuss/live">&nbsp;실시간 고민&nbsp;</a></td>
            <td><a class="menu-btn" href="/discuss/rank">&nbsp;&nbsp;&nbsp;&nbsp;랭 킹&nbsp;&nbsp;&nbsp;&nbsp;</a>
                <#--<td><a class="menu-btn" href="/discuss/free">&nbsp;&nbsp;&nbsp;자유 주제&nbsp;&nbsp;&nbsp;</a></td>-->
            <td><a class="menu-btn" href="/discuss/write">&nbsp;&nbsp;&nbsp;고민 작성&nbsp;&nbsp;&nbsp;</a></td>
            <#if user??>
                <td><a class="menu-btn" href="/logout">&nbsp;&nbsp;로그아웃&nbsp;&nbsp;</a></td>
            <#else>
                <td><a class="menu-btn" href="/login">&nbsp;&nbsp;로 그 인&nbsp;&nbsp;</a></td>
                <td><a class="menu-btn" href="/create-account">&nbsp;&nbsp;&nbsp;회원 가입&nbsp;&nbsp;&nbsp;</a></td>
            </#if>
        </tr>
        </tr>
    </nav>
</div>
</body>
</html>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Hello!</title>
    <script src="/js/create-account.js"></script>
    <script src="http://code.jquery.com/jquery-3.1.1.min.js"></script>
</head>
<body>
<#--<h5><#if msg??>${msg}</#if></h5>-->
<form action="/login" method="post">
    <div class="center-wrapper">
        <table>
            <tr>
                <td>
            <tr>
                <label for="username">Username</label>
                <input type="text" id="username" name="username"/>
            </tr>
            <tr>
                <label for="password">Password</label>
                <input type="password" id="password" name="password"/>
            </tr>
            </td>
            <td>
                <div class="form-actions">
                    <button type="submit" class="btn">Log in</button>
                </div>
            </td>
            </tr>
        </table>
    </div>
</form>
</body>
</html>
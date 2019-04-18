<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Hello!</title>
    <link rel='stylesheet' href='/webjars/bootstrap/4.2.1/css/bootstrap.min.css'>
    <script src="webjars/jquery/3.3.1-1/jquery.min.js"></script>
    <script src="/js/create-account.js"></script>
</head>
<body>
<h5><#if msg??>${msg}</#if></h5>
<form action="/login" method="post">
    <div>
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
    </div>
</form>
</body>
</html>
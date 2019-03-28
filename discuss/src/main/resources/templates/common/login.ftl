<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Hello!</title>


    </head>
    <body>
    <h5><#if msg??>${msg}</#if></h5>
        <form action="/login" method="post">
            <div>
                <label for="username">Username</label>
                <input type="text" id="username" name="username"/>
                <label for="password">Password</label>
                <input type="password" id="password" name="password"/>
                <div class="form-actions">
                    <button type="submit" class="btn">Log in</button>
                </div>
            </div>
        </form>
    </body>
</html>
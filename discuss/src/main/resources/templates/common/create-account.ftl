<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Hello!</title>
    <script  src="http://code.jquery.com/jquery-3.1.1.min.js"></script>
    <link rel="stylesheet" href="/webjars/bootstrap/4.2.1/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/user/create-info.css">
    <script src="/js/user/create-account.js"></script>
</head>
<body>
<h5><#if msg??>${msg}</#if></h5>
<form id="create_account-form" action="/save-account" method="post">
    <div id="info-table-wrapper">
        <table id="info-table">
            <h2>회원 가입 정보</h2>
            <tbody>
            <tr>
                <th scope="row">아이디</th>
                <td><input type="text" id="uid" name="uid" required="required"></td>
            </tr>
            <tr>
                <th scope="row">비밀번호</th>
                <td><input type="password" size="12" id="password" name="password" required="required"></td>
            </tr>
            <tr>
                <th scope="row">이메일</th>
                <td><input type="email" size="30" id="email" name="email" required="required"></td>
            </tr>
            <tr>
                <th scope="row">주소</th>
                <td><input type="email" size="30" id="address" name="address" required="required"></td>
            </tr>
            <tr>
                <th scope="row">연락처</th>
                <td><input type="text" size="11" id="phone" name="phone" required="required"></td>
            </tr>
            </tbody>
            <table>
                <ul id="btns">
                    <li><a class="custom-btn" id="clear_btn">초기화</a></li>
                    <li><a class="custom-btn" id="go_home_btn">취소</a></li>
                    <li><a class="custom-btn" id="create_account_btn">가입</a></li>
                </ul>
            </table>
        </table>
    </div>
</form>
</form>
</body>
</html>
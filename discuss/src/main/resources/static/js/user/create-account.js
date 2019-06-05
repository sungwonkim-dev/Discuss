$(document).ready(function () {

    $("#clear_btn").click(function () {
        $(':input', '#create_account-form')
            .not(':button, :submit, :reset, :hidden')
            .val('')
            .removeAttr('checked')
            .removeAttr('selected');
    });

    $("#go_home_btn").click(function () {
        location.href = '/discuss';
    });


    $("#create_account_btn").click(function () {

            var id = $("#uid").val();
            var pw = $("#password").val();
            var addr = $("#address").val();
            var email = $("#email").val();
            var phone = $("#phone").val();

            if (id.length > 1 && pw.length > 1 && addr.length > 1 && email.length > 1 && phone.length > 1) {
                $("#create_account-form").submit();
                alert("회원 가입이 완료됐습니다. 홈페이지로 이동합니다.");
                location.href = '/discuss';
            } else {
                alert("전체 항목을 입력해주세요.");
            }
        }
    );

});

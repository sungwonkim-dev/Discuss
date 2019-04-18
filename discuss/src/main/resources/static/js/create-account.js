$(document).ready(function() {

    $("#clear_btn").click(function () {
        $(':input', '#create_account-form')
            .not(':button, :submit, :reset, :hidden')
            .val('')
            .removeAttr('checked')
            .removeAttr('selected');
    });

    $("#go_home_btn").click(function () {
        window.location.href("/home");
    });



    $("#create_account-form").submit(function(e) {

        e.preventDefault();

        var form = $(this);
        var url = form.attr('action');

        $.ajax({
            type: "POST",
            url: url,
            data: form.serialize(),
            success: function()
            {
                alert("회원가입이 완료되었습니다. 로그인 페이지로 이동합니다.");
                window.location.href("/home");
            }
        });


    });

    // $("#create_account_btn").click(function () {
    //     var formData = $("#create_account-form").serialize();
    //     $.ajax({
    //         type: "POST",
    //         url: "/save-account",
    //         data: formData,
    //         cache: false,
    //         processData: false,
    //         success: function () {
    //             alert("계정 생성이 완료되었습니다. 로그인 페이지로 이동합니다");
    //             //window.location.href("/login");
    //         },
    //         error: function (data) {
    //             alert(data);
    //         }
    //     })
    // });
});
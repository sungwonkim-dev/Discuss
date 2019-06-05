$(document).ready(function () {

    var tempObj = [];

    nhn.husky.EZCreator.createInIFrame({
        oAppRef: tempObj,
        elPlaceHolder: "text-editor",
        sSkinURI: "/smarteditor/SmartEditor2Skin.html",
        htParams: {
            bUseToolbar: true,
            bUseVerticalResizer: true,
            bUseModeChanger: true,
        }
    });


    $("#text-editor-form").submit(function (e) {

        e.preventDefault();

        if ($("#title").val().length != 0) {
            tempObj.getById["text-editor"].exec("UPDATE_CONTENTS_FIELD", []);

            var form = $(this);
            var url = form.attr('action');

            $.ajax({
                type: "POST",
                url: url,
                data: form.serialize(),
                success: function (data) {
                    if (data == "0") {
                        alert("접속자가 많아 연결이 불안정합니다. 잠시 후 다시 시도해주세요.");
                    } else {
                        alert("고민이 등록되었습니다.");
                        $("#detail-frm input[name=did]").val(data);
                        $("#detail-frm").submit();
                    }
                }
            });
        }
        ;


    });


    $("#write-btn").click(function () {
            alert("zmfflr");
            $("#text-editor-form").submit();

            // if($("#text-editor").val().length !=0 && $("#title").val().length !=0) {
            //
            //
            //     tempObj.getById["text-editor"].exec("UPDATE_CONTENTS_FIELD", []);
            //
            //     e.preventDefault();
            //
            //     var form = $(this);
            //     var url = form.attr('action');
            //
            //     $.ajax({
            //         type: "POST",
            //         url: url,
            //         data: form.serialize(),
            //         success: function()
            //         {
            //             alert("회원가입이 완료되었습니다. 메인 페이지로 이동합니다.");
            //             window.location.href("/home");
            //         }
            //     });
            //
            //     window.location("/discuss/debate");
        }
    );

    $("#cancel-btn").click(function () {
        history.back();
    });
});
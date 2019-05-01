$(document).ready(function() {

    alert("ttt");

    var tempObj=[];

    nhn.husky.EZCreator.createInIFrame({
        oAppRef: tempObj,
        elPlaceHolder: "text-editor",
        sSkinURI: "/smarteditor/SmartEditor2Skin.html",
        htParams : {
            bUseToolbar : true,
            bUseVerticalResizer : true,
            bUseModeChanger : true,
        }
    });

    $("#write-btn").click(function(){
        tempObj.getById["text-editor"].exec("UPDATE_CONTENTS_FIELD", []);
        $("#text-editor-form").submit();
    });

    $("#cancel-btn").click(function () {
        history.back();
    });
});
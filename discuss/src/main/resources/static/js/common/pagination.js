$(document).ready(function () {

    CommonUtil.writePagination($(".pagination"), $("input[name=discussionCount]").val(), $("input[name=pageNo]").val(), $("input[name=size]").val());

    $(".pagination li a").click(function () {

        var name = this.className;
        var pageNo;
        switch (name) {
            case "page-link last":
                pageNo = this.getAttribute("title");
                break;

            case "page-link first":
                pageNo = "1";
                break;

            default:
                pageNo = this.innerHTML;
                break;
        }

        $("input[name=pageNo]").val(pageNo);
        $("#frm").submit();
    });
});

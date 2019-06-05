$(document).ready(function () {
    $('.move-page-btn').click(function () {
        alert($(this).attr('id'));
        $("#detail-frm input[name=did]").val($(this).attr('id'));
        $("#detail-frm").submit();
    });
});

CommonUtil = {
    formatBytes: function (byteSize) {
        var KB = 1024;
        var MB = KB * 1024;
        var GB = MB * 1024;

        if (byteSize > GB) {
            return (byteSize / GB).toFixed(2) + "GB";
        } else if (byteSize > MB) {
            return (byteSize / MB).toFixed(2) + "MB";
        } else if (byteSize > KB) {
            return (byteSize / KB).toFixed(2) + "KB";
        } else {
            return byteSize + "Bytes";
        }
    },

    showDialog: function (type, msg) {
        var dialog = (type === "info") ? $(".pop-info") : $(".pop-error");
        if (msg) {
            dialog.find(" .pop-msg").html(msg);
        } else {
            dialog.find(" .pop-msg").empty();
        }

        dialog.show();
    },

    hideDialog: function () {
        $(".pop:visible").hide();
    },

    writePagination: function (canvas, total, pageNo, fetchCount) {

        total -= 0;
        pageNo -= 0;
        fetchCount -= 0;

        if (!total) {
            return "";
        }

        var last = Math.ceil(total / fetchCount);
        var begin = pageNo - 2;
        var end = pageNo + 2;

        if (begin < 1) {
            begin = 1;
            end = 5;
        }
        if (end > last) {
            end = last;
            begin = last - 5;
            if (begin < 1) {
                begin = 1;
            }
        }

        var html = "";

        if (begin !== 1) {
            html = "<li class=\"page-item\"><a class=\"page-link first\" title='1'><i class='xi-step-backward'></i></a></li>";
        }

        for (var i = begin; i <= end; i++) {
            if (i == pageNo) {
                html += "<li class=\"page-item active\"><a class=\"page-link\">" + i + "</a></li>";
            } else {
                html += "<li class=\"page-item\"><a class=\"page-link\">" + i + "</a></li>";
            }
        }

        if (end !== last) {
            html += "<li class=\"page-item\"><a class=\"page-link last\" title='" + last + "'><i class='xi-step-forward'></i></a></li>";
        }

        canvas.html(html);

    }

};
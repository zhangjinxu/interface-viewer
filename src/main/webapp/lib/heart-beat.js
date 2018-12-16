function ajaxHeartBeat() {
    console.log("heart beat to keep login....");
    $.ajax({
        url: '/user/info',
        type: 'get',
        dataType: 'json',
        success: function (data) {
            if (data.code != 1 || !data.data) {
                location.href = "/login.html";
                return;
            }

            $("#username").text(data.data.name);
            $("#userType").text(data.data.type);
            sessionStorage.setItem("username", data.data.username);
            sessionStorage.setItem("userId", data.data.id);
            sessionStorage.setItem("type", data.data.type);
        }
    });
};
ajaxHeartBeat();

setInterval(ajaxHeartBeat, 1000*60*15);
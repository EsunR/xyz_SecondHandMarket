$(document).ready(function () {
  $("#topbar .title").eq(0).click(function () {  
    window.location.href = '../Index/index.html'
  })
  // 消息通知
  $("#user_list").hover(function () {
    $("#user_info").slideDown();
  }, function () {
    $("#user_info").slideUp();
  })
});
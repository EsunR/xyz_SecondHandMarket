$(document).ready(function () {
  // 跳转主页
  $("#topbar .title").eq(0).click(function () {
    window.location.href = '../Index/index.html'
  })
  $('.home_btn').eq(0).click(function () {
    window.location.href = '../Index/index.html'
  })

  // 消息通知下拉动画
  $("#user_list").hover(function () {
    $("#user_info").slideDown();
  }, function () {
    $("#user_info").slideUp();
  })

  // 聚合通知
  // TODO: 将其移动到获取用户信息后的Ajax回调函数中
  let user_msg_num = parseInt($('#user_msg').text());
  let sys_msg_num = parseInt($('#user_msg').text());
  $('#user_name .badge-primary').text(user_msg_num + sys_msg_num)
});
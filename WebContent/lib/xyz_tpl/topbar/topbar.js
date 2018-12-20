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
    $("#user_info").slideDown('fast');
  }, function () {
    $("#user_info").slideUp('fast');
  })

  // 聚合通知
  // TODO: 将其移动到获取用户信息后的Ajax回调函数中
  let user_msg_num = parseInt($('#user_msg').text());
  let sys_msg_num = parseInt($('#user_msg').text());
  $('#user_name .badge-primary').text(user_msg_num + sys_msg_num)

  // 跳转按钮的链接
  let user_url = '../User/user.html'
  let nav_btn_url = ['#publish', '#want', '#collection'];
  for (let i = 0; i < 3; i++) {
    $('.nav_btn').eq(i).click(function(){
      window.location.href = user_url + nav_btn_url[i];
    })
  }
  $('#user_name').click(function(){
    window.location.href = user_url + '#info'
  })
  $('.user_list_btn').eq(0).click(function(){
    window.location.href = user_url + '#userMsg'
  })
  $('.user_list_btn').eq(1).click(function(){
    window.location.href = user_url + '#sysMsg'
  })
  $('.user_list_btn').eq(2).click(function(){
    window.location.href = '../Login/login.html'
  })
  

});
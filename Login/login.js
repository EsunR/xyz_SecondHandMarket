$(function () {
  // 一言Hitokoto
  $.ajax({
    type: "GET",
    url: "https://v1.hitokoto.cn/?c=d",
    success(data) {
      $('#hitokoto_text').text(data.hitokoto);
      $('#hitokoto_from').text(" ——《" + data.from + "》");
    },
    error() {
      $('#hitokoto_text').text('生活永远充满惊喜。');
      $('#hitokoto_from').text(" ——给予热爱生活的每个人");
    }
  });


  // 显示、隐藏注册界面
  let oRegisterBox = document.getElementById("register_box");
  $('#goto_register').click(function () {
    $('#register_box').css({ "display": "block" });
    oRegisterBox.className = "bounceIn";
  })
  $('#goto_login').click(function () {
    oRegisterBox.className = "bounceOut";
  })
  oRegisterBox.addEventListener("animationend", (oRegisterBox) => {
    if ($(oRegisterBox)[0].animationName == "bounceOut") {
      $('#register_box').css({ "display": "none" });
    }
  }, false);

  // 警告框
  var warning = function (msg) {
    $('#alert').text(msg);
    $('#alert').slideDown().delay(1500).slideUp();
  }

  // 表单验证
  // 验证登录信息
  $('#login_btn').click(function(){
    var name = $('#name').val();
    var password = $('#password').val();
    if(name && password){
      // TODO: 发送Ajax请求，匹配用户名和密码，如果成功则跳转页面，如果失败调用以下代码：return warning('密码或用户名输入错误');
      console.log('通过');
    }else{
      warning('有未填写内容，请确认后再提交')
      return false;
    }
  })
  // 验证注册信息
  $('#register_btn').click(function () {
    var reg_name = $('#reg_name').val();
    var reg_realName = $('#reg_realName').val();
    var reg_phone = $('#reg_phone').val();
    var reg_password = $('#reg_password').val();
    var reg_repassword = $('#reg_repassword').val();
    if (reg_name && reg_realName && reg_phone && reg_password && reg_repassword) {
      if (reg_password === reg_repassword) {
        // 提交注册表单
        return true;
      } else {
        warning('两次输入的内容不一致');
        return false;
      }
    } else {
      warning('有未填写内容，请确认后再提交')
      return false;
    }
  })


})
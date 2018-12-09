$(function () {
  // 一言Hitokoto
  $.ajax({
    type: "GET",
    url: "https://v1.hitokoto.cn/?c=d",
    success(data) {
      $('#hitokoto_text').text(data.hitokoto);
      $('#hitokoto_from').text(" ——《" + data.from + "》");
    },
    error(){
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

  // 点击 获取短信 
  $('#message_btn').click(function(){
    $(this).css("display","none");
    $('#message_time').css("display","block");
    let i = 60;
    $('#message_time').text(i+'s');
    let t = setInterval(function(){
      i--;
      $('#message_time').text(i + "s");
      if(i == 0){
        clearInterval(t);
        $('#message_time').css("display","none");
        $('#message_btn').css("display","block");      
        $('#message_time').text("60s");  
      }
    },1000)
  })



})
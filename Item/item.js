$(document).ready(function () {
  // 计算折扣
  var old_price = $('.old_price').eq(0).text().split("￥")[1];
  var price = $('.price').eq(0).text().split("￥")[1];
  var percent = ((old_price - price) / old_price).toFixed(2) * 100;
  $('.percent').eq(0).html('<span class="mdi mdi-arrow-down-bold-box-outline"></span>' + percent + "%");


  // 留言板消息渲染
  // TODO: 这条代码是当Ajax返回该物品的留言列表后执行的，如果留言列表为空就显示“没有留言”的提示，如果留言列表中有留言则不显示该提示
  if ($('#message_box .message').length == 0) {
    $('#message_null').show();
  }




});
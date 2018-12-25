$(document).ready(function () {
  // 新手提示
  $('#dontshow').click(function () {
    $('#new_user_to_show').slideUp();
    $.cookie('new_user', '0', { expires: 365 });
  })
  if (!$.cookie('new_user')) {
    $('#new_user_brand').slideDown();
  }

  // 点击商品跳转
  $(".item").click(function () {  
    window.location.href = loca+'/Items/'+ $(this).attr("item-id");
  })
  
  function renderPercent() {
    $('.price_box').each(function () {
      let price = $(this).find('.now').eq(0).text().split('￥')[1];
      let old_price = $(this).find('.old').eq(0).text().split('￥')[1];
      let percent = ((old_price - price) / old_price).toFixed(2) * 100;
      $(this).children('.percent').eq(0).text('-' + percent + '%');
    })
  };
  renderPercent();

});
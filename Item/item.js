$(document).ready(function () {
  var old_price = $('.old_price').eq(0).text().split("￥")[1];
  var price = $('.price').eq(0).text().split("￥")[1];
  var percent = ((old_price - price)/old_price).toFixed(2) * 100;
  $('.percent').eq(0).html('<span class="mdi mdi-arrow-down-bold-box-outline"></span>' + percent + "%");
});
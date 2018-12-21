// 显示用户修改的头像
function showPreview(source) {
  var file = source.files[0];
  if (window.FileReader) {
    var fr = new FileReader();
    fr.onloadend = function (e) {
      document.getElementById('user_head_preview').src = e.target.result;
    }
    fr.readAsDataURL(file);
  }
  console.log(1);
}


var item_id;
// 确定商品已卖出后执行的函数
function publish_sold() {
  console.log(item_id);
  // TODO: 发送Ajax请求，标记商品已被卖出

  $('#ensure_publish_sold').modal('hide');
  $('[item_id=' + item_id + ']').fadeOut();
}

// 确定下架后执行的函数
function publish_delete() {
  console.log(item_id);
  // TODO: 发送Ajax请求，删除商品信息

  $('#ensure_publish_delete').modal('hide');
  $('[item_id=' + item_id + ']').fadeOut();
}

// 确定删除我想要的商品时执行的函数
function want_delete() {
  console.log(item_id);
  // TODO: 发送Ajax请求，从我想要的列表中删除商
  
  $('#ensure_want_delete').modal('hide');
  $('[item_id=' + item_id + ']').fadeOut();
}

// 渲染卖家信息
function renderSellerInfo(seller_info) {
  $('#seller_name span').eq(0).text(seller_info.sellerName);
  $('#seller_contact span').eq(0).text(seller_info.sellerContact);
  let $contactWay = $('#seller_contact span').eq(1)
  switch (seller_info.sellerContactWay) {
    case 1:
      $contactWay.text('QQ');
      break;
    case 2:
      $contactWay.text('微信');
      break;
    case 3:
      $contactWay.text('电话');
      break;
  }
}
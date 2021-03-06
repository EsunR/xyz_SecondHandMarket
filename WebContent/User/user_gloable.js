// 显示面板
function showPanel() {
  let part = window.location.hash;
  $('.nav-link').each(function () {
    $(this).removeClass('active').attr('aria-selected', 'false');
  });
  $(part + '_tab').addClass('active').attr('aria-selected', 'true');
  $('.tab-pane').removeClass('show active');
  $(part).addClass('show active')
}

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


// 获取商品图片相关
function getSrc(item_id) {
  return loca + '/Data/SecondHand/Item/' + item_id + '/cover'; //封面在服务器上存放的路径
}
function renderItemPic() {
  $('.item_card').each(function () {
    item_id = $(this).attr('item_id')
    $(this).find('img').eq(0).attr('src', getSrc(item_id));
  })
}


var item_id;
var user_id;
// 确定商品已卖出后执行的函数
function publish_sold() {
  console.log(item_id);
  // TODO: 发送Ajax请求，标记商品已被卖出
  $.ajax({
    type: "post",
    dataType: "json",
    data: { id: item_id },
    url: loca + "/ipublishDelete",
    async: false,
    success: function (data) {
      if (data.msg == 1) {
    	  console.log('publish delete success');
      }
      else {
        alert(信息异常);
      }
    },
    error: function (data) {
      alert("系统出错");
    }
  });
  $('#ensure_publish_sold').modal('hide');
  $('[item_id=' + item_id + ']').fadeOut();
}

// 确定下架后执行的函数
function publish_delete() {
  // TODO: 发送Ajax请求，删除商品信息
  $.ajax({
    type: "post",
    dataType: "json",
    data: { id: item_id },
    url: loca + "/ipublishDelete",
    async: false,
    success: function (data) {
      if (data.msg == 1) {
    	  console.log('publish delete success');
      }
      else {
        alert(信息异常);
      }
    },
    error: function (data) {
      alert("系统出错");
    }
  });
  $('#ensure_publish_delete').modal('hide');
  $('[item_id=' + item_id + ']').fadeOut();
}

// 确定删除我想要的商品时执行的函数
function want_delete() {
  console.log('user_id: ', user_id);
  console.log('item_id: ', item_id);
  // TODO: 发送Ajax请求，从我想要的列表中删除商
  $.ajax({
    type: "post",
    dataType: "json",
    data: { user_id: user_id, item_id: item_id },
    url: loca + "/iwantDelete",
    async: false,
    success: function (data) {
      if (data.msg == 1) {
        console.log('want delete success');
      }
      else {
        alert(信息异常);
      }
    },
    error: function (data) {
      alert("系统出错");
    }
  });
  $('#ensure_want_delete').modal('hide');
  $('[item_id=' + item_id + ']').fadeOut();
}

// 渲染卖家信息
function renderSellerInfo(seller_info) {
  $('#seller_name span').eq(0).text(seller_info.sellerName);
  $('#seller_contact span').eq(0).text(seller_info.sellerContact);
  let $contactWay = $('#seller_contact span').eq(1);
  switch (seller_info.sellerContactWay) {
    case '1':
      $contactWay.text('QQ');
      break;
    case '2':
      $contactWay.text('微信');
      break;
    case '3':
      $contactWay.text('手机');
      break;
  }
}
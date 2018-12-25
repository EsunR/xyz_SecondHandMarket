$(function () {
  // 显示面板
  showPanel();
  function showPanel() {
    let part = window.location.hash;
    $('.nav-link').each(function () {
      $(this).removeClass('active').attr('aria-selected', 'false');
    });
    $(part + '_tab').addClass('active').attr('aria-selected', 'true');
    $('.tab-pane').removeClass('show active');
    $(part).addClass('show active')
  }
  var url = window.location.href.split('#')[0];
  
  /*
  //切换面板变换url
  $('#info_tab').click(function(){
	  window.location.href = url + '#info';
  })
  $('#publish_tab').click(function(){
	  window.location.href = url + '#publish';
  })
  $('#want_tab').click(function(){
	  window.location.href = url + '#want';
  })
  $('#collection_tab').click(function(){
	  window.location.href = url + '#collection';
  })
  $('#userMsg_tab').click(function(){
	  window.location.href = url + '#userMsg';
  })
  $('#sysMsg_tab').click(function(){
	  window.location.href = url + '#sysMsg';
  })
  */
  
  
  //url变化监听器
  if (('onhashchange' in window) && ((typeof document.documentMode === 'undefined') || document.documentMode == 8)) {
    window.onhashchange = hashChange;
  }
  function hashChange() {
    showPanel();
    let hash = window.location.hash;
    /*
    switch(hash){
    case '#info':
    	console.log('info');
    	break;
    case '#publish':
    	console.log('publish');
    	break;
    case '#want_tab':
    	console.log('want_tab');
    	break;
    case '#collection_tab':
    	console.log('collection_tab');
    	break;
    }
    */
  }


  // 个人信息面板相关=========================
  // 点击“更改信息按钮”
  let show_submit_change = true;
  $('#change').click(function () {
    if (show_submit_change == true) {
      $('fieldset').removeAttr('disabled');
      $('#submit_change').removeAttr('disabled')
        .removeClass('btn-secondary').addClass('btn-primary');
      $(this).text('取消更改')
      show_submit_change = false;
    }
    else {
      $('fieldset').attr('disabled', 'disabled');
      $('#submit_change').attr('disabled', 'disabled').removeClass('btn-primary').addClass('btn-secondary');;
      $(this).text('更改信息')
      show_submit_change = true;
    }
  })
  // 点击“提交更改”按钮
  $('#submit_change').click(function () {
    // TODO: 提交更改信息
	  $.ajax({
	  	    type: "post",
	  	    dataType:"json",
	  	    data:$('#ss1').serialize(),
	  	    url: loca+"/userUpdate",
	  	    async:false,
	  	  success:function(data) {
	    	    if(data.msg==1){
	    	    	window.location.reload();
	    	    }
	    	    else{
	    	    	alert(信息异常);
	    	    }
	    	    },
	    	    error:function(data){
	    	    	alert("系统出错");
	    	    }
	  	  });
  })



  // 商品信息面板相关=========================

  function getSrc(item_id) {
    return loca +'/Data/SecondHand/Item/' + item_id + '/cover'; //封面在服务器上存放的路径
  }
  renderItemPic();  // 该函数应该放在渲染出商品列表（页面DOM树生成）之后执行
  function renderItemPic() {
    $('.item_card').each(function () {
      item_id = $(this).attr('item_id')
      $(this).find('img').eq(0).attr('src', getSrc(item_id));
    })
  }
  // 点击商品获取商品ID后跳转到商品页面
  $('.item_card').click(function () {
    item_id = $(this).attr('item_id');
    // TODO: 由商品ID跳转到商品页面
    window.location.href = loca+'/Items/' + item_id;
  })

  // 点击“发布-已售出”按钮
  $('.publish_sold').click(function () {
    event.stopPropagation();
    item_id = $(this).parents('.item_card').attr('item_id');
    $('#ensure_publish_sold').modal('toggle');
  })

  // 点击“发布-删除”按钮
  $('.publish_delete').click(function () {
    event.stopPropagation();
    item_id = $(this).parents('.item_card').attr('item_id');
    $('#ensure_publish_delete').modal('toggle');
    $.ajax({
  	    type: "post",
  	    dataType:"json",
  	    data:{id:item_id},
  	    url: loca+"/ipublishDelete",
  	    async:false,
  	  success:function(data) {
    	    if(data.msg==1){
    	    	window.location.reload();
    	    }
    	    else{
    	    	alert(信息异常);
    	    }
    	    },
    	    error:function(data){
    	    	alert("系统出错");
    	    }
  	  });
  })

  // 点击“想要-删除”按钮
  $('.want_delete').click(function () {
    event.stopPropagation();
    item_id = $(this).parents('.item_card').attr('item_id');
    user_id = $(this).parents('.item_card').attr('user_id');
    $('#ensure_want_delete').modal('show');
    $.ajax({
  	    type: "post",
  	    dataType:"json",
  	    data:{user_id:user_id,item_id:item_id},
  	    url: loca+"/iwantDelete",
  	    async:false,
  	  success:function(data) {
    	    if(data.msg==1){
    	    	window.location.reload();
    	    }
    	    else{
    	    	alert(信息异常);
    	    }
    	    },
    	    error:function(data){
    	    	alert("系统出错");
    	    }
  	  });
  })

  // 点击“查看卖家信息”按钮
  $('.seller_info').click(function () {
    event.stopPropagation();
    item_id = $(this).parents('.item_card').attr('item_id');
    $('#seller_info').modal('show')
    // TODO: 发送Ajax请求渲染出模态框中的卖家信息，下方示例
    // Ajax返回的对象
    let seller_info = {
      sellerName: '张先生',
      sellerContactWay: 2,
      sellerContact: '641411169'
    }
    // Ajax接收数据成功后执行的函数
    renderSellerInfo(seller_info);
  })

  // 执行Ajax
  function render(){

  }

});
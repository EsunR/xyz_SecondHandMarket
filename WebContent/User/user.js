$(document).ready(function () {
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
  //url变化监听器
  if (('onhashchange' in window) && ((typeof document.documentMode === 'undefined') || document.documentMode == 8)) {
    window.onhashchange = hashChange;
  }
  function hashChange() {
    showPanel();
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
    console.log('提交更改');
  })



  // 商品信息面板相关=========================
  function getSrc(item_id){
    return '../Data/SecondHand/Item/' + item_id + '/cover.jpg'; //封面在服务器上存放的路径
  }
  renderItemPic();
  function renderItemPic(){
    $('.item_card').each(function(){
      let item_id = $(this).attr('item_id')
      $(this).find('img').eq(0).attr('src',getSrc(item_id));
      console.log(item_id);
    })
  }




});
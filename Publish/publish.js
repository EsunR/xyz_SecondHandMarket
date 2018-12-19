$(document).ready(function () {
  $("#upload_pic").fileinput({
    language: "zh",
    theme: "fa",
    showCaption: false, // 不显示本地文件名
    allowedFileTypes: ['image'], // 只允许上传图片
    allowedFileExtensions: ['jpg', 'png'],
    uploadAsync: false,
    showUpload: false, //是否显示上传按钮
    showRemove: false, //是否显示上传按钮
    browseClass: "btn btn-warning", //按钮样式 
    required: true,
    showClose: false,
    maxFileCount: 5,  // 上传最大限制是5
    removeFromPreviewOnError:true,  //当文件不符合规则，就不显示预览
  });
});
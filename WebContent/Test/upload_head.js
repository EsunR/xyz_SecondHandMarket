$(document).ready(function () {
  var fileList = this.files;
  for (var i = 0; i < fileList.length; i++) {
    var imgSrcI = getObjectURL(fileList[i]);
    imgName.push(fileList[i].name);
    imgSrc.push(imgSrcI);
    imgFile.push(fileList[i]);
  }
});
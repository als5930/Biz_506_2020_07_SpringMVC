$(function () {
  $(".io_item").click(function () {
    const seq = $(this).data("seq");
    document.location.href = `${rootPath}/detail?id=` + seq; // ?id=P00001
  });
});

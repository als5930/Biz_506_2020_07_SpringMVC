$(function () {
  $("td.book-title").click(function () {
    let seq = $(this).data("seq");

    document.location.href = `${rootPath}/iolist/detail/${seq}`;
  });
});

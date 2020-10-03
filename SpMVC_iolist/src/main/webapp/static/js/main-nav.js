$(function () {
<<<<<<< HEAD
=======
  $(window).scroll(function () {
    let headerHeight = $("header").height();

    let windowTop = $(window).scrollTop();
    if (windowTop > headerHeight) {
      $("#main-nav").css("position", "fixed");
      $("#main-nav").css("top", "0");
    } else {
      $("#main-nav").css("position", "relative");
    }
  });

  $("li#menu-home").click(function () {});
  $("li#menu-iolist").click(function () {});
  $("li#menu-join").click(function () {});
  $("li#menu-login").click(function () {});
>>>>>>> b5f9a619524354a73346db20cb1209b68e3c08d8

  $("#main-nav li").click(function () {
    let menu_text = $(this).text();
    let menu_id = $(this).attr("id");

    if (menu_text === "정보보기") {
<<<<<<< HEAD
      document.location.href = `${rootPath}/list`;
    } else if (menu_id === "menu-home") {
      document.location.href = `${rootPath}/`;
=======
      document.location.href = `${rootPath}/iolist-list`;
    } else if (menu_id === "menu-home") {
      document.location.href = `${rootPath}/`;
    } else if (menu_id === "menu-iolist") {
      document.location.href = `${rootPath}/read/`;
>>>>>>> b5f9a619524354a73346db20cb1209b68e3c08d8
    } else if (menu_id === "menu-join") {
      document.location.href = `${rootPath}/member/join`;
    } else if (menu_id === "menu-logout") {
      document.location.href = `${rootPath}/member/logout`;
    }
  });
});

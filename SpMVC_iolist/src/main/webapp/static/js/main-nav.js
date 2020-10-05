$(function () {
  $("#main-nav li").click(function () {
    let menu_text = $(this).text();
    let menu_id = $(this).attr("id");

    if (menu_text === "정보보기") {
      document.location.href = `${rootPath}/list`;
    } else if (menu_id === "menu-home") {
      document.location.href = `${rootPath}/`;
    } else if (menu_id === "menu-home") {
      document.location.href = `${rootPath}/`;
    } else if (menu_id === "menu-home") {
      document.location.href = `${rootPath}/`;
    } else if (menu_id === "menu-join") {
      document.location.href = `${rootPath}/join`;
    } else if (menu_id === "menu-logout") {
      document.location.href = `${rootPath}/logout`;
    }
  });
});

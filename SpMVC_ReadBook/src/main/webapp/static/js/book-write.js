$(function () {
  $("section#book-modal").css("display", "none");

  $("#btn-save").click(function () {
<<<<<<< HEAD
    // naver로 부터 조회한 도서정보를 저장하는 까닭에
    // 유효성검사는 일단 생략
=======
    // naver로 부터 조회한 도서정보를 저장하는 까닭에 유효성검사는 일단 생략
>>>>>>> b5f9a619524354a73346db20cb1209b68e3c08d8
    $("form").submit();
  });

  $("#naver-search").click(function () {
    let title = $("#title").val();
    if (title === "") {
<<<<<<< HEAD
      alert("도서명을 입력한 후 검색을 하세요");
      $("#title").focus();
      return false;
    }
    // ajax를 사용하여 서버에 네이버 검색 요청
=======
      alert("도서명 입력 후 검색하세요");
      $("#title").focus();
      return false;
    }

    // Ajax를 사용하여 Server에 네이버 검색 요청
>>>>>>> b5f9a619524354a73346db20cb1209b68e3c08d8
    $.ajax({
      // ajax로 서버의 /naver/search URL에 POST로 요청을 하면서
      // search_text 변수에 title 변수에 담긴 값을 담아서 전달하고
      url: `${rootPath}/naver/search`,
      method: "POST",
      data: { search_text: title },
<<<<<<< HEAD
      // 서버가 데이터 조회를 수행한 후 view(HTML코드)코드를
      // return 하면 그 결과를
      // #search-result div box에 채워서 보여달라
=======
      // 서버가 데이터 조회를 수행한 후 view(HTML code) 코드를 return 하면 그 결과를
      // #search-result div box 에 채워서 보여달라!!
>>>>>>> b5f9a619524354a73346db20cb1209b68e3c08d8
      success: function (result) {
        $("#search-result").html(result);
      },
      error: function (error) {
        alert("서버 통신 오류!!");
      },
    });
<<<<<<< HEAD
=======

>>>>>>> b5f9a619524354a73346db20cb1209b68e3c08d8
    $("#book-modal").css("display", "block");
  });

  // x 표시를 클릭했을때 modal 창 닫기
  $("div#modal-header span").click(function () {
    $("#book-modal").css("display", "none");
  });
  /*
<<<<<<< HEAD
동적으로 구현된 HTML에 event 핸들링 설정하기
현재 document(HTML 문서)가 생성되는 동안이 없던 tag를
JS(JQ)코드에서 동적으로 생성했을 경우 화면에 그려지는 것은
아무런 문제가 없으나
JS에서 event핸들러를 설정할때 아직 화면에 없는 tag에 연결을 하면
무시해 버리고 없던일로 만들어 버린다.
사후에(HTML 문서가 완성된 후) JS 코드로 생성할 tag(id, class)에
event를 설정하려면 자체에 설정하지 않고
가장 상위 객체인 document에 on 함수를 사용하여 event를 설정한다.
$(document).on("event","대상",function(){ } )
주의사항
$(selector).click(function(){}) 
만약 기존에 selector에 click event가 설정되어 있으면
기존의 이벤트를 덮어쓰기 한다.
$(document).on("event","selector")
만약 기존에 selector에 대한 click event가 설정되어 있더라도
중복 정의 된다.
동적으로 여는곳에서는 
$(document).on() 을 사용하여 event 핸들러를 설정하고
동적으로 열리는 곳에서는 절대 $(document).on() 사용하면 안된다.
동적으로 열리는 곳에서는 $(selector).click() 를 사용하자
*/
  $(document).on("click", "div.book-select", function () {
    let isbn = $(this).data("isbn");

=======
    동적으로 구현된 HTML에 event 핸들링 설정하기
    현재 document(HTML 문서)가 생성되는 동안이 없던 tag를
    JS(JQ)코드에서 동적으로 생성했을 경우 화면에 그려지는 것은
    아무런 문제가 없으나
    
    JS에서 event핸들러를 설정할때 아직 화면에 없는 tag에 연결을 하면
    무시해 버리고 없던일로 만들어 버린다.
    
    사후에(HTML 문서가 완성된 후 ) JS 코드로 생성할 tag(id, class)에 
    event를 설정하려면 자체에 설정하지 않고
    가장 상위 객체인 document에 on 함수를 사용하여 event를 설정한다.
    $(document).on("event","대상",function() { } )
    
    주의사항
    $(select).click(function(){})
    만약 기존에 select에 click event가 설정되어 있으면 
    기존의 이벤트를 덭어쓰기 한다
    
    $(document).on("event","selector")
    만약 기존에 selector에 대한 click event가 설정되어 있더라도
    중복의 정의된다
    
    동적으로 여는곳에서는 $(document).on을 사용하여 event 핸들러를 설정하고
    
    동적으로 열리는 곳에서는 절대$(dovument).on() 사용라면 안된다
    종족으로 열리는 곳에서는 $(selector).click()를 사용하자
  */

  $(document).on("click", "div.book-select", function () {
    let isbn = $(this).data("isbn");
>>>>>>> b5f9a619524354a73346db20cb1209b68e3c08d8
    // 13자리 isbn 추출
    // 코드의 오른쪽에서 13자리를 잘라내라
    let length = isbn.length;
    isbn = isbn.substring(length - 13);
<<<<<<< HEAD
=======
    // alert(isbn)
>>>>>>> b5f9a619524354a73346db20cb1209b68e3c08d8

    $.ajax({
      url: `${rootPath}/api/isbn`,
      method: "POST",
      data: { search_text: isbn },
    })
      .done(function (bookVO) {
<<<<<<< HEAD
        // alert(JSON.stringify(bookVO))
=======
        //alert(JSON.stringify(bookVO))
>>>>>>> b5f9a619524354a73346db20cb1209b68e3c08d8
        $("#seq").val(bookVO.seq);
        $("#title").val(bookVO.title);
        $("#link").val(bookVO.link);
        $("#image").val(bookVO.image);
        $("#author").val(bookVO.author);
        $("#price").val(bookVO.price);
        $("#discount").val(bookVO.discount);
        $("#publisher").val(bookVO.publisher);

        let isbn = bookVO.isbn;
<<<<<<< HEAD
        // isbn 변수에 들어있는 문자열중에서 html tag 구조를 가진 단어가 있으면
        // 무조건 제거라하라
=======
        //  isbn 변수에 들어있는 문자열중에서 html tag 구조를 가진 단어가 있으면 무조건 제거하라
>>>>>>> b5f9a619524354a73346db20cb1209b68e3c08d8
        isbn = isbn.replace(/(<([^>]+)>)/gi, "");
        // isbn = isbn.substring(isbn.length - 17, isbn.length - 4);

        isbn = isbn.substring(isbn.length - 13);
<<<<<<< HEAD
        $("#isbn").val(isbn);

        $("#description").val(bookVO.description);
        $("#pubdate").val(bookVO.pubdate);

        $("section#book-modal").css("display", "none");
      })
      .fail(function (xhr, textStatus, error) {
        alert("서버와 통신오류!");
=======

        $("#isbn").val(isbn);

        $("#description").val(bookVO.description);

        $("#pubdate").val(bookVO.pubdate);

        $("#section#book-modal").css("display", "none");
      })
      .fail(function (xhr, textStatus, error) {
        alert("서버와 통신오류!!");
>>>>>>> b5f9a619524354a73346db20cb1209b68e3c08d8
      });
  });
});

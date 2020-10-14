# spring web tiles project

### spring에서 전통적으로 아주 많이 사용하던 layout 관리자
### 최근 4 ~ 5년 전부터 인기 시들햐졌지만, 전자정부 프레임워크에서 지금도 표준 layout 처럼 사용되고 있다

### tiles dependency 가져오기
* tiles-core, tiles-extras


### tiles-layout.xml 설정하기
* jsp를 이용해서 화면 layout을 꾸미는 방법을 정의하는 파일
* tiles-definitions tag사이에 layout 꾸미는 방법을 기술
* xml 파일의 tag를 정의할때 tag 이름이 복수형으로 되어있다는 것은 tag내부에 단수형으로 여러개의 설정내용이 정의된다

* 정의 방법
1. layout.jsp 파일을 definition라는 이름으로 정의 
2. layout.jsp attribute로 등록한 이름들을 tiles-layout.xml에 put-attribute로 등록하기
3. view 폴더에 layout 폴더를 만들고, header.jsp, menu.jsp, content.jsp, footer.jsp

### tiles-context.xml 파일의 UrlBaseResolver bean 설정할때 유의사항
* 일반적으로 spring에서는 bean에 bean을 주입할때 미리 bean을 만들고 id 를 통해서 주입한다
* tiles에서 TilesView클래스를 UrlBaseResolver에 bean으로 주입할때는 일반적인 방식으로 주입하면 안된다
* 반드시 직접 TilesView 클래스이름을 주입하는 방식을 사용해야 한다
* 여기서 TilesView 클래스를 value값을 문자열로 지정을 하는데 자동완성이 안된다
* 이럴때는 임시로 bean을 하나 만들고 class 값에 TilesView를 입력한후 클래스 이름을 자동완성하여 그 문자열을 잘라 붙이기로 수행하면 된다
* order property의 value값을 반드시 1로 설정해 주어야 한다

### tiles-context.xml을 설정한 후 servlet-context.xml의 변경사항 추가
* InternalResouceViewResolver의 order 속성을 반드시 2 이상의 값으로 지정해주어야 한다
* TilesView 사용하는 UrlBasResolver를 우선순위1, Internal*Resolver를 우선순위2로 변경하는 것이다
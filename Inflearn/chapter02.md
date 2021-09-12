#Spring boot 동작원리

### application.properties(application.yml)

- 설정이름 = 값(설정이름 : 값)


## DispatcherServlet
- 사용자의 요청을 담아두는 게이트웨이.
- AutoConfiguration 됨
- 클라이언트의 모든 요청을 한 곳으로 받아서 처리
- 요청에 맞는 Handler로 요청을 전달
- Handler의 실행 결과를 Http Response 형태로 만들어 반환


요청 -> 디스패쳐서블릿 -> 핸들러 -> 컨트롤러 -> 모델엔 뷰
뷰 리졸버 -> 뷰에 모델을 담아 응답함

## HttpMessageConvertersAutoConfiguration
Http의 요청을 Json형식으로 받아줌


## @RestController -> Spring4부터 지원됨
- @Controller + @ResponseBody
View를 갖지 않는 REST Data(JSON/XML) 을 반환


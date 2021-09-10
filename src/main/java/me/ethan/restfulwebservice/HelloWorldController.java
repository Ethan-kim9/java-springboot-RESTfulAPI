package me.ethan.restfulwebservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    //GET

    // /hello-world -> (endpoint)

    //@RequestMapping(method = RequestMethod.Get, path="/hello-world") -> 최근에는 get, post 등의  매핑으로 간단화
    @GetMapping(path = "/hello-world")
    public String helloWorld(){
        return "Hello World";
    }

    //alt + enter => 클래스 생성단축키
    // 자바빈으로 반환하게 되면 JSON 형태로 반환이됨
    // xml 라이브러리 추가로 xml 형태로 반환도 가능함
    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello World");
    }


}

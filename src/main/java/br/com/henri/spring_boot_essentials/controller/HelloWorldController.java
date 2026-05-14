//package br.com.henri.spring_boot_essentials.controller;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/v1/hello")
//public class HelloWorldController {
//
////    @GetMapping
////    public String helloWorld() {
////         return "Hello World";
////    }
//
////    @GetMapping
////    public ResponseEntity<String> helloWorld() {
////        return ResponseEntity.ok("Hello World!");
////    }
//
////    @GetMapping
////    public ResponseEntity<String> helloWorld() {
////        return new ResponseEntity<>("Hello World!", HttpStatus.OK);
////    }
//
//    @GetMapping(value = ("/{id}")) //patch verbal
//    @ResponseStatus(HttpStatus.OK)
//    public String get1(@PathVariable String id) {
//        return "Hello World " + id;
//    }
//
//    @GetMapping
//    @ResponseStatus(HttpStatus.OK)
//    public String get2(@RequestParam(value = "name", required = true) String name) {
//        return "Hello World " + name;
//    }
//
//    @PostMapping
//    @ResponseStatus(HttpStatus.CREATED)
//    public String post(@RequestBody String name) {
//        return "Hello World " + name;
//    }
//
//}

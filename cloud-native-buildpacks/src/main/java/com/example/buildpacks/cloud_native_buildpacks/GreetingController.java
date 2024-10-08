package com.example.buildpacks.cloud_native_buildpacks;


@RestController
public class GreetingController {

    @GetMapping("/{name}")
    public String hello(@PathVariable String name){
        return "Welcome " + name +" to Cloud natttttttive World !!!";
    }
}

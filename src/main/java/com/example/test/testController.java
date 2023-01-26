package com.example.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController
{
    @GetMapping("/double")
    public int returndouble(int a)
    {
       return a*a;
    }
}

package com.david.springgirl;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author David
 *
 */
@Controller
@ResponseBody
public class Hello {

    @RequestMapping( value = {"hello","hi"}, method = RequestMethod.GET)
    public String say(@RequestParam(value = "id") Integer id){
         return "qwe"+id;
     }

}

package com.david.controller;

import com.david.domain.Result;
import com.david.service.GirlService;
import com.david.domain.Girl;
import com.david.repository.GirlRepository;
import com.david.utils.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
/**
 * @author David
 * @date 2016/10/31
 */
@RestController
public class GirlController {
    @Autowired
    private GirlRepository girlRepository;
    @Autowired
    private GirlService girlService;
    private final static Logger logger= LoggerFactory.getLogger(GirlController.class);
    @GetMapping(value = "/girls")
    public Result girlList() {
        return ResultUtil.success(girlRepository.findAll());
    }


    @PostMapping(value = "girls")
    public Result girlAdd(@Valid Girl girl, BindingResult bindingResult,HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin","*");
        if (bindingResult.hasErrors()){
            return ResultUtil.error(1,bindingResult.getFieldError().getDefaultMessage());
        }
        System.out.println(girl.getAge());
        System.out.println(girl.getCupSize());
        girl.setCupSize(girl.getCupSize());
        girl.setAge(girl.getAge());

        return ResultUtil.success(girlRepository.save(girl));
    }


    @GetMapping(value = "getgirl")
    public Result girlFindOne(
            @RequestParam(value = "id") Integer id,
    HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin","*");
        return ResultUtil.success(girlRepository.findById(id));
    }


    @PutMapping(value = "girls/{id}")
    public Girl girlUpdateOne(@PathVariable("id") Integer id,
                              @RequestParam("cupSize") String cupSize,
                              @RequestParam("age") Integer age) {

        Girl girl = new Girl();
        girl.setId(id);
        girl.setAge(age);
        girl.setCupSize(cupSize);
        return girlRepository.save(girl);
    }


    @DeleteMapping(value = "girls/{id}")
    public Result de(@PathVariable("id") Integer id) {
        girlRepository.deleteById(id);
        return ResultUtil.success();
    }


    @GetMapping(value = "girls/age/{age}")
    public Result girlLists(@PathVariable("age") Integer age) {
        return ResultUtil.success(girlRepository.findByAge(age));
    }

    @PostMapping(value = "girls/tran")
    public void girlLs() {
        girlService.insertTwo();
    }

    @GetMapping(value = "girls/getAge/{id}")
    public void getAge(@PathVariable("id") Integer id) throws Exception{
       girlService.getage(id);
    }

}

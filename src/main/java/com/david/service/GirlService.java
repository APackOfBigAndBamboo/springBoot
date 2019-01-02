package com.david.service;

import com.david.domain.Girl;
import com.david.enums.ResultEnum;
import com.david.execption.GirlException;
import com.david.repository.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
/**
 * @author David
 */
@Service
public class GirlService  {

    @Autowired
    private GirlRepository girlRepository;

    @Transactional(rollbackFor = Exception.class)
    public void insertTwo(){
        Girl g=new Girl();
        g.setCupSize("A");
        g.setAge(18);
        girlRepository.save(g);

        Girl g1=new Girl();
        g1.setCupSize("BBBBBB");
        g1.setAge(18);
        girlRepository.save(g1);
    }

    public void getage(Integer id)throws Exception{
        Optional<Girl> girl=girlRepository.findById(id);
        Integer age=girl.get().getAge();
        int a=10;
        int b=13;
        int c=16;
        if (age<a){
            throw new GirlException(ResultEnum.PRIMARY_SCHOOL);
        }else if (age>b && age<c){
            throw new GirlException(ResultEnum.MIDDLE_SCHOOL);
        }
    }
}

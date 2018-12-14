package com.baizhi;

import com.baizhi.entity.City;
import com.baizhi.mapper.CityMapper;
import com.baizhi.mapper.TestMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootCommonMapperApplicationTests {
    @Autowired
    CityMapper cityMapper;
    @Autowired
    TestMapper testMapper;
    @Test
    public void contextLoads() {
        List<City> cities = cityMapper.selectAll();
        for (City city : cities) {
            System.out.println(city);
        }
    }
    @Test
    public void test1(){
        List<com.baizhi.entity.Test> tests = testMapper.selectAll();
        for (com.baizhi.entity.Test test : tests) {
            System.out.println(test);
        }

    }
    @Test
    public void test2(){
        com.baizhi.entity.Test test = new com.baizhi.entity.Test(null,null,null,null);
        test.setTid(18);
        test.setName("哈哈");
        test.setEmail("ss@dd.ff");
        test.setBirthday(new Date());
        int i = testMapper.updateByPrimaryKey(test);
        System.out.println(i);
        com.baizhi.entity.Test test1 = testMapper.selectByPrimaryKey(18);
        System.out.println(test1);

    }

}

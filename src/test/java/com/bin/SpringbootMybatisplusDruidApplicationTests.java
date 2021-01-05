package com.bin;

import com.bin.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootMybatisplusDruidApplicationTests {

    @Autowired
    private UserService userService;


    @Test
    void contextLoads() {
        System.err.println(userService.findById("4028488176b196040176b19b0d2a0000"));
    }


    @Test
    void testFindByUsername(){
        System.err.println(userService.findByUsername("uzi"));
    }

}

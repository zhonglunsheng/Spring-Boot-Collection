package com.lsheng.boo;

import com.lsheng.boo.domain.Server;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BootVApplicationTests {

    @Test
    public void contextLoads() throws Exception {
        Server server = new Server();
        server.copyTo();
        System.out.println(server.toString());
    }

}

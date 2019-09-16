package com.iuboot.kafkademoproducer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest
public class KafkaDemoProducerApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Autowired
    private KafkaSender<Message> kafkaSender;

    @Test
    public void kafkaSend() throws InterruptedException {
        //模拟发消息
        for (int i = 0; i < 5; i++) {

            Message message = new Message();
            message.setId(UUID.randomUUID().toString());
            message.setMsg("test");

            kafkaSender.send(message);
            Thread.sleep(3000);

        }
    }

}

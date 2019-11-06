package com.iuboot.kafkademoproducer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class TestEndpoint {

    @Autowired
    private KafkaSender<Message> kafkaSender;

    @RequestMapping("/test")
    public void kafkaSend() throws InterruptedException {
        //模拟发消息
        for (int i = 0; i < 5; i++) {

            Message message = new Message();
            message.setId(UUID.randomUUID().toString());
            message.setMsg("test" + i);

            kafkaSender.send(message);
            Thread.sleep(3000);

        }
    }
}

package net.kafkamasteryc.springboot;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerDatabase {

    private final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumerDatabase.class);


    @KafkaListener(topics = "chatapp_messages", groupId = "myGroup")
    public void consume(String eventMessage){
        LOGGER.info(String.format("Message received->%s", eventMessage));
    }


}

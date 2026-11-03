package com.openkm.service;

import com.openkm.dto.CreditCard;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class CreditCardConsumerService {
    @KafkaListener(topics = {"user-topic"})
    public void consume(CreditCard u){
        IO.println(u);
    }
}

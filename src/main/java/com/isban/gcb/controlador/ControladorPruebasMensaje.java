package com.isban.gcb.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isban.gcb.producer.KafkaProducer;

@RestController
@RequestMapping("kafka")
public class ControladorPruebasMensaje {

    @Autowired
    private KafkaProducer kafkaProducer;
    
    @PostMapping("enviar")
    private void enviarMensaje(@NonNull String msg)
    {
        kafkaProducer.sendMessage(msg);
    }
    
    
}

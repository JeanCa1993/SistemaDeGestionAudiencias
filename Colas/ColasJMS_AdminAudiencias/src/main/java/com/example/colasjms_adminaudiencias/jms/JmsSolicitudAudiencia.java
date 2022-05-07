/*
package com.example.colasjms_adminaudiencias.jms;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class JmsSolicitudAudiencia {
    @Autowired
    private JmsTemplate jmsTemplate;

    @Value("${jms.cola.envio}")
    String destino;

    public void send(String mensaje){
        jmsTemplate.convertAndSend(destino, mensaje);
    }
}

*/

package com.example.colasjms_adminaudiencias.jms;
import com.example.colasjms_adminaudiencias.entidades.Audiencia;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class JmsSolicitudAudiencia {

    @Autowired
    private JmsTemplate jmsTemplate;

    @Value("cola.Audiencias")
    String colaDestino;

    @Value("cola.Respuesta.Audiencias")
    String colaRespuesta;

    public void send(String mensaje){
        String corrId = UUID.randomUUID().toString();
        //enviar mensaje con un corrId
        jmsTemplate.convertAndSend(colaDestino, mensaje, m -> {
            m.setJMSCorrelationID(corrId);
            return m;
        });

        System.out.println("Administrador: Enviando:"+mensaje);

        //espera la respuesta del sistema de verificacion de Audiencias
        String respuesta = (String) jmsTemplate.receiveSelectedAndConvert(colaRespuesta,
                "JMSCorrelationID="+
                corrId+"");
        System.out.println("Administrador Leyendo respuesta: "+respuesta);

        System.out.println("Administrador con corrId:"+corrId);
    }



}

package com.upc.verificadoraudiencia.jms;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.upc.verificadoraudiencia.entidades.Audiencia;
import com.upc.verificadoraudiencia.negocio.NegocioAudiencia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.support.JmsMessageHeaderAccessor;
import org.springframework.stereotype.Component;

@Component
public class jmsVerificador {
    /*
    @Autowired
    private NegocioAudiencia negocioAudiencia;

    @JmsListener(destination = "${jms.queue.desination}")
    public void miMensaje(String mensajeJson){
        System.out.println("Recibido: " + mensajeJson);

        //mensaje JSON a Objeto Audiencia
        ObjectMapper mapper = new ObjectMapper();
        try{
            //convertir a Json Audiendia
            Audiencia audiencia = mapper.readValue(mensajeJson, Audiencia.class);
            System.out.println(mensajeJson);
            Audiencia respuesta = negocioAudiencia.grabar(audiencia);
            if(respuesta==null){
                System.out.println("No se pudo registrar");
            }else{
                System.out.println("Registrado ok!");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("No se pudo registrar");
        }

    }
    */



    @Autowired
    private JmsTemplate jmsTemplate;

    @Value("${jms.cola.respuesta}")
    String colaRespuesta;

    @JmsListener(destination = "${jms.cola.envio}")
    public void miRespuesta(String mensaje, JmsMessageHeaderAccessor headerAccessor){
        String corrID;
        corrID = headerAccessor.getCorrelationId();
        System.out.println("VERIFICADOR: llego : " + corrID);
        System.out.println("VERIFICADOR Solicitud recibida: " + mensaje);
        String mensajeRespuesta = "Audiencia "+corrID+" valida.";

        jmsTemplate.convertAndSend(colaRespuesta,mensajeRespuesta,m->{
            m.setJMSCorrelationID(corrID);
            return m;
        });

        System.out.println("VERIFICADOR respondiendo resultado de validacion: "+mensajeRespuesta);

    }

}

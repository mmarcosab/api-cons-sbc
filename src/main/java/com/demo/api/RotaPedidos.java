package com.demo.api;

import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.builder.RouteBuilder;

public class RotaPedidos {

    public static void main(String[] args) throws Exception {

        CamelContext context = new DefaultCamelContext();
        context.addRoutes(new RouteBuilder() {

        	  @Override
        	  public void configure() throws Exception {
        	       
        		  //padrão de integração messages
        		  from("file:C:\\Users\\Marcos\\Desktop\\teste\\persons.json?delay=5s&noop=true").
        		  		log("${id} - ${name}").
        	       to("file:saida");
        	  } 
        });

        context.start(); 
        Thread.sleep(2000); 
        context.stop(); 
    }    
}

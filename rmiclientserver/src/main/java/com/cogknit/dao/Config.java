package com.cogknit.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;
import org.springframework.remoting.support.RemoteExporter;

import com.cogknit.service.MyService;

@Configuration
@EnableAutoConfiguration
public class Config {

	@Bean
    RemoteExporter registerRMIExporter(@Autowired MyService myService) {
		System.out.println("server");
        RmiServiceExporter exporter = new RmiServiceExporter();
        exporter.setServiceName("addinfo");
        exporter.setServiceInterface(AddInfo.class);
        exporter.setService(myService);
        System.out.println("rmi server");
       // exporter.setServiceUrl("rmi:// 192.168.0.63/ScheduledService"); 
        return exporter;
        
    }
}
//
//rmiProxyFactoyy3.setServiceUrl("rmi://" + url + "/ScheduledService");
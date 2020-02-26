package com.cogknit;
@Configuration
public class Config {

	@Bean
    RemoteExporter registerRMIExporter() {
         
        RmiServiceExporter exporter = new RmiServiceExporter();
        exporter.setServiceName("helloworldrmi");
        exporter.setServiceInterface(HelloWorldRMI.class);
        exporter.setService(new HelloWorldRMIimpl());
         
        return exporter;
    }
}

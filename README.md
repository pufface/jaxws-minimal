# JAX-WS-MINIMAL

Minimal demo for run JAX WS on Tomcat and Websphere with same codebase.
No additional dependencies needed, except one lib for Tomcat runtime.

http://memorynotfound.com/category/java/jax-ws/
http://ics.upjs.sk/~novotnyr/blog/2068/deploying-jax-ws-services-on-java-7-and-tomcat-7

Build jars: `$gradle clean jar`
Build wars: `$gradle clean build`
Eclipse project: `$gradle cleanEclipse eclipse`

Prereq and tested on:
- Tomcat 7 with JDK 6+
- WebSphere 8.0.0.5 with JDK 6
- Gradle 3.4

// TODO binding logger
// TODO Test tomcat 7 on JDK 6
// TODO client ws provider interface (log messages)

## JAX-WS-PROVIDER

Run standalone: `$java -jar build\libs\jax-ws-provider.jar`
Run Tomcat: copy tomcat/lib/webservices-rt-2.3.1.jar to <TOMCAT_HOME>/lib older
Run WebSphere: just deploy and run

Generate WSDL from Java: `$run_wsgen.bat`

Tomcat additional dependecy:
- Tomcat is not full Java EE servlets (eg. does not have any JAX WS runtime)
- GlassFish Metro is standalone web service opensource implemtation
  Contains JAXB RI, JAX-WS RI, SAAJ RI, StAX (SJSXP) and WSIT
- org.glassfish.metro:webservices-rt:2.3.1


## JAX-WS-CONSUMER

Run standalone: `$java -jar build\libs\jax-ws-consumer.jar`
Run Tomcat: just deploy and run
Run WebSphere: just deploy and run

Generate Java from WSDL: `$run_wsimport.bat`

Pack WSDL to archive, no dependency on WSDL location:
- use wsdlLocation URI: http://localhost/wsdl/Service.wsdl
- map URI to local wsdl via: jax-ws-catalog.xml
- put catalog and wsdl to src/main/resources/META-INF

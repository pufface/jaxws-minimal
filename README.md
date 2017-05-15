# JAX-WS-MINIMAL

Minimal demo for run JAX WS on Tomcat and Websphere with same codebase.
No additional dependencies needed, except one lib for Tomcat runtime.

Build jars: `$gradle clean jar`
Build wars: `$gradle clean build`
Eclipse project: `$gradle cleanEclipse eclipse`

Prereq and tested on:
- Tomcat 7 with JDK 6+
- WebSphere 8.0.0.5 with JDK 6
- Gradle 3.4

## JAX-WS-PROVIDER

Standalone: `$java -jar jax-ws-provider.jar` http://localhost:8888/jax-ws-provider/TimeServiceService

Tomcat: http://localhost:8080/jax-ws-provider/TimeServiceService

WebSphere: http://localhost:10039/jax-ws-provider/TimeServiceService

Generate WSDL from Java: `$run_wsgen.bat`

Tomcat additional dependecy:
- Tomcat is not full Java EE servlets (eg. does not have any JAX WS runtime)
- GlassFish Metro is standalone web service opensource implemtation
  Contains JAXB RI, JAX-WS RI, SAAJ RI, StAX (SJSXP) and WSIT
- org.glassfish.metro:webservices-rt:2.3.1
- copy tomcat/lib/webservices-rt-2.3.1.jar to <TOMCAT_HOME>/lib folder


## JAX-WS-CONSUMER

Standalone: `$java -jar jax-ws-consumer.jar`

Tomcat: http://localhost:8080/jax-ws-consumer

WebSphere: http://localhost:10039/jax-ws-consumer

Generate Java from WSDL: `$run_wsimport.bat`

Pack WSDL to archive, no dependency on WSDL location:
- use wsdlLocation URI: http://localhost/wsdl/Service.wsdl
- map URI to local wsdl via: jax-ws-catalog.xml
- put catalog and wsdl to src/main/resources/META-INF

# JAX-WS-MINIMAL

Minimal demo for run JAX WS on Tomcat and Websphere with same codebase.  
**No additional dependencies needed**, except one lib for Tomcat runtime.

Build jars: `$gradle clean jar`  
Build wars: `$gradle clean build`  
Eclipse project: `$gradle cleanEclipse eclipse`  

Prereq and tested on:
- Tomcat 7 with JDK 6+
- WebSphere 8.0.0.5 with JDK 6
- Gradle 3.4

## JAX-WS-PROVIDER

Standalone: `$java -jar jax-ws-provider.jar` `http://localhost:8888/jax-ws-provider/TimeServiceService`

Tomcat: `http://localhost:8080/jax-ws-provider/TimeServiceService`

WebSphere: `http://localhost:10039/jax-ws-provider/TimeServiceService`

Generate WSDL from Java: `$run_wsgen.bat`

Tomcat additional dependecy:
- Tomcat is not full Java EE servlets (eg. does not have any JAX WS runtime)
- GlassFish Metro is standalone web service opensource implemtation
- Contains JAXB RI, JAX-WS RI, SAAJ RI, StAX (SJSXP) and WSIT
- **org.glassfish.metro:webservices-rt:2.3.1**
- copy tomcat/lib/webservices-rt-2.3.1.jar to <TOMCAT_HOME>/lib folder

## JAX-WS-CONSUMER

Standalone: `$java -jar jax-ws-consumer.jar`

Tomcat: `http://localhost:8080/jax-ws-consumer`

WebSphere: `http://localhost:10039/jax-ws-consumer`

Generate Java from WSDL: `$run_wsimport.bat`

Pack WSDL to archive, no dependency on WSDL location:
- use wsdlLocation URI: `http://localhost/wsdl/Service.wsdl`
- map URI to local wsdl via: `jax-ws-catalog.xml`
- put catalog and wsdl to `src/main/resources/META-INF`

## JAX-WS-PROVIDER URL ENDPOINTS
- configuration for Tomcat via `WEB-INF/sun-jaxws.xml`
```xml
<?xml version="1.0" encoding="UTF-8"?>
<endpoints xmlns="http://java.sun.com/xml/ns/jax-ws/ri/runtime" version="2.0">
	<endpoint name="TimeService" url-pattern="/ws/TimeService"
		implementation="sk.fillo.ws.provider.TimeService" />
</endpoints>
```

- configuration for Websphere 8.0 via `WEB-INF/web.xml` servlet configuration (is not really a servlet, but IBM magic for configure URL)
```xml
<web-app xmlns="http://java.sun.com/xml/ns/javaee" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_3_0.xsd"
	version="3.0">
	<!-- TIME SERVICE - JAX WS URL FOR WEBSPHERE 8.0 -->
	<servlet>
		<servlet-name>TestService</servlet-name>
		<servlet-class>sk.fillo.ws.provider.TimeService</servlet-class>
		<load-on-startup>1</load-on-startup>
	</servlet>
	<servlet-mapping>
		<servlet-name>TestService</servlet-name>
		<url-pattern>/ws/TimeService</url-pattern>
	</servlet-mapping>
</web-app>
```

- configuration for Websphere 8.5 via `WEB-INF/ibm-ws-bnd.xml`
```xml
<?xml version="1.0" encoding="UTF-8"?>
<webservices-bnd xmlns="http://websphere.ibm.com/xml/ns/javaee" 
  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
  xsi:schemaLocation="http://websphere.ibm.com/xml/ns/javaee http://websphere.ibm.com/xml/ns/javaee/ibm-ws-bnd_1_0.xsd" 
  version="1.0">
  <!-- TIME SERVICE - JAX WS URL FOR WEBSPHERE 8.5 -->
  <webservice-endpoint port-component-name="TimeService" address="/ws/TimeService" />
</webservices-bnd>
```

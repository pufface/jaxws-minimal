# JAX-WS-MINIMAL

http://memorynotfound.com/category/java/jax-ws/


## JAX-WS-PROVIDER

Generate WSDL from Java:
1. build service classes: `$gradle clean build` 
2. run `$run_wsgen.bat`

Run standalone:
1. build jar: `$gradle clean jar`
2. run `$java -jar build\libs\jax-ws-provider.jar`

Run Tomcat:
1. build war: `$gradle clean build`


## JAX-WS-CONSUMER

Generate Java from WSDL:
1. run `$run_wsimport.bat`



Pack WSDL to archive, no dependency on WSDL location:
- use wsdlLocation URI: http://localhost/wsdl/Service.wsdl
- map URI to local wsdl via: jax-ws-catalog.xml
- put catalog and wsdl to src/main/resources/META-INF

# Prueba Device
## Device
Prueba Device

# Generalidades

Este servicio permite conectar a servicio SOAP y obtener informacion del servicio externo

# Como descargar?

Instale un IDE de su preferencia (ej:IntelliJ), clone el repositorio y ejecute la clase principal PruebaDeviceApplication.java como un proyecto Spring 3.

Necesita tambien tener instalado maven y java.

# WSDL

El wsdl del servicio SOAP se encuentra en la carpeta src/main/resources/wsdl

Instale SOAPUI para generar un mock del servicio y lo puede configurar para que responda en http://localhost:10000/ws y se conecte el servicio al mock cuando envie peticiones de postman

# Swagger

Acceda al swagger despues de levantar el servicio en la direccion local http://localhost:8080/swagger-ui/index.html para ver la documentacion del servicio.


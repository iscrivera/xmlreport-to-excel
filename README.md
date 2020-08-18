# xmlreport-to-excel

_Proyecto desarrollado para generar un reporte en Excel del analisis en Veracode consiste en una libreria desarrollada en Java y maven_

## Comenzando 🚀

_Estas instrucciones te permitirán obtener una copia del proyecto en funcionamiento en tu máquina local para propósitos de desarrollo y pruebas._



### Pre-requisitos 📋

_Que cosas necesitas para instalar el software y como instalarlas_

```
Java 1.8
Maven 3+
Git
```

### Instalación 🔧

_Para bajar, compilar y ejecutar la aplicación sigue los pasos a continuación_

_clona este repositorio_

```
git clone https://github.com/iscrivera/xmlreport-to-excel.git
```

_Ingresa a la carpeta del proyecto y compila_

```
cd xmlreport-to-excel

mvn clean install

mvn package
```

_Con esto se genera el jar ejecutable en la carpeta target_

```
cd target
```

_Copia el jar xmlreport-to-excel.jar y la carpeta dependency-jars hacia la ruta en donde lo vas a utilizar_

## Ejecutando las pruebas ⚙️

_Dentro de la carpeta src/main/test se encuentra una prueba unitaria que puedes ejecutar con el siguiente comando_

```
mvn test
```

_El proyecto trae un reporte de ejemplo con el cual se ejecuta la prueba_

### Pruebas end-to-end con Veracode 🔩

_Obtenga su reporte detallado en Veracode_

_Para esto, una ves logeado en Veracode, vaya a su scan y seleccione:_

```
ViewResults > Download > Detailed XML Export (XML) > Download
```

_Esta acción descargará un archivo zip, el cual debes descomprimir._

_Dentro encontrarás dos archivos un xsd y un xml._

_Este último con un nombre algo largo, como detailedreport_BET_-_Front_15_Jul_2020_Static_20208187534635.xml_

_A este archivo cambiale el nombre a detailVeracodeReport.xml y pegalo en la misma carpeta don pusiste el jar xmlreport-to-excel.jar_

_Ahora solo resta dar doble clic al jar y listo!_

_Se generará un archivo llamado detailVeracodeReport.xls dentro de la misma carpeta con los resultados de la información._


_También puedes ejecutar el siguiente y definir la ruta de tu archivo xml y la salida de tu reporte excel (xls)_

_Esto lo puede hacer con el siguiente comando:_

```
java -jar xmlreport-to-excel.jar C:\ruta\de\entrada\detailVeracodeReport.xml C:\ruta\de\salida\detailVeracodeReport.xls
```

### Y las pruebas de estilo de codificación ⌨️

_En breve compartiré el reporte de sonar y veracode correpondiente_

```
\m/
```


## Construido con 🛠️


* [JAXB](https://javaee.github.io/jaxb-v2/) - The Java™ Architecture for XML Binding (JAXB) provides an API and tools that automate the mapping between XML documents and Java objects.
* [Maven](https://maven.apache.org/) - Manejador de dependencias
* [Lombok](https://projectlombok.org/) - Project Lombok is a java library that automatically plugs into your editor and build tools
* [POI](https://poi.apache.org/) - The Apache POI Project's mission is to create and maintain Java APIs for manipulating various file formats based upon the Office Open XML standards


## Autores ✒️

_Menciona a todos aquellos que ayudaron a levantar el proyecto desde sus inicios_

* **Ascención Rivera Velásquez** - *Trabajo Inicial* - [iscrivera](https://github.com/iscrivera)


## Expresiones de Gratitud 🎁

* Comenta a otros sobre este proyecto 📢
* Invita una cerveza 🍺 o un café ☕ a alguien del equipo. 
* Da las gracias públicamente 🤓.



---
⌨️ con ❤️ por [iscrivera](https://github.com/iscrivera) 😊

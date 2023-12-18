1. Preámbulo
2. Resumen del proyecto
3. Objetivos de aprendizaje
4. Criterios de aceptación del proyecto

1. Preámbulo
De acuerdo con Wikipedia, la internet de las cosas (IoT, por sus siglas en inglés)​ es un concepto que se refiere a una interconexión digital de objetos cotidianos con internet. Constituye un cambio radical en la calidad de vida de las personas en la sociedad, ofrece una gran cantidad de nuevas oportunidades de acceso a datos, servicios específicos en la educación, seguridad, asistencia sanitaria y en el transporte, entre otros campos.

En logística y manejo de flota, por ejemplo, se puede hacer seguimiento en todo momento de la ubicación y las condiciones de la carga y los activos mediante sensores inalámbricos conectados a internet que envían alertas en caso de eventualidades (demoras, daños, robos, etc).

zach-vessels-utMdPdGDc8M-unsplash

La IoT también plantea retos como el almacenamiento, análisis y visualización de la gran cantidad de información que genera. Se calcula que para el 2025 los dispositivos IoT generen 79.4 zettabytes (1 zettabyte equivale a 1 trillón de gigabytes). Como desarrolladoras debemos estar al tanto de estos retos y contribuir para su solución desde nuestra experiencia, conocimiento y ganas de aprender.

2. Resumen del proyecto
En este proyecto construirás la API REST de un Fleet Management Software para consultar las ubicaciones de los vehículos de una empresa de taxis en Beijing, China.

Te entregaremos un poco más de 17 millones de ubicaciones de casi 10 mil taxis. Esperamos que como desarrolladora explores nuevas alternativas y técnicas para almacenar y consultar esta gran cantidad de información y puedas garantizar la mejor experiencia de usuaria en tu API REST.

3. Objetivos de aprendizaje
ℹ️ Esta sección será automáticamente generada en el idioma pertinente, a partir de los objetivos de aprendizaje declarados en project.yml, al crear el repo del proyecto para un cohort en particular usando ./scripts/create-cohort-project.js.

Acá puedes ver una lista de todos los objetivos de aprendizaje que contempla nuestra currícula.

4. Criterios de aceptación del proyecto
La empresa que nos ha contratado ha instalado dispositivos GPS en sus taxis. Estos dispositivos utilizan señales satelitales para determinar con precisión las coordenadas geográficas del taxi. Hasta el momento la información de ubicación se ha almacenado en archivos de texto, sin embargo, no es óptimo consultar la información con esta opción.

Nuestra clienta requiere:

Cargar la información de los archivos de texto a una base de datos Postgresql.
Desarrollar una API REST que permita consultar, mediante peticiones HTTP, la información almancenada en la base de datos.
Definición del producto
El Product Owner nos presenta este backlog que es el resultado de su trabajo con el clientx hasta hoy.

[Historia de usuario 1] Cargar información a base de datos
Yo como desarrolladora requiero cargar la información, almacenada hasta ahora en archivos de texto, en una base de datos Postgresql para facilitar su consulta y análisis.

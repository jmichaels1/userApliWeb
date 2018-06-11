# userApliWeb
Aplicación web 

Enunciado del proyecto : 

Crear una aplicación JEE con interfaz Web que contenga:
 
1.     Página de acceso a la aplicación.
·        Solicitar el email del usuario (No es necesario contraseña).
·        Validar que el email del usuario este registrado en la aplicación.
·        Si el usuario no está registrado permitir ir a la página de registro de usuarios.
·        Cada vez que un usuario accede a la aplicación debe registrarse la fecha y hora del acceso.
2.     Página de registro de usuario.
·        Solicitar al usuario la siguiente información:
·  Nombre, email, empresa (opcional), fecha de registro (no editable), etc.
·        Validar los campos obligatorios y que el email sea único (campo que identifica a cada usuario).
·        Almacenar la información en una base de datos.
3.     Página de resumen de accesos a la aplicación.
·        Mostrar un listado de todos los accesos de los usuarios a la aplicación.
·        Mostrar todos los campos disponibles del usuario en el listado.
·        Mostrar los resultados ordenados por la fecha de acceso a la aplicación (Descendientemente).
Opcional (No es obligatorio entregar):
·        Crear Unit Test si consideráis necesario.
 
Tener en cuenta para la construcción los siguientes aspectos:
·        Utilizar cualquier BD (preferiblemente en memoria), incluir los script SQL de creación de los esquemas.
·        Utilizar Apache Maven para la construcción del proyecto.
·        Recomendamos la utilización de  framework para el desarrollo de la aplicación, tal como: Spring-*, JPA, Log4J, etc.
·        Utilizar una arquitectura multicapas empleando patrones de diseños. Por ejemplo: (Value Object, Data Access Object, Data Transform Object,  etc.)
·        Para la interfaz Web se puede utilizar cualquier tecnología, el diseño de las páginas no es relevante.
·        El proyecto debe ser entregado en un git público o en un archivo zip


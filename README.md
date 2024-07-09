<h1 style="text-align: center; border: 8px double black; background-color: white;"> Proyecto: Desafío de Literatura </h1>

<h3>Descripción del proyecto</h3>

<p>Este proyecto utiliza la API de <a href="https://gutendex.com/">Gutendex</a> para realizar diversas consultas, mostrando los resultados en la consola al usuario. Además, permite exportar algunos datos a una base de datos SQL (es necesario configurar el archivo <strong>application.properties</strong> y agregar el conector de la base de datos deseada en el archivo <strong>POM.xml</strong>). Esto creará tablas en la base de datos indicada para almacenar los datos exportados de la API, usando tecnologías como:</p>

<ul>
    <li>Java 17: como lenguaje de programación principal</li>
    <li>Spring Boot como framework y Maven como gestor de dependencias</li>
    <li>Spring Data JPA</li>
    <li>Hibernate</li>
    <li>Jackson</li>
</ul>

<h2 style="text-align: center;">Funciones del programa</h2>
<ol>
    <li>Consultar datos de la API de un libro, introduciendo su título, obteniendo información como el título y una lista de autores</li>
    <li>Obtener una lista de libros de la API de un autor específico</li>
    <li>Obtener una lista de autores vivos en un determinado año ingresado en la consola</li>
    <li>Ver una lista de los libros consultados en la sesión actual</li>
    <li>Buscar un libro para añadirlo a la base de datos local para su consulta posterior</li>
    <li>Mostrar una lista de los libros añadidos a la base de datos local</li>
    <li>Mostrar una lista de los libros disponibles en algún idioma (se muestra una lista de los idiomas en los que se han almacenado libros)</li>
    <li>Mostrar cuántos libros hay disponibles en cada idioma en la base de datos</li>
    <li>Ver una lista de autores almacenados en la base de datos que hayan estado vivos en un determinado año</li>
</ol>#   l i b r e r i a _ c h a l l e n g e  
 
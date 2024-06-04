Crear una Base de datos en MySql llamada: TP47.
Crear una tabla llamada Autores que contenga los campos de la tabla.
Realizar CRUD para que la tabla tenga los siguientes datos:
Nombre Apellido

Fecha de Nacimiento Nacionalidad Mejor Obra

Año de Publicación Edad en Publicación Gabriel García Márquez 6/3/1927 Colombiano Cien años de soledad 1967 40 Julio Cortázar 26/8/1914 Argentino Rayuela 1963 48 Mario Vargas Llosa 28/3/1936 Peruano La ciudad y los perros 1963 26 Pablo Neruda 12/7/1904 Chileno

Veinte poemas de amor y una canción desesperada 1924 19 Isabel Allende 2/8/1942 Chilena La casa de los espíritus 1982 40 Jorge Luis Borges 24/08/1899 Argentino Ficciones 1944 45 Octavio Paz 31/3/1914 Mexicano El laberinto de la soledad 1950 36 Clarice Lispector 10/12/1920 Brasileña La hora de la estrella 1977 56 Juan Rulfo 16/5/1917 Mexicano Pedro Páramo 1955 38 Carlos Fuentes 11/11/1928 Mexicano La región más transparente 1958 29 Eduardo Galeano 3/9/1940 Uruguayo

Las venas abiertas de América Latina 1971 31

Realizar las siguientes consultas – Agregarlas cada una en un button diferente a. Listar todos los autores de que sean de Nacionalidad Argentina
SELECT * FROM Autores WHERE Nacionalidad = 'Argentino';

b. Listar todos los autores que tengan hayan publicado entre 1960 a 1980.

SELECT * FROM Autores WHERE AnoPublicacion BETWEEN 1960 AND 1980;

c. Mostrar el promedio de la edad de publicación.

SELECT AVG(EdadEnPublicacion) AS PromedioEdadPublicacion FROM Autores;

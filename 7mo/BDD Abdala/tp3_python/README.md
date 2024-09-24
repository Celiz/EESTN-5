# Programa de Gestión de Empleados

Este programa en Python permite administrar un registro de empleados de una empresa. Cuenta con las siguientes funcionalidades:

1. **Agregar empleados**: Permite ingresar los datos de un nuevo empleado (nombre, edad y puesto).
2. **Listar empleados**: Muestra el listado de todos los empleados registrados, incluyendo su nombre, edad y puesto.
3. **Actualizar empleado**: Permite modificar la edad o el puesto de un empleado existente.
4. **Eliminar empleado**: Elimina a un empleado del registro.
5. **Calcular edad promedio**: Calcula y muestra la edad promedio de todos los empleados registrados.

## Estructura del Programa

El programa utiliza un diccionario de Python llamado `empleados` para almacenar los datos de los empleados. Las claves del diccionario son los nombres de los empleados, y los valores son diccionarios que contienen la edad y el puesto de cada empleado.

Las diferentes funcionalidades del programa se implementan mediante funciones separadas:

- `agregar_empleado()`: Permite al usuario ingresar los datos de un nuevo empleado y los guarda en el diccionario `empleados`.
- `listar_empleados()`: Recorre el diccionario `empleados` y muestra los datos de cada empleado.
- `actualizar_empleado()`: Permite al usuario seleccionar un empleado y modificar su edad o puesto.
- `eliminar_empleado()`: Permite al usuario seleccionar un empleado y eliminarlo del registro.
- `calcular_edad_promedio()`: Calcula y muestra la edad promedio de todos los empleados registrados.

Estas funciones se invocan desde un bucle `while` que presenta un menú de opciones al usuario, permitiéndole seleccionar la acción que desea realizar.

## Uso del Programa

Al ejecutar el programa, se mostrará el menú de opciones. El usuario puede ingresar el número correspondiente a la opción que desea seleccionar.

1. **Agregar empleado**: El programa solicitará el nombre, edad y puesto del nuevo empleado y lo agregará al registro.
2. **Listar empleados**: El programa mostrará el listado de todos los empleados registrados, incluyendo su nombre, edad y puesto.
3. **Actualizar empleado**: El programa solicitará el nombre del empleado a actualizar y luego pedirá la nueva edad y/o puesto.
4. **Eliminar empleado**: El programa solicitará el nombre del empleado a eliminar y lo borrará del registro.
5. **Calcular edad promedio**: El programa calculará y mostrará la edad promedio de todos los empleados registrados.
6. **Salir**: El programa finalizará su ejecución.

Si el usuario ingresa una opción inválida, el programa mostrará un mensaje de error y volverá a presentar el menú.

¡Espero que este programa de gestión de empleados sea útil para tus necesidades! Si tienes alguna duda o sugerencia, no dudes en comunicarte.
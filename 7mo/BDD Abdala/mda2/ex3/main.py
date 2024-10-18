import sqlite3

# Conexión a la base de datos (si no existe, se crea)
conexion = sqlite3.connect("mda2/ex3/escuela.db")
cursor = conexion.cursor()

# Crear la tabla "alumnos" usando SQL
cursor.execute("""
CREATE TABLE IF NOT EXISTS alumnos (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    nombre TEXT,
    curso TEXT
);
""")

# Insertar registros usando SQL
cursor.execute("INSERT INTO alumnos (nombre, curso) VALUES ('Juan', 'Matemáticas');")
cursor.execute("INSERT INTO alumnos (nombre, curso) VALUES ('Ana', 'Física');")
cursor.execute("INSERT INTO alumnos (nombre, curso) VALUES ('Luis', 'Programación');")

# Guardar los cambios
conexion.commit()

# Cerrar la conexión
conexion.close()
import sqlite3


conn = sqlite3.connect('prueba_python/ex2/EESTN5.db')
cursor = conn.cursor()


cursor.execute('''
CREATE TABLE IF NOT EXISTS alumnos (
    id INTEGER PRIMARY KEY,
    nombre TEXT,
    edad INTEGER
)
''')

alumnos_data = [
    (1, "Juan Perez", 17),
    (2, "Matias Celiz", 19),
    (3, "Alan Barbe", 18),
    (4, "Luca Lopez", 19),
    (5, "Facundo Berardi", 18),
    (6, "Tomas Di Mauro", 19),
    (7, "Pepe Salomon", 16),
    (8, "Random", 17)
]

cursor.executemany('INSERT OR REPLACE INTO alumnos VALUES (?, ?, ?)', alumnos_data)

cursor.execute('SELECT * FROM alumnos WHERE edad > 17')
resultados = cursor.fetchall()

print("\nAlumnos mayores de 17 años:")
for alumno in resultados:
    print(f"ID: {alumno[0]}, Nombre: {alumno[1]}, Edad: {alumno[2]}")

conn.commit()
conn.close()
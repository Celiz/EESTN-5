try:
    f = open('myfile.txt')
    try:
        f.write('hola mundo')
    except:
        print("Ocurrio un error")
    finally:
        f.close()
except:
    print("Ocurrio un error al abrir el archivo")
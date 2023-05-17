import random
def adivina_numero():
    numero_secreto = random.randint(0, 100)
    intentos = 0

    while True:
        intento = int(input("Adivina el número (entre 0 y 99): "))
        intentos += 1

        if intento < numero_secreto:
            print("Te quedaste corto. Intenta nuevamente.")
        elif intento > numero_secreto:
            print("Te pasaste. Intenta nuevamente.")
        else:
            print("¡Felicidades! Adivinaste el numero")
            print("Número de intentos: " + str(intentos))
            break

adivina_numero()
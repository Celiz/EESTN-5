import random
def adivina_numero():
    numero = random.randint(0, 100)
    intentos = 0

    while True:
        intento = int(input("Adivina el número (entre 0 y 99): "))
        intentos += 1

        if intento < numero:
            print("Te quedaste corto. Intenta nuevamente.")
        elif intento > numero:
            print("Te pasaste. Intenta nuevamente.")
        else:
            print("¡Felicidades! Adivinaste el numero")
            print("Número de intentos: " + str(intentos))
            break

adivina_numero()

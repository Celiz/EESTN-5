class CJugadores {
    constructor() {
      this.jugador = [];
    }
  
    agregarJugador(name, position, age, height, weight, nacionality) {
      this.jugador.push({
        name,
        position,
        age,
        height,
        weight,
        nacionality
      });
    }
  
    generarTablaPersonas() {
      const tablaBody = document.querySelector('#animalTable tbody');
      tablaBody.innerHTML = '';
  
      for (const jugador of this.jugador) {
        const fila = document.createElement('tr');
        fila.innerHTML = `
          <td>${jugador.name}</td>
          <td>${jugador.position}</td>
          <td>${jugador.age}</td>
          <td>${jugador.height} m</td>
          <td>${jugador.weight} kg</td>
          <td>${jugador.nacionality}</td>
        `;
        tablaBody.appendChild(fila);
      }
    }
  
    listARgentinaNacionality() {
      let count = 0;
      for (const jugador of this.jugador) {
        if (jugador.nacionality == 'Argentina') {
          count++;
        }
      }
      return count;
    }
  
    //Listar todos los jugadores que tengan peso entre 75 y 80 kg.
    between75and80kg() {
      let count = 0;
      for (const jugador of this.jugador) {
        console.log(jugador.weight);
        if (jugador.weight >= 75 && jugador.weight <= 80) {
          count++;
        }
      }
      return count;
    }

    //Mostrar el jugador más alto.
    playerTall() {
      let max = 0;
      let name = '';
      for (const jugador of this.jugador) {
        if (jugador.height > max) {
          max = jugador.height;
          name = jugador.name;
        }
      }
      return name;
    }
    
      




  }
  const jugador = new CJugadores();

  jugador.agregarJugador('Fábio1', 'G', 43, 1.88 , 86 , 'Brasil');
  jugador.agregarJugador('Marlon4', 'D', 28, 1.83 , 78, 'Brasil');
  jugador.agregarJugador('Marcelo12', 'D', 35, 1.73 , 72 , 'Brasil');
  jugador.agregarJugador('Nino33', 'D', 26, 1.88 , 82 , 'Brasil');
  jugador.agregarJugador('John Kennedy9', 'A', 21, 1.73 , 71, 'Brasil');
  jugador.agregarJugador('Keno11', 'A', 34, 1.78 , 72, 'Brasil');
  jugador.agregarJugador('Germán Cano14', 'A', 35, 1.78 , 81 , 'Argentina');

  // Generar la tabla de animales
  jugador.generarTablaPersonas();

  document.getElementById("resultado1").textContent = "Listar todos los jugadores que sean de Nacionalidad Argentina: " + jugador.listARgentinaNacionality();
  
  document.getElementById("resultado2").textContent = "Listar todos los jugadores que tengan peso entre 75 y 80 kg: " + jugador.between75and80kg();
  
  document.getElementById("resultado3").textContent = "Mostrar el jugador más alto: " + jugador.playerTall();

  
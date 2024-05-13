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
          <td>${jugador.height}</td>
          <td>${jugador.weight}</td>
          <td>${jugador.nacionality}</td>
        `;
        tablaBody.appendChild(fila);
      }
    }
  
    listARgentinaNacionality() {
      let count = 0;
      for (const person of this.person) {
        if (person.nacionality === 'Argentino') {
          count++;
        }
      }
      return count;
    }
  
    between1960and1980() {
      let count = 0;
      for (const person of this.person) {
        if (person.yearPublished >= 1960 && person.yearPublished <= 1980) {
          count++;
        }
      }
      return count;
    }
  
    averageAgePublished() {
      let sum = 0;
      for (const person of this.person) {
        sum += person.agePublished;
      }
      return sum / this.person.length;
    }

    showPerson() {
      let html = '';
      for (const person of this.person) {
        html += `
          
            ${person.name}
            ${person.surname}
            ,
        `;
      }
      return html;
    }

  }
  const person = new CPerson();

  person.agregarJugador('Fábio1', 'G', 43, '1.88 m', '86 kg', 'Brasil');
  person.agregarJugador('Marlon4', 'D', 28, '1.83 m', '78 kg', 'Brasil');
  person.agregarJugador('Marcelo12', 'D', 35, '1.73 m', '72 kg', 'Brasil');
  person.agregarJugador('Nino33', 'D', 26, '1.88 m', '82 kg', 'Brasil');
  person.agregarJugador('John Kennedy9', 'A', 21, '1.73 m', '71 kg', 'Brasil');
  person.agregarJugador('Keno11', 'A', 34, '1.78 m', '72 kg', 'Brasil');
  person.agregarJugador('Germán Cano14', 'A', 35, '1.78 m', '81 kg', 'Argentina');

  // Generar la tabla de animales
  person.generarTablaPersonas();

  document.getElementById("resultado1").textContent = "Listar todos los autores de que sean de Nacionalidad Argentina: " + person.listARgentinaNacionality();
  
  document.getElementById("resultado2").textContent = "Listar todos los autores que publicaron entre 1960 a 1980: " + person.between1960and1980();
  

  document.getElementById("resultado3").textContent = "Mostrar el promedio de la edad de publicación: " + person.averageAgePublished();

  //mostrar a los autores
  document.getElementById("resultado4").textContent = "Mostrar todos los autores: " + person.showPerson();
  
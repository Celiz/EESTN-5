class CPerson {
    constructor() {
      this.person = [];
    }
  
    agregarAnimal(name, surname, nacionality, bestWork, yearPublished, agePublished) {
      this.person.push({
        name,
        surname,
        nacionality,
        bestWork,
        yearPublished,
        agePublished
      });
    }
  
    generarTablaPersonas() {
      const tablaBody = document.querySelector('#animalTable tbody');
      tablaBody.innerHTML = '';
  
      for (const person of this.person) {
        const fila = document.createElement('tr');
        fila.innerHTML = `
          <td>${person.name}</td>
          <td>${person.surname}</td>
          <td>${person.nacionality}</td>
          <td>${person.bestWork}</td>
          <td>${person.yearPublished}</td>
          <td>${person.agePublished}</td>
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

  person.agregarAnimal('Gabriel', 'García Márquez', 'Colombiano', 'Cien años de soledad', 1967, 40);
  person.agregarAnimal('Julio', 'Cortázar', 'Argentino', 'Rayuela', 1963, 48);
  person.agregarAnimal('Isabel', 'Allende', 'Chilena', 'La casa de los espíritus', 1982, 40);
  person.agregarAnimal('Jorge Luis', 'Borges', 'Argentino', 'Ficciones', 1944, 45);
  person.agregarAnimal('Clarice', 'Lispector', 'Brasileña', 'La hora de la estrella', 1977, 56);
  person.agregarAnimal('Juan', 'Rulfo', 'Mexicano', 'Pedro Páramo', 1955, 38);
  person.agregarAnimal('Carlos', 'Fuentes', 'Mexicano', 'La región más transparente', 1958, 29);
  person.agregarAnimal('Eduardo', 'Galeano', 'Uruguayo', 'Las venas abiertas de América Latina', 1971, 31);
  
  // Generar la tabla de animales
  person.generarTablaPersonas();

  document.getElementById("resultado1").textContent = "Listar todos los autores de que sean de Nacionalidad Argentina: " + person.listARgentinaNacionality();
  
  document.getElementById("resultado2").textContent = "Listar todos los autores que publicaron entre 1960 a 1980: " + person.between1960and1980();
  

  document.getElementById("resultado3").textContent = "Mostrar el promedio de la edad de publicación: " + person.averageAgePublished();

  //mostrar a los autores
  document.getElementById("resultado4").textContent = "Mostrar todos los autores: " + person.showPerson();
  
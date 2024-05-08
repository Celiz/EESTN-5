class CZooAnimal {
    constructor() {
      this.zooAnimals = [];
    }
  
    agregarAnimal(n, cage, type, weight) {
      const IdAnimal = Math.floor(Math.random() * 1000) + 1;
      this.zooAnimals.push({ IdAnimal, name: n, cageNumber: cage, IdTypeAnimal: type, weight });
    }
  
    generarTablaAnimales() {
      const tablaBody = document.querySelector('#animalTable tbody');
      tablaBody.innerHTML = '';
  
      this.zooAnimals.forEach(animal => {
        const fila = document.createElement('tr');
        fila.innerHTML = `
          <td>${animal.IdAnimal}</td>
          <td>${animal.name}</td>
          <td>${animal.cageNumber}</td>
          <td>${animal.IdTypeAnimal}</td>
          <td>${animal.weight}</td>
        `;
        tablaBody.appendChild(fila);
      });
    }
  
    contarAnimalesEnJaula5Menor3kg() {
      let count = 0;
      for (const animal of this.zooAnimals) {
        if (animal.cageNumber === 5 && animal.weight < 3) {
          count++;
        }
      }
      return count;
    }
  
    contarFelinosEntreJaulas2y5() {
      let count = 0;
      for (const animal of this.zooAnimals) {
        if (animal.IdTypeAnimal === 1 && animal.cageNumber >= 2 && animal.cageNumber <= 5) {
          count++;
        }
      }
      return count;
    }
  
    listarNombreAnimalJaula4Menor120() {
      for (const animal of this.zooAnimals) {
        if (animal.cageNumber === 4 && animal.weight < 120) {
          return animal.name;
        }
      }
      
    }
  }
  
  // Crear una instancia de la clase CZooAnimal
  const zoo = new CZooAnimal();
  
  // Agregar algunos animales
  zoo.agregarAnimal("Tigre", 5, 1, 150); // Felino
  zoo.agregarAnimal("León", 2, 1, 180); // Felino
  zoo.agregarAnimal("Águila", 3, 2, 2); // Ave
  zoo.agregarAnimal("Serpiente", 4, 3, 80); // Reptil
  zoo.agregarAnimal("Pantera", 5, 1, 100); // Felino
  
  // Generar la tabla de animales
  zoo.generarTablaAnimales();
  
  // Mostrar la cantidad de animales en la jaula 5 cuyo peso sea menor a 3 kg
  document.getElementById("resultado1").textContent = "Cantidad de animales en la jaula 5 con peso menor a 3 kg: " + zoo.contarAnimalesEnJaula5Menor3kg();
  
  // Mostrar la cantidad de animales de tipo felinos entre las jaulas 2 y 5
  document.getElementById("resultado2").textContent = "Cantidad de animales tipo felino entre las jaulas 2 y 5: " + zoo.contarFelinosEntreJaulas2y5();
  
  // Mostrar el nombre del animal en la jaula 4 con peso menor a 120
  document.getElementById("resultado3").textContent = "Nombre del animal en la jaula 4 con peso menor a 120: " + zoo.listarNombreAnimalJaula4Menor120();
  
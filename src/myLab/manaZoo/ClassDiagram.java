package myLab.manaZoo;

public class ClassDiagram {

}

//					+--------------------+
//					|     Animal         |
//					+--------------------+
//					| - id: int          |
//					| - name: String     |
//					| - species: String  |
//					| - age: int         |
//					+--------------------+
//					| +getId(): int      |
//					| +getName(): String |
//					| +getSpecies(): String |
//					| +getAge(): int     |
//					| +setName(String)   |
//					| +setSpecies(String)|
//					| +setAge(int)       |
//					| +toString(): String|
//					+--------------------+
//					
//					         ▲
//					         |
//					         | uses
//					         ▼
//					
//					+-------------------------+
//					|     AnimalService       |
//					+-------------------------+
//					| - animalList: List<Animal> |
//					+-------------------------+
//					| +registerAnimal()       |
//					| +getAllAnimals(): List<Animal> |
//					| +getById(int): Animal   |
//					| +getByName(String): List<Animal> |
//					| +getBySpecies(String): List<Animal> |
//					| +editAnimalById(int)    |
//					| +editAnimalByName(String) |
//					| +removeAnimalById(int)  |
//					+-------------------------+
//					
//					         ▲
//					         |
//					         | used by
//					         ▼
//					
//					+---------------------+
//					|    AnimalApp        |
//					+---------------------+
//					| +main(String[]): void |
//					| +run(): void         |
//					+---------------------+

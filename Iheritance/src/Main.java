//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

Animal animal=new Animal("Generic animal","huge",400);
doAnimalStuff(animal,"slow");
Dog dog=new Dog();
doAnimalStuff(dog,"false");

Dog yorkie=new Dog("Yorkie",15);
doAnimalStuff(yorkie,"fast");
Dog retriever=new Dog("Labador retriever",65,"floppy","swimmer");
doAnimalStuff(retriever,"slow");

Dog wolf=new Dog("wolf",40);
doAnimalStuff(wolf,"slow");

Fish goldy= new Fish("goldFish",0.25,2,3);
doAnimalStuff(goldy,"fast");

}

public static void doAnimalStuff(Animal animal,String speed){

    animal.makeNoise();
    animal.moves(speed);
    System.out.println(animal);
    System.out.println("-".repeat(10));
}

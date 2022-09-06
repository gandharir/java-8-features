public class Test {
  public static void main(String[] args) {
    Animal a1 = new Animal() {
      @Override
      public void name() {
        System.out.println("Dog");
      }
    };
    getAnimalName(a1);
    // You can pass lambda as parameter
    getAnimalName(()-> System.out.println("Cat"));
    Car car = (color) -> System.out.println("Car color is " + color);
    car.getColor("Red");
  }

  public static void getAnimalName(Animal animal) {
    animal.name();
  }

}

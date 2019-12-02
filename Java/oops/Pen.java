class Pen {
  Pen() {
    System.out.println("I'm Pen method");
  }

  void color() {
   System.out.println("I'm color method");
  }

  public static void main(String[] args) {
    Pen Pen1 = new Pen();
    Pen1.color();
    System.out.println(Pen1);
  }
}



// class Pen {
//   int number_instance = 10;
//   public static void main(String[] args) {
//     int number1 = 50;
//     System.out.println("Hi Java, I'm Bala");
//     System.out.println(number1);
//   }
// }

class ForLoops {
  public static void main(String[] args) {

    for (int i = 5;i > 0; i--) {
      System.out.println(i);
    }
    System.out.println("=====================================================");
    int arr[] = {1, 2, 3, 4, 5};
    for(int j:arr) {
      System.out.println(j);
    }
  }
}

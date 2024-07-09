class number {
  public static void main(String[] args) {
    int count = 0;
    for (int i = 100; i <= 200; i++) {
      System.out.print(i + " ");
      count += 1;
      i += 1;
    }
    System.out.println();
    System.out.println("Count = " + count);

  }

}

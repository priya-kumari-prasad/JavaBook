class SquareCube{
  public static void main(String[] args) {
    int arr[] = new int[50];
    for(int i = 0;i<25;i++){
      arr[i] = i*i;
    }
    for(int i = 25;i<50;i++){
      arr[i] = 3*i;
    }
    for(int i = 0;i<50;i++){
      System.out.println(i+" = "+arr[i]);
    }
  }
  
}
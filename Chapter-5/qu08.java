class CountTimes {
  public static void main(String[] args) {
    int arr[] = {10, 20, 30, 10, 20, 20, 10, 30, 40, 50, 40, 10, 20, 30};
    int count = 0;
    int numberCount = 10;
    for(int i = 0;i<arr.length;i++){
        if(arr[i] == numberCount){
          count++;
        
      }
    }
    System.out.println("The number "+numberCount+" is available "+count+" times in the array.");
    
  }
  
}

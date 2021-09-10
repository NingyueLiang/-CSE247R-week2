/* Question 1 
class Main {
  public static void main(String[] args) {
    int low = 0;
    int high = 99;
    int last = -1;
    int [] arr = {0, 2, 4, 60, 99};
    System.out.print("[");
    for(int i = 0; i < arr.length; ++i){
      if(arr[i]>=low && arr[i]<=high){
        if(arr[i] == low){
            last = arr[i];
        }else if((arr[i]-1)==last){
           last += 1;
        }else if((last+1) == (arr[i]-1)){
          System.out.print("\""+(arr[i]-1)+"\" ");
          last += 2;
        }else{
          System.out.print("\""+(last+1)+ "->" +(arr[i]-1) + "\" ");
          last = arr[i];
        }
      }
    }
    if(last<high){
      System.out.print("\""+(last+1)+ "->" +high + "\"");
    }
    System.out.print("]");
    
  }
}*/

class Main {
  public static void main(String[] args) {
    int [] arr = {0, 2, 4, 5, 10, 15, 25, 26, 42, 50, 60, 99};
    int target = 50;
    int high = arr.length - 1;
    int low = 0;

    while(high != low){
      int mid = (high+low)/2;
    }


  }
}
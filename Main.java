import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);

    String [] names = {"Marisol","Gaynelle","Josue","Cletus","Dong","Lucille","Margot","Mai","Vaughn","Sebastian","Petrina","Maxima","Fletcher","Kenda","Doug","Dot","Jeromy","Jerald","Alla","Georgene"};
   
    System.out.println("enter number");
    int number = scan.nextInt();

    for(int i = 0; i < 20; i ++){
      if (i%number == 0){
        System.out.println(""+names[i]);
      }
    }
    

  }
}

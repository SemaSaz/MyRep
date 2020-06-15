import java.util.Scanner;

public class MAi {


    public  static void Word(char[] word){


    }

    public static String Is(String a){
        System.out.println(a);
        String[] MyWord = new String[4];
        MyWord[0] = "J";
        MyWord[1] = "a";
        MyWord[2] = "v";
        MyWord[3] = "a";
        String[] Pusto = new String[4];
        Pusto[0] = "_";
        Pusto[1] = "_";
        Pusto[2] = "_";
        Pusto[3] = "_";
        for(int i = 0; i < 4; i++){
            if(MyWord[i] == a){
                Pusto[i] = a;
                System.out.println("dkfjhrdjgh");
            }
        }

        for (int i = 0; i < 4; i++){
            if(Pusto[i] == "_"){
                for(int y = 0; y < 4; y++){
                    System.out.println(Pusto[y]);
                }
                return "0";
            }

        }


        return "";
    }

    public static void main(String[] args) {
        Scanner sam = new Scanner(System.in);
       while(true){
           System.out.println("Ваша буква: ");
           String[] s = new String[1];
           s[0] = sam.nextLine();
           System.out.println(Is(s[0]));

       }
        //System.out.println( computers(a,b));

    }
}

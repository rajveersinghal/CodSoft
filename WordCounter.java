import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        System.out.println("Type your text : ");
        Scanner sc=new Scanner(System.in);
        //sc.nextLine();
        String userInput =sc.nextLine();
        sc.close();
        userInput=userInput.trim();
        int count=0;
        if (userInput.length() == 0) {
            count=0;
        }else
        {
            
            count++;
            for (int i=0;i<userInput.length();i++){
                if (userInput.charAt(i)==' '
                        && userInput.charAt(i+1) !=' '){
                    // '?'
                    count++;
                }
            }
        }
        System.out.println("Word Counter : "+count);
    }
}

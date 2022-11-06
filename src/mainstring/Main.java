package mainstring;

public class Main {
    public static void main(String[] args){
        StringBuilder builder=new StringBuilder();

        for (char i ='a'; i <='z' ; i++) {
             builder.append(i);
        }
        System.out.println(builder);
    }
}

package Main;

public class Main {
    public static void main(String[] args){
            String m = "Hello";
           System.out.print(m);
            bar(m);
           System.out.print(m);
        }

       static void bar(String m) {
            m += " World!";
//           System.out.println(m);
        }
    }


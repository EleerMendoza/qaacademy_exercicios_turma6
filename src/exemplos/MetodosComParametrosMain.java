package exemplos;

public class MetodosComParametrosMain {
//    public static void main(String[] args) {
////        texto1("croaCia", 30);
//        texto("País", "Germany");
//        texto("Germany",  7,"Brasil",1);


//    public static void texto(String a, int b) {
//        System.out.println("ó texto é " + a + b);
//    }
//    public static void texto(String a, String b) {
//        System.out.println("ó texto é " + a + " " + b);
//    }
//    public static void texto(String a, int b, String c, int d) {
//        System.out.println("ó texto é " + a + " " +  b + " " + c + " " +d);
//    }

    public static void main(String[] args) {

        System.out.println(texto1("croaCia", 30));
        System.out.println(texto2("País", "Germany"));
        System.out.println(texto3("Germany", 7, "Brasil", 1));

        String tx = texto1("croaCia", 30);
        System.out.println(tx);

        String rt = texto2("País ", "Germany");
        System.out.println(rt);


    }


    public static String texto1(String a, int b) {
        return a + b;
    }

    public static String texto2(String a, String b) {
        return a + b;

    }
    public static String texto3(String a, int b, String c, int d) {
        System.out.println("ó texto é " + a + " " + b + " " + c + " " + d);
        return "";


//    public static String texto3(String a, int b, String c, int d) {
//        System.out.println("ó texto é " + a + " " + b + " " + c + " " + d);
//        return "";
    }
}







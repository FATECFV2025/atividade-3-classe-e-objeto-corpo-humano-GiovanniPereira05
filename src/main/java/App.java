    package main.java;
    import java.util.Scanner;

    public class App {
            //Comentário

        public static void funcao_teste (){
            //Biblioteca para entrada de dados
            Scanner ler = new Scanner(System.in); 

            //variável local a
            String v2;
            int v1;

            System.out.println("Comando de Saida de Dados");
            
            System.out.printf("Informe uma palavra: ");
            v2 = ler.next();

            System.out.printf("Informe um número: ");
            v1 = ler.nextInt();

            System.out.printf(v2+" "+v1);
        }
        public static void main(String[] args) throws Exception {
            CorpoHumano c1 = new CorpoHumano(0, 0,0);
            // c1.massa = "2"
            c1.setMassa(50);
            c1.setAltura(1.9);
            System.out.println("o IMC é " + c1.getIMC());
        }
    }
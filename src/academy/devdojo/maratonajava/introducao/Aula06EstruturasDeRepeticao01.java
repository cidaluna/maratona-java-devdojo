package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // while, do while, for
        int count = 0;
        System.out.println("- - - - ");
        while(count < 10){
            System.out.println(count);
            count = count +1;
        }

        System.out.println("- - - - ");
        do{
            System.out.println("dentro do primeiro do-while");
        }while(count < 10);

        System.out.println("- - - - ");
        count = 0;
        do{
            System.out.println("dentro do segundo do-while " + ++count);
        }while(count < 10);

        System.out.println("- - - - ");
        for(int i=0; i < 10; i++){
            System.out.println("dentro do for: "+i);
        }
    }
}

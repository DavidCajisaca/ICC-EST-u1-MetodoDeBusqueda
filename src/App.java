
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        MetodosBusqueda metodosbusqueda= new MetodosBusqueda();
        //Crear un arreglo de 1 a 100000 en orden
        int [] arreglo=new int[100000];
        for (int i = 0; i < 100000; i++) {
          arreglo[i]=i+1;

        }
        metodosbusqueda.printArreglo(arreglo);
        int posi = metodosbusqueda.busquedasecuen(arreglo, 50418);
        if(posi !=-1){
            System.out.println("El valor secuencial esta en: "+ posi);
        } else{
            System.out.println("Valor no encontrado secuencial ");
        }
        int posibi = metodosbusqueda.busquedabinaria(arreglo, 50418);
        if(posibi!=-1){
            System.out.println("El valor binario esta en: "+posibi);

        }else{
            System.out.println("El valor binario  no esta");
        }
    }

}

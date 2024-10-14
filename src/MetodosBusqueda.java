
public class MetodosBusqueda {
    public int busquedasecuen (int[] arreglo,int Valor){
        for(int i = 0; i<arreglo.length;i++){
            System.out.println("Comparaciones: "+i);

            if(arreglo[i]== Valor){
                return  i;
            }
        }return -1;
    }
    public int busquedabinaria(int[] arreglo , int Valors){
        int inicio = 0;
        int fin= arreglo.length-1;
        int cont=0;
        while(inicio<=fin){
            int medio = inicio+(fin-inicio)/2;  
            cont++;
            System.out.println("Contador bINARIO:   "+cont);    
            if(arreglo[medio]==Valors){

                return medio;
            } 
            if (arreglo[medio]<Valors){
                inicio = medio+1;
            }else{
                fin= medio-1;
            }

        }
        return -1;

    }
public void printArreglo(int[] arreglo ){
    for (int ele : arreglo) {
        System.out.print(ele + " ");
    }
}

}

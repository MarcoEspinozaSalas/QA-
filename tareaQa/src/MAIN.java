public class MAIN {
    public static void main(String args[]) {
        int[] arreglo = new int[]{ 0,1,2,3,4 };

    deteccionNumeros(arreglo);
    }

    static void deteccionNumeros(int[] arreglo){
        int cont = 0;
        boolean esDivisiblepor3 = false;
        boolean es0 = false;
        boolean esPar = false;
        boolean esImpar = false;
        while (cont<(arreglo.length)) {
        if (arreglo[cont] ==0){
            es0 = true;
        }
        if(arreglo[cont] % 2 != 0 ){
            esImpar = true;

        }else{
            esPar = true;

        }
        if ((arreglo[cont] % 3 ==0)){
            esDivisiblepor3 = true;
            }


        System.out.println("El numero es:" + arreglo[cont]);
        System.out.println("El numero es  0?:" + es0);
        System.out.println("El numero es  par?:" + esPar);
        System.out.println("El numero es  impar?:" + esImpar);
        System.out.println("El numero es  divisible por 3?:" + esDivisiblepor3);
        System.out.println("-------------------------------------------------");
            es0 = false;
            esImpar = false;
            esPar = false;
            esDivisiblepor3 = false;
            cont++;
            }

    }
}
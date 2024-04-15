public class Desiciones {

    public static void main(String[] args) {
        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;
        String tipoPlan = "plus";

        if (fechaDeLanzamiento >= 2022) {

            System.out.println("peliculas mas populares");
        }else {
            System.out.println("Pelicula que aun vale la pena ver");
        }

        if (incluidoEnElPlan && tipoPlan.equals("plus")){
            System.out.println("Disfrute de su pelicula");

        }else {
            System.out.println( "Peninsula no disponible  para su plan actual");
        }
    }


}


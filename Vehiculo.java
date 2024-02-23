public class Main {
    public static void main(String[] args) {
        
        AutoDeportivo deportivo = new AutoDeportivo("Chevrolet Camaro", "SS", 455);
        AutoCasual casual = new AutoCasual("Chevrolet Spark", "GT", 80);
        AutoClasico clasico = new AutoClasico("Chevrolet Coupe", "1965", 279);

        
        deportivo.publicidad();
        deportivo.mostrarInformacion();
        deportivo.valor();
        deportivo.valor("actualizado");
        deportivo.consumo();

        System.out.println();

        casual.mostrarInformacion();
        casual.valor();
        casual.consumo();


        System.out.println();

        clasico.mostrarInformacion();
        clasico.precio();
        clasico.consumo();


    }
}

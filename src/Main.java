import java.time.Period;

public class Main {
    public static void main(String[] args) {
        Persona juan = new Persona("Juan", true);
////        juan.asignarNombre("Juan");
//        juan.cambiarUsuario("juan1998");
//        juan.cambiarUsuario("juanito");
//        juan.cambiarUsuario("juancho");
//        juan.estadoCivil = "Soltero";
//        juan.colorOjos = "Cafe";
//        juan.colorPelo = "Castano";
//        System.out.println(juan.caminar());
//        System.out.println(juan.obtenerNombreUsuario());
//
//        Persona pedro = new Persona("Pedro", true);
////        pedro.asignarNombre("Pedro");
//        System.out.println(pedro.leer());
//
//        Persona ana = new Persona("Ana", true);
////        ana.asignarNombre("Ana");
//        System.out.println(ana.correr());
//
//        Persona maria = new Persona("Maria", true);
////        maria.asignarNombre("Maria");
//        System.out.println(maria.estudiar());

        Fecha fecha = new Fecha(14,11,2022);

        Mundial mundialQatar = new Mundial(fecha);

        // 1/2/2020

        System.out.println("La fecha de inicio del Mundial de Qatar 2022 es: " + mundialQatar.getFechaInicioMundial());

        // Calcular
        Calculadora calculadora = new Calculadora(2, 2);
        System.out.println("La suma es: " + calculadora.getSuma());
        System.out.println("La resta es: " + calculadora.getResta());
    }
}

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<String> nombresAlumnos = new ArrayList<>();

        String nombre;
        registrarAlumno(nombresAlumnos, nombre="Juan");
        registrarAlumno(nombresAlumnos, nombre="Ana");

        System.out.println("¿Juan está registrado? " + buscarAlumno(nombresAlumnos, nombre="Juan"));

        eliminarAlumno(nombresAlumnos, nombre="Ana");
        System.out.println("Alumnos restantes: " + nombresAlumnos);
    }
    private static void registrarAlumno (List<String> nombresAlumnos, String nombre){
        nombresAlumnos.add(nombre);
    }
    private static boolean buscarAlumno(List<String> nombresAlumnos, String nombre){
        return nombresAlumnos.contains(nombre);
    }
    private static void eliminarAlumno(List<String> nombresAlumnos, String nombre){
        nombresAlumnos.remove(nombre);
    }
}
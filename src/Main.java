import esfot.Estudiante;
import esfot.Pasante;
import esfot.Persona;

import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Persona p = new Persona();
        Persona p1 = new Persona("Ana");
        Persona p2 = new Persona("Andres", 25, 1.60f);
        System.out.println("List");
        List<Persona> lista = new ArrayList<>();
        lista.add(p);
        lista.add(p1);
        lista.add(p2);
        lista.add(new Persona("Pepe", 46, 1.70f));
        lista.add(new Persona("Vero", 16, 1.50f));
        System.out.println("Listado de personas");
        for (Persona n : lista) {
            n.descripcion();
        }
        lista.get(1).setEdad(18);
        lista.get(1).descripcion();
        System.out.println("Set");
        Set<String> nombres = new HashSet<>();
        nombres.add("Mateo");
        nombres.add("Javier");
        nombres.add("Irene");
        nombres.add("Michael");
        nombres.add("Mateo");
        System.out.println("NOMBRES UNICOS SIN UN ORDEN GARANTIZADO: " + nombres);
        Set<Persona> nombres2 = new HashSet<>();
        nombres2.add((new Persona("Pepe", 46, 1.70f)));
        nombres2.add((new Persona("Vero", 16, 1.50f)));
        nombres2.add((new Persona("Tola", 46, 1.60f)));
        nombres2.add((new Persona("Maria", 46, 1.70f)));
        nombres2.add((new Persona("Pepe", 46, 1.70f)));
        System.out.printf("---------------------");
        for (Persona n : nombres2) {
            n.descripcion();
        }
        Map<String, Persona> codigounico = new HashMap<>();
        codigounico.put("c01", p);
        codigounico.put("c02", p1);
        codigounico.put("c03", p2);
        codigounico.put("c04", lista.get(4));
        System.out.println("Codgo unico 03: "+ codigounico.get("c01").descripcion());

        List<Persona>inscritos=new ArrayList<>();
        Scanner sc= new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Ingrese el nombre de la nueva persona: ");
            String nombre;
            nombre=sc.next();
            System.out.println("Ingrese la edad de la nueva persona: ");
            int edad;
            edad=sc.nextInt();
            System.out.println("Ingrese la estatura de la nueva persona: ");
            float estatura;
            estatura=sc.nextFloat();
            inscritos.add((new Persona(nombre,edad,estatura)));
            System.out.println("Ingresado con exito");


            System.out.println("0 para salir: ");
            opcion= sc.nextInt();



        }
        while (opcion !=0);
        System.out.println("herencia");
        Estudiante e=new Estudiante();
        e.setNombre("alejo");
        e.setEdad(21);
        e.setEstatura(1.80f);
        e.setPromedio(16);
        e.infoProm();
        System.out.println("Pasante---");
        Pasante pasante= new Pasante();
        pasante.setNombre("pedro");
        pasante.setEstatura(1.70f);
        pasante.setEdad(21);
        pasante.setPromedio(19);
        pasante.setPorcentajeBeca(0.7);
        pasante.becaInfo();
        pasante.descripcion();
    }
}
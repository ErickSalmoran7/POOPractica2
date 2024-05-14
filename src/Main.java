//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        DatosPersonales obj = new DatosPersonales("Santiago","Izquierdo Varela");
//        System.out.println(obj.getNombre());

        Coleccion objc = new Coleccion();

        DatosPersonales dp1 = new DatosPersonales("Santiago","Izquierdo Varela");
        objc.add(new DatosPersonales("Erick","Salmoran Aca"));
        objc.add(new DatosPersonales("Dereck","Diaz Hernandez"));
        objc.add(new DatosPersonales("Javier","Sanchez Varela"));
        objc.add(new DatosPersonales("Brenda","Corona Salmoran"));

//        objc.show();
//        objc.show2();
        objc.buscar("Brenda");

    }
}
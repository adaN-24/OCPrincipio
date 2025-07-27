//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        Producto producto1 = new Producto("Teclado", 50.0, new SinDescuento());
        Producto producto2 = new Producto("Computadora Lenovo", 500.0, new DescuentoVIP());
        Producto producto3 = new Producto("Computadora HP", 700.0, new DescuentoTemporada());


        producto1.mostrarDetalle();
        producto2.mostrarDetalle();
        producto3.mostrarDetalle();
    }
}
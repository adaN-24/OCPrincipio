public class Producto {
    private  String nombre;
    private  double precio;
    private  Descuento descuento;

    public Producto(String nombre, double precio, Descuento descuento){
        this.nombre = nombre;
        this.precio = precio;
        this.descuento = descuento;
    }

    public void mostrarDetalle(){
        double precioFinal = descuento.aplicarDescuento(precio);
        System.out.println("Producto:" + nombre);
        System.out.println("Precio original: $" + precio);
        System.out.println("Tipo de descuento: " + descuento.tipo());
        System.out.println("Precio con descuento: $" + precioFinal);
    }
}

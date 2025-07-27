public class SinDescuento implements Descuento{
    public double aplicarDescuento(double precio){
        return precio;
    }

    @Override
    public String tipo() {
        return "Sin descuento";
    }
}

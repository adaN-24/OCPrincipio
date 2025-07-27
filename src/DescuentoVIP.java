public class DescuentoVIP implements  Descuento{
    public double aplicarDescuento(double precio){
        return precio * 0.90;//10%
    }

    @Override
    public String tipo() {
        return "Descuento VIP (10%)";
    }
}

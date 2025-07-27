public class DescuentoTemporada implements Descuento{
    public double aplicarDescuento(double precio){
        return precio * 0.85;//15%
    }

    @Override
    public String tipo() {
        return "Descuento Temporada (15%)";
    }
}
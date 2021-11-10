public class Producto {
    private long codigoProducto;
    private String tipoProducto;

    public Producto(long codigoProducto, String tipoProducto) {
        this.codigoProducto = codigoProducto;
        this.tipoProducto = tipoProducto;
    }

    public long getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(long codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }
}

public class Sucursal {
    private long codigoSucursal;
    private String region;

    public Sucursal(long codigoSucursal, String region) {
        this.codigoSucursal = codigoSucursal;
        this.region = region;
    }

    public long getCodigoSucursal() {
        return codigoSucursal;
    }

    public void setCodigoSucursal(long codigoSucursal) {
        this.codigoSucursal = codigoSucursal;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}

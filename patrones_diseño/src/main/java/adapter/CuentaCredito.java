package adapter;

public class CuentaCredito {
    private String numeroCuenta;
    private Long cupoDisponible;

    public CuentaCredito(String numeroCuenta, Long cupoDisponible) {
        this.numeroCuenta = numeroCuenta;
        this.cupoDisponible = cupoDisponible;
    }

    public void hacerCargo(Long monto){
        this.cupoDisponible=this.cupoDisponible-monto;
        System.out.println("Se ha hecho un cargo por "+monto +" a la cuenta de credito numero "+this.numeroCuenta);
    }

    public Long getCupoDisponible() {
        return cupoDisponible;
    }
}

package adapter;

import java.math.BigDecimal;

public class CuentaDestino {
    private String numeroCuenta;
    private Long saldo;

    public CuentaDestino(String numeroCuenta, Long saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public void recibirTransferencia(Long monto){
        this.saldo=saldo+monto;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }
}

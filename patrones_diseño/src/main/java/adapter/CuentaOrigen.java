package adapter;

import java.math.BigDecimal;

public class CuentaOrigen {
    private String numeroCuenta;
    private Long saldo;

    public CuentaOrigen(String numeroCuenta, Long saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public void transferir(CuentaDestino cuentaDestino, Long monto){
        this.saldo=this.saldo-monto;
        cuentaDestino.recibirTransferencia(monto);
        System.out.println("Se ha realizado una transferencia por "+monto+" desde la cuenta numero "+this.numeroCuenta+"a la cuenta"+cuentaDestino.getNumeroCuenta());
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }
}

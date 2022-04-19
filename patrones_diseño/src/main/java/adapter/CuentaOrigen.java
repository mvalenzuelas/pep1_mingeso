package adapter;

import java.math.BigDecimal;

/**
 * Una clase que representa una cuenta bancaria de origen a modo de cuenta corriente o cuenta viste que puede realizar
 * transferencias a otras cuentas bancarias del tipo destino. Posee una cadena de texto que representa el numero de
 * cuenta unico y un entero largo que representa el saldo de la cuenta.
 */
public class CuentaOrigen {
    private String numeroCuenta;
    private Long saldo;

    public CuentaOrigen(String numeroCuenta, Long saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    /**
     * Metodo que permite realizar una transferencia desde una cuenta de origen a una determinada cuenta de destino,
     * decontando el monto señalado a la cuenta de origen y recibiendolo al cuenta de destino.
     * @param cuentaDestino una clase CuentaDestino que representa la cuenta que recibira el monto señalado
     * @param monto un Long que representa el monto por el cual se esta realizando la tranferencia
     */
    public void transferir(CuentaDestino cuentaDestino, Long monto){
        this.saldo=this.saldo-monto;
        cuentaDestino.recibirTransferencia(monto);
        System.out.println("Se ha realizado una transferencia por "+monto+" desde la cuenta numero "+this.numeroCuenta+"a la cuenta"+cuentaDestino.getNumeroCuenta());
    }

    /**
     * Metodo que permite obtener el nuemro de cuenta de la cuenta de origen
     * @return Cadena de caracteres que contiene que representa el número de cuenta de la cuenta de origen
     */
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
}

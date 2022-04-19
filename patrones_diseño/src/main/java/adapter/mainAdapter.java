package adapter;

/**
 * Clase cliente que permite ejemplifica el proceso de realizar un pago a una cuenta bancaria corriente/vista de destino
 * haciendole un cargo a una cuenta de creditos utilizando el patron de diseño adapter. Cabe mencionar que la cuenta
 * destino solo puede recibir transferencias si otra cuenta corriente/vista de origen.
 */
public class mainAdapter {
    public static void main(String[] args) {
        //Definir la cuenta de de destino, la cuenta en donde se recibira el monto cargado
        CuentaDestino cuentaDestino=new CuentaDestino("1234567",5000L);

        CuentaCredito cuentaCredito=new CuentaCredito("1111-2222-3333-4444",1000L);
        new CuentaCreditoAdapter(cuentaCredito).creditoTransferencia(500L,cuentaDestino);

    }
}

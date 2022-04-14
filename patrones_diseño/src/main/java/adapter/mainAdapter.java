package adapter;

public class mainAdapter {
    public static void main(String[] args) {
        CuentaDestino cuentaDestino=new CuentaDestino("1234567",5000L);
        CuentaCredito cuentaCredito=new CuentaCredito("1111-2222-3333-4444",1000L);
        new CuentaCreditoAdapter(cuentaCredito).creditoTransferencia(500L,cuentaDestino);

    }
}

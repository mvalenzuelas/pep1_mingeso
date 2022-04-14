package adapter;

public class CuentaCreditoAdapter extends CuentaOrigen {
    private CuentaCredito cuentaCredito;

    public CuentaCreditoAdapter(CuentaCredito cuentaCredito) {
        //Definir una cuenta de origen auxiliar predefinida que permite realizar las transferencias a cuentas de destino
        //La cuenta de origen auxiliar creada tendra como monto el cupo disponible
        super("000000",cuentaCredito.getCupoDisponible());

        //Asignar la cuenta de credico a la cual se le realizara el cargo igual al monto de la transferencia
        this.cuentaCredito=cuentaCredito;
    }

    public void creditoTransferencia(Long monto,CuentaDestino cuentaDestino){
        //Realizar el cargo a la cuenta de credito
        this.cuentaCredito.hacerCargo(monto);
        System.out.println("Se ha utilizado la cuenta "+this.getNumeroCuenta()+" como cuenta auxiliar para realizar la transacción");
        //La cuenta de origen auxiliar realiza la transferencia por el monto indicado
        this.transferir(cuentaDestino,monto);

    }

}

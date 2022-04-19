package command;

public class Doctor {
    private String nombre;
    private Paciente paciente;
    private OperacionesHospitalarias operaciones;

    public Doctor(String nombre,Paciente paciente) {
        this.nombre = nombre;
        this.paciente=paciente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setOperaciones(OperacionesHospitalarias operacionesHospitalarias){
        operaciones=operacionesHospitalarias;
    }

    public void ejecutarComando(Hospital hospital){
        operaciones.ejecutarOperacion(hospital);
    }

}

package command;

public class SolicitarInterconsulta implements OperacionesHospitalarias{
    private final Doctor doctor;
    private final Paciente paciente;
    private final String especialidad;

    public SolicitarInterconsulta(Doctor doctor, Paciente paciente,String especialidad) {
        this.doctor = doctor;
        this.paciente = paciente;
        this.especialidad=especialidad;
    }

    @Override
    public void ejecutarOperacion() {
        hospital.tramitarInterconsulta(doctor,paciente,especialidad);

    }
}

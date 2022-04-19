package command;

public class SolicitarLicensia implements OperacionesHospitalarias{
    private final Doctor doctor;
    private final Paciente paciente;
    private final String motivo;

    public SolicitarLicensia(Doctor doctor, Paciente paciente, String motivo) {
        this.doctor = doctor;
        this.paciente = paciente;
        this.motivo = motivo;
    }

    @Override
    public void ejecutarOperacion() {
        hospital.generarLicencia(doctor,paciente,motivo);

    }
}

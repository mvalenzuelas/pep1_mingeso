package command;

public class comandoLicencia implements OperacionesHospitalarias{
    private final Doctor doctor;
    private final Paciente paciente;
    private final String motivo;

    public comandoLicencia(Doctor doctor, Paciente paciente, String motivo) {
        this.doctor = doctor;
        this.paciente = paciente;
        this.motivo = motivo;
    }

    @Override
    public void ejecutarOperacion(Hospital hospital) {
        hospital.generarLicencia(doctor,paciente,motivo);
    }
}

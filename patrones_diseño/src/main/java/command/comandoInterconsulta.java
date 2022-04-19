package command;

public class comandoInterconsulta implements OperacionesHospitalarias{
    private final Doctor doctor;
    private final Paciente paciente;
    private final String especialidad;

    public comandoInterconsulta(Doctor doctor, Paciente paciente,String especialidad) {
        this.doctor = doctor;
        this.paciente = paciente;
        this.especialidad=especialidad;
    }

    @Override
    public void ejecutarOperacion(Hospital hospital) {
        hospital.tramitarInterconsulta(doctor,paciente,especialidad);

    }
}

package command;

public class comandoExamen implements OperacionesHospitalarias{
    Doctor doctor;
    Paciente paciente;
    String examen;

    public comandoExamen(Doctor doctor, Paciente paciente, String examen) {
        this.doctor = doctor;
        this.paciente = paciente;
        this.examen= examen;
    }

    @Override
    public void ejecutarOperacion(Hospital hospital) {
        hospital.agendarExamen(doctor,paciente,examen);
    }
}

package command;

public class SolicitarExamen implements OperacionesHospitalarias{
    Doctor doctor;
    Paciente paciente;
    String examen;

    public SolicitarExamen(Doctor doctor, Paciente paciente,String examen) {
        this.doctor = doctor;
        this.paciente = paciente;
        this.examen= examen;
    }

    @Override
    public void ejecutarOperacion() {
        hospital.agendarExamen(doctor,paciente,examen);
    }
}

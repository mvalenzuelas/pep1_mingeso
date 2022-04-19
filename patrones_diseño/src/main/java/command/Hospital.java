package command;

public class Hospital {
    public void generarLicencia(Doctor doctor,Paciente paciente,String motivo){
        System.out.println("Se ha genrado una licencia para el/la paciente "+paciente.getNombre()+
                " a solicitud del doctor/a "+paciente.getNombre()+
                " por el motivo de "+ motivo);

    }

    public void tramitarInterconsulta(Doctor doctor,Paciente paciente, String especialidad){
        System.out.println("Se ha iniciado el tramite para la solicitud de una interconsulta para la espcialidad de " +especialidad
                +" para el/la paciente "+ paciente.getNombre()
        +" solicitada por el/la doctor/a "+doctor.getNombre());
    }

    public void agendarExamen(Doctor doctor,Paciente paciente, String examen){
        System.out.println("Se ha agendado una para el paciente "+paciente.getNombre()+
                " para realizar el examen "+examen+
                " a solicitud del doctor "+doctor.getNombre());
    }
}

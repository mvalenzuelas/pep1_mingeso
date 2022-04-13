package AbstractFactory;

public class StudientFing implements Studient{


    @Override
    public void asigmentSchedule() {
        System.out.println("Las asignaturas de la facultad de ingenieria han sido asignadas al estudiante ");
    }

    @Override
    public void asigmentSubject() {
        System.out.println("se ha asignado un horario al estudiante de la facultad de ingenieria");
    }

    public StudientFing() {
        System.out.println("Se ha creado un estudiante de la facultad de ingenieria");
    }
}

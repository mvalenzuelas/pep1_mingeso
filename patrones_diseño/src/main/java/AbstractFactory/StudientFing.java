package AbstractFactory;

public class StudientFing implements Studient{
    private int level;
    private String name;

    @Override
    public void asigmentSchedule() {
        System.out.println("Las asignaturas de la facultad de ingenieria para el nivle "+this.level+" han sido asignadas al estudiante "+this.name);
    }

    @Override
    public void asigmentSubject() {
        System.out.println("se ha asignado un horario al estudiante "+this.name+" del nivel "+this.name+" de la facultad de ingenieria");
    }
}

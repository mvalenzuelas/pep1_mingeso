package AbstractFactory;

public class StudientFahu implements Studient{
    private int level;
    private String name;

    @Override
    public void asigmentSchedule() {
        System.out.println("Las asignaturas de la facultad de humanidades para el nivel "+this.level+" han sido asignadas al estudiante "+this.name);
    }

    @Override
    public void asigmentSubject() {
        System.out.println("se ha asignado un horario al estudiante "+this.name+" del nivel "+this.name+" de la facultad de humanidades");
    }
}

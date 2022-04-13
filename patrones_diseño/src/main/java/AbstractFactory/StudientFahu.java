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

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

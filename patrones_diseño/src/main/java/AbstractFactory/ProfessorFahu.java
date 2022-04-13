package AbstractFactory;

public class ProfessorFahu implements Professor{
    private String name;
    private String career;
    private String specialty;

    @Override
    public void assigmentResearch() {
        System.out.println("Se ha asignado al profesor de la facultad de humanidades  "+this.name+" de la carrera profesional "+this.career+"y la especialidad "+this.specialty+" sus investigaciones");

    }

    @Override
    public void assigmentSchedule() {
        System.out.println("Se ha asignado al profesor de la facultad de humanidades"+this.name+" de la carrera profesional "+this.career+"y la especialidad "+this.specialty+" su horario");

    }

    @Override
    public void assignmentAssignment() {
        System.out.println("Se ha asignado al profesor de la facultad de humanidades"+this.name+" de la carrera profesional "+this.career+"y la especialidad "+this.specialty+" las asignaturas que imparte");
    }
}

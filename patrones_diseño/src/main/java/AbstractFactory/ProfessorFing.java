package AbstractFactory;

public class ProfessorFing implements Professor{

    @Override
    public void assigmentResearch() {
        System.out.println("Se ha asignado al profesor de la facultad de ingenieria sus investigaciones");

    }

    @Override
    public void assigmentSchedule() {
        System.out.println("Se ha asignado al profesor de la facultad de ingenieria su horario");

    }

    @Override
    public void assignmentAssignment() {
        System.out.println("Se ha asignado al profesor de la facultad de ingenieria las asignaturas que imparte");
    }

    public ProfessorFing() {
        System.out.println("Se ha creado un profesor de la facultad de ingenieria");
    }
}

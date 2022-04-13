package AbstractFactory;

public class ProfessorFahu implements Professor{


    @Override
    public void assigmentResearch() {
        System.out.println("Se ha asignado al profesor de la facultad de humanidades  sus investigaciones");

    }

    @Override
    public void assigmentSchedule() {
        System.out.println("Se ha asignado al profesor de la facultad de humanidades su horario");

    }

    @Override
    public void assignmentAssignment() {
        System.out.println("Se ha asignado al profesor de la facultad de humanidades las asignaturas que imparte");
    }

    public ProfessorFahu() {
        System.out.println("Se ha creado un profesor de la facultad de humanidades");
    }

}

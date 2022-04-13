package AbstractFactory;

public class MainAbstractFactory {
    public static void main(String[] args) {
        Studient student;
        Professor professor;
        FahuFactory fahuFactory=new FahuFactory();
        FingFactory fingFactory=new FingFactory();

        System.out.println("\n********************************************************************");
        //Crear a un estudiante FING
        student=fingFactory.createStudient();
        //Asignar al estudiante ramos
        student.asigmentSubject();
        //Asignar al estudiante su horario
        student.asigmentSchedule();
        System.out.println("********************************************************************\n");

        System.out.println("\n********************************************************************");
        //Crear a un estudiante Fahu
        student=fahuFactory.createStudient();
        //Asignar al estudiante ramos
        student.asigmentSubject();
        //Asignar al estudiante su horario
        student.asigmentSchedule();
        System.out.println("********************************************************************\n");

        System.out.println("\n********************************************************************");
        //Crear un profesor Fahu
        professor=fahuFactory.createProfessor();
        professor.assignmentAssignment();
        professor.assigmentSchedule();
        professor.assigmentResearch();
        System.out.println("********************************************************************\n");

        System.out.println("\n********************************************************************");
        //Crear un profesor Fing
        professor=fingFactory.createProfessor();
        professor.assignmentAssignment();
        professor.assigmentSchedule();
        professor.assigmentResearch();
        System.out.println("********************************************************************\n");

    }
}

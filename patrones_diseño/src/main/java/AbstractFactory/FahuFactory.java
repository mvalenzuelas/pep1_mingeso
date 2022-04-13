package AbstractFactory;

public class FahuFactory implements AbstractFactory{
    @Override
    public Studient createStudient() {
        return new StudientFahu();
    }

    @Override
    public Professor createProfessor() {
        return new ProfessorFahu();
    }
}

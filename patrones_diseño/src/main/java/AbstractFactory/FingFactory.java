package AbstractFactory;

public class FingFactory implements AbstractFactory{
    @Override
    public Professor createProfessor() {
        return new ProfessorFing();
    }

    @Override
    public Studient createStudient() {
        return new StudientFing();
    }
}

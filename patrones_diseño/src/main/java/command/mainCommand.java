package command;

public class mainCommand {
    public static void main(String[] args) {
        Hospital hospital1=new Hospital();
        Paciente paciente1=new Paciente("Roberto Olmos");
        Doctor doctor1=new Doctor("Garcia",paciente1);
        doctor1.setOperaciones(new comandoInterconsulta(doctor1,paciente1,"Traumatologia"));
        doctor1.ejecutarComando(hospital1);
    }
}

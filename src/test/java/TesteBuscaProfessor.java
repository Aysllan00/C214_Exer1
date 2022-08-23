import org.junit.ComparisonFailure;
import org.junit.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.*;

public class TesteBuscaProfessor {

    @Test
    public void testeBuscaProfesssorChris(){

        ProfessorService service = new MockProfessorService();
        BuscaProfessor buscaP = new BuscaProfessor(service);

        Professor chris = buscaP.buscaProfessor(45);

        assertEquals("Christopher",chris.getNomeDoProfessor());
        assertEquals("Terça-13:30h",chris.getHorarioDoAtendimento());
        assertEquals("Integral",chris.getPeriodo());

    }

    @Test
    public void testeBuscaProfesssorRenzo(){

        ProfessorService service = new MockProfessorService();
        BuscaProfessor buscaP = new BuscaProfessor(service);

        Professor renzo = buscaP.buscaProfessor(20);

        assertEquals("Renzo",renzo.getNomeDoProfessor());
        assertEquals("Quarta-17:30h",renzo.getHorarioDoAtendimento());
        assertEquals("Integral",renzo.getPeriodo());

    }
    @Test
    public void testeBuscaProfesssorMarcelo(){

        ProfessorService service = new MockProfessorService();
        BuscaProfessor buscaP = new BuscaProfessor(service);

        Professor marcelo = buscaP.buscaProfessor(100);

        assertEquals("Marcelo",marcelo.getNomeDoProfessor());
        assertEquals("Sexta-19:30h",marcelo.getHorarioDoAtendimento());
        assertEquals("Noturno",marcelo.getPeriodo());

    }

    @Test (expected = ComparisonFailure.class)
    public void testeBuscaProfesssorEgidio(){

        ProfessorService service = new MockProfessorService();
        BuscaProfessor buscaP = new BuscaProfessor(service);

        Professor marcelo = buscaP.buscaProfessor(10);

        assertEquals("Egidio",marcelo.getNomeDoProfessor());
        assertEquals("Quinta-13:30h",marcelo.getHorarioDoAtendimento());
        assertEquals("Integral",marcelo.getPeriodo());

    }

    @Test (expected = AssertionError.class)
    public void testeBuscaInimigoValido(){

        ProfessorService service = new MockProfessorService();
        BuscaProfessor buscaP = new BuscaProfessor(service);

        //Faz a busca de um inimigo válido (id = 10 ou id = 20 ou ID positivo)
        boolean professorValido = buscaP.verificaExistencia(-20);

        assertTrue(professorValido);
    }

    @Test (expected = AssertionError.class)
    public void testeBuscaInimigoInValido(){

        ProfessorService service = new MockProfessorService();
        BuscaProfessor buscaP = new BuscaProfessor(service);

        //Faz a busca de um inimigo inválido (id negativo)
        boolean professorValido = buscaP.verificaExistencia(45);

        assertFalse(professorValido);
    }


}

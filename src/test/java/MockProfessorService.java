import java.util.ArrayList;

public class MockProfessorService implements ProfessorService{


    @Override
    public String busca(int id) {

        if (id == 45){
            //System.out.println(ProfessorCadastrados.Chris);
            return ProfessorCadastrados.Chris;
        }
        else if (id == 20){
            return ProfessorCadastrados.Renzo;
        }
        else if (id == 100) {
            return ProfessorCadastrados.Marcelo;
        }
        return ProfessorCadastrados.Padrao;
    }

    @Override
    public boolean professorExistente(int id) {
        //Aceitando somente IDs 10 e 20. Pode-se melhorar a logica para aceitar também IDs positivos
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Boolean> verificar = new ArrayList<>();

        list.add(20);
        list.add(45);
        list.add(100);


        for (int i=0; i < list.size(); i++){

            if (list.get(i).equals(id) || list.get(i).equals(id)){
                verificar.add(true);
            }else{
                verificar.add(false);
            }
        }

        if (verificar.contains(true)){
            return true;
        }

        return false;
    }
}

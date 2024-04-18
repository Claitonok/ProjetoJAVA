package texte;

import modelo.Aluno;
import modelo.AlunoDao;

public class TesteAltera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Aluno aluno = new Aluno(2,"ANA",5,9,10,7);
		AlunoDao alunoDao = new AlunoDao();
		alunoDao.altera(aluno);
	}

}

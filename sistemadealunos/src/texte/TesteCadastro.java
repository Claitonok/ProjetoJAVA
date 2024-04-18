package texte;

import modelo.Aluno;
import modelo.AlunoDao;


public class TesteCadastro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aluno aluno = new Aluno("Marques",10,8,7,5);
		AlunoDao alunoDao = new AlunoDao();
		alunoDao.cadastro(aluno);
	}

}

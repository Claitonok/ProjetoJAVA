 package texte;

import java.util.List;

import modelo.Aluno;
import modelo.AlunoDao;

public class TesteMostraTodosAlunos {

	public static void main(String[] args) {
		AlunoDao alunoDao = new AlunoDao();
		List<Aluno> alunos = alunoDao.mostraTodos();
		
		for(Aluno aluno:alunos) {
		System.out.println("RA: " + aluno.getRa());
		System.out.println("NOME: " + aluno.getNome());
		System.out.println("1°: " + aluno.getPrim());
		System.out.println("2°: " + aluno.getSeg());
		System.out.println("3°: " + aluno.getTer());
		System.out.println("4°: " + aluno.getQua());
		System.out.println("Média: " + aluno.getMedia());
		System.out.println("Status Final: " + aluno.getStatus_final());
		System.out.println("\n");
		
		}
	}

}

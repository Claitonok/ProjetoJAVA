package texte;

import modelo.Aluno;
import modelo.AlunoDao;

public class TesteMostraPorRa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AlunoDao alunoDao = new AlunoDao();
		Aluno aluno = alunoDao.mostraPorRa(2);
		
		if(aluno!=null) {
			System.out.println("RA: " + aluno.getRa());
			System.out.println("NOME: " + aluno.getNome());
			System.out.println("1°: " + aluno.getPrim());
			System.out.println("2°: " + aluno.getSeg());
			System.out.println("3°: " + aluno.getTer());
			System.out.println("4°: " + aluno.getQua());
			System.out.println("Média: " + aluno.getMedia());
			System.out.println("Status Final: " + aluno.getStatus_final());
			System.out.println("\n");
			
			}else {
				System.out.println("RA não existe");
			}

	}

}

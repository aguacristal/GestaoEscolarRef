
package gestaoescolarrefatorado;

import Model.Aluno;
import Repositorio.AlunoRepository;
import Repositorio.NotaRepository;
import Service.AlunoService;
import Service.NotaService;

public class GestaoEscolarRefatorado {
    public static void main(String[] args) {
        System.out.println("Iniciando testes do sistema...");

       
        AlunoRepository alunoRepo = new AlunoRepository();
        NotaRepository notaRepo = new NotaRepository();

      
        AlunoService alunoService = new AlunoService(alunoRepo, notaRepo);
        NotaService notaService = new NotaService(notaRepo);

     
        Aluno a1 = new Aluno(0, "Clara Rosa", "2025-0001", "9A");
        alunoService.cadastrarAluno(a1);
        System.out.println("Aluno cadastrado: " + alunoRepo.buscarPorId(a1.getId()));


        notaService.registrarNota(a1.getId(), 1, 3.6);
        notaService.registrarNota(a1.getId(), 2, 7.4);
        System.out.println("Notas do aluno: " + notaRepo.buscarPorAluno(a1.getId()));


        double media = alunoService.calcularMedia(a1.getId());
        System.out.println(String.format("Média do aluno %s = %.2f", a1.getNome(), media));
        System.out.println("Está em recuperação? " + alunoService.estaEmRecuperacao(a1.getId()));

        System.out.println("Testes finalizados com sucesso.");
    }
}
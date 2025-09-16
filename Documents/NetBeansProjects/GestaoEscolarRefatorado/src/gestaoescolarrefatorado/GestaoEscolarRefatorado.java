
package gestaoescolarrefatorado;

import Model.Aluno;
import Repositorio.AlunoRepository;
import Repositorio.NotaRepository;
import Service.AlunoService;
import Service.NotaService;

public class GestaoEscolarRefatorado {
    public static void main(String[] args) {
        System.out.println("Iniciando testes do sistema...");

        // Repositórios (in-memory)
        AlunoRepository alunoRepo = new AlunoRepository();
        NotaRepository notaRepo = new NotaRepository();

        // Serviços
        AlunoService alunoService = new AlunoService(alunoRepo, notaRepo);
        NotaService notaService = new NotaService(notaRepo);

        // TESTE 1: cadastrar aluno
        Aluno a1 = new Aluno(0, "Clara Rosa", "2025-0001", "9A");
        alunoService.cadastrarAluno(a1);
        System.out.println("Aluno cadastrado: " + alunoRepo.buscarPorId(a1.getId()));

        // TESTE 2: registrar notas
        notaService.registrarNota(a1.getId(), 1, 3.6);
        notaService.registrarNota(a1.getId(), 2, 7.4);
        System.out.println("Notas do aluno: " + notaRepo.buscarPorAluno(a1.getId()));

        // TESTE 3: calcular média e verificar recuperação
        double media = alunoService.calcularMedia(a1.getId());
        System.out.println(String.format("Média do aluno %s = %.2f", a1.getNome(), media));
        System.out.println("Está em recuperação? " + alunoService.estaEmRecuperacao(a1.getId()));

        System.out.println("Testes finalizados com sucesso.");
    }
}
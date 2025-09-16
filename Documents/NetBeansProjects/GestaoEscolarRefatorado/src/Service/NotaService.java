/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.Nota;
import Repositorio.NotaRepository;

public class NotaService {
    private final NotaRepository notaRepo;

    public NotaService(NotaRepository notaRepo) {
        this.notaRepo = notaRepo;
    }

    public void registrarNota(int alunoId, int materiaId, double valor) {
        if (valor < 0.0 || valor > 10.0) throw new IllegalArgumentException("Nota inválida.");
        Nota n = new Nota(alunoId, materiaId, valor, java.time.LocalDateTime.now());
        notaRepo.salvar(n);
    }
}

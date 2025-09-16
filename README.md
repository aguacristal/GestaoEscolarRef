# GestaoEscolarRef
Projeto Java (NetBeans) — versão refatorada do sistema de gestão escolar.

## Como rodar
1. Importe o projeto no NetBeans (New Project → Java → Existing Sources).
2. Execute `Main.java`.

## Estrutura
- br.com.sge.model -> classes de domínio
- br.com.sge.repository -> repositórios (persistência)
- br.com.sge.service -> regras de negócio

## Testes
O método `main()` contém testes simples que:
- cadastram um aluno
- registram notas
- calculam média e checam recuperação

# DevCalc API

![CI Pipeline](https://github.com/GameOfFront/devcalc-api/actions/workflows/ci.yml/badge.svg)

DevCalc é uma API REST em Java que fornece operações matemáticas simples como parte de um exercício de CI/CD com GitHub Actions.

## 🛠️ Ferramentas
- Java 21
- Maven
- Javalin

## omo executar localmente

1. Clone o repositório:
   ```bash
   git clone https://github.com/GameOfFront/devcalc-api.git


Teste edição

Modificação para novo teste

### Diagnóstico de Erro no Pipeline (Questão 5)

Para testar o processo de depuração, foi inserido intencionalmente um erro no step de build do workflow, alterando o comando `mvn clean install` para `mvn cleaan install`. Ao realizar o push, a execução falhou conforme esperado. A análise do erro foi feita na aba "Actions" do GitHub, onde a etapa com falha foi destacada em vermelho. Ao expandir os detalhes do job, foi possível visualizar a mensagem de erro indicando comando inválido. Após identificar o problema, o comando foi corrigido e um novo push foi feito, resultando em uma execução bem-sucedida. Essa atividade demonstrou a importância das mensagens de log e da interface de Actions como ferramenta essencial para diagnóstico em pipelines CI/CD.

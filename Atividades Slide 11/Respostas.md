# Respostas

 1. Análise de Coesão

  A classe Cliente ta misturando 3 responsabilidades diferentes, Cadastro de cliente Calculo de regras de negócio (desconto) e Comunicação por email

  Baixa coesão pq cada metodo trata de um assunto diferente pra dividir ficaria assim
  ClienteRepositorio - cadastrar()
  CalculadoraDesconto - calcularDesconto()ServicoEmail - enviarPromocional()

  Assim cada classe tem um proposito especifico e mudanças ficam isoladas.

  2. Refatoração com Injeção de Dependência

  public class Relatorio {
      private BancoDeDados bd;

      public Relatorio(BancoDeDados bd) {
          this.bd = bd;
      }

      void gerar() {
          bd.lerDados();
      }
  }

  Agora a dependencia vem de fora, o Relatorio nao decide qual banco usar, só sabe q precisa de um. Fica mais facil
  testar e trocar o banco dps se precisar.

  3. Relação entre Coesão, Acoplamento e DRY

  Quando vc tem alta coesão, cada classe tem um proposito bem definido. Isso significa q logicas relacionadas ficam
  juntas naturalmente, entao vc nao repete codigo em varios lugares.

  Com baixo acoplamento, as classes conversam por contratos simples, entao qnd vc precisa mudar alguma logica, muda
  num lugar só e todo mundo q usa aquele contrato continua funcionando.

  Tipo se a logica ta espalhada (baixa coesao) e tudo ta amarrado (alto acoplamento), qualquer mudança vc tem q repetir em mil lugares. Mas se ta organizado direitinho, vc centraliza a logica num modulo coeso e todo mundo q precisa usa aquele modulo - ai segue o DRY automaticamente.
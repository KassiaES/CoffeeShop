public class Main {
    public static void main(String[] args) {
        /**
         * Requisitos Mínimos
         * 0 - utilizar o JUnit5 para todos os testes
         * 1 - 2 classes service
         * 2 - 1 entidade
         * 3 - 6 métodos
         * 4 - 90% de coverage
         * 5 - 1 teste de exception
         * 6 - utilizar mocks
         * 7 - adicionar o Jacoco ao projeto
         *
         *
         * A Entidade é uma Cafeteria
         *  regras: uma cafeteria pode abrir e fechar
         *          a cafeteria só pode fechar se estiver aberta
         *          a cafeteria só pode abrir se estiver fechada
         *          uma cafeteria só pode anotar pedido, servir, limpar, cobrar, se estiver aberta
         *          uma cafeteria só pode ser limpar depois de servir
         *          a cafeteria não pode cobrar pedido nulo
         *
         * teste metodo abrir
         *      - cafeteriaDeveAbrirCorretamente
         *
         * teste metodo fechar
         *      - cafeteriaDeveFecharCorretamente
         *
         * teste metodo anotarPedido
         *      - anotarPedidoDeveAcrescentarItemNaLista
         *      - pedidoAnotadoNaoPodeSerNulo
         *
         * teste metodo servir
         *      - pedidoDeveSerServido
         *      - pedidoNullNaoPodeSerServido
         *
         * teste metodo limpar
         *      - soPodeLimparDepoisDeServir
         *
         * teste metodo cobrar
         *      - deveCobrarCorretamente
         *
         */
    }
}
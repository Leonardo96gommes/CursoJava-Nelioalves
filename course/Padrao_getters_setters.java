public class Padrao_getters_setters {
    public static void main(String[] args) {
        System.out.println("Padrão Getters e Setters");
    }
}
/*
Regra geral básica
• Um objeto NÃO deve expor nenhum atributo (modificador de acesso
        private)
• Os atributos devem ser acessados por meio de métodos get e set
• Padrão JavaBeans: https://en.wikipedia.org/wiki/JavaBeans
• Vantagens:
        • Encapsulamento
        • Controle total sobre a lóg
        • Fácil manutenção
        • Flexibilidade
        • Reuso
        • Herança
        • Polimorfismo
        • Facilidade de testes
        • Segurança
        • Controle de acesso
        • Facilidade de debug
        • Integridade dos dados
        • Flexibilidade para mudanças
        • Facilidade de leitura
        • Facilidade de escrita
        • Facilidade de documentação
        • Facilidade de refatoração
        • Facilidade de migração
        • Facilidade de integração
        • Facilidade de deploy
        • Facilidade de escalabilidade
        • Facilidade de manutenção
        • Facilidade de evolução
        • Facilidade de monitoramento
        • Facilidade de auditoria
        • Facilidade de controle
        • Facilidade de segurança
        • Facilidade de performance

                                                Padrão para implementação de getters e setters
                                        private String name;
                                        private double price;
                                        public String getName() {
                                        return name;
                                        }
                                        public void setName(String name) {
                                        this.name = name;
                                        }
                                        public double getPrice() {
                                        return price;
                                        }
                                        public void setPrice(double price) {
                                        this.price = price;
                                        }
 */

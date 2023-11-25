public class JogoIndie extends Jogo{
    public String verificarDesconto() {
        if (calcularDesconto() > 5) {
            return "Jogo com grande desconto";
        } else {
            return "Jogo sem grande desconto";
        }
    }

    @Override
    public String getTipo() {
        return "Jogo Indie";
    }
}

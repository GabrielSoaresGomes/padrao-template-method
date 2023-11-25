public class Jogo3W extends Jogo{
    public String verificarDesconto() {
        if (calcularDesconto() > 10) {
            return "Jogo com grande desconto";
        } else {
            return "Jogo sem grande desconto";
        }
    }

    @Override
    public String getTipo() {
        return "Jogo 3W";
    }
}

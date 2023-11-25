import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Jogo3WTest {

        @Test
        void deveRetornarGrandeDesconto() {
            Jogo3W jogo3W = new Jogo3W();
            jogo3W.setPrecoOriginal(100);
            jogo3W.setNovoPreco(80);
            assertEquals("Jogo com grande desconto", jogo3W.verificarDesconto());
        }

        @Test
        void deveRetornarSemGrandeDesconto() {
            Jogo3W jogo3W = new Jogo3W();
            jogo3W.setPrecoOriginal(100);
            jogo3W.setNovoPreco(95);
            assertEquals("Jogo sem grande desconto", jogo3W.verificarDesconto());
        }

        @Test
        void deveRetornarInformacoes() {
            Jogo3W jogo3W = new Jogo3W();
            jogo3W.setCode(1);
            jogo3W.setNome("Jogo 3W");
            jogo3W.setPrecoOriginal(100);
            jogo3W.setNovoPreco(95);
            assertEquals("Jogo 3W{code=1, nome='Jogo 3W', desconto=Jogo sem grande desconto}", jogo3W.getInfo());
        }
}
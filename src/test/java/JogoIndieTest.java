import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



public class JogoIndieTest {

    @Test
    void deveRetornarGrandeDesconto() {
        JogoIndie jogoIndie = new JogoIndie();
        jogoIndie.setPrecoOriginal(100);
        jogoIndie.setNovoPreco(80);
        assertEquals("Jogo com grande desconto", jogoIndie.verificarDesconto());
    }

    @Test
    void deveRetornarSemGrandeDesconto() {
        JogoIndie jogoIndie = new JogoIndie();
        jogoIndie.setPrecoOriginal(100);
        jogoIndie.setNovoPreco(95);
        assertEquals("Jogo sem grande desconto", jogoIndie.verificarDesconto());
    }

    @Test
    void deveRetornarInformacoes() {
        JogoIndie jogoIndie = new JogoIndie();
        jogoIndie.setCode(1);
        jogoIndie.setNome("Jogo Indie");
        jogoIndie.setPrecoOriginal(100);
        jogoIndie.setNovoPreco(95);
        assertEquals("Jogo Indie{code=1, nome='Jogo Indie', desconto=Jogo sem grande desconto}", jogoIndie.getInfo());
    }
}

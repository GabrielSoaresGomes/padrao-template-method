public abstract class Jogo {
    private int code;
    protected String nome;
    private float precoOriginal;
    private float novoPreco;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPrecoOriginal() {
        return precoOriginal;
    }

    public void setPrecoOriginal(float precoOriginal) {
        this.precoOriginal = precoOriginal;
    }

    public float getNovoPreco() {
        return novoPreco;
    }

    public void setNovoPreco(float novoPreco) {
        this.novoPreco = novoPreco;
    }

    public float calcularDesconto() {
        return precoOriginal - novoPreco;
    }

    public abstract String verificarDesconto();

    public String getTipo() {
        return "Jogo";
    }

    public String getInfo() {
        return getTipo() + "{" +
                "code=" + code +
                ", nome='" + nome + '\'' +
                ", desconto=" + verificarDesconto() +
                '}';
    }

}

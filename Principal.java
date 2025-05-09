public class Principal {
    public static void main(String[] args) {
        ContaBancaria dados = new ContaBancaria();
        dados.setNumeroConta(99999);
        dados.setSaldo(500.99);

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Talyta");
        pessoa.setIdade(28);
        pessoa.setConta(dados);

        pessoa.dadosUsuario();
    }
}

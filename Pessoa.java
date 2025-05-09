public class Pessoa {
    private String nome;
    private int idade;
    private ContaBancaria conta;

    void verificarIdade(){
        if (idade >= 18){
            System.out.println("Usuário é maior de idade.");
        } else {
            System.out.println("Usuário não é maior de idade.");
        }
    }

    void dadosUsuario(){
        System.out.println("Nome titular: " + getNome());
        System.out.println("Idade titular: " + getIdade());
        verificarIdade();

        if (conta != null){
            System.out.println("Número da conta: " + conta.getNumeroConta());
            System.out.println("Saldo $" + conta.getSaldo());
        } else {
            System.out.println("Conta bancária não vinculada");
        }
    }


    //setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setConta(ContaBancaria conta) {
        this.conta = conta;
    }


    //getters
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public ContaBancaria getConta() {
        return conta;
    }
}

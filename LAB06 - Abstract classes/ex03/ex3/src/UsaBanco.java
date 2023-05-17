public class UsaBanco {
    public static void main(String[] args) {
        ContaEspecial conta1 = new ContaEspecial(1000.0f, 1, 1234, 500.0f);
        ContaEspecial conta2 = new ContaEspecial(2000.0f, 2, 5678, 1000.0f);

        // Realizando débitos nas contas
        boolean debito1 = conta1.debitaValor(1001.0f, 1234);
        boolean debito2 = conta2.debitaValor(1500.0f, 5678);
        boolean debito3 = conta2.debitaValor(500.0f, 5678);

        // Verificando os saldos após os débitos
        float saldo1 = conta1.getSaldo(1234);
        float saldo2 = conta2.getSaldo(5678);

        // Imprimindo os resultados
        System.out.println("Débito na conta 1: " + (debito1 ? "Sucesso" : "Falha"));
        System.out.println("Débito na conta 2 (1º tentativa): " + (debito2 ? "Sucesso" : "Falha"));
        System.out.println("Débito na conta 2 (2º tentativa): " + (debito3 ? "Sucesso" : "Falha"));
        System.out.println("Saldo da conta 1: " + saldo1);
        System.out.println("Saldo da conta 2: " + saldo2);
    }
}

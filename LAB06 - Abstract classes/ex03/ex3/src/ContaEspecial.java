class ContaEspecial extends ContaCorrente {
    private float limite;

    public ContaEspecial(float val, int num, int pwd, float lim) {
        super(val, num, pwd);
        limite = lim;
        if (lim == 0) {
            ContaComum novaConta = new ContaComum(val, num, pwd);
        }
    }

    public float getLimite(int pwd) {
        if (isSenha(pwd)) return limite;
        else return -1;
    }

    public void setLimite(int pwd, float lim) {
        if (isSenha(pwd)) limite = lim;
    }
}
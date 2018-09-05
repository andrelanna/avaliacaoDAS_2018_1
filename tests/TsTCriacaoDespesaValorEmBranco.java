import


public class TsTCriacaoDespesaValorEmBranco {

    @Test
    public void VerificaCriacaoDespesaEmBranco(){
        try {
            Despesa despesa = new Despesa();
        }catch(ValorEmBrancoException v){
            /* Lança exceção para despesa */
        }
    }


}
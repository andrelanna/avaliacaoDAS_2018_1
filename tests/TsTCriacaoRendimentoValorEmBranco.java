import app.Receita

public class TsTCriacaoRendimentoValorEmBranco {

    @Test
    public void VerificaCriacaoRendimentoEmBranco(){
        try{
            Receita receita = new Receita();
        }catch(ValorEmBrancoException v){
            /* Lança exceção para rendimento */
        }
    }

}
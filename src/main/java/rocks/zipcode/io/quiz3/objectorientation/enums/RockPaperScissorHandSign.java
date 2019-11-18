package rocks.zipcode.io.quiz3.objectorientation.enums;

/**
 * @author leon on 09/12/2018.
 */
public enum RockPaperScissorHandSign {
   ROCK("ROCK"),PAPER("PAPER"),SCISSOR("SCISSOR");

   private String sign;

   RockPaperScissorHandSign(String sign){
       this.sign = sign;
   }

    public RockPaperScissorHandSign getWinner(){
        if(this.sign.equals("ROCK")){
            return PAPER;
        }else if(this.sign.equals("PAPER")){
            return SCISSOR;
        } else {
            return ROCK;
        }
    }

    public RockPaperScissorHandSign getLoser() {
        if(this.sign.equals("ROCK")){
            return SCISSOR;
        }else if(this.sign.equals("PAPER")){
            return ROCK;
        } else {
            return PAPER;
        }
    }
}

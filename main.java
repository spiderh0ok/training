public class main {
    public static void main(String[] args) {

    }
    public void sortFishPeople(ProfessionalBasketBallPlayer[] basketBallPlayers){
        for (ProfessionalBasketBallPlayer basketBallPlayer : basketBallPlayers){
            if (basketBallPlayer instanceof Fish fish){
                fish.goToWork();
                basketBallPlayer.playBasketBall();
            }
            else
                basketBallPlayer.playBasketBall();
        }

    }

    public void getFishBasketballers(Fish[] fishs){
        int counter=0;
        for (Fish fish:fishs){
            if(fish instanceof ProfessionalBasketBallPlayer fishBaller){
                counter++;
            }
        }

        ProfessionalBasketBallPlayer[] fishBallers = new ProfessionalBasketBallPlayer[counter];
        counter = 0;
        for (int i = 0; i < fishs.length ; i++) {
            if(fishs[i] instanceof ProfessionalBasketBallPlayer fishBaller){
                fishBallers[counter] = fishBaller;
            }
        }
        sortFishPeople(fishBallers);
    }
}

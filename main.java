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
}

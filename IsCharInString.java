public class IsCharInString implements CharInString{

    @Override
    public boolean charInString(String word, char sign) {
        for (int i = 0; i < word.length(); i++) {
            if (word.toCharArray()[i] == sign) {
                return true;
            }
        }
        return false;
    }
}

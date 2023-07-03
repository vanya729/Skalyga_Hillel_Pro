package RockPaperScissors;


public enum Item {

    Paper("     _______\n" +
            "---'    ____)____\n" +
            "           ______)\n" +
            "          _______)\n" +
            "         _______)\n" +
            "---.__________)\n"),// 📃

    Rock("    _______\n" +
            "---'   ____)\n" +
            "      (_____)\n" +
            "      (_____)\n" +
            "      (____)\n" +
            "---.__(___)\n" ),//🪨

    Scissors("    _______\n" +
            "---'   ____)____\n" +
            "          ______)\n" +
            "       __________)\n" +
            "      (____)\n" +
            "---.__(___)\n");//✂

    private final String emoji;

    Item(String emoji) {
        this.emoji = emoji;
    }

    public String getEmoji() {
        return emoji;
    }

}



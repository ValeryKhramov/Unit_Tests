package seminars.third.tdd;

public class MoodAnalyser {

    public String analyseMood(String message) {
        if(message.contains("good day")){
            return "happy";
        } else if (message.contains("bad day")) {
            return "bad";
        }
        return "so-so";
    }

}
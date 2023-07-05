public class Main {
    private String additionalMessage = ", have a nice evening";
    public String sayGoodBye(String message) {
        return "Goodbye " + message + additionalMessage;
    }

    public static void main(String[] args) {
        Main myMainClass = new Main();
        String goodByeMessage = myMainClass.sayGoodBye("Tony");
        System.out.println(goodByeMessage);
    }
}
package builder;

public class Main {
    public static void main(String[] args) {
        RobotBuilder robotBuilder = RobotBuilder.builder().addBg("b-g").addBd("b-d").addPd("p-d");

        System.out.println(robotBuilder.build());
    }
}

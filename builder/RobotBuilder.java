package builder;

public class RobotBuilder {

    private static RobotBuilder instance;

    private String tete;

    private String bg;

    private String bd;

    private String pg;

    private String pd;

    private RobotBuilder() {}

    public static RobotBuilder builder() {
        instance = new RobotBuilder();
        return instance;
    }

    public Robot build() {
        Robot robot = new Robot();
        robot.setTete(tete);
        robot.setBg(bg);
        robot.setBd(bd);
        robot.setPg(pg);
        robot.setPd(pd);

        return robot;
    }

    public RobotBuilder addTete(String tete) {
        instance.tete = tete;
        return instance;
    }

    public RobotBuilder addBg(String bg) {
        instance.bg = bg;
        return instance;
    }

    public RobotBuilder addBd(String bd) {
        instance.bd = bd;
        return instance;
    }

    public RobotBuilder addPg(String pg) {
        instance.pg = pg;
        return instance;
    }

    public RobotBuilder addPd(String pd) {
        instance.pd = pd;
        return instance;
    }
}

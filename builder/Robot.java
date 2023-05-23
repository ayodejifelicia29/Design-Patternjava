package builder;

public class Robot {

    private String tete;

    private String bg;

    private String bd;

    private String pg;

    private String pd;

    public Robot() {
        this.tete = "x-r";
    }

    public String getTete() {
        return tete;
    }

    public void setTete(String tete) {
        if (tete != null)
            this.tete = tete;
    }

    public String getBg() {
        return bg;
    }

    public void setBg(String bg) {
        this.bg = bg;
    }

    public String getBd() {
        return bd;
    }

    public void setBd(String bd) {
        this.bd = bd;
    }

    public String getPg() {
        return pg;
    }

    public void setPg(String pg) {
        this.pg = pg;
    }

    public String getPd() {
        return pd;
    }

    public void setPd(String pd) {
        this.pd = pd;
    }

    @Override
    public String toString() {
        return "Robot [tete=" + tete + ", bg=" + bg + ", bd=" + bd + ", pg=" + pg + ", pd=" + pd
                + "]";
    }
}

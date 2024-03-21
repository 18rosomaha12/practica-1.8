public class Person {

    private String fio;
    private int propusk;
    private String dolzn;
    private boolean dop;

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getPropusk() {
        return propusk;
    }

    public void setPropusk(int propusk) {
        this.propusk = propusk;
    }

    public String getDolzn() {
        return dolzn;
    }

    public void setDolzn(String dolzn) {
        this.dolzn = dolzn;
    }

    public boolean isDop() {
        return dop;
    }

    public void setDop(boolean dop) {
        this.dop = dop;
    }

    public Person(String fio, int propusk, String dolzn, boolean dop) {
        this.fio = fio;
        this.propusk = propusk;
        this.dolzn = dolzn;
        this.dop = dop;
    }

    public Person() {
    }


}

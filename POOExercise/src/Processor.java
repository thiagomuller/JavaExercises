public class Processor {
    private String company;
    private int cores;

    public Processor(String company, int cores) {
        this.company = company;
        this.cores = cores;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }
}

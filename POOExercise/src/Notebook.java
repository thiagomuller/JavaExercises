

public class Notebook {
    private String screen;
    private Processor processor;
    private String company;


    public Notebook(String screen, Processor processor, String company) {
        this.screen = screen;
        this.processor = processor;
        this.company = company;
    }


    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}

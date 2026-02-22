package problem02;

public class Report {
    private String header;
    private String content;
    private String footer;

    public void setHeader(String header) {
        this.header = header;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setFooter(String footer) {
        this.footer = footer;
    }

    public void export() {
        System.out.println("------------------------------------");
        System.out.println("EXPORTING REPORT...");
        System.out.println("------------------------------------");
        System.out.println(header);
        System.out.println(content);
        System.out.println(footer);
        System.out.println("------------------------------------");
        System.out.println("REPORT EXPORTED SUCCESSFULLY!");
        System.out.println("------------------------------------");
    }
}

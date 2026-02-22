package problem02;

public class Main {
    public static void main(String[] args) {
        TextReportBuilder textReportBuilder = new TextReportBuilder();
        HTMLReportBuilder htmlReportBuilder = new HTMLReportBuilder();

        ReportDirector reportDirector = new ReportDirector();

        reportDirector.createReport(textReportBuilder).export();
        reportDirector.createReport(htmlReportBuilder).export();
    }
}

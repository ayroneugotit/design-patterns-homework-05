package problem02;

public class TextReportBuilder extends AReportBuilder implements IReportBuilder {
    public void setHeader(String text) {
        report.setHeader("TEXT REPORT:\n" + text);
    }

    public void setContent(String text) {
        report.setContent(text);
    }

    public void setFooter(String text) {
        report.setFooter(text);
    }

    public Report getReport() {
        return report;
    }
}

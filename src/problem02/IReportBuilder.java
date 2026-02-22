package problem02;

public interface IReportBuilder {
    void setHeader(String text);
    void setContent(String text);
    void setFooter(String text);
    Report getReport();
}

package problem02;

public class ReportDirector {
    public Report createReport(IReportBuilder reportBuilder) {
        reportBuilder.setHeader("Header");
        reportBuilder.setContent("Content");
        reportBuilder.setFooter("Footer");
        return reportBuilder.getReport();
    }
}

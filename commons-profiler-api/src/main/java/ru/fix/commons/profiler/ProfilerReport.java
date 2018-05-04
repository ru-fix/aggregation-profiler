package ru.fix.commons.profiler;

import java.util.List;
import java.util.Map;

public class ProfilerReport {

    private final Map<String, Long> indicators;
    private final List<ProfilerCallReport> profilerCallReports;

    public ProfilerReport(Map<String, Long> indicators, List<ProfilerCallReport> profilerCallReports) {
        this.indicators = indicators;
        this.profilerCallReports = profilerCallReports;
    }

    public Map<String, Long> getIndicators() {
        return indicators;
    }

    public List<ProfilerCallReport> getProfilerCallReports() {
        return profilerCallReports;
    }

    @Override
    public String toString() {
        StringBuilder sumReport = new StringBuilder();
        sumReport.append("Indicators:\n");
        indicators.forEach((key, value) ->
                sumReport.append(key)
                        .append(" = ")
                        .append(value)
                        .append('\n')
        );
        sumReport.append("Profilers:\n");
        profilerCallReports.forEach(pr ->
                sumReport.append(pr.toString())
                        .append('\n')
        );
        return sumReport.toString();
    }
}

package pe.edu.galaxy.training.java.apiclientes.custom;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class CustomMetricsScheduler {

	private final CustomMetrics customMetrics;

    public CustomMetricsScheduler(CustomMetrics customMetrics) {
        this.customMetrics = customMetrics;
    }

    @Scheduled(fixedRate = 1000)
    public void triggerCustomMetrics() {
    	customMetrics.getRandomMetricsData();
    }
}

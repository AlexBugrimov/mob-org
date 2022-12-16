package dev.bug.moborg.adapter.in.web;

import org.junit.jupiter.api.Test;
import org.springframework.ui.ConcurrentModel;

import static org.assertj.core.api.Assertions.*;

public class DashboardControllerTest {

    @Test
    void givenOneHuddleResultsInHuddlePutIntoModel() {
        DashboardController dashboardController = new DashboardController();

        ConcurrentModel model = new ConcurrentModel();
        dashboardController.dashboardView(model);

        assertThat(model.containsAttribute("huddles"))
                .isTrue();
    }
}

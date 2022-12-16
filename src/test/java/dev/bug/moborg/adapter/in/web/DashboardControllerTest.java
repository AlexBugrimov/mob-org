package dev.bug.moborg.adapter.in.web;

import org.junit.jupiter.api.Test;
import org.springframework.ui.ConcurrentModel;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class DashboardControllerTest {

    @Test
    void givenOneHuddleResultsInHuddlePutIntoModel() {
        DashboardController dashboardController = new DashboardController();

        ConcurrentModel model = new ConcurrentModel();
        dashboardController.dashboardView(model);

        List<Huddle> huddles = ((List<Huddle>)model.getAttribute("huddles"));

        assertThat(huddles)
                .hasSize(1);
    }
}

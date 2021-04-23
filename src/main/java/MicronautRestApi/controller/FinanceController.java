package MicronautRestApi.controller;

import MicronautRestApi.bean.FinanceEngine;
import MicronautRestApi.dto.StockDto;
import io.micronaut.context.BeanContext;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import javax.inject.Inject;
import java.math.BigDecimal;

@Controller("/fin")
public class FinanceController {

    // inject a Singleton bean through the constuctor
    private final FinanceEngine financeEngine;

    @Inject
    public FinanceController(FinanceEngine financeEngine) {
        this.financeEngine = financeEngine;
    }

    @Get(value = "/stock", produces = MediaType.APPLICATION_JSON)
    public StockDto getStock() {

        return new StockDto("ABC.YZ", "Some fake Company", new BigDecimal("30.25"), financeEngine.getStockCount());
    }
}

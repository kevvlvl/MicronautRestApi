package MicronautRestApi.controller;

import MicronautRestApi.dto.StockDto;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import java.math.BigDecimal;

@Controller("/fin")
public class FinanceController {

    @Get(value = "/stock", produces = MediaType.APPLICATION_JSON)
    public StockDto getStock() {
        return new StockDto("ABC.YZ", "Some fake Company", new BigDecimal("30.25"));
    }
}

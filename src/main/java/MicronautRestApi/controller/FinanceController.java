package MicronautRestApi.controller;

import MicronautRestApi.bean.FinanceEngine;
import MicronautRestApi.dto.StockDto;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.MediaType;
import io.micronaut.http.MutableHttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.reactivex.Flowable;
import io.reactivex.Single;

import javax.inject.Inject;
import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;

@Controller("/fin")
public class FinanceController {

    // inject a Singleton bean through the constuctor
    private final FinanceEngine financeEngine;

    @Inject
    public FinanceController(FinanceEngine financeEngine) {
        this.financeEngine = financeEngine;
    }

    /**
     * Return one item blocking: using a new thread
     */
    @Get(value = "/stock", produces = MediaType.APPLICATION_JSON)
    public StockDto getStock() {

        return new StockDto("ABC.YZ", "Some fake Company", new BigDecimal("30.25"), financeEngine.getStockCount());
    }

    /**
     * Return a single item using a non-blocking thread
     */
    @Get(value = "/nb/stock", produces = MediaType.APPLICATION_JSON)
    public Single<MutableHttpResponse<StockDto>> getStockNonBlocking() {

        StockDto stock = new StockDto("ABC.YZ", "Some fake Company", new BigDecimal("30.25"), financeEngine.getStockCount());
        return Single.just(HttpResponse.ok(stock));
    }

    /**
     * Return multiple items using a non-blocking thread
     */
    @Get(value = "/nb/stocks", produces = MediaType.APPLICATION_JSON)
    public Flowable<StockDto> getStocksNonBlocking() {

        return Flowable
                .fromCallable(financeEngine::getStock)
                .repeat()
                .delay(500, TimeUnit.MILLISECONDS);
    }
}

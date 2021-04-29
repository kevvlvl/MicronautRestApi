package MicronautRestApi.bean;

import MicronautRestApi.dto.StockDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Singleton;
import java.math.BigDecimal;

@Singleton
public class FinanceEngineImpl implements FinanceEngine {

    private static final Logger LOG = LoggerFactory.getLogger(FinanceEngineImpl.class);

    @Override
    public int getStockCount() {
        return 1050;
    }

    @Override
    public StockDto getStock() {

        BigDecimal max = new BigDecimal("150.00"); // max stock value possible
        BigDecimal min = new BigDecimal("0.00");

        BigDecimal value = min.add(BigDecimal.valueOf(Math.random())).multiply(max);

        LOG.info("Value generated = {}", value);

        return new StockDto("ABC.YZ", "Some fake Company", value, getStockCount());
    }
}

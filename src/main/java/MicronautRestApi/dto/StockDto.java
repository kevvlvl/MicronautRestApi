package MicronautRestApi.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockDto {

    private final String symbol;
    private final String name;
    private final BigDecimal stockValue;

    @JsonCreator
    public StockDto(@JsonProperty("symbol") String symbol,
                    @JsonProperty("name") String name,
                    @JsonProperty("stockValue") BigDecimal stockValue) {
        this.symbol = symbol;
        this.name = name;
        this.stockValue = stockValue;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getStockValue() {
        return stockValue;
    }
}

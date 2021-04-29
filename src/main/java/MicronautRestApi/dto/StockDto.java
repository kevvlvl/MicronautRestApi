package MicronautRestApi.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class StockDto {

    private final String symbol;
    private final String name;
    private final BigDecimal stockValue;
    private final int total;

    @JsonCreator
    public StockDto(@JsonProperty("symbol") String symbol,
                    @JsonProperty("name") String name,
                    @JsonProperty("stockValue") BigDecimal stockValue,
                    @JsonProperty("total") int total) {
        this.symbol = symbol;
        this.name = name;
        this.stockValue = stockValue;
        this.total = total;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getStockValue() {
        return stockValue.setScale(2, RoundingMode.DOWN);
    }

    public int getTotal() {
        return total;
    }
}

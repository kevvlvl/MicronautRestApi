package MicronautRestApi.dto;

import java.math.BigDecimal;

public class StockDto {

    private String symbol;
    private String name;
    private BigDecimal stockValue;

    public StockDto(String symbol, String name, BigDecimal stockValue) {
        this.symbol = symbol;
        this.name = name;
        this.stockValue = stockValue;
    }
}

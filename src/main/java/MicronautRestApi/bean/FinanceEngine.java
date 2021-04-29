package MicronautRestApi.bean;

import MicronautRestApi.dto.StockDto;

public interface FinanceEngine {

    int getStockCount();
    StockDto getStock();
}

package MicronautRestApi.bean;

import javax.inject.Singleton;

@Singleton
public class FinanceEngineImpl implements FinanceEngine {

    @Override
    public int getStockCount() {
        return 1050;
    }
}

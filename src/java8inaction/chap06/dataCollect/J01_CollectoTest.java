package java8inaction.chap06.dataCollect;

import static org.junit.Assert.*;

import java8inaction.common.Currency;
import java8inaction.common.Transaction;
import java8inaction.common.TransactionHolder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


/**
 * Created by arahansa on 2016-04-10.
 */

@Slf4j
public class J01_CollectoTest {

    @Test
    public void 컬렉터트랜잭션테스트() throws Exception{
        Map<Currency, List<Transaction>> transactionByCurrencies = TransactionHolder.transactions
                .stream().collect(Collectors.groupingBy(Transaction::getCurrency));
        log.info("transaction : {}" + transactionByCurrencies);
    }


}
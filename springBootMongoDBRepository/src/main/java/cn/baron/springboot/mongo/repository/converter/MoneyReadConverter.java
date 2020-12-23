package cn.baron.springboot.mongo.repository.converter;

import lombok.extern.slf4j.Slf4j;
import org.bson.Document;
import org.joda.money.CurrencyUnit;
import org.joda.money.Money;
import org.springframework.core.convert.ConverterNotFoundException;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * @author Baron
 * @date 2020/8/4 23:15
 */
@Component
@Slf4j
public class MoneyReadConverter implements Converter<Document, Money> {
    @Override
    public Money convert(Document source) {
        try {
            Document money = (Document)source.get("money");
            double amount = Double.parseDouble(money.getString("amount"));
            String currency  = ((Document)money.get("currency")).getString("code");
            return Money.of(CurrencyUnit.of(currency), amount);
        }catch (ConverterNotFoundException e){
            log.info("发生异常了，请检查代码逻辑是否正常！");
        }
        return null;
    }
}

package cn.baron.springboot.mongo.converter;

import org.bson.Document;
import org.joda.money.CurrencyUnit;
import org.joda.money.Money;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * @author Baron
 * @date 2020/8/4 23:15
 */
@Component
public class MoneyReadConverter implements Converter<Object, Money> {
    @Override
    public Money convert(Object source) {
        if (source instanceof Long){
            return Money.ofMajor(CurrencyUnit.of("CNY"), (Long) source);
        }else if (source instanceof Document){
            org.bson.Document money = (org.bson.Document)((org.bson.Document)source).get("money");
            double amount = Double.parseDouble(money.getString("amount"));
            String currency  = ((org.bson.Document)money.get("currency")).getString("code");
            return Money.of(CurrencyUnit.of(currency), amount);
        }
        return null;
    }
}

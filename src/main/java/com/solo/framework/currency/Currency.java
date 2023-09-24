package com.solo.framework.currency;

import java.math.BigDecimal;

import com.core.collection.SList;
import com.core.collection.Solo;
import com.core.util.convert.SConvertNumberToCharacterLetterUtil;
import com.core.util.convert.SConverter;
import com.core.util.convert.SCurrencyUtil;
import com.core.util.convert.SStringConverterUtil;

public class Currency {
	
	public static void main(String[] args) throws Exception {
		System.out.println(SCurrencyUtil.ConvertAmount(12.32));
		//NumberToLetter CharacterLetter
		System.out.println(SCurrencyUtil.convertNumberToLetter(1250098));
		//NumberToLetter Capital CharacterLetter
		System.out.println(SCurrencyUtil.numToEng("1250098"));
		// PercentageFormat
		System.out.println(SCurrencyUtil.PercentageFormat("0.1"));
		// List All Currency
		SList listCurrency = SCurrencyUtil.ListAllCurrency();
		Solo solo = new Solo();
		solo.set("currency", listCurrency);
		System.out.println(SConverter.SoloToStringJSONPretty(solo));
		// Number to CharacterLetter with currency
		System.out.println(SConvertNumberToCharacterLetterUtil.convertCharacterProcess("USD", new BigDecimal("12000"), "KH"));
		System.out.println(SConvertNumberToCharacterLetterUtil.convertCharacterProcess("KHR", new BigDecimal("12000"), "EN"));
		// Number to CharacterLetter no currency
		System.out.println(SConvertNumberToCharacterLetterUtil.convertNumbertoCharInKhmer(new BigDecimal("1672000")));
		System.out.println(SConvertNumberToCharacterLetterUtil.convertNumbertoCharInEnglish(new BigDecimal("12000")));
		// Format Amount Currency
		System.out.println(SStringConverterUtil.formatBalance("123400.6", "USD"));
		System.out.println(SStringConverterUtil.formatBalance("123400.6", "KHR"));
	}

}

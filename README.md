# SoloFramework

## Doc: https:-- huosokkheang.github.io/Solo-Framework

### AESEncryption.java

    public  class AESEncryption {
	    private  static String secretKey = "ilovecambodiayouilovecambodiayou";
	    
	    public  static String Encrypt(String dataInput) throws Exception {
		    return SCrypto.encryptCode(dataInput, secretKey);
	    }
	    
	    public  static String decrypt(String encryptionString) throws Exception {
		    return SCrypto.decryptCode(encryptionString, secretKey);
	    }
	    
	    public  static  void main(String[] args) throws Exception {
		    String input = "I Love Cambodia";
		    String encrypt = AESEncryption.Encrypt(input);
		    String decrypt = AESEncryption.decrypt(encrypt);
		    System.out.println("Data Input = " + input);
		    System.out.println("Encryption = " + encrypt);
		    System.out.println("Decryption = " + decrypt);
	    }
    }

### Output

    Data Input = I Love Cambodia
    Encryption = YmPoO9r3oThUCdUCOG3u1g==
    Decryption = I Love Cambodia

### Currency.java

    public  class  Currency {
	    public  static  void main(String[] args) throws Exception {
	    
	        -- Format Amount
	        System.out.println(SCurrencyUtil.ConvertAmount(12.32));
	        -- Output: 12,32
	        
	        -- NumberToLetter CharacterLetter
	        System.out.println(SCurrencyUtil.convertNumberToLetter(1250098));
	        -- Output: One Million Two Hundred Fifty Thousand Ninety Eight
	        
	        -- NumberToLetter Capital CharacterLetter
	        System.out.println(SCurrencyUtil.numToEng("1250098"));
	        -- Output: ONE MILLION TWO HUNDRED FIFTY THOUSAND NINETY EIGHT
	        
	        --  PercentageFormat
	        System.out.println(SCurrencyUtil.PercentageFormat("0.1"));
	        -- Output: 10%
	        
	        --  Number to CharacterLetter with currency
	        System.out.println(SConvertNumberToCharacterLetterUtil.convertCharacterProcess("USD", new BigDecimal("12000"), "KH"));
	        -- Output: ដប់ពីរពាន់ ដុល្លារ
	        
	        System.out.println(SConvertNumberToCharacterLetterUtil.convertCharacterProcess("KHR", new BigDecimal("12000"), "EN"));
	        -- Output: Twelve Thousand KH Riel
	        
	        --  Number to CharacterLetter no currency
	        System.out.println(SConvertNumberToCharacterLetterUtil.convertNumbertoCharInKhmer(new BigDecimal("1672000")));
	    	-- Output: មួយ លាន ប្រាំមួយរយចិតសិបពីរពាន់
	    
	        System.out.println(SConvertNumberToCharacterLetterUtil.convertNumbertoCharInEnglish(new BigDecimal("12000")));
	        -- Output: Twelve Thousand
	        
	        -- Format Amount Currency
	        System.out.println(SStringConverterUtil.formatBalance("123400.6", "USD"));
	        -- Output: 123,400.60
	        
	        System.out.println(SStringConverterUtil.formatBalance("123400.6", "KHR"));
	        -- Output: 123,400
	        
	    	-- List All Currency
	        SList listCurrency = SCurrencyUtil.ListAllCurrency();
	        Solo solo = new Solo();
	        solo.set("currency", listCurrency);
	        System.out.println(SConverter.SoloToStringJSONPretty(solo));
	        -- Output: 
	        {
	    	  "currency": [
	    	    {
	    	      "country": "Afghanistan",
	    	      "currencyCode": "AFN"
	    	    },
	    	    {
	    	      "country": "Albania",
	    	      "currencyCode": "ALL"
	    	    },
	    	    {
	    	      "country": "Algeria",
	    	      "currencyCode": "DZD"
	    	    },
	    	    {
	    	      "country": "American Samoa",
	    	      "currencyCode": "USD"
	    	    },
	    	    {
	    	      "country": "Andorra",
	    	      "currencyCode": "EUR"
	    	    },
	    	    {
	    	      "country": "Angola",
	    	      "currencyCode": "AOA"
	    	    },
	    	    {
	    	      "country": "Anguilla",
	    	      "currencyCode": "XCD"
	    	    },
	    	    {
	    	      "country": "Antigua & Barbuda",
	    	      "currencyCode": "XCD"
	    	    },
	    	    {
	    	      "country": "Argentina",
	    	      "currencyCode": "ARS"
	    	    },
	    	    {
	    	      "country": "Armenia",
	    	      "currencyCode": "AMD"
	    	    },
	    	    {
	    	      "country": "Aruba",
	    	      "currencyCode": "AWG"
	    	    },
	    	    {
	    	      "country": "Australia",
	    	      "currencyCode": "AUD"
	    	    },
	    	    {
	    	      "country": "Austria",
	    	      "currencyCode": "EUR"
	    	    },
	    	    {
	    	      "country": "Azerbaijan",
	    	      "currencyCode": "AZN"
	    	    },
	    	    {
	    	      "country": "Bahamas",
	    	      "currencyCode": "BSD"
	    	    },
	    	    {
	    	      "country": "Bahrain",
	    	      "currencyCode": "BHD"
	    	    },
	    	    {
	    	      "country": "Bangladesh",
	    	      "currencyCode": "BDT"
	    	    },
	    	    {
	    	      "country": "Barbados",
	    	      "currencyCode": "BBD"
	    	    },
	    	    {
	    	      "country": "Belarus",
	    	      "currencyCode": "BYN"
	    	    },
	    	    {
	    	      "country": "Belgium",
	    	      "currencyCode": "EUR"
	    	    },
	    	    {
	    	      "country": "Belize",
	    	      "currencyCode": "BZD"
	    	    },
	    	    {
	    	      "country": "Benin",
	    	      "currencyCode": "XOF"
	    	    },
	    	    {
	    	      "country": "Bermuda",
	    	      "currencyCode": "BMD"
	    	    },
	    	    {
	    	      "country": "Bhutan",
	    	      "currencyCode": "BTN"
	    	    },
	    	    {
	    	      "country": "Bolivia",
	    	      "currencyCode": "BOB"
	    	    },
	    	    {
	    	      "country": "Bosnia & Herzegovina",
	    	      "currencyCode": "BAM"
	    	    },
	    	    {
	    	      "country": "Botswana",
	    	      "currencyCode": "BWP"
	    	    },
	    	    {
	    	      "country": "Brazil",
	    	      "currencyCode": "BRL"
	    	    },
	    	    {
	    	      "country": "British Indian Ocean Territory",
	    	      "currencyCode": "USD"
	    	    },
	    	    {
	    	      "country": "British Virgin Islands",
	    	      "currencyCode": "USD"
	    	    },
	    	    {
	    	      "country": "Brunei",
	    	      "currencyCode": "BND"
	    	    },
	    	    {
	    	      "country": "Bulgaria",
	    	      "currencyCode": "BGN"
	    	    },
	    	    {
	    	      "country": "Burkina Faso",
	    	      "currencyCode": "XOF"
	    	    },
	    	    {
	    	      "country": "Burundi",
	    	      "currencyCode": "BIF"
	    	    },
	    	    {
	    	      "country": "Cambodia",
	    	      "currencyCode": "KHR"
	    	    },
	    	    {
	    	      "country": "Cameroon",
	    	      "currencyCode": "XAF"
	    	    },
	    	    {
	    	      "country": "Canada",
	    	      "currencyCode": "CAD"
	    	    },
	    	    {
	    	      "country": "Cape Verde",
	    	      "currencyCode": "CVE"
	    	    },
	    	    {
	    	      "country": "Caribbean Netherlands",
	    	      "currencyCode": "USD"
	    	    },
	    	    {
	    	      "country": "Cayman Islands",
	    	      "currencyCode": "KYD"
	    	    },
	    	    {
	    	      "country": "Central African Republic",
	    	      "currencyCode": "XAF"
	    	    },
	    	    {
	    	      "country": "Chad",
	    	      "currencyCode": "XAF"
	    	    },
	    	    {
	    	      "country": "Chile",
	    	      "currencyCode": "CLP"
	    	    },
	    	    {
	    	      "country": "China",
	    	      "currencyCode": "CNY"
	    	    },
	    	    {
	    	      "country": "Christmas Island",
	    	      "currencyCode": "AUD"
	    	    },
	    	    {
	    	      "country": "Cocos (Keeling) Islands",
	    	      "currencyCode": "AUD"
	    	    },
	    	    {
	    	      "country": "Colombia",
	    	      "currencyCode": "COP"
	    	    },
	    	    {
	    	      "country": "Comoros",
	    	      "currencyCode": "KMF"
	    	    },
	    	    {
	    	      "country": "Congo - Brazzaville",
	    	      "currencyCode": "XAF"
	    	    },
	    	    {
	    	      "country": "Congo - Kinshasa",
	    	      "currencyCode": "CDF"
	    	    },
	    	    {
	    	      "country": "Cook Islands",
	    	      "currencyCode": "NZD"
	    	    },
	    	    {
	    	      "country": "Costa Rica",
	    	      "currencyCode": "CRC"
	    	    },
	    	    {
	    	      "country": "Croatia",
	    	      "currencyCode": "HRK"
	    	    },
	    	    {
	    	      "country": "Cuba",
	    	      "currencyCode": "CUP"
	    	    },
	    	    {
	    	      "country": "Curaçao",
	    	      "currencyCode": "ANG"
	    	    },
	    	    {
	    	      "country": "Cyprus",
	    	      "currencyCode": "EUR"
	    	    },
	    	    {
	    	      "country": "Czechia",
	    	      "currencyCode": "CZK"
	    	    },
	    	    {
	    	      "country": "Côte d’Ivoire",
	    	      "currencyCode": "XOF"
	    	    },
	    	    {
	    	      "country": "Denmark",
	    	      "currencyCode": "DKK"
	    	    },
	    	    {
	    	      "country": "Djibouti",
	    	      "currencyCode": "DJF"
	    	    },
	    	    {
	    	      "country": "Dominica",
	    	      "currencyCode": "XCD"
	    	    },
	    	    {
	    	      "country": "Dominican Republic",
	    	      "currencyCode": "DOP"
	    	    },
	    	    {
	    	      "country": "Ecuador",
	    	      "currencyCode": "USD"
	    	    },
	    	    {
	    	      "country": "Egypt",
	    	      "currencyCode": "EGP"
	    	    },
	    	    {
	    	      "country": "El Salvador",
	    	      "currencyCode": "SVC"
	    	    },
	    	    {
	    	      "country": "Equatorial Guinea",
	    	      "currencyCode": "XAF"
	    	    },
	    	    {
	    	      "country": "Eritrea",
	    	      "currencyCode": "ERN"
	    	    },
	    	    {
	    	      "country": "Estonia",
	    	      "currencyCode": "EUR"
	    	    },
	    	    {
	    	      "country": "Eswatini",
	    	      "currencyCode": "SZL"
	    	    },
	    	    {
	    	      "country": "Ethiopia",
	    	      "currencyCode": "ETB"
	    	    },
	    	    {
	    	      "country": "Falkland Islands",
	    	      "currencyCode": "FKP"
	    	    },
	    	    {
	    	      "country": "Faroe Islands",
	    	      "currencyCode": "DKK"
	    	    },
	    	    {
	    	      "country": "Fiji",
	    	      "currencyCode": "FJD"
	    	    },
	    	    {
	    	      "country": "Finland",
	    	      "currencyCode": "EUR"
	    	    },
	    	    {
	    	      "country": "France",
	    	      "currencyCode": "EUR"
	    	    },
	    	    {
	    	      "country": "French Guiana",
	    	      "currencyCode": "EUR"
	    	    },
	    	    {
	    	      "country": "French Polynesia",
	    	      "currencyCode": "XPF"
	    	    },
	    	    {
	    	      "country": "Gabon",
	    	      "currencyCode": "XAF"
	    	    },
	    	    {
	    	      "country": "Gambia",
	    	      "currencyCode": "GMD"
	    	    },
	    	    {
	    	      "country": "Georgia",
	    	      "currencyCode": "GEL"
	    	    },
	    	    {
	    	      "country": "Germany",
	    	      "currencyCode": "EUR"
	    	    },
	    	    {
	    	      "country": "Ghana",
	    	      "currencyCode": "GHS"
	    	    },
	    	    {
	    	      "country": "Gibraltar",
	    	      "currencyCode": "GIP"
	    	    },
	    	    {
	    	      "country": "Greece",
	    	      "currencyCode": "EUR"
	    	    },
	    	    {
	    	      "country": "Greenland",
	    	      "currencyCode": "DKK"
	    	    },
	    	    {
	    	      "country": "Grenada",
	    	      "currencyCode": "XCD"
	    	    },
	    	    {
	    	      "country": "Guadeloupe",
	    	      "currencyCode": "EUR"
	    	    },
	    	    {
	    	      "country": "Guam",
	    	      "currencyCode": "USD"
	    	    },
	    	    {
	    	      "country": "Guatemala",
	    	      "currencyCode": "GTQ"
	    	    },
	    	    {
	    	      "country": "Guernsey",
	    	      "currencyCode": "GBP"
	    	    },
	    	    {
	    	      "country": "Guinea",
	    	      "currencyCode": "GNF"
	    	    },
	    	    {
	    	      "country": "Guinea-Bissau",
	    	      "currencyCode": "XOF"
	    	    },
	    	    {
	    	      "country": "Guyana",
	    	      "currencyCode": "GYD"
	    	    },
	    	    {
	    	      "country": "Haiti",
	    	      "currencyCode": "HTG"
	    	    },
	    	    {
	    	      "country": "Honduras",
	    	      "currencyCode": "HNL"
	    	    },
	    	    {
	    	      "country": "Hong Kong SAR China",
	    	      "currencyCode": "HKD"
	    	    },
	    	    {
	    	      "country": "Hungary",
	    	      "currencyCode": "HUF"
	    	    },
	    	    {
	    	      "country": "Iceland",
	    	      "currencyCode": "ISK"
	    	    },
	    	    {
	    	      "country": "India",
	    	      "currencyCode": "INR"
	    	    },
	    	    {
	    	      "country": "Indonesia",
	    	      "currencyCode": "IDR"
	    	    },
	    	    {
	    	      "country": "Iran",
	    	      "currencyCode": "IRR"
	    	    },
	    	    {
	    	      "country": "Iraq",
	    	      "currencyCode": "IQD"
	    	    },
	    	    {
	    	      "country": "Ireland",
	    	      "currencyCode": "EUR"
	    	    },
	    	    {
	    	      "country": "Isle of Man",
	    	      "currencyCode": "GBP"
	    	    },
	    	    {
	    	      "country": "Israel",
	    	      "currencyCode": "ILS"
	    	    },
	    	    {
	    	      "country": "Italy",
	    	      "currencyCode": "EUR"
	    	    },
	    	    {
	    	      "country": "Jamaica",
	    	      "currencyCode": "JMD"
	    	    },
	    	    {
	    	      "country": "Japan",
	    	      "currencyCode": "JPY"
	    	    },
	    	    {
	    	      "country": "Jersey",
	    	      "currencyCode": "GBP"
	    	    },
	    	    {
	    	      "country": "Jordan",
	    	      "currencyCode": "JOD"
	    	    },
	    	    {
	    	      "country": "Kazakhstan",
	    	      "currencyCode": "KZT"
	    	    },
	    	    {
	    	      "country": "Kenya",
	    	      "currencyCode": "KES"
	    	    },
	    	    {
	    	      "country": "Kiribati",
	    	      "currencyCode": "AUD"
	    	    },
	    	    {
	    	      "country": "Kosovo",
	    	      "currencyCode": "EUR"
	    	    },
	    	    {
	    	      "country": "Kuwait",
	    	      "currencyCode": "KWD"
	    	    },
	    	    {
	    	      "country": "Kyrgyzstan",
	    	      "currencyCode": "KGS"
	    	    },
	    	    {
	    	      "country": "Laos",
	    	      "currencyCode": "LAK"
	    	    },
	    	    {
	    	      "country": "Latvia",
	    	      "currencyCode": "EUR"
	    	    },
	    	    {
	    	      "country": "Lebanon",
	    	      "currencyCode": "LBP"
	    	    },
	    	    {
	    	      "country": "Lesotho",
	    	      "currencyCode": "LSL"
	    	    },
	    	    {
	    	      "country": "Liberia",
	    	      "currencyCode": "LRD"
	    	    },
	    	    {
	    	      "country": "Libya",
	    	      "currencyCode": "LYD"
	    	    },
	    	    {
	    	      "country": "Liechtenstein",
	    	      "currencyCode": "CHF"
	    	    },
	    	    {
	    	      "country": "Lithuania",
	    	      "currencyCode": "EUR"
	    	    },
	    	    {
	    	      "country": "Luxembourg",
	    	      "currencyCode": "EUR"
	    	    },
	    	    {
	    	      "country": "Macao SAR China",
	    	      "currencyCode": "MOP"
	    	    },
	    	    {
	    	      "country": "Madagascar",
	    	      "currencyCode": "MGA"
	    	    },
	    	    {
	    	      "country": "Malawi",
	    	      "currencyCode": "MWK"
	    	    },
	    	    {
	    	      "country": "Malaysia",
	    	      "currencyCode": "MYR"
	    	    },
	    	    {
	    	      "country": "Mali",
	    	      "currencyCode": "XOF"
	    	    },
	    	    {
	    	      "country": "Malta",
	    	      "currencyCode": "EUR"
	    	    },
	    	    {
	    	      "country": "Marshall Islands",
	    	      "currencyCode": "USD"
	    	    },
	    	    {
	    	      "country": "Martinique",
	    	      "currencyCode": "EUR"
	    	    },
	    	    {
	    	      "country": "Mauritania",
	    	      "currencyCode": "MRU"
	    	    },
	    	    {
	    	      "country": "Mauritius",
	    	      "currencyCode": "MUR"
	    	    },
	    	    {
	    	      "country": "Mayotte",
	    	      "currencyCode": "EUR"
	    	    },
	    	    {
	    	      "country": "Mexico",
	    	      "currencyCode": "MXN"
	    	    },
	    	    {
	    	      "country": "Micronesia",
	    	      "currencyCode": "USD"
	    	    },
	    	    {
	    	      "country": "Moldova",
	    	      "currencyCode": "MDL"
	    	    },
	    	    {
	    	      "country": "Monaco",
	    	      "currencyCode": "EUR"
	    	    },
	    	    {
	    	      "country": "Mongolia",
	    	      "currencyCode": "MNT"
	    	    },
	    	    {
	    	      "country": "Montenegro",
	    	      "currencyCode": "EUR"
	    	    },
	    	    {
	    	      "country": "Montserrat",
	    	      "currencyCode": "XCD"
	    	    },
	    	    {
	    	      "country": "Morocco",
	    	      "currencyCode": "MAD"
	    	    },
	    	    {
	    	      "country": "Mozambique",
	    	      "currencyCode": "MZN"
	    	    },
	    	    {
	    	      "country": "Myanmar (Burma)",
	    	      "currencyCode": "MMK"
	    	    },
	    	    {
	    	      "country": "Namibia",
	    	      "currencyCode": "NAD"
	    	    },
	    	    {
	    	      "country": "Nauru",
	    	      "currencyCode": "AUD"
	    	    },
	    	    {
	    	      "country": "Nepal",
	    	      "currencyCode": "NPR"
	    	    },
	    	    {
	    	      "country": "Netherlands",
	    	      "currencyCode": "EUR"
	    	    },
	    	    {
	    	      "country": "New Caledonia",
	    	      "currencyCode": "XPF"
	    	    },
	    	    {
	    	      "country": "New Zealand",
	    	      "currencyCode": "NZD"
	    	    },
	    	    {
	    	      "country": "Nicaragua",
	    	      "currencyCode": "NIO"
	    	    },
	    	    {
	    	      "country": "Niger",
	    	      "currencyCode": "XOF"
	    	    },
	    	    {
	    	      "country": "Nigeria",
	    	      "currencyCode": "NGN"
	    	    },
	    	    {
	    	      "country": "Niue",
	    	      "currencyCode": "NZD"
	    	    },
	    	    {
	    	      "country": "Norfolk Island",
	    	      "currencyCode": "AUD"
	    	    },
	    	    {
	    	      "country": "North Korea",
	    	      "currencyCode": "KPW"
	    	    },
	    	    {
	    	      "country": "North Macedonia",
	    	      "currencyCode": "MKD"
	    	    },
	    	    {
	    	      "country": "Northern Mariana Islands",
	    	      "currencyCode": "USD"
	    	    },
	    	    {
	    	      "country": "Norway",
	    	      "currencyCode": "NOK"
	    	    },
	    	    {
	    	      "country": "Oman",
	    	      "currencyCode": "OMR"
	    	    },
	    	    {
	    	      "country": "Pakistan",
	    	      "currencyCode": "PKR"
	    	    },
	    	    {
	    	      "country": "Palau",
	    	      "currencyCode": "USD"
	    	    },
	    	    {
	    	      "country": "Palestinian Territories",
	    	      "currencyCode": "ILS"
	    	    },
	    	    {
	    	      "country": "Panama",
	    	      "currencyCode": "PAB"
	    	    },
	    	    {
	    	      "country": "Papua New Guinea",
	    	      "currencyCode": "PGK"
	    	    },
	    	    {
	    	      "country": "Paraguay",
	    	      "currencyCode": "PYG"
	    	    },
	    	    {
	    	      "country": "Peru",
	    	      "currencyCode": "PEN"
	    	    },
	    	    {
	    	      "country": "Philippines",
	    	      "currencyCode": "PHP"
	    	    },
	    	    {
	    	      "country": "Pitcairn Islands",
	    	      "currencyCode": "NZD"
	    	    },
	    	    {
	    	      "country": "Poland",
	    	      "currencyCode": "PLN"
	    	    },
	    	    {
	    	      "country": "Portugal",
	    	      "currencyCode": "EUR"
	    	    },
	    	    {
	    	      "country": "Puerto Rico",
	    	      "currencyCode": "USD"
	    	    },
	    	    {
	    	      "country": "Qatar",
	    	      "currencyCode": "QAR"
	    	    },
	    	    {
	    	      "country": "Romania",
	    	      "currencyCode": "RON"
	    	    },
	    	    {
	    	      "country": "Russia",
	    	      "currencyCode": "RUB"
	    	    },
	    	    {
	    	      "country": "Rwanda",
	    	      "currencyCode": "RWF"
	    	    },
	    	    {
	    	      "country": "Réunion",
	    	      "currencyCode": "EUR"
	    	    },
	    	    {
	    	      "country": "Samoa",
	    	      "currencyCode": "WST"
	    	    },
	    	    {
	    	      "country": "San Marino",
	    	      "currencyCode": "EUR"
	    	    },
	    	    {
	    	      "country": "Saudi Arabia",
	    	      "currencyCode": "SAR"
	    	    },
	    	    {
	    	      "country": "Senegal",
	    	      "currencyCode": "XOF"
	    	    },
	    	    {
	    	      "country": "Serbia",
	    	      "currencyCode": "RSD"
	    	    },
	    	    {
	    	      "country": "Serbia and Montenegro",
	    	      "currencyCode": "CSD"
	    	    },
	    	    {
	    	      "country": "Seychelles",
	    	      "currencyCode": "SCR"
	    	    },
	    	    {
	    	      "country": "Sierra Leone",
	    	      "currencyCode": "SLE"
	    	    },
	    	    {
	    	      "country": "Singapore",
	    	      "currencyCode": "SGD"
	    	    },
	    	    {
	    	      "country": "Sint Maarten",
	    	      "currencyCode": "ANG"
	    	    },
	    	    {
	    	      "country": "Slovakia",
	    	      "currencyCode": "EUR"
	    	    },
	    	    {
	    	      "country": "Slovenia",
	    	      "currencyCode": "EUR"
	    	    },
	    	    {
	    	      "country": "Solomon Islands",
	    	      "currencyCode": "SBD"
	    	    },
	    	    {
	    	      "country": "Somalia",
	    	      "currencyCode": "SOS"
	    	    },
	    	    {
	    	      "country": "South Africa",
	    	      "currencyCode": "ZAR"
	    	    },
	    	    {
	    	      "country": "South Korea",
	    	      "currencyCode": "KRW"
	    	    },
	    	    {
	    	      "country": "South Sudan",
	    	      "currencyCode": "SSP"
	    	    },
	    	    {
	    	      "country": "Spain",
	    	      "currencyCode": "EUR"
	    	    },
	    	    {
	    	      "country": "Sri Lanka",
	    	      "currencyCode": "LKR"
	    	    },
	    	    {
	    	      "country": "St. Barthélemy",
	    	      "currencyCode": "EUR"
	    	    },
	    	    {
	    	      "country": "St. Helena",
	    	      "currencyCode": "SHP"
	    	    },
	    	    {
	    	      "country": "St. Kitts & Nevis",
	    	      "currencyCode": "XCD"
	    	    },
	    	    {
	    	      "country": "St. Lucia",
	    	      "currencyCode": "XCD"
	    	    },
	    	    {
	    	      "country": "St. Martin",
	    	      "currencyCode": "EUR"
	    	    },
	    	    {
	    	      "country": "St. Pierre & Miquelon",
	    	      "currencyCode": "EUR"
	    	    },
	    	    {
	    	      "country": "St. Vincent & Grenadines",
	    	      "currencyCode": "XCD"
	    	    },
	    	    {
	    	      "country": "Sudan",
	    	      "currencyCode": "SDG"
	    	    },
	    	    {
	    	      "country": "Suriname",
	    	      "currencyCode": "SRD"
	    	    },
	    	    {
	    	      "country": "Svalbard & Jan Mayen",
	    	      "currencyCode": "NOK"
	    	    },
	    	    {
	    	      "country": "Sweden",
	    	      "currencyCode": "SEK"
	    	    },
	    	    {
	    	      "country": "Switzerland",
	    	      "currencyCode": "CHF"
	    	    },
	    	    {
	    	      "country": "Syria",
	    	      "currencyCode": "SYP"
	    	    },
	    	    {
	    	      "country": "São Tomé & Príncipe",
	    	      "currencyCode": "STN"
	    	    },
	    	    {
	    	      "country": "Taiwan",
	    	      "currencyCode": "TWD"
	    	    },
	    	    {
	    	      "country": "Tajikistan",
	    	      "currencyCode": "TJS"
	    	    },
	    	    {
	    	      "country": "Tanzania",
	    	      "currencyCode": "TZS"
	    	    },
	    	    {
	    	      "country": "Thailand",
	    	      "currencyCode": "THB"
	    	    },
	    	    {
	    	      "country": "Timor-Leste",
	    	      "currencyCode": "USD"
	    	    },
	    	    {
	    	      "country": "Togo",
	    	      "currencyCode": "XOF"
	    	    },
	    	    {
	    	      "country": "Tokelau",
	    	      "currencyCode": "NZD"
	    	    },
	    	    {
	    	      "country": "Tonga",
	    	      "currencyCode": "TOP"
	    	    },
	    	    {
	    	      "country": "Trinidad & Tobago",
	    	      "currencyCode": "TTD"
	    	    },
	    	    {
	    	      "country": "Tunisia",
	    	      "currencyCode": "TND"
	    	    },
	    	    {
	    	      "country": "Turkey",
	    	      "currencyCode": "TRY"
	    	    },
	    	    {
	    	      "country": "Turkmenistan",
	    	      "currencyCode": "TMT"
	    	    },
	    	    {
	    	      "country": "Turks & Caicos Islands",
	    	      "currencyCode": "USD"
	    	    },
	    	    {
	    	      "country": "Tuvalu",
	    	      "currencyCode": "AUD"
	    	    },
	    	    {
	    	      "country": "U.S. Outlying Islands",
	    	      "currencyCode": "USD"
	    	    },
	    	    {
	    	      "country": "U.S. Virgin Islands",
	    	      "currencyCode": "USD"
	    	    },
	    	    {
	    	      "country": "Uganda",
	    	      "currencyCode": "UGX"
	    	    },
	    	    {
	    	      "country": "Ukraine",
	    	      "currencyCode": "UAH"
	    	    },
	    	    {
	    	      "country": "United Arab Emirates",
	    	      "currencyCode": "AED"
	    	    },
	    	    {
	    	      "country": "United Kingdom",
	    	      "currencyCode": "GBP"
	    	    },
	    	    {
	    	      "country": "United States",
	    	      "currencyCode": "USD"
	    	    },
	    	    {
	    	      "country": "Uruguay",
	    	      "currencyCode": "UYU"
	    	    },
	    	    {
	    	      "country": "Uzbekistan",
	    	      "currencyCode": "UZS"
	    	    },
	    	    {
	    	      "country": "Vanuatu",
	    	      "currencyCode": "VUV"
	    	    },
	    	    {
	    	      "country": "Vatican City",
	    	      "currencyCode": "EUR"
	    	    },
	    	    {
	    	      "country": "Venezuela",
	    	      "currencyCode": "VES"
	    	    },
	    	    {
	    	      "country": "Vietnam",
	    	      "currencyCode": "VND"
	    	    },
	    	    {
	    	      "country": "Wallis & Futuna",
	    	      "currencyCode": "XPF"
	    	    },
	    	    {
	    	      "country": "Western Sahara",
	    	      "currencyCode": "MAD"
	    	    },
	    	    {
	    	      "country": "Yemen",
	    	      "currencyCode": "YER"
	    	    },
	    	    {
	    	      "country": "Zambia",
	    	      "currencyCode": "ZMW"
	    	    },
	    	    {
	    	      "country": "Zimbabwe",
	    	      "currencyCode": "ZWL"
	    	    },
	    	    {
	    	      "country": "Åland Islands",
	    	      "currencyCode": "EUR"
	    	    }
	    	  ]
	    	}
	    }
    }

### TimeAgo.java

    public class TimeAgo {
            Date fromDate = SDateUtil.stringToDate("21-09-2023 11:45:20 am", "dd-MM-yyyy HH:mm:ss a");
            Date currentDate = SDateUtil.stringToDate("21-09-2023 11:45:23 am", "dd-MM-yyyy HH:mm:ss a");
            String date = STimeUtil.timeAgo(currentDate, fromDate);
            System.out.println(date);
    }

##### Output
		3 seconds ago
### JavaDigitalSignature.java

    public class JavaDigitalSignature.java {
    
        public  static  void main(String[] args) throws Exception {
        
    	    String path = "C:\\Users\\SokkheangHUO\\Downloads\\Telegram Desktop\\IMG_0531.HEIC";
    	    String digitalSignaturePathFile = System.getProperty("user.dir");
    	    
    	    // Check file existing public and signature files
    	    if( !SFileIOUtil.checkFileExists(digitalSignaturePathFile + "/signature/publickey") &&
    	    !SFileIOUtil.checkFileExists(digitalSignaturePathFile + "/signature/signature") ) {
    		    // Generate JavaDigitalSignature
    		    DigitalSignature.GenerateDigitalSignature(digitalSignaturePathFile, path);
    	    }
    	    
    	    //TODO Verify DigitalSignature
    	    boolean  verify = DigitalSignature.VerifyDigitalSignature(digitalSignaturePathFile + "/signature/publickey",
    	    digitalSignaturePathFile + "/signature/signature", path);
    	    if(verify) {
	    	    System.out.println("Verify successfully !");
    	    }else {
	    	    System.out.println("Verify failed !");
    	    }
        }
    }

### RSAFiles.java

    public  class RSAKeys {
   	    public  static  void main(String[] args) throws Exception {
   	    
   		    // Generate private and public key
   		    RSAGeneratorUtil.generateFiles("RSA");
   		    
   		    // Encrypt Text
   		    String encrypt = RSAUtil.encrypt("hello", "RSA");
   		    System.out.println("encrypt text : " + encrypt);
   		    
   		    // Decrypt Text
   		    String decrypt = RSAUtil.decrypt(encrypt, "RSA");
   		    System.out.println("decrypt text : " + decrypt);
   		    }
    }

### RSAKeys.java

    public  class RSAKeys {
    	public  static  void main(String[] args) throws Exception {
    	
	    	// Generate private and public key
	    	RSAGeneratorUtil.generateKeys();
	    	
	    	String publicKey = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQC3bbgNFEh84UBQZZyjrIYnXCM7PDDq81KK8frmB6D8CpPPpP+7ovMCECWQ60i0TuOFMAoKPJNw1bKOTmTCmWkbxSnqQLLwx5+IHVdKYYJakoklnJzXHQ8oiUv9Gjxt4PQjQWkm+aokW50e6I5WMK7va7miuDMa6e3rIk/aga7sCwIDAQAB";
	    	String privateKey = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBALdtuA0USHzhQFBlnKOshidcIzs8MOrzUorx+uYHoPwKk8+k/7ui8wIQJZDrSLRO44UwCgo8k3DVso5OZMKZaRvFKepAsvDHn4gdV0phglqSiSWcnNcdDyiJS/0aPG3g9CNBaSb5qiRbnR7ojlYwru9ruaK4Mxrp7esiT9qBruwLAgMBAAECgYAcCORu91Em6QR75TPeHjG41U+7L3Voi3zrqJVI0BSuQO2beGPvqTWL9KzRK+zGRiJnClMWgnCkd7zdHCUxSuIx7eOQdV1dWJ0HdveFAXpv1891B3Ddzsg7AYUxjEGqfXaPWifUb/JYej2fLTwe5f/RO6Mtoilk1H30R5AKYzJ/RQJBALqrDsjSVr4cN1gxh7T8GpeFSN4I3rs+3VnNQKzQT5I0sA3kk5pZ2i2bJOLRkZfN4i9bFrU5wahpj0VjsfYz440CQQD7jqFgjC3GVl680Oi+C7esnx4PYbrflS8QxPrhF3OnmS6PaAm5O0vDGMa+idcv+/iPiWnLNMVUgxLyMPLUOJv3AkAH/gb2Bjt8jEy6U/SRhTHGRwilqQ+QSNLFY4pfW9PsWKEpFx5Sv4Id7cSYiYyISWJj0KyaOczW3x4pRGl8NyCJAkBNTyc/UbVbp/2Tj6yHg3heP8RwO7u/rMx7Hd5wQNHVZxlND081swh0m++wbRJJ9+kKy9NMlRoz/9hZwDtQh1k/AkEAiIcmHN+iSCZ1AzuLm5rJjQJNDZIGV/32CVXFY3HjTS79C34fflxeCk+cmZ/DrdVx8iYRuyfXR+BqOltcXh524g==";
	    	
	    	// Encrypt Text
	    	String encrypt = RSAUtil.encryption("hello", publicKey);
	    	System.out.println("encrypt text : " + encrypt);
	    	
	    	// Decrypt Text
	    	String decrypt = RSAUtil.decryption(encrypt, privateKey);
	    	System.out.println("decrypt text : " + decrypt);
    	}
    }


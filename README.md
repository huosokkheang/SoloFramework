# SoloFramework

## Doc: https:-- huosokkheang.github.io/Solo-Framework

### AESEncryption.java

    String input = "I Love Cambodia";
    
    String encrypt = AESEncryption.Encrypt(input);
    
    String decrypt = AESEncryption.decrypt(encrypt);
    
    System.out.println("Data Input = " + input);
    
    System.out.println("Encryption = " + encrypt);
    
    System.out.println("Decryption = " + decrypt);

### Output

    Data Input = I Love Cambodia
    Encryption = YmPoO9r3oThUCdUCOG3u1g==
    Decryption = I Love Cambodia

### Currency.java

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

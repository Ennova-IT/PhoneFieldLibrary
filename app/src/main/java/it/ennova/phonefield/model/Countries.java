package it.ennova.phonefield.model;


import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;

import java.util.ArrayList;
import java.util.List;

import it.ennova.phonefield.utils.StringUtils;

public final class Countries {

    private static final int NUMBER_OF_COUNTRIES = 242;
    @VisibleForTesting
    public static final List<Country> LIST = new ArrayList<>(NUMBER_OF_COUNTRIES);

    static {
        LIST.add(Country.create("af", "Afghanistan", 93));
        LIST.add(Country.create("al", "Albania", 355));
        LIST.add(Country.create("dz", "Algeria", 213));
        LIST.add(Country.create("as", "American Samoa", 1684));
        LIST.add(Country.create("ad", "Andorra", 376));
        LIST.add(Country.create("ao", "Angola", 244));
        LIST.add(Country.create("ai", "Anguilla", 1264));
        LIST.add(Country.create("ag", "Antigua and Barbuda", 1268));
        LIST.add(Country.create("ar", "Argentina", 54));
        LIST.add(Country.create("am", "Armenia", 374));
        LIST.add(Country.create("aw", "Aruba", 297));
        LIST.add(Country.create("au", "Australia", 61));
        LIST.add(Country.create("at", "Austria", 43));
        LIST.add(Country.create("az", "Azerbaijan", 994));
        LIST.add(Country.create("bs", "Bahamas", 1242));
        LIST.add(Country.create("bh", "Bahrain", 973));
        LIST.add(Country.create("bd", "Bangladesh", 880));
        LIST.add(Country.create("bb", "Barbados", 1246));
        LIST.add(Country.create("by", "Belarus", 375));
        LIST.add(Country.create("be", "Belgium", 32));
        LIST.add(Country.create("bz", "Belize", 501));
        LIST.add(Country.create("bj", "Benin", 229));
        LIST.add(Country.create("bm", "Bermuda", 1441));
        LIST.add(Country.create("bt", "Bhutan", 975));
        LIST.add(Country.create("bo", "Bolivia", 591));
        LIST.add(Country.create("ba", "Bosnia and Herzegovina", 387));
        LIST.add(Country.create("bw", "Botswana", 267));
        LIST.add(Country.create("br", "Brazil", 55));
        LIST.add(Country.create("io", "British Indian Ocean Territory", 246));
        LIST.add(Country.create("vg", "British Virgin Islands", 1284));
        LIST.add(Country.create("bn", "Brunei", 673));
        LIST.add(Country.create("bg", "Bulgaria", 359));
        LIST.add(Country.create("bf", "Burkina Faso", 226));
        LIST.add(Country.create("bi", "Burundi", 257));
        LIST.add(Country.create("kh", "Cambodia", 855));
        LIST.add(Country.create("cm", "Cameroon", 237));
        LIST.add(Country.create("ca", "Canada", 1));
        LIST.add(Country.create("cv", "Cape Verde", 238));
        LIST.add(Country.create("bq", "Caribbean Netherlands", 599));
        LIST.add(Country.create("ky", "Cayman Islands", 1345));
        LIST.add(Country.create("cf", "Central African Republic", 236));
        LIST.add(Country.create("td", "Chad", 235));
        LIST.add(Country.create("cl", "Chile", 56));
        LIST.add(Country.create("cn", "China", 86));
        LIST.add(Country.create("cx", "Christmas Island", 61));
        LIST.add(Country.create("cc", "Cocos Islands", 61));
        LIST.add(Country.create("co", "Colombia", 57));
        LIST.add(Country.create("km", "Comoros", 269));
        LIST.add(Country.create("cd", "Congo (DRC)", 243));
        LIST.add(Country.create("cg", "Congo (Republic)", 242));
        LIST.add(Country.create("ck", "Cook Islands", 682));
        LIST.add(Country.create("cr", "Costa Rica", 506));
        LIST.add(Country.create("ci", "Côte d’Ivoire", 225));
        LIST.add(Country.create("hr", "Croatia", 385));
        LIST.add(Country.create("cu", "Cuba", 53));
        LIST.add(Country.create("cw", "Curaçao", 599));
        LIST.add(Country.create("cy", "Cyprus", 357));
        LIST.add(Country.create("cz", "Czech Republic", 420));
        LIST.add(Country.create("dk", "Denmark", 45));
        LIST.add(Country.create("dj", "Djibouti", 253));
        LIST.add(Country.create("dm", "Dominica", 1767));
        LIST.add(Country.create("do", "Dominican Republic", 1));
        LIST.add(Country.create("ec", "Ecuador", 593));
        LIST.add(Country.create("eg", "Egypt", 20));
        LIST.add(Country.create("sv", "El Salvador", 503));
        LIST.add(Country.create("gq", "Equatorial Guinea", 240));
        LIST.add(Country.create("er", "Eritrea", 291));
        LIST.add(Country.create("ee", "Estonia", 372));
        LIST.add(Country.create("et", "Ethiopia", 251));
        LIST.add(Country.create("fk", "Falkland Islands", 500));
        LIST.add(Country.create("fo", "Faroe Islands", 298));
        LIST.add(Country.create("fj", "Fiji", 679));
        LIST.add(Country.create("fi", "Finland (Suomi)", 358));
        LIST.add(Country.create("fr", "France", 33));
        LIST.add(Country.create("gf", "French Guiana", 594));
        LIST.add(Country.create("pf", "French Polynesia", 689));
        LIST.add(Country.create("ga", "Gabon", 241));
        LIST.add(Country.create("gm", "Gambia", 220));
        LIST.add(Country.create("ge", "Georgia", 995));
        LIST.add(Country.create("de", "Germany", 49));
        LIST.add(Country.create("gh", "Ghana", 233));
        LIST.add(Country.create("gi", "Gibraltar", 350));
        LIST.add(Country.create("gr", "Greece", 30));
        LIST.add(Country.create("gl", "Greenland", 299));
        LIST.add(Country.create("gd", "Grenada", 1473));
        LIST.add(Country.create("gp", "Guadeloupe", 590));
        LIST.add(Country.create("gu", "Guam", 1671));
        LIST.add(Country.create("gt", "Guatemala", 502));
        LIST.add(Country.create("gg", "Guernsey", 44));
        LIST.add(Country.create("gn", "Guinea", 224));
        LIST.add(Country.create("gw", "Guinea-Bissau", 245));
        LIST.add(Country.create("gy", "Guyana", 592));
        LIST.add(Country.create("ht", "Haiti", 509));
        LIST.add(Country.create("hn", "Honduras", 504));
        LIST.add(Country.create("hk", "Hong Kong", 852));
        LIST.add(Country.create("hu", "Hungary", 36));
        LIST.add(Country.create("is", "Iceland", 354));
        LIST.add(Country.create("in", "India", 91));
        LIST.add(Country.create("id", "Indonesia", 62));
        LIST.add(Country.create("ir", "Iran", 98));
        LIST.add(Country.create("iq", "Iraq", 964));
        LIST.add(Country.create("ie", "Ireland", 353));
        LIST.add(Country.create("im", "Isle of Man", 44));
        LIST.add(Country.create("il", "Israel", 972));
        LIST.add(Country.create("it", "Italy", 39));
        LIST.add(Country.create("jm", "Jamaica", 1876));
        LIST.add(Country.create("jp", "Japan", 81));
        LIST.add(Country.create("je", "Jersey", 44));
        LIST.add(Country.create("jo", "Jordan", 962));
        LIST.add(Country.create("kz", "Kazakhstan", 7));
        LIST.add(Country.create("ke", "Kenya", 254));
        LIST.add(Country.create("ki", "Kiribati", 686));
        LIST.add(Country.create("kw", "Kuwait", 965));
        LIST.add(Country.create("kg", "Kyrgyzstan", 996));
        LIST.add(Country.create("la", "Laos", 856));
        LIST.add(Country.create("lv", "Latvia", 371));
        LIST.add(Country.create("lb", "Lebanon", 961));
        LIST.add(Country.create("ls", "Lesotho", 266));
        LIST.add(Country.create("lr", "Liberia", 231));
        LIST.add(Country.create("ly", "Libya", 218));
        LIST.add(Country.create("li", "Liechtenstein", 423));
        LIST.add(Country.create("lt", "Lithuania", 370));
        LIST.add(Country.create("lu", "Luxembourg", 352));
        LIST.add(Country.create("mo", "Macau", 853));
        LIST.add(Country.create("mk", "Macedonia", 389));
        LIST.add(Country.create("mg", "Madagascar", 261));
        LIST.add(Country.create("mw", "Malawi", 265));
        LIST.add(Country.create("my", "Malaysia", 60));
        LIST.add(Country.create("mv", "Maldives", 960));
        LIST.add(Country.create("ml", "Mali", 223));
        LIST.add(Country.create("mt", "Malta", 356));
        LIST.add(Country.create("mh", "Marshall Islands", 692));
        LIST.add(Country.create("mq", "Martinique", 596));
        LIST.add(Country.create("mr", "Mauritania ", 222));
        LIST.add(Country.create("mu", "Mauritius", 230));
        LIST.add(Country.create("yt", "Mayotte", 262));
        LIST.add(Country.create("mx", "Mexico", 52));
        LIST.add(Country.create("fm", "Micronesia", 691));
        LIST.add(Country.create("md", "Moldova", 373));
        LIST.add(Country.create("mc", "Monaco", 377));
        LIST.add(Country.create("mn", "Mongolia", 976));
        LIST.add(Country.create("me", "Montenegro", 382));
        LIST.add(Country.create("ms", "Montserrat", 1664));
        LIST.add(Country.create("ma", "Morocco", 212));
        LIST.add(Country.create("mz", "Mozambique", 258));
        LIST.add(Country.create("mm", "Myanmar", 95));
        LIST.add(Country.create("na", "Namibia", 264));
        LIST.add(Country.create("nr", "Nauru", 674));
        LIST.add(Country.create("np", "Nepal", 977));
        LIST.add(Country.create("nl", "Netherlands", 31));
        LIST.add(Country.create("nc", "New Caledonia", 687));
        LIST.add(Country.create("nz", "New Zealand", 64));
        LIST.add(Country.create("ni", "Nicaragua", 505));
        LIST.add(Country.create("ne", "Niger", 227));
        LIST.add(Country.create("ng", "Nigeria", 234));
        LIST.add(Country.create("nu", "Niue", 683));
        LIST.add(Country.create("nf", "Norfolk Island", 672));
        LIST.add(Country.create("kp", "North Korea", 850));
        LIST.add(Country.create("mp", "Northern Mariana Islands", 1670));
        LIST.add(Country.create("no", "Norway", 47));
        LIST.add(Country.create("om", "Oman", 968));
        LIST.add(Country.create("pk", "Pakistan", 92));
        LIST.add(Country.create("pw", "Palau", 680));
        LIST.add(Country.create("ps", "Palestine", 970));
        LIST.add(Country.create("pa", "Panama", 507));
        LIST.add(Country.create("pg", "Papua New Guinea", 675));
        LIST.add(Country.create("py", "Paraguay", 595));
        LIST.add(Country.create("pe", "Peru", 51));
        LIST.add(Country.create("ph", "Philippines", 63));
        LIST.add(Country.create("pl", "Poland", 48));
        LIST.add(Country.create("pt", "Portugal", 351));
        LIST.add(Country.create("pr", "Puerto Rico", 1));
        LIST.add(Country.create("qa", "Qatar", 974));
        LIST.add(Country.create("re", "Réunion", 262));
        LIST.add(Country.create("ro", "Romania", 40));
        LIST.add(Country.create("ru", "Russia", 7));
        LIST.add(Country.create("rw", "Rwanda", 250));
        LIST.add(Country.create("bl", "Saint Barthélemy", 590));
        LIST.add(Country.create("sh", "Saint Helena", 290));
        LIST.add(Country.create("kn", "Saint Kitts and Nevis", 1869));
        LIST.add(Country.create("lc", "Saint Lucia", 1758));
        LIST.add(Country.create("mf", "Saint Martin", 590));
        LIST.add(Country.create("pm", "Saint Pierre and Miquelon", 508));
        LIST.add(Country.create("vc", "Saint Vincent and the Grenadines", 1784));
        LIST.add(Country.create("ws", "Samoa", 685));
        LIST.add(Country.create("sm", "San Marino", 378));
        LIST.add(Country.create("st", "São Tomé and Príncipe", 239));
        LIST.add(Country.create("sa", "Saudi Arabia", 966));
        LIST.add(Country.create("sn", "Senegal", 221));
        LIST.add(Country.create("rs", "Serbia", 381));
        LIST.add(Country.create("sc", "Seychelles", 248));
        LIST.add(Country.create("sl", "Sierra Leone", 232));
        LIST.add(Country.create("sg", "Singapore", 65));
        LIST.add(Country.create("sx", "Sint Maarten", 1721));
        LIST.add(Country.create("sk", "Slovakia", 421));
        LIST.add(Country.create("si", "Slovenia", 386));
        LIST.add(Country.create("sb", "Solomon Islands", 677));
        LIST.add(Country.create("so", "Somalia", 252));
        LIST.add(Country.create("za", "South Africa", 27));
        LIST.add(Country.create("kr", "South Korea", 82));
        LIST.add(Country.create("ss", "South Sudan", 211));
        LIST.add(Country.create("es", "Spain", 34));
        LIST.add(Country.create("lk", "Sri Lanka", 94));
        LIST.add(Country.create("sd", "Sudan", 249));
        LIST.add(Country.create("sr", "Suriname", 597));
        LIST.add(Country.create("sj", "Svalbard and Jan Mayen", 47));
        LIST.add(Country.create("sz", "Swaziland", 268));
        LIST.add(Country.create("se", "Sweden", 46));
        LIST.add(Country.create("ch", "Switzerland", 41));
        LIST.add(Country.create("sy", "Syria", 963));
        LIST.add(Country.create("tw", "Taiwan", 886));
        LIST.add(Country.create("tj", "Tajikistan", 992));
        LIST.add(Country.create("tz", "Tanzania", 255));
        LIST.add(Country.create("th", "Thailand", 66));
        LIST.add(Country.create("tl", "Timor-Leste", 670));
        LIST.add(Country.create("tg", "Togo", 228));
        LIST.add(Country.create("tk", "Tokelau", 690));
        LIST.add(Country.create("to", "Tonga", 676));
        LIST.add(Country.create("tt", "Trinidad and Tobago", 1868));
        LIST.add(Country.create("tn", "Tunisia", 216));
        LIST.add(Country.create("tr", "Turkey", 90));
        LIST.add(Country.create("tm", "Turkmenistan", 993));
        LIST.add(Country.create("tc", "Turks and Caicos Islands", 1649));
        LIST.add(Country.create("tv", "Tuvalu", 688));
        LIST.add(Country.create("vi", "U.S. Virgin Islands", 1340));
        LIST.add(Country.create("ug", "Uganda", 256));
        LIST.add(Country.create("ua", "Ukraine", 380));
        LIST.add(Country.create("ae", "United Arab Emirates", 971));
        LIST.add(Country.create("gb", "United Kingdom", 44));
        LIST.add(Country.create("us", "United States", 1));
        LIST.add(Country.create("uy", "Uruguay", 598));
        LIST.add(Country.create("uz", "Uzbekistan", 998));
        LIST.add(Country.create("vu", "Vanuatu", 678));
        LIST.add(Country.create("va", "Vatican City", 39));
        LIST.add(Country.create("ve", "Venezuela", 58));
        LIST.add(Country.create("vn", "Vietnam ", 84));
        LIST.add(Country.create("wf", "Wallis and Futuna", 681));
        LIST.add(Country.create("eh", "Western Sahara", 212));
        LIST.add(Country.create("ye", "Yemen", 967));
        LIST.add(Country.create("zm", "Zambia", 260));
        LIST.add(Country.create("zw", "Zimbabwe", 263));
        LIST.add(Country.create("ax", "Åland Islands", 358));
    }

    public static Country get(@NonNull String code) {
        for (Country current : LIST) {
            if (current.is(code)) {
                return current;
            }
        }

        return LIST.get(1);
    }

    public static List<Country> getFiltered(@Nullable String filter) {
        if (StringUtils.isEmpty(filter)) {
            return LIST;
        }

        return getFilteredCountries(filter);
    }

    @NonNull
    private static List<Country> getFilteredCountries(@NonNull String filter) {
        List<Country> filtered = new ArrayList<>();
        for (Country country : LIST) {
            if (country.name().toLowerCase().contains(filter.toLowerCase())) {
                filtered.add(country);
            }
        }
        return filtered;
    }
}

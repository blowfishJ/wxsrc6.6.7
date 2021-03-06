package com.google.android.gms.c;

public enum a
{
  private final String aVX;
  
  static
  {
    aRA = new a("ADVERTISER", 4, "advertiser");
    aRB = new a("AFFECTS_SELECTORS", 5, "affects_selectors");
    aRC = new a("ALGORITHM", 6, "algorithm");
    aRD = new a("ALLOW_ANCHOR", 7, "allow_anchor");
    aRE = new a("ALLOW_HASH", 8, "allow_hash");
    aRF = new a("ALLOW_LINKER", 9, "allow_linker");
    aRG = new a("ANALYTICS_FIELDS", 10, "analytics_fields");
    aRH = new a("ANALYTICS_PASS_THROUGH", 11, "analytics_pass_through");
    aRI = new a("ANONYMIZE_IP", 12, "anonymize_ip");
    aRJ = new a("APP_NAME", 13, "app_name");
    aRK = new a("APP_VERSION", 14, "app_version");
    aRL = new a("ARG0", 15, "arg0");
    aRM = new a("ARG1", 16, "arg1");
    aRN = new a("ATTRIBUTE", 17, "attribute");
    aRO = new a("AUTO_LINK_DOMAINS", 18, "auto_link_domains");
    aRP = new a("BLACKLISTED_BEHAVIOR", 19, "blacklisted_behavior");
    aRQ = new a("CACHE_BUSTER", 20, "cache_buster");
    aRR = new a("CACHE_BUSTER_VALUE", 21, "cache_buster_value");
    aRS = new a("CAMPAIGN_CONTENT_KEY", 22, "campaign_content_key");
    aRT = new a("CAMPAIGN_CONTENT_OVERRIDE", 23, "campaign_content_override");
    aRU = new a("CAMPAIGN_COOKIE_TIMEOUT", 24, "campaign_cookie_timeout");
    aRV = new a("CAMPAIGN_MEDIUM_KEY", 25, "campaign_medium_key");
    aRW = new a("CAMPAIGN_MEDIUM_OVERRIDE", 26, "campaign_medium_override");
    aRX = new a("CAMPAIGN_NAME_KEY", 27, "campaign_name_key");
    aRY = new a("CAMPAIGN_NAME_OVERRIDE", 28, "campaign_name_override");
    aRZ = new a("CAMPAIGN_NO_KEY", 29, "campaign_no_key");
    aSa = new a("CAMPAIGN_SOURCE_KEY", 30, "campaign_source_key");
    aSb = new a("CAMPAIGN_SOURCE_OVERRIDE", 31, "campaign_source_override");
    aSc = new a("CAMPAIGN_TERM_KEY", 32, "campaign_term_key");
    aSd = new a("CAMPAIGN_TERM_OVERRIDE", 33, "campaign_term_override");
    aSe = new a("CAMPAIGN_TRACK", 34, "campaign_track");
    aSf = new a("CATEGORY", 35, "category");
    aSg = new a("CHECK_VALIDATION", 36, "check_validation");
    aSh = new a("CHILD_INDEX", 37, "child_index");
    aSi = new a("CLEAR_PERSISTENT_DATA_LAYER_PREFIX", 38, "clear_data_layer_prefix");
    aSj = new a("CLICK_ID", 39, "click_id");
    aSk = new a("CLIENT_INFO", 40, "client_info");
    aSl = new a("COLLECT_ADID", 41, "collect_adid");
    aSm = new a("COMPANY", 42, "company");
    aSn = new a("COMPONENT", 43, "component");
    aSo = new a("CONTENT_DESCRIPTION", 44, "content_description");
    aSp = new a("CONTENT_GROUP", 45, "content_group");
    aSq = new a("CONVERSION_ID", 46, "conversion_id");
    aSr = new a("COOKIE_DOMAIN", 47, "cookie_domain");
    aSs = new a("COOKIE_EXPIRATION", 48, "cookie_expiration");
    aSt = new a("COOKIE_NAME", 49, "cookie_name");
    aSu = new a("COOKIE_PATH", 50, "cookie_path");
    aSv = new a("COOKIE_PATH_COPY", 51, "cookie_path_copy");
    aSw = new a("COUNTRY", 52, "country");
    aSx = new a("CSS_ID", 53, "css_id");
    aSy = new a("CSS_IMPORTANT", 54, "css_important");
    aSz = new a("CSS_PROPERTY", 55, "css_property");
    aSA = new a("CSS_RULE", 56, "css_rule");
    aSB = new a("CSS_VALUE", 57, "css_value");
    aSC = new a("CURRENCY_CODE", 58, "currency_code");
    aSD = new a("CUSTOM_URL_SOURCE", 59, "custom_url_source");
    aSE = new a("CUSTOM_VARS", 60, "custom_vars");
    aSF = new a("CUSTOMER_ID", 61, "customer_id");
    aSG = new a("DATA_LAYER_VERSION", 62, "data_layer_version");
    aSH = new a("DATA_PROVIDER_ID", 63, "data_provider_id");
    aSI = new a("DEBUG", 64, "debug");
    aSJ = new a("DECODE", 65, "decode");
    aSK = new a("DECORATE_FORM", 66, "decorate_form");
    aSL = new a("DECORATE_FORMS_AUTO_LINK", 67, "decorate_forms_auto_link");
    aSM = new a("DECORATE_LINK", 68, "decorate_link");
    aSN = new a("DEFAULT_PAGES", 69, "default_pages");
    aSO = new a("DEFAULT_VALUE", 70, "default_value");
    aSP = new a("DEPENDENCIES", 71, "dependencies");
    aSQ = new a("DETECT_FLASH", 72, "detect_flash");
    aSR = new a("DETECT_TITLE", 73, "detect_title");
    aSS = new a("DIMENSION", 74, "dimension");
    aST = new a("DOMAIN_NAME", 75, "domain_name");
    aSU = new a("DOUBLE_CLICK", 76, "double_click");
    aSV = new a("ECOMMERCE_MACRO_DATA", 77, "ecommerce_macro_data");
    aSW = new a("ECOMMERCE_USE_DATA_LAYER", 78, "ecommerce_use_data_layer");
    aSX = new a("ELEMENT", 79, "element");
    aSY = new a("ELEMENT_ID", 80, "element_id");
    aSZ = new a("ELEMENTS", 81, "elements");
    aTa = new a("EMAIL", 82, "email");
    aTb = new a("EMPLOYEE_RANGE", 83, "employee_range");
    aTc = new a("ENABLE_ECOMMERCE", 84, "enable_ecommerce");
    aTd = new a("ENABLE_ALL_VIDEOS", 85, "enable_all_videos");
    aTe = new a("ENABLE_PRODUCT_REPORTING", 86, "enable_product_reporting");
    aTf = new a("ENABLE_REMARKETING_LISTS", 87, "enable_remarketing_lists");
    aTg = new a("ESCAPE", 88, "escape");
    aTh = new a("EVENT_ACTION", 89, "event_action");
    aTi = new a("EVENT_CATEGORY", 90, "event_category");
    aTj = new a("EVENT_LABEL", 91, "event_label");
    aTk = new a("EVENT_VALUE", 92, "event_value");
    aTl = new a("EXCEPTION_DESCRIPTION", 93, "exception_description");
    aTm = new a("EXCEPTION_FATAL", 94, "exception_fatal");
    aTn = new a("EXPERIMENT_COMBINATION", 95, "experiment_combination");
    aTo = new a("EXPERIMENT_ID", 96, "experiment_id");
    aTp = new a("EXPERIMENT_KEY", 97, "experiment_key");
    aTq = new a("FAILED_BEHAVIOR", 98, "failed_behavior");
    aTr = new a("SECTION_INDEX", 99, "section_index");
    aTs = new a("FIELDS_TO_SET", 100, "fields_to_set");
    aTt = new a("FORCE_SSL", 101, "force_ssl");
    aTu = new a("FORM_OBJECT", 102, "form_object");
    aTv = new a("FUNCTION", 103, "function");
    aTw = new a("FUNCTION_CALL_NAME", 104, "function_call_macro_name");
    aTx = new a("GROUP", 105, "group");
    aTy = new a("HIT_CALLBACK", 106, "hit_callback");
    aTz = new a("HTML", 107, "html");
    aTA = new a("ID", 108, "id");
    aTB = new a("IGNORED_ORGANIC", 109, "ignored_organic");
    aTC = new a("IGNORED_REF", 110, "ignored_ref");
    aTD = new a("IGNORE_CASE", 111, "ignore_case");
    aTE = new a("INPUT", 112, "input");
    aTF = new a("INPUT_FORMAT", 113, "input_format");
    aTG = new a("INSTANCE_NAME", 114, "instance_name");
    aTH = new a("INSTANCE_LABEL", 115, "instance_label");
    aTI = new a("INTERVAL", 116, "interval");
    aTJ = new a("ITEM_SEPARATOR", 117, "item_separator");
    aTK = new a("JAVASCRIPT", 118, "javascript");
    aTL = new a("JSON", 119, "json");
    aTM = new a("KEYWORD", 120, "keyword");
    aTN = new a("KEY_VALUE_SEPARATOR", 121, "key_value_separator");
    aTO = new a("LABEL", 122, "label");
    aTP = new a("LANGUAGE", 123, "language");
    aTQ = new a("LIMIT", 124, "limit");
    aTR = new a("LINK", 125, "link");
    aTS = new a("LINK_BY_POST", 126, "link_by_post");
    aTT = new a("LINK_ID", 127, "link_id");
    aTU = new a("LIVE_ONLY", 128, "live_only");
    aTV = new a("LOCAL_GIF_PATH", 129, "local_gif_path");
    aTW = new a("LOCALE", 130, "locale");
    aTX = new a("LOCATION", 131, "location");
    aTY = new a("MAP", 132, "map");
    aTZ = new a("MAX", 133, "max");
    aUa = new a("METRIC", 134, "metric");
    aUb = new a("MIN", 135, "min");
    aUc = new a("MODE", 136, "mode");
    aUd = new a("NAME", 137, "name");
    aUe = new a("NAMESPACE_CODE", 138, "namespace_code");
    aUf = new a("NAMESPACE_ID", 139, "namespace_id");
    aUg = new a("NAMESPACE_VALUE", 140, "namespace_value");
    aUh = new a("NONINTERACTION", 141, "noninteraction");
    aUi = new a("NOT_DEFAULT_MACRO", 142, "not_default_macro");
    aUj = new a("NO_PADDING", 143, "no_padding");
    aUk = new a("NUMBER", 144, "number");
    aUl = new a("OPTOUT", 145, "optout");
    aUm = new a("ORDER", 146, "order");
    aUn = new a("ORDER_ID", 147, "order_id");
    aUo = new a("ORDER_VALUE", 148, "order_value");
    aUp = new a("ORDINAL", 149, "ordinal");
    aUq = new a("ORGANIC", 150, "organic");
    aUr = new a("OUTPUT_FORMAT", 151, "output_format");
    aUs = new a("PAGE", 152, "page");
    aUt = new a("PAGE_PATH", 153, "page_path");
    aUu = new a("PARTITION", 154, "partition");
    aUv = new a("PERCENTAGE", 155, "percentage");
    aUw = new a("PIXEL", 156, "pixel");
    aUx = new a("PLACEMENT", 157, "placement");
    aUy = new a("PLATFORM", 158, "platform");
    aUz = new a("POSITION", 159, "position");
    aUA = new a("PRICES", 160, "prices");
    aUB = new a("PRIORITY", 161, "priority");
    aUC = new a("PRODUCT", 162, "product");
    aUD = new a("PRODUCT_DATA", 163, "product_data");
    aUE = new a("PRODUCT_ID", 164, "product_id");
    aUF = new a("PRODUCT_IDS", 165, "product_ids");
    aUG = new a("PRODUCT_SETTING_FIELD_PATH", 166, "product_setting_field_path");
    aUH = new a("PUSH_AFTER_EVALUATE", 167, "push_after_evaluate");
    aUI = new a("QUANTITY", 168, "quantity");
    aUJ = new a("QUERY_KEY", 169, "query_key");
    aUK = new a("QUERY_LISTS", 170, "query_lists");
    aUL = new a("REFERRER", 171, "referrer");
    aUM = new a("REFERRER_OVERRIDE", 172, "referrer_override");
    aUN = new a("REQUIRES_CONTENT", 173, "requires_content");
    aUO = new a("REVENUE", 174, "revenue");
    aUP = new a("SAMPLE_RATE", 175, "sample_rate");
    aUQ = new a("SELECTOR", 176, "selector");
    aUR = new a("SEND_HITS_TO_GOOGLE", 177, "send_hits_to_google");
    aUS = new a("SESSION_CONTROL", 178, "session_control");
    aUT = new a("SESSION_COOKIE_TIMEOUT", 179, "session_cookie_timeout");
    aUU = new a("SITE_SPEED_SAMPLE_RATE", 180, "site_speed_sample_rate");
    aUV = new a("SOCIAL_ACTION", 181, "social_action");
    aUW = new a("SOCIAL_ACTION_TARGET", 182, "social_action_target");
    aUX = new a("SOCIAL_NETWORK", 183, "social_network");
    aUY = new a("SOCIAL_USE_DATA_LAYER", 184, "social_use_data_layer");
    aUZ = new a("SERVER_SIDE", 185, "server_side");
    aVa = new a("STANDARD_INDUSTRIAL_CLASSIFICATION", 186, "standard_industrial_classification");
    aVb = new a("STRING", 187, "string");
    aVc = new a("STRIP_WWW", 188, "strip_www");
    aVd = new a("TAG_ID", 189, "tag_id");
    aVe = new a("TAG_LIST", 190, "tag_list");
    aVf = new a("TAG_LIST_CONTEXT", 191, "tag_list_context");
    aVg = new a("TAG_LIST_INDEX", 192, "tag_list_index");
    aVh = new a("TAG_REFERENCE", 193, "tag_reference");
    aVi = new a("TARGET_CSS_ID", 194, "target_css_id");
    aVj = new a("TARGET_ELEMENTS", 195, "target_elements");
    aVk = new a("TARGET_SELECTOR", 196, "target_selector");
    aVl = new a("TARGET_URL", 197, "target_url");
    aVm = new a("TEXT", 198, "text");
    aVn = new a("TIMING_CATEGORY", 199, "timing_category");
    aVo = new a("TIMING_LABEL", 200, "timing_label");
    aVp = new a("TIMING_SAMPLE_RATE", 201, "timing_sample_rate");
    aVq = new a("TIMING_VALUE", 202, "timing_value");
    aVr = new a("TIMING_VAR", 203, "timing_var");
    aVs = new a("TITLE", 204, "title");
    aVt = new a("TRACK_APPVIEW", 205, "track_appview");
    aVu = new a("TRACK_DATA", 206, "track_data");
    aVv = new a("TRACK_EVENT", 207, "track_event");
    aVw = new a("TRACK_EXCEPTION", 208, "track_exception");
    aVx = new a("TRACK_SOCIAL", 209, "track_social");
    aVy = new a("TRACK_TIMING", 210, "track_timing");
    aVz = new a("TRACK_TRANSACTION", 211, "track_transaction");
  }
  
  private a(String paramString)
  {
    this.aVX = paramString;
  }
  
  public final String toString()
  {
    return this.aVX;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/google/android/gms/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
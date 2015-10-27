package com.saothienhat.web;

/**
 * @author binhtt
 *
 */
public enum HttpStatusMessageEnum
{
    // 2xx
    HTTP_200(200, "OK", "This is the most common HTTP status message. It indicates that the request was successful and the server was able to deliver on the request."),
    
    // 4xx
    HTTP_404(404, "", ""),
    
    HTTP_UNKNOWN(0, "", "")
    ;
    
    // TODO: refer for more: http://webdesign.about.com/cs/http/p/http2xx.htm
    
    private int code;
    private String mean;
    private String detail;
    
    HttpStatusMessageEnum(int code, String mean, String detail){
        this.code = code;
        this.mean = mean;
        this.detail = detail;
    }

    /**
     * Method to get field code as type int
     * @return the code
     */
    public int getCode()
    {
        return code;
    }

    /**
     * Method to get field mean as type String
     * @return the mean
     */
    public String getMean()
    {
        return mean;
    }

    /**
     * Method to get field detail as type String
     * @return the detail
     */
    public String getDetail()
    {
        return detail;
    }
    
    
    /**
     * Method to getHttpStatusMessageEnumByCode
     *
     * @param code
     * @return
     */
    public static HttpStatusMessageEnum getHttpStatusMessageEnumByCode(int code){
        HttpStatusMessageEnum result = HttpStatusMessageEnum.HTTP_UNKNOWN;
        HttpStatusMessageEnum[] values = HttpStatusMessageEnum.values();
        for( int index = 0; index < values.length; index++ )
        {
            HttpStatusMessageEnum value = values[index];
            if(value.code == code){
                result = value;               
                break;
            }
        }
        return result;
    }
    
}

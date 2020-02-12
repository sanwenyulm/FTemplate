package Constants;

public class Constant {
    //权限验证相关
    public static final String AUTH_ADMIN = "app-admin";
    public static final String AUTH_USER = "app-user";
    public static final String AUTH_UNKNOW = "app-nuknow";
    public static final String AUTH_ROLES = "roles";
    public static final String AUTH_TOKRN = "claims";
    public static final String TOKRN_USER_ID = "userid";

    public static final String TOKRN_PREFIX = "sanwenapp ";//约定token前缀
    public static final String REQUEST_HEADER_ATTR = "Authorization";//约定token 在header中的key
    public static final int    TOKRN_SUBSTRING = 10;//约定token前缀 后需要截取的token位置

}

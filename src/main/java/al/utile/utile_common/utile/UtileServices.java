package al.utile.utile_common.utile;

public enum UtileServices {

    UTILE(Constants.UTILE_MAIN),
    PROFESSIONAL(Constants.PROFESSIONAL),
    API_GATEWAY(Constants.API_GATEWAY),
    AUTHENTICATION_SERVER(Constants.AUTHENTICATION_SERVER)
    ;

    public static class Constants {
        public static final String UTILE_MAIN = "utile-main";
        public static final String PROFESSIONAL = "utile-professional";
        public static final String API_GATEWAY = "utile-be-gateway";
        public static final String AUTHENTICATION_SERVER = "utile-authentication-server";
    }

    private final String serviceName;


    UtileServices(final String s) {
        serviceName = s;
    }

    public final String getServiceName() {
        return serviceName;
    }
}

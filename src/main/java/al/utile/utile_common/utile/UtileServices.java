package al.utile.utile_common.utile;

public enum UtileServices {

    UTILE("utile-main"),
    PROFESSIONAL("utile-professional"),
    API_GATEWAY("utile-be-gateway"),
    AUTHENTICATION_SERVER("utile-authentication-server");

    private final String serviceName;


    UtileServices(String s) {
        serviceName = s;
    }

    public String getServiceName() {
        return serviceName;
    }
}

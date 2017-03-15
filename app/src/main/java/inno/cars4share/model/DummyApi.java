package inno.cars4share.model;

/**
 * Created by ilgiz on 3/15/17.
 */

public class DummyApi {

    public static User authenticate(String login, String password, String authTokenType) {
        User ans = null;
        if (login.equals("admin") && password.equals("admin") && authTokenType.equals("lessor")) {
            ans.authToken = "lessor admin authToken yeeeee";
            ans.name = "LESSOR ADMIN";
            ans.type = "lessor";
        } else if (login.equals("driver") && password.equals("driver") && authTokenType.equals("lessee")) {
            ans.authToken = "lessee DR1V3R token";
            ans.name = "DR1V3R";
            ans.type = "lessee";
        }
        return ans;
    }



}

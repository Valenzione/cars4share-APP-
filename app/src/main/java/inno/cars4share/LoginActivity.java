package inno.cars4share;

import android.accounts.AccountAuthenticatorActivity;
import android.os.Bundle;

public class LoginActivity extends AccountAuthenticatorActivity {

    public static final String EXTRA_TOKEN_TYPE
            = "inno.cars4share.LoginActivity.EXTRA_TOKEN_TYPE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
}

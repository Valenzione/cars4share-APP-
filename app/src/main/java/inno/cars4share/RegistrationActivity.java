package inno.cars4share;

import android.accounts.AccountAuthenticatorActivity;
import android.os.Bundle;

public class RegistrationActivity extends AccountAuthenticatorActivity {

    public static final String EXTRA_TOKEN_TYPE
            = "inno.cars4share.RegistrationActivity.EXTRA_TOKEN_TYPE";

    public static final String EXTRA_ACCOUNT_AUTHENTICATOR_RESPONSE
            = "inno.cars4share.RegistrationActivity.EXTRA_ACCOUNT_AUTHENTICATOR_RESPONSE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
    }
}

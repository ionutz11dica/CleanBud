package disertatie.ro.cleanbud.CB.View;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import javax.inject.Inject;

import butterknife.BindView;
import dagger.android.AndroidInjector;
import disertatie.ro.cleanbud.R;
import disertatie.ro.cleanbud.CB.ViewModel.LoginViewModel;



public class LoginActivity extends BaseActivity {


    @BindView(R.id.editTextEmailLogin)
    EditText etEmail;
    @BindView(R.id.editTextPasswordLogin)
    EditText etPassword;
    @BindView(R.id.cirLoginButton)
    Button btnLogin;


    @Inject
    ViewModelFactory viewModelFactory;
    private LoginViewModel loginViewModel;


    @Override
    protected int layoutRes() {
        return R.layout.activity_login;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //for changing status bar icon colors
        if(Build.VERSION.SDK_INT>= Build.VERSION_CODES.M) {
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        }
        setContentView(layoutRes());






    }

    public void onLoginClick(View View){
        startActivity(new Intent(this,RegisterActivity.class));
        overridePendingTransition(R.anim.slide_in_right,R.anim.stay);

    }

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return null;
    }
}

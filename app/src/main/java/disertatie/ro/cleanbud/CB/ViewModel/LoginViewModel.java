package disertatie.ro.cleanbud.CB.ViewModel;

import android.view.View;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import disertatie.ro.cleanbud.CB.Model.User;
import io.reactivex.disposables.CompositeDisposable;

public class LoginViewModel extends ViewModel {

    private CompositeDisposable disposable;

    public MutableLiveData<String> emailAdress = new MutableLiveData<>();
    public MutableLiveData<String> password = new MutableLiveData<>();

    private MutableLiveData<User> userMutableLiveData;





    public MutableLiveData<User> getUser() {
        if (userMutableLiveData == null){
            disposable = new CompositeDisposable();
            userMutableLiveData = new MutableLiveData<>();
        }
        return userMutableLiveData;
    }




    public void onLoginClick(View view) {
        User user = new User(emailAdress.getValue(), password.getValue());

        userMutableLiveData.setValue(user);
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        if (disposable !=null){
            disposable.clear();
            disposable = null;
        }
    }
}

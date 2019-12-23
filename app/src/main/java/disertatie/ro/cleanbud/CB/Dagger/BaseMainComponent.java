package disertatie.ro.cleanbud.CB.Dagger;


import javax.inject.Singleton;

import dagger.Component;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(modules = {AndroidSupportInjectionModule.class,})
public interface BaseMainComponent {
}

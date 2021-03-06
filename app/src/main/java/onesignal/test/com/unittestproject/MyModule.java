package onesignal.test.com.unittestproject;

import javax.inject.Singleton;
import dagger.Module;
import dagger.Provides;

@Module
class MyModule {

    @Provides
    @Singleton
    static MyExample provideMyExample() {
        return new MyExampleImpl();
    }

}
package com.example.mfahad.rxjava;

import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;


/**
 * Created by M.FAHAD on 8/23/2017.
 */

public class Observerr {

    //Constructor
    public Observerr() {

    }

    public Observer<String> getObserver() {
        return new Observer<String>() {
            @Override
            public void onSubscribe(@NonNull Disposable d) {
            }

            @Override
            public void onNext(@NonNull String s) {
                    MainActivity.tvMain.setText(s);
            }

            @Override
            public void onError(@NonNull Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        };
    }

}

package com.example.mfahad.rxjava;


import io.reactivex.Observable;
import io.reactivex.Observer;

/**
 * Created by M.FAHAD on 8/23/2017.
 */

public class Observeable {

    public Observable observable;
    //Constructor
    public Observeable(){

    }

    public Observable<String> getObserveable(){
        return Observable.just("Data From Observable");
    }
}

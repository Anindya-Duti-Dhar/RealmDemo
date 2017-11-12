package anindya.sample.realm_demo.adapters;

import android.content.Context;

import anindya.sample.realm_demo.model.Book;
import io.realm.RealmResults;

public class RealmBooksAdapter extends RealmModelAdapter<Book> {

    public RealmBooksAdapter(Context context, RealmResults<Book> realmResults, boolean automaticUpdate) {

        super(context, realmResults, automaticUpdate);
    }
}
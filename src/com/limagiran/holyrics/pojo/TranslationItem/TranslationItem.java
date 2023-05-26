package com.limagiran.holyrics.pojo.TranslationItem;
public class TranslationItem<T> {
    private String key;
    private T item;

    public TranslationItem(String key, T item) {
        this.key = key;
        this.item = item;
    }


    public TranslationItem<T> setKey(String key) {
        this.key = key;
        return this;
    }

    public T getItem() {
        return this.item;
    }

    public TranslationItem<T> setItem(T item) {
        this.item = item;
        return this;
    }
}

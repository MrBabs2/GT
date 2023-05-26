package p015cm.aptoide.p016pt.search.model;

import kotlin.C4789l;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0006J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, mo16641d2 = {"Lcm/aptoide/pt/search/model/SearchItem;", "", "getId", "", "getType", "Lcm/aptoide/pt/search/model/SearchItem$Type;", "Type", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.search.model.SearchItem */
/* compiled from: SearchItem.kt */
public interface SearchItem {

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, mo16641d2 = {"Lcm/aptoide/pt/search/model/SearchItem$Type;", "", "(Ljava/lang/String;I)V", "LOADING", "APP", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
    /* renamed from: cm.aptoide.pt.search.model.SearchItem$Type */
    /* compiled from: SearchItem.kt */
    public enum Type {
        LOADING,
        APP
    }

    long getId();

    Type getType();
}
